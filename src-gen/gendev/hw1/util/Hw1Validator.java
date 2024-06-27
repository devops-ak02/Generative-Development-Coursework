/**
 */
package gendev.hw1.util;

import gendev.hw1.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Package
 * @generated
 */
public class Hw1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Hw1Validator INSTANCE = new Hw1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "gendev.hw1";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Inv2' of 'Deployment'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEPLOYMENT__INV2 = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Inv4 Non Empty Initiate Deployment' of 'Dev Ops Engineer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DEV_OPS_ENGINEER__INV4_NON_EMPTY_INITIATE_DEPLOYMENT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Hw1Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Hw1Package.CLIENT:
			return validateClient((Client) value, diagnostics, context);
		case Hw1Package.PROJECT:
			return validateProject((Project) value, diagnostics, context);
		case Hw1Package.PROJECT_MANAGER:
			return validateProjectManager((ProjectManager) value, diagnostics, context);
		case Hw1Package.CLOUD_ARCHITECT:
			return validateCloudArchitect((CloudArchitect) value, diagnostics, context);
		case Hw1Package.DEPLOYMENT:
			return validateDeployment((Deployment) value, diagnostics, context);
		case Hw1Package.CLOUD_SERVICE:
			return validateCloudService((CloudService) value, diagnostics, context);
		case Hw1Package.QUALITY_ASSURANCE:
			return validateQualityAssurance((QualityAssurance) value, diagnostics, context);
		case Hw1Package.CLOUD_SOLUTION:
			return validateCloudSolution((CloudSolution) value, diagnostics, context);
		case Hw1Package.DEV_OPS_ENGINEER:
			return validateDevOpsEngineer((DevOpsEngineer) value, diagnostics, context);
		case Hw1Package.EMPLOYEE:
			return validateEmployee((Employee) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClient(Client client, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(client, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProject(Project project, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(project, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProjectManager(ProjectManager projectManager, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(projectManager, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudArchitect(CloudArchitect cloudArchitect, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cloudArchitect, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployment(Deployment deployment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(deployment, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(deployment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(deployment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(deployment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(deployment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(deployment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(deployment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(deployment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(deployment, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDeployment_inv2(deployment, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inv2 constraint of '<em>Deployment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeployment_inv2(Deployment deployment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return deployment.inv2(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudService(CloudService cloudService, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cloudService, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQualityAssurance(QualityAssurance qualityAssurance, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qualityAssurance, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCloudSolution(CloudSolution cloudSolution, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cloudSolution, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevOpsEngineer(DevOpsEngineer devOpsEngineer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(devOpsEngineer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(devOpsEngineer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(devOpsEngineer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(devOpsEngineer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(devOpsEngineer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(devOpsEngineer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(devOpsEngineer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(devOpsEngineer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(devOpsEngineer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateDevOpsEngineer_inv4_NonEmptyInitiateDeployment(devOpsEngineer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inv4_NonEmptyInitiateDeployment constraint of '<em>Dev Ops Engineer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDevOpsEngineer_inv4_NonEmptyInitiateDeployment(DevOpsEngineer devOpsEngineer,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return devOpsEngineer.inv4_NonEmptyInitiateDeployment(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmployee(Employee employee, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(employee, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Hw1Validator
