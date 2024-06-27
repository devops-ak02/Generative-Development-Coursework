/**
 */
package gendev.hw1.impl;

import gendev.hw1.CloudService;
import gendev.hw1.Deployment;
import gendev.hw1.Hw1Package;
import gendev.hw1.Project;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.ProjectImpl#getProjectId <em>Project Id</em>}</li>
 *   <li>{@link gendev.hw1.impl.ProjectImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link gendev.hw1.impl.ProjectImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link gendev.hw1.impl.ProjectImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link gendev.hw1.impl.ProjectImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link gendev.hw1.impl.ProjectImpl#getAutomates <em>Automates</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
	/**
	 * The default value of the '{@link #getProjectId() <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectId()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectId() <em>Project Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectId()
	 * @generated
	 * @ordered
	 */
	protected String projectId = PROJECT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudService> uses;

	/**
	 * The cached value of the '{@link #getAutomates() <em>Automates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomates()
	 * @generated
	 * @ordered
	 */
	protected Deployment automates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectId() {
		return projectId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectId(String newProjectId) {
		String oldProjectId = projectId;
		projectId = newProjectId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PROJECT__PROJECT_ID, oldProjectId,
					projectId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PROJECT__PROJECT_NAME, oldProjectName,
					projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PROJECT__START_DATE, oldStartDate,
					startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PROJECT__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudService> getUses() {
		if (uses == null) {
			uses = new EObjectContainmentEList<CloudService>(CloudService.class, this, Hw1Package.PROJECT__USES);
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getAutomates() {
		return automates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutomates(Deployment newAutomates, NotificationChain msgs) {
		Deployment oldAutomates = automates;
		automates = newAutomates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Hw1Package.PROJECT__AUTOMATES, oldAutomates, newAutomates);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomates(Deployment newAutomates) {
		if (newAutomates != automates) {
			NotificationChain msgs = null;
			if (automates != null)
				msgs = ((InternalEObject) automates).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Hw1Package.PROJECT__AUTOMATES, null, msgs);
			if (newAutomates != null)
				msgs = ((InternalEObject) newAutomates).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Hw1Package.PROJECT__AUTOMATES, null, msgs);
			msgs = basicSetAutomates(newAutomates, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.PROJECT__AUTOMATES, newAutomates,
					newAutomates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.PROJECT__USES:
			return ((InternalEList<?>) getUses()).basicRemove(otherEnd, msgs);
		case Hw1Package.PROJECT__AUTOMATES:
			return basicSetAutomates(null, msgs);
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
		case Hw1Package.PROJECT__PROJECT_ID:
			return getProjectId();
		case Hw1Package.PROJECT__PROJECT_NAME:
			return getProjectName();
		case Hw1Package.PROJECT__START_DATE:
			return getStartDate();
		case Hw1Package.PROJECT__END_DATE:
			return getEndDate();
		case Hw1Package.PROJECT__USES:
			return getUses();
		case Hw1Package.PROJECT__AUTOMATES:
			return getAutomates();
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
		case Hw1Package.PROJECT__PROJECT_ID:
			setProjectId((String) newValue);
			return;
		case Hw1Package.PROJECT__PROJECT_NAME:
			setProjectName((String) newValue);
			return;
		case Hw1Package.PROJECT__START_DATE:
			setStartDate((Date) newValue);
			return;
		case Hw1Package.PROJECT__END_DATE:
			setEndDate((Date) newValue);
			return;
		case Hw1Package.PROJECT__USES:
			getUses().clear();
			getUses().addAll((Collection<? extends CloudService>) newValue);
			return;
		case Hw1Package.PROJECT__AUTOMATES:
			setAutomates((Deployment) newValue);
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
		case Hw1Package.PROJECT__PROJECT_ID:
			setProjectId(PROJECT_ID_EDEFAULT);
			return;
		case Hw1Package.PROJECT__PROJECT_NAME:
			setProjectName(PROJECT_NAME_EDEFAULT);
			return;
		case Hw1Package.PROJECT__START_DATE:
			setStartDate(START_DATE_EDEFAULT);
			return;
		case Hw1Package.PROJECT__END_DATE:
			setEndDate(END_DATE_EDEFAULT);
			return;
		case Hw1Package.PROJECT__USES:
			getUses().clear();
			return;
		case Hw1Package.PROJECT__AUTOMATES:
			setAutomates((Deployment) null);
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
		case Hw1Package.PROJECT__PROJECT_ID:
			return PROJECT_ID_EDEFAULT == null ? projectId != null : !PROJECT_ID_EDEFAULT.equals(projectId);
		case Hw1Package.PROJECT__PROJECT_NAME:
			return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
		case Hw1Package.PROJECT__START_DATE:
			return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
		case Hw1Package.PROJECT__END_DATE:
			return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
		case Hw1Package.PROJECT__USES:
			return uses != null && !uses.isEmpty();
		case Hw1Package.PROJECT__AUTOMATES:
			return automates != null;
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
		result.append(" (projectId: ");
		result.append(projectId);
		result.append(", projectName: ");
		result.append(projectName);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
