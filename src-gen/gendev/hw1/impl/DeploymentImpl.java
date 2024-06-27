/**
 */
package gendev.hw1.impl;

import gendev.hw1.Deployment;
import gendev.hw1.DevOpsEngineer;
import gendev.hw1.Hw1Package;
import gendev.hw1.Hw1Tables;
import gendev.hw1.QualityAssurance;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionSizeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.DeploymentImpl#getDeploymentId <em>Deployment Id</em>}</li>
 *   <li>{@link gendev.hw1.impl.DeploymentImpl#getDeploymentStatus <em>Deployment Status</em>}</li>
 *   <li>{@link gendev.hw1.impl.DeploymentImpl#getQacheck <em>Qacheck</em>}</li>
 *   <li>{@link gendev.hw1.impl.DeploymentImpl#getDoing <em>Doing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeploymentImpl extends MinimalEObjectImpl.Container implements Deployment {
	/**
	 * The default value of the '{@link #getDeploymentId() <em>Deployment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeploymentId() <em>Deployment Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentId()
	 * @generated
	 * @ordered
	 */
	protected String deploymentId = DEPLOYMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeploymentStatus() <em>Deployment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYMENT_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeploymentStatus() <em>Deployment Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentStatus()
	 * @generated
	 * @ordered
	 */
	protected String deploymentStatus = DEPLOYMENT_STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getQacheck() <em>Qacheck</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQacheck()
	 * @generated
	 * @ordered
	 */
	protected QualityAssurance qacheck;

	/**
	 * The cached value of the '{@link #getDoing() <em>Doing</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoing()
	 * @generated
	 * @ordered
	 */
	protected EList<DevOpsEngineer> doing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.DEPLOYMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeploymentId() {
		return deploymentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentId(String newDeploymentId) {
		String oldDeploymentId = deploymentId;
		deploymentId = newDeploymentId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.DEPLOYMENT__DEPLOYMENT_ID, oldDeploymentId,
					deploymentId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeploymentStatus() {
		return deploymentStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentStatus(String newDeploymentStatus) {
		String oldDeploymentStatus = deploymentStatus;
		deploymentStatus = newDeploymentStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.DEPLOYMENT__DEPLOYMENT_STATUS,
					oldDeploymentStatus, deploymentStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityAssurance getQacheck() {
		if (qacheck != null && qacheck.eIsProxy()) {
			InternalEObject oldQacheck = (InternalEObject) qacheck;
			qacheck = (QualityAssurance) eResolveProxy(oldQacheck);
			if (qacheck != oldQacheck) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Hw1Package.DEPLOYMENT__QACHECK,
							oldQacheck, qacheck));
			}
		}
		return qacheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityAssurance basicGetQacheck() {
		return qacheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQacheck(QualityAssurance newQacheck) {
		QualityAssurance oldQacheck = qacheck;
		qacheck = newQacheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.DEPLOYMENT__QACHECK, oldQacheck, qacheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DevOpsEngineer> getDoing() {
		if (doing == null) {
			doing = new EObjectContainmentEList<DevOpsEngineer>(DevOpsEngineer.class, this,
					Hw1Package.DEPLOYMENT__DOING);
		}
		return doing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean inv2(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Deployment::inv2";
		try {
			/**
			 *
			 * inv inv2:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.doing->size() > 1 implies self.deploymentStatus = 'Passed'
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Hw1Package.Literals.DEPLOYMENT___INV2__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Hw1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ List<DevOpsEngineer> doing = this.getDoing();
				final /*@NonInvalid*/ OrderedSetValue BOXED_doing = idResolver
						.createOrderedSetOfAll(Hw1Tables.ORD_CLSSid_DevOpsEngineer, doing);
				final /*@NonInvalid*/ IntegerValue size = CollectionSizeOperation.INSTANCE.evaluate(BOXED_doing);
				final /*@NonInvalid*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
						.evaluate(executor, size, Hw1Tables.INT_1).booleanValue();
				final /*@NonInvalid*/ Boolean result;
				if (!gt) {
					result = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ String deploymentStatus = this.getDeploymentStatus();
					final /*@NonInvalid*/ boolean eq = Hw1Tables.STR_Passed.equals(deploymentStatus);
					if (eq) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						result = ValueUtil.FALSE_VALUE;
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, Hw1Tables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Hw1Package.DEPLOYMENT__DOING:
			return ((InternalEList<?>) getDoing()).basicRemove(otherEnd, msgs);
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
		case Hw1Package.DEPLOYMENT__DEPLOYMENT_ID:
			return getDeploymentId();
		case Hw1Package.DEPLOYMENT__DEPLOYMENT_STATUS:
			return getDeploymentStatus();
		case Hw1Package.DEPLOYMENT__QACHECK:
			if (resolve)
				return getQacheck();
			return basicGetQacheck();
		case Hw1Package.DEPLOYMENT__DOING:
			return getDoing();
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
		case Hw1Package.DEPLOYMENT__DEPLOYMENT_ID:
			setDeploymentId((String) newValue);
			return;
		case Hw1Package.DEPLOYMENT__DEPLOYMENT_STATUS:
			setDeploymentStatus((String) newValue);
			return;
		case Hw1Package.DEPLOYMENT__QACHECK:
			setQacheck((QualityAssurance) newValue);
			return;
		case Hw1Package.DEPLOYMENT__DOING:
			getDoing().clear();
			getDoing().addAll((Collection<? extends DevOpsEngineer>) newValue);
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
		case Hw1Package.DEPLOYMENT__DEPLOYMENT_ID:
			setDeploymentId(DEPLOYMENT_ID_EDEFAULT);
			return;
		case Hw1Package.DEPLOYMENT__DEPLOYMENT_STATUS:
			setDeploymentStatus(DEPLOYMENT_STATUS_EDEFAULT);
			return;
		case Hw1Package.DEPLOYMENT__QACHECK:
			setQacheck((QualityAssurance) null);
			return;
		case Hw1Package.DEPLOYMENT__DOING:
			getDoing().clear();
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
		case Hw1Package.DEPLOYMENT__DEPLOYMENT_ID:
			return DEPLOYMENT_ID_EDEFAULT == null ? deploymentId != null : !DEPLOYMENT_ID_EDEFAULT.equals(deploymentId);
		case Hw1Package.DEPLOYMENT__DEPLOYMENT_STATUS:
			return DEPLOYMENT_STATUS_EDEFAULT == null ? deploymentStatus != null
					: !DEPLOYMENT_STATUS_EDEFAULT.equals(deploymentStatus);
		case Hw1Package.DEPLOYMENT__QACHECK:
			return qacheck != null;
		case Hw1Package.DEPLOYMENT__DOING:
			return doing != null && !doing.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Hw1Package.DEPLOYMENT___INV2__DIAGNOSTICCHAIN_MAP:
			return inv2((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (deploymentId: ");
		result.append(deploymentId);
		result.append(", deploymentStatus: ");
		result.append(deploymentStatus);
		result.append(')');
		return result.toString();
	}

} //DeploymentImpl
