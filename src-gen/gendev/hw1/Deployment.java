/**
 */
package gendev.hw1;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Deployment#getDeploymentId <em>Deployment Id</em>}</li>
 *   <li>{@link gendev.hw1.Deployment#getDeploymentStatus <em>Deployment Status</em>}</li>
 *   <li>{@link gendev.hw1.Deployment#getQacheck <em>Qacheck</em>}</li>
 *   <li>{@link gendev.hw1.Deployment#getDoing <em>Doing</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getDeployment()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='inv2'"
 * @generated
 */
public interface Deployment extends EObject {
	/**
	 * Returns the value of the '<em><b>Deployment Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Id</em>' attribute.
	 * @see #setDeploymentId(String)
	 * @see gendev.hw1.Hw1Package#getDeployment_DeploymentId()
	 * @model
	 * @generated
	 */
	String getDeploymentId();

	/**
	 * Sets the value of the '{@link gendev.hw1.Deployment#getDeploymentId <em>Deployment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Id</em>' attribute.
	 * @see #getDeploymentId()
	 * @generated
	 */
	void setDeploymentId(String value);

	/**
	 * Returns the value of the '<em><b>Deployment Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment Status</em>' attribute.
	 * @see #setDeploymentStatus(String)
	 * @see gendev.hw1.Hw1Package#getDeployment_DeploymentStatus()
	 * @model
	 * @generated
	 */
	String getDeploymentStatus();

	/**
	 * Sets the value of the '{@link gendev.hw1.Deployment#getDeploymentStatus <em>Deployment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Status</em>' attribute.
	 * @see #getDeploymentStatus()
	 * @generated
	 */
	void setDeploymentStatus(String value);

	/**
	 * Returns the value of the '<em><b>Qacheck</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qacheck</em>' reference.
	 * @see #setQacheck(QualityAssurance)
	 * @see gendev.hw1.Hw1Package#getDeployment_Qacheck()
	 * @model
	 * @generated
	 */
	QualityAssurance getQacheck();

	/**
	 * Sets the value of the '{@link gendev.hw1.Deployment#getQacheck <em>Qacheck</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qacheck</em>' reference.
	 * @see #getQacheck()
	 * @generated
	 */
	void setQacheck(QualityAssurance value);

	/**
	 * Returns the value of the '<em><b>Doing</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.DevOpsEngineer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Doing</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getDeployment_Doing()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DevOpsEngineer> getDoing();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.doing-&gt;size() &gt; 1 implies self.deploymentStatus = \'Passed\''"
	 * @generated
	 */
	boolean inv2(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Deployment
