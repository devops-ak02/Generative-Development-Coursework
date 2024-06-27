/**
 */
package gendev.hw1.impl;

import gendev.hw1.CloudService;
import gendev.hw1.CloudSolution;
import gendev.hw1.Hw1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Solution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.CloudSolutionImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link gendev.hw1.impl.CloudSolutionImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link gendev.hw1.impl.CloudSolutionImpl#getArchitectureDesign <em>Architecture Design</em>}</li>
 *   <li>{@link gendev.hw1.impl.CloudSolutionImpl#getServiceProvider <em>Service Provider</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudSolutionImpl extends CloudArchitectImpl implements CloudSolution {
	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected String serviceType = SERVICE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getArchitectureDesign() <em>Architecture Design</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitectureDesign()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHITECTURE_DESIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchitectureDesign() <em>Architecture Design</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchitectureDesign()
	 * @generated
	 * @ordered
	 */
	protected String architectureDesign = ARCHITECTURE_DESIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceProvider() <em>Service Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProvider()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_PROVIDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceProvider() <em>Service Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProvider()
	 * @generated
	 * @ordered
	 */
	protected String serviceProvider = SERVICE_PROVIDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudSolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.CLOUD_SOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CLOUD_SOLUTION__SERVICE_NAME,
					oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceType() {
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceType(String newServiceType) {
		String oldServiceType = serviceType;
		serviceType = newServiceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CLOUD_SOLUTION__SERVICE_TYPE,
					oldServiceType, serviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchitectureDesign() {
		return architectureDesign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitectureDesign(String newArchitectureDesign) {
		String oldArchitectureDesign = architectureDesign;
		architectureDesign = newArchitectureDesign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CLOUD_SOLUTION__ARCHITECTURE_DESIGN,
					oldArchitectureDesign, architectureDesign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceProvider() {
		return serviceProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceProvider(String newServiceProvider) {
		String oldServiceProvider = serviceProvider;
		serviceProvider = newServiceProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CLOUD_SOLUTION__SERVICE_PROVIDER,
					oldServiceProvider, serviceProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.CLOUD_SOLUTION__SERVICE_NAME:
			return getServiceName();
		case Hw1Package.CLOUD_SOLUTION__SERVICE_TYPE:
			return getServiceType();
		case Hw1Package.CLOUD_SOLUTION__ARCHITECTURE_DESIGN:
			return getArchitectureDesign();
		case Hw1Package.CLOUD_SOLUTION__SERVICE_PROVIDER:
			return getServiceProvider();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Hw1Package.CLOUD_SOLUTION__SERVICE_NAME:
			setServiceName((String) newValue);
			return;
		case Hw1Package.CLOUD_SOLUTION__SERVICE_TYPE:
			setServiceType((String) newValue);
			return;
		case Hw1Package.CLOUD_SOLUTION__ARCHITECTURE_DESIGN:
			setArchitectureDesign((String) newValue);
			return;
		case Hw1Package.CLOUD_SOLUTION__SERVICE_PROVIDER:
			setServiceProvider((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Hw1Package.CLOUD_SOLUTION__SERVICE_NAME:
			setServiceName(SERVICE_NAME_EDEFAULT);
			return;
		case Hw1Package.CLOUD_SOLUTION__SERVICE_TYPE:
			setServiceType(SERVICE_TYPE_EDEFAULT);
			return;
		case Hw1Package.CLOUD_SOLUTION__ARCHITECTURE_DESIGN:
			setArchitectureDesign(ARCHITECTURE_DESIGN_EDEFAULT);
			return;
		case Hw1Package.CLOUD_SOLUTION__SERVICE_PROVIDER:
			setServiceProvider(SERVICE_PROVIDER_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Hw1Package.CLOUD_SOLUTION__SERVICE_NAME:
			return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
		case Hw1Package.CLOUD_SOLUTION__SERVICE_TYPE:
			return SERVICE_TYPE_EDEFAULT == null ? serviceType != null : !SERVICE_TYPE_EDEFAULT.equals(serviceType);
		case Hw1Package.CLOUD_SOLUTION__ARCHITECTURE_DESIGN:
			return ARCHITECTURE_DESIGN_EDEFAULT == null ? architectureDesign != null
					: !ARCHITECTURE_DESIGN_EDEFAULT.equals(architectureDesign);
		case Hw1Package.CLOUD_SOLUTION__SERVICE_PROVIDER:
			return SERVICE_PROVIDER_EDEFAULT == null ? serviceProvider != null
					: !SERVICE_PROVIDER_EDEFAULT.equals(serviceProvider);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CloudService.class) {
			switch (derivedFeatureID) {
			case Hw1Package.CLOUD_SOLUTION__SERVICE_NAME:
				return Hw1Package.CLOUD_SERVICE__SERVICE_NAME;
			case Hw1Package.CLOUD_SOLUTION__SERVICE_TYPE:
				return Hw1Package.CLOUD_SERVICE__SERVICE_TYPE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CloudService.class) {
			switch (baseFeatureID) {
			case Hw1Package.CLOUD_SERVICE__SERVICE_NAME:
				return Hw1Package.CLOUD_SOLUTION__SERVICE_NAME;
			case Hw1Package.CLOUD_SERVICE__SERVICE_TYPE:
				return Hw1Package.CLOUD_SOLUTION__SERVICE_TYPE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (serviceName: ");
		result.append(serviceName);
		result.append(", serviceType: ");
		result.append(serviceType);
		result.append(", architectureDesign: ");
		result.append(architectureDesign);
		result.append(", serviceProvider: ");
		result.append(serviceProvider);
		result.append(')');
		return result.toString();
	}

} //CloudSolutionImpl
