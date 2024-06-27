/**
 */
package gendev.hw1;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.Project#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link gendev.hw1.Project#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link gendev.hw1.Project#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link gendev.hw1.Project#getEndDate <em>End Date</em>}</li>
 *   <li>{@link gendev.hw1.Project#getUses <em>Uses</em>}</li>
 *   <li>{@link gendev.hw1.Project#getAutomates <em>Automates</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Project Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Id</em>' attribute.
	 * @see #setProjectId(String)
	 * @see gendev.hw1.Hw1Package#getProject_ProjectId()
	 * @model
	 * @generated
	 */
	String getProjectId();

	/**
	 * Sets the value of the '{@link gendev.hw1.Project#getProjectId <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Id</em>' attribute.
	 * @see #getProjectId()
	 * @generated
	 */
	void setProjectId(String value);

	/**
	 * Returns the value of the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project Name</em>' attribute.
	 * @see #setProjectName(String)
	 * @see gendev.hw1.Hw1Package#getProject_ProjectName()
	 * @model
	 * @generated
	 */
	String getProjectName();

	/**
	 * Sets the value of the '{@link gendev.hw1.Project#getProjectName <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project Name</em>' attribute.
	 * @see #getProjectName()
	 * @generated
	 */
	void setProjectName(String value);

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see gendev.hw1.Hw1Package#getProject_StartDate()
	 * @model
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link gendev.hw1.Project#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see gendev.hw1.Hw1Package#getProject_EndDate()
	 * @model
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link gendev.hw1.Project#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.CloudService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getProject_Uses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<CloudService> getUses();

	/**
	 * Returns the value of the '<em><b>Automates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automates</em>' containment reference.
	 * @see #setAutomates(Deployment)
	 * @see gendev.hw1.Hw1Package#getProject_Automates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Deployment getAutomates();

	/**
	 * Sets the value of the '{@link gendev.hw1.Project#getAutomates <em>Automates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automates</em>' containment reference.
	 * @see #getAutomates()
	 * @generated
	 */
	void setAutomates(Deployment value);

} // Project
