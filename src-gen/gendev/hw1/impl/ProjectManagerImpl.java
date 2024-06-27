/**
 */
package gendev.hw1.impl;

import gendev.hw1.Hw1Package;
import gendev.hw1.Project;
import gendev.hw1.ProjectManager;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.ProjectManagerImpl#getProjectsHandled <em>Projects Handled</em>}</li>
 *   <li>{@link gendev.hw1.impl.ProjectManagerImpl#getManages <em>Manages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectManagerImpl extends EmployeeImpl implements ProjectManager {
	/**
	 * The default value of the '{@link #getProjectsHandled() <em>Projects Handled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectsHandled()
	 * @generated
	 * @ordered
	 */
	protected static final int PROJECTS_HANDLED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProjectsHandled() <em>Projects Handled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectsHandled()
	 * @generated
	 * @ordered
	 */
	protected int projectsHandled = PROJECTS_HANDLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getManages() <em>Manages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManages()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> manages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.PROJECT_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getProjectsHandled() {
		return projectsHandled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectsHandled(int newProjectsHandled) {
		int oldProjectsHandled = projectsHandled;
		projectsHandled = newProjectsHandled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PROJECT_MANAGER__PROJECTS_HANDLED,
					oldProjectsHandled, projectsHandled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getManages() {
		if (manages == null) {
			manages = new EObjectContainmentEList<Project>(Project.class, this, Hw1Package.PROJECT_MANAGER__MANAGES);
		}
		return manages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.PROJECT_MANAGER__MANAGES:
			return ((InternalEList<?>) getManages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.PROJECT_MANAGER__PROJECTS_HANDLED:
			return getProjectsHandled();
		case Hw1Package.PROJECT_MANAGER__MANAGES:
			return getManages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Hw1Package.PROJECT_MANAGER__PROJECTS_HANDLED:
			setProjectsHandled((Integer) newValue);
			return;
		case Hw1Package.PROJECT_MANAGER__MANAGES:
			getManages().clear();
			getManages().addAll((Collection<? extends Project>) newValue);
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
		case Hw1Package.PROJECT_MANAGER__PROJECTS_HANDLED:
			setProjectsHandled(PROJECTS_HANDLED_EDEFAULT);
			return;
		case Hw1Package.PROJECT_MANAGER__MANAGES:
			getManages().clear();
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
		case Hw1Package.PROJECT_MANAGER__PROJECTS_HANDLED:
			return projectsHandled != PROJECTS_HANDLED_EDEFAULT;
		case Hw1Package.PROJECT_MANAGER__MANAGES:
			return manages != null && !manages.isEmpty();
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
		result.append(" (projectsHandled: ");
		result.append(projectsHandled);
		result.append(')');
		return result.toString();
	}

} //ProjectManagerImpl
