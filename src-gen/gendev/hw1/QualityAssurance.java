/**
 */
package gendev.hw1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quality Assurance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.QualityAssurance#getQualityassuranceId <em>Qualityassurance Id</em>}</li>
 *   <li>{@link gendev.hw1.QualityAssurance#getTestStatus <em>Test Status</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getQualityAssurance()
 * @model
 * @generated
 */
public interface QualityAssurance extends EObject {
	/**
	 * Returns the value of the '<em><b>Qualityassurance Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qualityassurance Id</em>' attribute.
	 * @see #setQualityassuranceId(String)
	 * @see gendev.hw1.Hw1Package#getQualityAssurance_QualityassuranceId()
	 * @model
	 * @generated
	 */
	String getQualityassuranceId();

	/**
	 * Sets the value of the '{@link gendev.hw1.QualityAssurance#getQualityassuranceId <em>Qualityassurance Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qualityassurance Id</em>' attribute.
	 * @see #getQualityassuranceId()
	 * @generated
	 */
	void setQualityassuranceId(String value);

	/**
	 * Returns the value of the '<em><b>Test Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Status</em>' attribute.
	 * @see #setTestStatus(String)
	 * @see gendev.hw1.Hw1Package#getQualityAssurance_TestStatus()
	 * @model
	 * @generated
	 */
	String getTestStatus();

	/**
	 * Sets the value of the '{@link gendev.hw1.QualityAssurance#getTestStatus <em>Test Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Test Status</em>' attribute.
	 * @see #getTestStatus()
	 * @generated
	 */
	void setTestStatus(String value);

} // QualityAssurance
