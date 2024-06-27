/**
 */
package gendev.hw1.impl;

import gendev.hw1.Client;
import gendev.hw1.CloudArchitect;
import gendev.hw1.CloudService;
import gendev.hw1.CloudSolution;
import gendev.hw1.Deployment;
import gendev.hw1.DevOpsEngineer;
import gendev.hw1.Employee;
import gendev.hw1.Hw1Factory;
import gendev.hw1.Hw1Package;
import gendev.hw1.Project;
import gendev.hw1.ProjectManager;
import gendev.hw1.QualityAssurance;

import gendev.hw1.util.Hw1Validator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hw1PackageImpl extends EPackageImpl implements Hw1Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudArchitectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityAssuranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudSolutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass devOpsEngineerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employeeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see gendev.hw1.Hw1Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Hw1PackageImpl() {
		super(eNS_URI, Hw1Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Hw1Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Hw1Package init() {
		if (isInited)
			return (Hw1Package) EPackage.Registry.INSTANCE.getEPackage(Hw1Package.eNS_URI);

		// Obtain or create and register package
		Object registeredHw1Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Hw1PackageImpl theHw1Package = registeredHw1Package instanceof Hw1PackageImpl
				? (Hw1PackageImpl) registeredHw1Package
				: new Hw1PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theHw1Package.createPackageContents();

		// Initialize created meta-data
		theHw1Package.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theHw1Package, new EValidator.Descriptor() {
			public EValidator getEValidator() {
				return Hw1Validator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theHw1Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Hw1Package.eNS_URI, theHw1Package);
		return theHw1Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClient() {
		return clientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_EmployeeId() {
		return (EAttribute) clientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClient_Name() {
		return (EAttribute) clientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClient_Initiates() {
		return (EReference) clientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_ProjectId() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_ProjectName() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_StartDate() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_EndDate() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Uses() {
		return (EReference) projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Automates() {
		return (EReference) projectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectManager() {
		return projectManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProjectManager_ProjectsHandled() {
		return (EAttribute) projectManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProjectManager_Manages() {
		return (EReference) projectManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudArchitect() {
		return cloudArchitectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudArchitect_DesignArchitecture() {
		return (EAttribute) cloudArchitectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_DeploymentId() {
		return (EAttribute) deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeployment_DeploymentStatus() {
		return (EAttribute) deploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Qacheck() {
		return (EReference) deploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Doing() {
		return (EReference) deploymentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeployment__Inv2__DiagnosticChain_Map() {
		return deploymentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudService() {
		return cloudServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudService_ServiceName() {
		return (EAttribute) cloudServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudService_ServiceType() {
		return (EAttribute) cloudServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityAssurance() {
		return qualityAssuranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualityAssurance_QualityassuranceId() {
		return (EAttribute) qualityAssuranceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualityAssurance_TestStatus() {
		return (EAttribute) qualityAssuranceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudSolution() {
		return cloudSolutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudSolution_ArchitectureDesign() {
		return (EAttribute) cloudSolutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudSolution_ServiceProvider() {
		return (EAttribute) cloudSolutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevOpsEngineer() {
		return devOpsEngineerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDevOpsEngineer_InitiateDeployment() {
		return (EAttribute) devOpsEngineerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDevOpsEngineer__Inv4_NonEmptyInitiateDeployment__DiagnosticChain_Map() {
		return devOpsEngineerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmployee() {
		return employeeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_EmployeeId() {
		return (EAttribute) employeeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Name() {
		return (EAttribute) employeeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmployee_Role() {
		return (EAttribute) employeeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1Factory getHw1Factory() {
		return (Hw1Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		clientEClass = createEClass(CLIENT);
		createEAttribute(clientEClass, CLIENT__EMPLOYEE_ID);
		createEAttribute(clientEClass, CLIENT__NAME);
		createEReference(clientEClass, CLIENT__INITIATES);

		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__PROJECT_ID);
		createEAttribute(projectEClass, PROJECT__PROJECT_NAME);
		createEAttribute(projectEClass, PROJECT__START_DATE);
		createEAttribute(projectEClass, PROJECT__END_DATE);
		createEReference(projectEClass, PROJECT__USES);
		createEReference(projectEClass, PROJECT__AUTOMATES);

		projectManagerEClass = createEClass(PROJECT_MANAGER);
		createEAttribute(projectManagerEClass, PROJECT_MANAGER__PROJECTS_HANDLED);
		createEReference(projectManagerEClass, PROJECT_MANAGER__MANAGES);

		cloudArchitectEClass = createEClass(CLOUD_ARCHITECT);
		createEAttribute(cloudArchitectEClass, CLOUD_ARCHITECT__DESIGN_ARCHITECTURE);

		deploymentEClass = createEClass(DEPLOYMENT);
		createEAttribute(deploymentEClass, DEPLOYMENT__DEPLOYMENT_ID);
		createEAttribute(deploymentEClass, DEPLOYMENT__DEPLOYMENT_STATUS);
		createEReference(deploymentEClass, DEPLOYMENT__QACHECK);
		createEReference(deploymentEClass, DEPLOYMENT__DOING);
		createEOperation(deploymentEClass, DEPLOYMENT___INV2__DIAGNOSTICCHAIN_MAP);

		cloudServiceEClass = createEClass(CLOUD_SERVICE);
		createEAttribute(cloudServiceEClass, CLOUD_SERVICE__SERVICE_NAME);
		createEAttribute(cloudServiceEClass, CLOUD_SERVICE__SERVICE_TYPE);

		qualityAssuranceEClass = createEClass(QUALITY_ASSURANCE);
		createEAttribute(qualityAssuranceEClass, QUALITY_ASSURANCE__QUALITYASSURANCE_ID);
		createEAttribute(qualityAssuranceEClass, QUALITY_ASSURANCE__TEST_STATUS);

		cloudSolutionEClass = createEClass(CLOUD_SOLUTION);
		createEAttribute(cloudSolutionEClass, CLOUD_SOLUTION__ARCHITECTURE_DESIGN);
		createEAttribute(cloudSolutionEClass, CLOUD_SOLUTION__SERVICE_PROVIDER);

		devOpsEngineerEClass = createEClass(DEV_OPS_ENGINEER);
		createEAttribute(devOpsEngineerEClass, DEV_OPS_ENGINEER__INITIATE_DEPLOYMENT);
		createEOperation(devOpsEngineerEClass,
				DEV_OPS_ENGINEER___INV4_NON_EMPTY_INITIATE_DEPLOYMENT__DIAGNOSTICCHAIN_MAP);

		employeeEClass = createEClass(EMPLOYEE);
		createEAttribute(employeeEClass, EMPLOYEE__EMPLOYEE_ID);
		createEAttribute(employeeEClass, EMPLOYEE__NAME);
		createEAttribute(employeeEClass, EMPLOYEE__ROLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		projectManagerEClass.getESuperTypes().add(this.getEmployee());
		cloudArchitectEClass.getESuperTypes().add(this.getEmployee());
		cloudSolutionEClass.getESuperTypes().add(this.getCloudArchitect());
		cloudSolutionEClass.getESuperTypes().add(this.getCloudService());
		devOpsEngineerEClass.getESuperTypes().add(this.getEmployee());

		// Initialize classes, features, and operations; add parameters
		initEClass(clientEClass, Client.class, "Client", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClient_EmployeeId(), ecorePackage.getEString(), "employeeId", null, 0, 1, Client.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getClient_Name(), ecorePackage.getEString(), "name", null, 0, 1, Client.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClient_Initiates(), this.getProject(), null, "initiates", null, 1, -1, Client.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_ProjectId(), ecorePackage.getEString(), "projectId", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ProjectName(), ecorePackage.getEString(), "projectName", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_StartDate(), ecorePackage.getEDate(), "startDate", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_EndDate(), ecorePackage.getEDate(), "endDate", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Uses(), this.getCloudService(), null, "uses", null, 1, -1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Automates(), this.getDeployment(), null, "automates", null, 1, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectManagerEClass, ProjectManager.class, "ProjectManager", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectManager_ProjectsHandled(), ecorePackage.getEInt(), "projectsHandled", null, 1, 1,
				ProjectManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getProjectManager_Manages(), this.getProject(), null, "manages", null, 1, -1,
				ProjectManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudArchitectEClass, CloudArchitect.class, "CloudArchitect", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudArchitect_DesignArchitecture(), ecorePackage.getEString(), "designArchitecture", null, 0,
				1, CloudArchitect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeployment_DeploymentId(), ecorePackage.getEString(), "deploymentId", null, 0, 1,
				Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeployment_DeploymentStatus(), ecorePackage.getEString(), "deploymentStatus", null, 0, 1,
				Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_Qacheck(), this.getQualityAssurance(), null, "qacheck", null, 0, 1,
				Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeployment_Doing(), this.getDevOpsEngineer(), null, "doing", null, 1, -1, Deployment.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getDeployment__Inv2__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "inv2",
				0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cloudServiceEClass, CloudService.class, "CloudService", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudService_ServiceName(), ecorePackage.getEString(), "serviceName", null, 0, 1,
				CloudService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudService_ServiceType(), ecorePackage.getEString(), "serviceType", null, 0, 1,
				CloudService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(qualityAssuranceEClass, QualityAssurance.class, "QualityAssurance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQualityAssurance_QualityassuranceId(), ecorePackage.getEString(), "qualityassuranceId", null,
				0, 1, QualityAssurance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualityAssurance_TestStatus(), ecorePackage.getEString(), "testStatus", null, 0, 1,
				QualityAssurance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(cloudSolutionEClass, CloudSolution.class, "CloudSolution", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudSolution_ArchitectureDesign(), ecorePackage.getEString(), "architectureDesign", null, 0,
				1, CloudSolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudSolution_ServiceProvider(), ecorePackage.getEString(), "serviceProvider", null, 0, 1,
				CloudSolution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(devOpsEngineerEClass, DevOpsEngineer.class, "DevOpsEngineer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDevOpsEngineer_InitiateDeployment(), ecorePackage.getEString(), "initiateDeployment", null, 0,
				1, DevOpsEngineer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDevOpsEngineer__Inv4_NonEmptyInitiateDeployment__DiagnosticChain_Map(),
				ecorePackage.getEBoolean(), "inv4_NonEmptyInitiateDeployment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(employeeEClass, Employee.class, "Employee", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmployee_EmployeeId(), ecorePackage.getEString(), "employeeId", null, 0, 1, Employee.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_Name(), ecorePackage.getEString(), "name", null, 0, 1, Employee.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmployee_Role(), ecorePackage.getEString(), "role", null, 0, 1, Employee.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source, new String[] {});
		addAnnotation(deploymentEClass, source, new String[] { "constraints", "inv2" });
		addAnnotation(devOpsEngineerEClass, source, new String[] { "constraints", "inv4_NonEmptyInitiateDeployment" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(getDeployment__Inv2__DiagnosticChain_Map(), source,
				new String[] { "body", "self.doing->size() > 1 implies self.deploymentStatus = \'Passed\'" });
		addAnnotation(getDevOpsEngineer__Inv4_NonEmptyInitiateDeployment__DiagnosticChain_Map(), source,
				new String[] { "body", "\n        self.initiateDeployment->notEmpty()" });
	}

} //Hw1PackageImpl
