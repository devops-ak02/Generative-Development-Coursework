/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Factory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore"
 * @generated
 */
public interface Hw1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "hw1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/hw1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "hw1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Hw1Package eINSTANCE = gendev.hw1.impl.Hw1PackageImpl.init();

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.ClientImpl <em>Client</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.ClientImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getClient()
	 * @generated
	 */
	int CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__EMPLOYEE_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Initiates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT__INITIATES = 2;

	/**
	 * The number of structural features of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Client</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.ProjectImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_ID = 0;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__START_DATE = 2;

	/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__END_DATE = 3;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__USES = 4;

	/**
	 * The feature id for the '<em><b>Automates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__AUTOMATES = 5;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.EmployeeImpl <em>Employee</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.EmployeeImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getEmployee()
	 * @generated
	 */
	int EMPLOYEE = 9;

	/**
	 * The feature id for the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__EMPLOYEE_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE__ROLE = 2;

	/**
	 * The number of structural features of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Employee</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYEE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.ProjectManagerImpl <em>Project Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.ProjectManagerImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getProjectManager()
	 * @generated
	 */
	int PROJECT_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MANAGER__EMPLOYEE_ID = EMPLOYEE__EMPLOYEE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MANAGER__NAME = EMPLOYEE__NAME;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MANAGER__ROLE = EMPLOYEE__ROLE;

	/**
	 * The feature id for the '<em><b>Projects Handled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MANAGER__PROJECTS_HANDLED = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Manages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MANAGER__MANAGES = EMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Project Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MANAGER_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Project Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_MANAGER_OPERATION_COUNT = EMPLOYEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.CloudArchitectImpl <em>Cloud Architect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.CloudArchitectImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getCloudArchitect()
	 * @generated
	 */
	int CLOUD_ARCHITECT = 3;

	/**
	 * The feature id for the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ARCHITECT__EMPLOYEE_ID = EMPLOYEE__EMPLOYEE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ARCHITECT__NAME = EMPLOYEE__NAME;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ARCHITECT__ROLE = EMPLOYEE__ROLE;

	/**
	 * The feature id for the '<em><b>Design Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ARCHITECT__DESIGN_ARCHITECTURE = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cloud Architect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ARCHITECT_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cloud Architect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_ARCHITECT_OPERATION_COUNT = EMPLOYEE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.DeploymentImpl <em>Deployment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.DeploymentImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getDeployment()
	 * @generated
	 */
	int DEPLOYMENT = 4;

	/**
	 * The feature id for the '<em><b>Deployment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__DEPLOYMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Deployment Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__DEPLOYMENT_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Qacheck</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__QACHECK = 2;

	/**
	 * The feature id for the '<em><b>Doing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT__DOING = 3;

	/**
	 * The number of structural features of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Inv2</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT___INV2__DIAGNOSTICCHAIN_MAP = 0;

	/**
	 * The number of operations of the '<em>Deployment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPLOYMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.CloudServiceImpl <em>Cloud Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.CloudServiceImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getCloudService()
	 * @generated
	 */
	int CLOUD_SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE__SERVICE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE__SERVICE_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Cloud Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cloud Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.QualityAssuranceImpl <em>Quality Assurance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.QualityAssuranceImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getQualityAssurance()
	 * @generated
	 */
	int QUALITY_ASSURANCE = 6;

	/**
	 * The feature id for the '<em><b>Qualityassurance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE__QUALITYASSURANCE_ID = 0;

	/**
	 * The feature id for the '<em><b>Test Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE__TEST_STATUS = 1;

	/**
	 * The number of structural features of the '<em>Quality Assurance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Quality Assurance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUALITY_ASSURANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.CloudSolutionImpl <em>Cloud Solution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.CloudSolutionImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getCloudSolution()
	 * @generated
	 */
	int CLOUD_SOLUTION = 7;

	/**
	 * The feature id for the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOLUTION__EMPLOYEE_ID = CLOUD_ARCHITECT__EMPLOYEE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOLUTION__NAME = CLOUD_ARCHITECT__NAME;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOLUTION__ROLE = CLOUD_ARCHITECT__ROLE;

	/**
	 * The feature id for the '<em><b>Design Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOLUTION__DESIGN_ARCHITECTURE = CLOUD_ARCHITECT__DESIGN_ARCHITECTURE;

	/**
	 * The feature id for the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOLUTION__SERVICE_NAME = CLOUD_ARCHITECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Service Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOLUTION__SERVICE_TYPE = CLOUD_ARCHITECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Architecture Design</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOLUTION__ARCHITECTURE_DESIGN = CLOUD_ARCHITECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOLUTION__SERVICE_PROVIDER = CLOUD_ARCHITECT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cloud Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOLUTION_FEATURE_COUNT = CLOUD_ARCHITECT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Cloud Solution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_SOLUTION_OPERATION_COUNT = CLOUD_ARCHITECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gendev.hw1.impl.DevOpsEngineerImpl <em>Dev Ops Engineer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gendev.hw1.impl.DevOpsEngineerImpl
	 * @see gendev.hw1.impl.Hw1PackageImpl#getDevOpsEngineer()
	 * @generated
	 */
	int DEV_OPS_ENGINEER = 8;

	/**
	 * The feature id for the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_OPS_ENGINEER__EMPLOYEE_ID = EMPLOYEE__EMPLOYEE_ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_OPS_ENGINEER__NAME = EMPLOYEE__NAME;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_OPS_ENGINEER__ROLE = EMPLOYEE__ROLE;

	/**
	 * The feature id for the '<em><b>Initiate Deployment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_OPS_ENGINEER__INITIATE_DEPLOYMENT = EMPLOYEE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dev Ops Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_OPS_ENGINEER_FEATURE_COUNT = EMPLOYEE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Inv4 Non Empty Initiate Deployment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_OPS_ENGINEER___INV4_NON_EMPTY_INITIATE_DEPLOYMENT__DIAGNOSTICCHAIN_MAP = EMPLOYEE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dev Ops Engineer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEV_OPS_ENGINEER_OPERATION_COUNT = EMPLOYEE_OPERATION_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Client</em>'.
	 * @see gendev.hw1.Client
	 * @generated
	 */
	EClass getClient();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Client#getEmployeeId <em>Employee Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employee Id</em>'.
	 * @see gendev.hw1.Client#getEmployeeId()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_EmployeeId();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Client#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gendev.hw1.Client#getName()
	 * @see #getClient()
	 * @generated
	 */
	EAttribute getClient_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link gendev.hw1.Client#getInitiates <em>Initiates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Initiates</em>'.
	 * @see gendev.hw1.Client#getInitiates()
	 * @see #getClient()
	 * @generated
	 */
	EReference getClient_Initiates();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see gendev.hw1.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Project#getProjectId <em>Project Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Id</em>'.
	 * @see gendev.hw1.Project#getProjectId()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ProjectId();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Project#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see gendev.hw1.Project#getProjectName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ProjectName();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Project#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see gendev.hw1.Project#getStartDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_StartDate();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Project#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see gendev.hw1.Project#getEndDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_EndDate();

	/**
	 * Returns the meta object for the containment reference list '{@link gendev.hw1.Project#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Uses</em>'.
	 * @see gendev.hw1.Project#getUses()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Uses();

	/**
	 * Returns the meta object for the containment reference '{@link gendev.hw1.Project#getAutomates <em>Automates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Automates</em>'.
	 * @see gendev.hw1.Project#getAutomates()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Automates();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.ProjectManager <em>Project Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Manager</em>'.
	 * @see gendev.hw1.ProjectManager
	 * @generated
	 */
	EClass getProjectManager();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.ProjectManager#getProjectsHandled <em>Projects Handled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projects Handled</em>'.
	 * @see gendev.hw1.ProjectManager#getProjectsHandled()
	 * @see #getProjectManager()
	 * @generated
	 */
	EAttribute getProjectManager_ProjectsHandled();

	/**
	 * Returns the meta object for the containment reference list '{@link gendev.hw1.ProjectManager#getManages <em>Manages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Manages</em>'.
	 * @see gendev.hw1.ProjectManager#getManages()
	 * @see #getProjectManager()
	 * @generated
	 */
	EReference getProjectManager_Manages();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.CloudArchitect <em>Cloud Architect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Architect</em>'.
	 * @see gendev.hw1.CloudArchitect
	 * @generated
	 */
	EClass getCloudArchitect();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.CloudArchitect#getDesignArchitecture <em>Design Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Design Architecture</em>'.
	 * @see gendev.hw1.CloudArchitect#getDesignArchitecture()
	 * @see #getCloudArchitect()
	 * @generated
	 */
	EAttribute getCloudArchitect_DesignArchitecture();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deployment</em>'.
	 * @see gendev.hw1.Deployment
	 * @generated
	 */
	EClass getDeployment();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Deployment#getDeploymentId <em>Deployment Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment Id</em>'.
	 * @see gendev.hw1.Deployment#getDeploymentId()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_DeploymentId();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Deployment#getDeploymentStatus <em>Deployment Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deployment Status</em>'.
	 * @see gendev.hw1.Deployment#getDeploymentStatus()
	 * @see #getDeployment()
	 * @generated
	 */
	EAttribute getDeployment_DeploymentStatus();

	/**
	 * Returns the meta object for the reference '{@link gendev.hw1.Deployment#getQacheck <em>Qacheck</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qacheck</em>'.
	 * @see gendev.hw1.Deployment#getQacheck()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Qacheck();

	/**
	 * Returns the meta object for the containment reference list '{@link gendev.hw1.Deployment#getDoing <em>Doing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Doing</em>'.
	 * @see gendev.hw1.Deployment#getDoing()
	 * @see #getDeployment()
	 * @generated
	 */
	EReference getDeployment_Doing();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.Deployment#inv2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Inv2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inv2</em>' operation.
	 * @see gendev.hw1.Deployment#inv2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDeployment__Inv2__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.CloudService <em>Cloud Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Service</em>'.
	 * @see gendev.hw1.CloudService
	 * @generated
	 */
	EClass getCloudService();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.CloudService#getServiceName <em>Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Name</em>'.
	 * @see gendev.hw1.CloudService#getServiceName()
	 * @see #getCloudService()
	 * @generated
	 */
	EAttribute getCloudService_ServiceName();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.CloudService#getServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Type</em>'.
	 * @see gendev.hw1.CloudService#getServiceType()
	 * @see #getCloudService()
	 * @generated
	 */
	EAttribute getCloudService_ServiceType();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.QualityAssurance <em>Quality Assurance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quality Assurance</em>'.
	 * @see gendev.hw1.QualityAssurance
	 * @generated
	 */
	EClass getQualityAssurance();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.QualityAssurance#getQualityassuranceId <em>Qualityassurance Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualityassurance Id</em>'.
	 * @see gendev.hw1.QualityAssurance#getQualityassuranceId()
	 * @see #getQualityAssurance()
	 * @generated
	 */
	EAttribute getQualityAssurance_QualityassuranceId();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.QualityAssurance#getTestStatus <em>Test Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Status</em>'.
	 * @see gendev.hw1.QualityAssurance#getTestStatus()
	 * @see #getQualityAssurance()
	 * @generated
	 */
	EAttribute getQualityAssurance_TestStatus();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.CloudSolution <em>Cloud Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Solution</em>'.
	 * @see gendev.hw1.CloudSolution
	 * @generated
	 */
	EClass getCloudSolution();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.CloudSolution#getArchitectureDesign <em>Architecture Design</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture Design</em>'.
	 * @see gendev.hw1.CloudSolution#getArchitectureDesign()
	 * @see #getCloudSolution()
	 * @generated
	 */
	EAttribute getCloudSolution_ArchitectureDesign();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.CloudSolution#getServiceProvider <em>Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Service Provider</em>'.
	 * @see gendev.hw1.CloudSolution#getServiceProvider()
	 * @see #getCloudSolution()
	 * @generated
	 */
	EAttribute getCloudSolution_ServiceProvider();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.DevOpsEngineer <em>Dev Ops Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dev Ops Engineer</em>'.
	 * @see gendev.hw1.DevOpsEngineer
	 * @generated
	 */
	EClass getDevOpsEngineer();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.DevOpsEngineer#getInitiateDeployment <em>Initiate Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initiate Deployment</em>'.
	 * @see gendev.hw1.DevOpsEngineer#getInitiateDeployment()
	 * @see #getDevOpsEngineer()
	 * @generated
	 */
	EAttribute getDevOpsEngineer_InitiateDeployment();

	/**
	 * Returns the meta object for the '{@link gendev.hw1.DevOpsEngineer#inv4_NonEmptyInitiateDeployment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Inv4 Non Empty Initiate Deployment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Inv4 Non Empty Initiate Deployment</em>' operation.
	 * @see gendev.hw1.DevOpsEngineer#inv4_NonEmptyInitiateDeployment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getDevOpsEngineer__Inv4_NonEmptyInitiateDeployment__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link gendev.hw1.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employee</em>'.
	 * @see gendev.hw1.Employee
	 * @generated
	 */
	EClass getEmployee();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Employee#getEmployeeId <em>Employee Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Employee Id</em>'.
	 * @see gendev.hw1.Employee#getEmployeeId()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_EmployeeId();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Employee#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gendev.hw1.Employee#getName()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Name();

	/**
	 * Returns the meta object for the attribute '{@link gendev.hw1.Employee#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see gendev.hw1.Employee#getRole()
	 * @see #getEmployee()
	 * @generated
	 */
	EAttribute getEmployee_Role();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Hw1Factory getHw1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.ClientImpl <em>Client</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.ClientImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getClient()
		 * @generated
		 */
		EClass CLIENT = eINSTANCE.getClient();

		/**
		 * The meta object literal for the '<em><b>Employee Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__EMPLOYEE_ID = eINSTANCE.getClient_EmployeeId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIENT__NAME = eINSTANCE.getClient_Name();

		/**
		 * The meta object literal for the '<em><b>Initiates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIENT__INITIATES = eINSTANCE.getClient_Initiates();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.ProjectImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Project Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PROJECT_ID = eINSTANCE.getProject_ProjectId();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PROJECT_NAME = eINSTANCE.getProject_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__START_DATE = eINSTANCE.getProject_StartDate();

		/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__END_DATE = eINSTANCE.getProject_EndDate();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__USES = eINSTANCE.getProject_Uses();

		/**
		 * The meta object literal for the '<em><b>Automates</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__AUTOMATES = eINSTANCE.getProject_Automates();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.ProjectManagerImpl <em>Project Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.ProjectManagerImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getProjectManager()
		 * @generated
		 */
		EClass PROJECT_MANAGER = eINSTANCE.getProjectManager();

		/**
		 * The meta object literal for the '<em><b>Projects Handled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_MANAGER__PROJECTS_HANDLED = eINSTANCE.getProjectManager_ProjectsHandled();

		/**
		 * The meta object literal for the '<em><b>Manages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT_MANAGER__MANAGES = eINSTANCE.getProjectManager_Manages();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.CloudArchitectImpl <em>Cloud Architect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.CloudArchitectImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getCloudArchitect()
		 * @generated
		 */
		EClass CLOUD_ARCHITECT = eINSTANCE.getCloudArchitect();

		/**
		 * The meta object literal for the '<em><b>Design Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_ARCHITECT__DESIGN_ARCHITECTURE = eINSTANCE.getCloudArchitect_DesignArchitecture();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.DeploymentImpl <em>Deployment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.DeploymentImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getDeployment()
		 * @generated
		 */
		EClass DEPLOYMENT = eINSTANCE.getDeployment();

		/**
		 * The meta object literal for the '<em><b>Deployment Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__DEPLOYMENT_ID = eINSTANCE.getDeployment_DeploymentId();

		/**
		 * The meta object literal for the '<em><b>Deployment Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPLOYMENT__DEPLOYMENT_STATUS = eINSTANCE.getDeployment_DeploymentStatus();

		/**
		 * The meta object literal for the '<em><b>Qacheck</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__QACHECK = eINSTANCE.getDeployment_Qacheck();

		/**
		 * The meta object literal for the '<em><b>Doing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPLOYMENT__DOING = eINSTANCE.getDeployment_Doing();

		/**
		 * The meta object literal for the '<em><b>Inv2</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEPLOYMENT___INV2__DIAGNOSTICCHAIN_MAP = eINSTANCE.getDeployment__Inv2__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.CloudServiceImpl <em>Cloud Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.CloudServiceImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getCloudService()
		 * @generated
		 */
		EClass CLOUD_SERVICE = eINSTANCE.getCloudService();

		/**
		 * The meta object literal for the '<em><b>Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_SERVICE__SERVICE_NAME = eINSTANCE.getCloudService_ServiceName();

		/**
		 * The meta object literal for the '<em><b>Service Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_SERVICE__SERVICE_TYPE = eINSTANCE.getCloudService_ServiceType();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.QualityAssuranceImpl <em>Quality Assurance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.QualityAssuranceImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getQualityAssurance()
		 * @generated
		 */
		EClass QUALITY_ASSURANCE = eINSTANCE.getQualityAssurance();

		/**
		 * The meta object literal for the '<em><b>Qualityassurance Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_ASSURANCE__QUALITYASSURANCE_ID = eINSTANCE.getQualityAssurance_QualityassuranceId();

		/**
		 * The meta object literal for the '<em><b>Test Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUALITY_ASSURANCE__TEST_STATUS = eINSTANCE.getQualityAssurance_TestStatus();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.CloudSolutionImpl <em>Cloud Solution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.CloudSolutionImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getCloudSolution()
		 * @generated
		 */
		EClass CLOUD_SOLUTION = eINSTANCE.getCloudSolution();

		/**
		 * The meta object literal for the '<em><b>Architecture Design</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_SOLUTION__ARCHITECTURE_DESIGN = eINSTANCE.getCloudSolution_ArchitectureDesign();

		/**
		 * The meta object literal for the '<em><b>Service Provider</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_SOLUTION__SERVICE_PROVIDER = eINSTANCE.getCloudSolution_ServiceProvider();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.DevOpsEngineerImpl <em>Dev Ops Engineer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.DevOpsEngineerImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getDevOpsEngineer()
		 * @generated
		 */
		EClass DEV_OPS_ENGINEER = eINSTANCE.getDevOpsEngineer();

		/**
		 * The meta object literal for the '<em><b>Initiate Deployment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEV_OPS_ENGINEER__INITIATE_DEPLOYMENT = eINSTANCE.getDevOpsEngineer_InitiateDeployment();

		/**
		 * The meta object literal for the '<em><b>Inv4 Non Empty Initiate Deployment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DEV_OPS_ENGINEER___INV4_NON_EMPTY_INITIATE_DEPLOYMENT__DIAGNOSTICCHAIN_MAP = eINSTANCE
				.getDevOpsEngineer__Inv4_NonEmptyInitiateDeployment__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link gendev.hw1.impl.EmployeeImpl <em>Employee</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gendev.hw1.impl.EmployeeImpl
		 * @see gendev.hw1.impl.Hw1PackageImpl#getEmployee()
		 * @generated
		 */
		EClass EMPLOYEE = eINSTANCE.getEmployee();

		/**
		 * The meta object literal for the '<em><b>Employee Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__EMPLOYEE_ID = eINSTANCE.getEmployee_EmployeeId();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__NAME = eINSTANCE.getEmployee_Name();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPLOYEE__ROLE = eINSTANCE.getEmployee_Role();

	}

} //Hw1Package
