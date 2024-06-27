package gendev.hw1;

import java.io.IOException;
import java.util.Collections;
import java.util.Date;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Task4 {
    public static String instance = "task4-Instances/instance.xmi";

    public static void main(String[] args) {
        System.out.println("Creating and saving instance to file " + instance);
        Hw1Package.eINSTANCE.eClass();

        // Create a resource set
        ResourceSet resourceSet = new ResourceSetImpl();

        // Register the XMI resource factory
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());

        // Create a resource
        Resource resource = resourceSet.createResource(URI.createURI(instance));

        // Create instances of model elements
        Hw1Factory factory = Hw1Factory.eINSTANCE;

        // Create at least 6 objects
        Client client = factory.createClient();
        client.setEmployeeId("1");
        client.setName("Client A");

        Project project1 = factory.createProject();
        project1.setProjectId("p1");
        project1.setProjectName("Project 1");
        project1.setStartDate(new Date());
        project1.setEndDate(new Date());

        Project project2 = factory.createProject();
        project2.setProjectId("p2");
        project2.setProjectName("Project 2");
        project2.setStartDate(new Date());
        project2.setEndDate(new Date());

        CloudService cloudService = factory.createCloudService();
        cloudService.setServiceName("AWS");
        cloudService.setServiceType("IaaS");

        QualityAssurance qa1 = factory.createQualityAssurance();
        qa1.setQualityassuranceId("qa1");
        qa1.setTestStatus("Pass");

        QualityAssurance qa2 = factory.createQualityAssurance();
        qa2.setQualityassuranceId("qa2");
        qa2.setTestStatus("Fail");

        DevOpsEngineer devOpsEngineer = factory.createDevOpsEngineer();
        devOpsEngineer.setEmployeeId("2");
        devOpsEngineer.setName("John Doe");
        devOpsEngineer.setRole("DevOps Engineer");
        devOpsEngineer.setInitiateDeployment("Deployment 1");

        // Add objects to the resource
        resource.getContents().add(client);
        resource.getContents().add(project1);
        resource.getContents().add(project2);
        resource.getContents().add(cloudService);
        resource.getContents().add(qa1);
        resource.getContents().add(qa2);
        resource.getContents().add(devOpsEngineer);

        // Establish links
        client.getInitiates().add(project1);
        client.getInitiates().add(project2);

        project1.getUses().add(cloudService);
        project2.getUses().add(cloudService);

        if(project1.getAutomates()!=null) {
        	project1.getAutomates().getDoing().add(devOpsEngineer);
        }

        client.getInitiates().add(project1);
        client.getInitiates().add(project2);

        project1.getUses().add(cloudService);
        project2.getUses().add(cloudService);

        // Create a deployment instance
        Deployment deployment1 = factory.createDeployment();
        deployment1.setDeploymentId("d1");
        deployment1.setDeploymentStatus("In Progress");

        // Add deployment to project1
        project1.setAutomates(deployment1);

        // Set the QA check for the deployment
        deployment1.setQacheck(qa1);

        

        // Save the resource
        try {
            resource.save(Collections.emptyMap());
            System.out.println("Instance saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Failed to save instance.");
        }
    }
}
