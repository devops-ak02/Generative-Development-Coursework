/**
 */
package gendev.hw1.impl;

import gendev.hw1.CloudArchitect;
import gendev.hw1.Hw1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Architect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.CloudArchitectImpl#getDesignArchitecture <em>Design Architecture</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CloudArchitectImpl extends EmployeeImpl implements CloudArchitect {
	/**
	 * The default value of the '{@link #getDesignArchitecture() <em>Design Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final String DESIGN_ARCHITECTURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDesignArchitecture() <em>Design Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDesignArchitecture()
	 * @generated
	 * @ordered
	 */
	protected String designArchitecture = DESIGN_ARCHITECTURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudArchitectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.CLOUD_ARCHITECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDesignArchitecture() {
		return designArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDesignArchitecture(String newDesignArchitecture) {
		String oldDesignArchitecture = designArchitecture;
		designArchitecture = newDesignArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CLOUD_ARCHITECT__DESIGN_ARCHITECTURE,
					oldDesignArchitecture, designArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.CLOUD_ARCHITECT__DESIGN_ARCHITECTURE:
			return getDesignArchitecture();
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
		case Hw1Package.CLOUD_ARCHITECT__DESIGN_ARCHITECTURE:
			setDesignArchitecture((String) newValue);
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
		case Hw1Package.CLOUD_ARCHITECT__DESIGN_ARCHITECTURE:
			setDesignArchitecture(DESIGN_ARCHITECTURE_EDEFAULT);
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
		case Hw1Package.CLOUD_ARCHITECT__DESIGN_ARCHITECTURE:
			return DESIGN_ARCHITECTURE_EDEFAULT == null ? designArchitecture != null
					: !DESIGN_ARCHITECTURE_EDEFAULT.equals(designArchitecture);
		}
		return super.eIsSet(featureID);
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
		result.append(" (designArchitecture: ");
		result.append(designArchitecture);
		result.append(')');
		return result.toString();
	}

} //CloudArchitectImpl
