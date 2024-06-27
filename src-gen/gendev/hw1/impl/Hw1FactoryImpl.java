/**
 */
package gendev.hw1.impl;

import gendev.hw1.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Hw1FactoryImpl extends EFactoryImpl implements Hw1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Hw1Factory init() {
		try {
			Hw1Factory theHw1Factory = (Hw1Factory) EPackage.Registry.INSTANCE.getEFactory(Hw1Package.eNS_URI);
			if (theHw1Factory != null) {
				return theHw1Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Hw1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Hw1Package.CLIENT:
			return createClient();
		case Hw1Package.PROJECT:
			return createProject();
		case Hw1Package.PROJECT_MANAGER:
			return createProjectManager();
		case Hw1Package.CLOUD_ARCHITECT:
			return createCloudArchitect();
		case Hw1Package.DEPLOYMENT:
			return createDeployment();
		case Hw1Package.CLOUD_SERVICE:
			return createCloudService();
		case Hw1Package.QUALITY_ASSURANCE:
			return createQualityAssurance();
		case Hw1Package.CLOUD_SOLUTION:
			return createCloudSolution();
		case Hw1Package.DEV_OPS_ENGINEER:
			return createDevOpsEngineer();
		case Hw1Package.EMPLOYEE:
			return createEmployee();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Client createClient() {
		ClientImpl client = new ClientImpl();
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project createProject() {
		ProjectImpl project = new ProjectImpl();
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectManager createProjectManager() {
		ProjectManagerImpl projectManager = new ProjectManagerImpl();
		return projectManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudArchitect createCloudArchitect() {
		CloudArchitectImpl cloudArchitect = new CloudArchitectImpl();
		return cloudArchitect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment createDeployment() {
		DeploymentImpl deployment = new DeploymentImpl();
		return deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudService createCloudService() {
		CloudServiceImpl cloudService = new CloudServiceImpl();
		return cloudService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityAssurance createQualityAssurance() {
		QualityAssuranceImpl qualityAssurance = new QualityAssuranceImpl();
		return qualityAssurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudSolution createCloudSolution() {
		CloudSolutionImpl cloudSolution = new CloudSolutionImpl();
		return cloudSolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DevOpsEngineer createDevOpsEngineer() {
		DevOpsEngineerImpl devOpsEngineer = new DevOpsEngineerImpl();
		return devOpsEngineer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Employee createEmployee() {
		EmployeeImpl employee = new EmployeeImpl();
		return employee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1Package getHw1Package() {
		return (Hw1Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Hw1Package getPackage() {
		return Hw1Package.eINSTANCE;
	}

} //Hw1FactoryImpl
