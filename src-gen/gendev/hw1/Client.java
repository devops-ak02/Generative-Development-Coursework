/**
 */
package gendev.hw1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Client#getEmployeeId <em>Employee Id</em>}</li>
 *   <li>{@link gendev.hw1.Client#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.Client#getInitiates <em>Initiates</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getClient()
 * @model
 * @generated
 */
public interface Client extends EObject {
	/**
	 * Returns the value of the '<em><b>Employee Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employee Id</em>' attribute.
	 * @see #setEmployeeId(String)
	 * @see gendev.hw1.Hw1Package#getClient_EmployeeId()
	 * @model
	 * @generated
	 */
	String getEmployeeId();

	/**
	 * Sets the value of the '{@link gendev.hw1.Client#getEmployeeId <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Employee Id</em>' attribute.
	 * @see #getEmployeeId()
	 * @generated
	 */
	void setEmployeeId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see gendev.hw1.Hw1Package#getClient_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link gendev.hw1.Client#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Initiates</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiates</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getClient_Initiates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Project> getInitiates();

} // Client
