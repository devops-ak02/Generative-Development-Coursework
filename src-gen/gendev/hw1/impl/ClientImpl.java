/**
 */
package gendev.hw1.impl;

import gendev.hw1.Client;
import gendev.hw1.Hw1Package;
import gendev.hw1.Project;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.ClientImpl#getEmployeeId <em>Employee Id</em>}</li>
 *   <li>{@link gendev.hw1.impl.ClientImpl#getName <em>Name</em>}</li>
 *   <li>{@link gendev.hw1.impl.ClientImpl#getInitiates <em>Initiates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientImpl extends MinimalEObjectImpl.Container implements Client {
	/**
	 * The default value of the '{@link #getEmployeeId() <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeId()
	 * @generated
	 * @ordered
	 */
	protected static final String EMPLOYEE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmployeeId() <em>Employee Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployeeId()
	 * @generated
	 * @ordered
	 */
	protected String employeeId = EMPLOYEE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitiates() <em>Initiates</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiates()
	 * @generated
	 * @ordered
	 */
	protected EList<Project> initiates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.CLIENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmployeeId(String newEmployeeId) {
		String oldEmployeeId = employeeId;
		employeeId = newEmployeeId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CLIENT__EMPLOYEE_ID, oldEmployeeId,
					employeeId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.CLIENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Project> getInitiates() {
		if (initiates == null) {
			initiates = new EObjectContainmentEList<Project>(Project.class, this, Hw1Package.CLIENT__INITIATES);
		}
		return initiates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.CLIENT__INITIATES:
			return ((InternalEList<?>) getInitiates()).basicRemove(otherEnd, msgs);
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
		case Hw1Package.CLIENT__EMPLOYEE_ID:
			return getEmployeeId();
		case Hw1Package.CLIENT__NAME:
			return getName();
		case Hw1Package.CLIENT__INITIATES:
			return getInitiates();
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
		case Hw1Package.CLIENT__EMPLOYEE_ID:
			setEmployeeId((String) newValue);
			return;
		case Hw1Package.CLIENT__NAME:
			setName((String) newValue);
			return;
		case Hw1Package.CLIENT__INITIATES:
			getInitiates().clear();
			getInitiates().addAll((Collection<? extends Project>) newValue);
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
		case Hw1Package.CLIENT__EMPLOYEE_ID:
			setEmployeeId(EMPLOYEE_ID_EDEFAULT);
			return;
		case Hw1Package.CLIENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Hw1Package.CLIENT__INITIATES:
			getInitiates().clear();
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
		case Hw1Package.CLIENT__EMPLOYEE_ID:
			return EMPLOYEE_ID_EDEFAULT == null ? employeeId != null : !EMPLOYEE_ID_EDEFAULT.equals(employeeId);
		case Hw1Package.CLIENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Hw1Package.CLIENT__INITIATES:
			return initiates != null && !initiates.isEmpty();
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
		result.append(" (employeeId: ");
		result.append(employeeId);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ClientImpl
