/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.QualityAssurance;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Quality Assurance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.QualityAssuranceImpl#getQualityassuranceId <em>Qualityassurance Id</em>}</li>
 *   <li>{@link gendev.hw1.impl.QualityAssuranceImpl#getTestStatus <em>Test Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualityAssuranceImpl extends MinimalEObjectImpl.Container implements QualityAssurance {
	/**
	 * The default value of the '{@link #getQualityassuranceId() <em>Qualityassurance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityassuranceId()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALITYASSURANCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualityassuranceId() <em>Qualityassurance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualityassuranceId()
	 * @generated
	 * @ordered
	 */
	protected String qualityassuranceId = QUALITYASSURANCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTestStatus() <em>Test Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String TEST_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTestStatus() <em>Test Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestStatus()
	 * @generated
	 * @ordered
	 */
	protected String testStatus = TEST_STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QualityAssuranceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.QUALITY_ASSURANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getQualityassuranceId() {
		return qualityassuranceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQualityassuranceId(String newQualityassuranceId) {
		String oldQualityassuranceId = qualityassuranceId;
		qualityassuranceId = newQualityassuranceId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.QUALITY_ASSURANCE__QUALITYASSURANCE_ID,
					oldQualityassuranceId, qualityassuranceId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTestStatus() {
		return testStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestStatus(String newTestStatus) {
		String oldTestStatus = testStatus;
		testStatus = newTestStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.QUALITY_ASSURANCE__TEST_STATUS,
					oldTestStatus, testStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.QUALITY_ASSURANCE__QUALITYASSURANCE_ID:
			return getQualityassuranceId();
		case Hw1Package.QUALITY_ASSURANCE__TEST_STATUS:
			return getTestStatus();
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
		case Hw1Package.QUALITY_ASSURANCE__QUALITYASSURANCE_ID:
			setQualityassuranceId((String) newValue);
			return;
		case Hw1Package.QUALITY_ASSURANCE__TEST_STATUS:
			setTestStatus((String) newValue);
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
		case Hw1Package.QUALITY_ASSURANCE__QUALITYASSURANCE_ID:
			setQualityassuranceId(QUALITYASSURANCE_ID_EDEFAULT);
			return;
		case Hw1Package.QUALITY_ASSURANCE__TEST_STATUS:
			setTestStatus(TEST_STATUS_EDEFAULT);
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
		case Hw1Package.QUALITY_ASSURANCE__QUALITYASSURANCE_ID:
			return QUALITYASSURANCE_ID_EDEFAULT == null ? qualityassuranceId != null
					: !QUALITYASSURANCE_ID_EDEFAULT.equals(qualityassuranceId);
		case Hw1Package.QUALITY_ASSURANCE__TEST_STATUS:
			return TEST_STATUS_EDEFAULT == null ? testStatus != null : !TEST_STATUS_EDEFAULT.equals(testStatus);
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
		result.append(" (qualityassuranceId: ");
		result.append(qualityassuranceId);
		result.append(", testStatus: ");
		result.append(testStatus);
		result.append(')');
		return result.toString();
	}

} //QualityAssuranceImpl
