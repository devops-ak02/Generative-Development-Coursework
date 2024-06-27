/**
 */
package gendev.hw1;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.ProjectManager#getProjectsHandled <em>Projects Handled</em>}</li>
 *   <li>{@link gendev.hw1.ProjectManager#getManages <em>Manages</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getProjectManager()
 * @model
 * @generated
 */
public interface ProjectManager extends Employee {
	/**
	 * Returns the value of the '<em><b>Projects Handled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projects Handled</em>' attribute.
	 * @see #setProjectsHandled(int)
	 * @see gendev.hw1.Hw1Package#getProjectManager_ProjectsHandled()
	 * @model required="true"
	 * @generated
	 */
	int getProjectsHandled();

	/**
	 * Sets the value of the '{@link gendev.hw1.ProjectManager#getProjectsHandled <em>Projects Handled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projects Handled</em>' attribute.
	 * @see #getProjectsHandled()
	 * @generated
	 */
	void setProjectsHandled(int value);

	/**
	 * Returns the value of the '<em><b>Manages</b></em>' containment reference list.
	 * The list contents are of type {@link gendev.hw1.Project}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manages</em>' containment reference list.
	 * @see gendev.hw1.Hw1Package#getProjectManager_Manages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Project> getManages();

} // ProjectManager
