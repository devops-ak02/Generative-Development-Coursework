/**
 */
package gendev.hw1;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dev Ops Engineer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.DevOpsEngineer#getInitiateDeployment <em>Initiate Deployment</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getDevOpsEngineer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='inv4_NonEmptyInitiateDeployment'"
 * @generated
 */
public interface DevOpsEngineer extends Employee {
	/**
	 * Returns the value of the '<em><b>Initiate Deployment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiate Deployment</em>' attribute.
	 * @see #setInitiateDeployment(String)
	 * @see gendev.hw1.Hw1Package#getDevOpsEngineer_InitiateDeployment()
	 * @model
	 * @generated
	 */
	String getInitiateDeployment();

	/**
	 * Sets the value of the '{@link gendev.hw1.DevOpsEngineer#getInitiateDeployment <em>Initiate Deployment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiate Deployment</em>' attribute.
	 * @see #getInitiateDeployment()
	 * @generated
	 */
	void setInitiateDeployment(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='\n        self.initiateDeployment-&gt;notEmpty()'"
	 * @generated
	 */
	boolean inv4_NonEmptyInitiateDeployment(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DevOpsEngineer
