/**
 */
package gendev.hw1.impl;

import gendev.hw1.DevOpsEngineer;
import gendev.hw1.Hw1Package;

import gendev.hw1.Hw1Tables;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dev Ops Engineer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.impl.DevOpsEngineerImpl#getInitiateDeployment <em>Initiate Deployment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DevOpsEngineerImpl extends EmployeeImpl implements DevOpsEngineer {
	/**
	 * The default value of the '{@link #getInitiateDeployment() <em>Initiate Deployment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiateDeployment()
	 * @generated
	 * @ordered
	 */
	protected static final String INITIATE_DEPLOYMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInitiateDeployment() <em>Initiate Deployment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiateDeployment()
	 * @generated
	 * @ordered
	 */
	protected String initiateDeployment = INITIATE_DEPLOYMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevOpsEngineerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Hw1Package.Literals.DEV_OPS_ENGINEER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInitiateDeployment() {
		return initiateDeployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiateDeployment(String newInitiateDeployment) {
		String oldInitiateDeployment = initiateDeployment;
		initiateDeployment = newInitiateDeployment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Hw1Package.DEV_OPS_ENGINEER__INITIATE_DEPLOYMENT,
					oldInitiateDeployment, initiateDeployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean inv4_NonEmptyInitiateDeployment(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "DevOpsEngineer::inv4_NonEmptyInitiateDeployment";
		try {
			/**
			 *
			 * inv inv4_NonEmptyInitiateDeployment:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.initiateDeployment->notEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Hw1Package.Literals.DEV_OPS_ENGINEER___INV4_NON_EMPTY_INITIATE_DEPLOYMENT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Hw1Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ String initiateDeployment = this.getInitiateDeployment();
					final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
							Hw1Tables.SET_PRIMid_String, initiateDeployment);
					final /*@Thrown*/ boolean result = CollectionNotEmptyOperation.INSTANCE.evaluate(oclAsSet)
							.booleanValue();
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Hw1Tables.INT_0)
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Hw1Package.DEV_OPS_ENGINEER__INITIATE_DEPLOYMENT:
			return getInitiateDeployment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Hw1Package.DEV_OPS_ENGINEER__INITIATE_DEPLOYMENT:
			setInitiateDeployment((String) newValue);
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
		case Hw1Package.DEV_OPS_ENGINEER__INITIATE_DEPLOYMENT:
			setInitiateDeployment(INITIATE_DEPLOYMENT_EDEFAULT);
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
		case Hw1Package.DEV_OPS_ENGINEER__INITIATE_DEPLOYMENT:
			return INITIATE_DEPLOYMENT_EDEFAULT == null ? initiateDeployment != null
					: !INITIATE_DEPLOYMENT_EDEFAULT.equals(initiateDeployment);
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
		case Hw1Package.DEV_OPS_ENGINEER___INV4_NON_EMPTY_INITIATE_DEPLOYMENT__DIAGNOSTICCHAIN_MAP:
			return inv4_NonEmptyInitiateDeployment((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
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
		result.append(" (initiateDeployment: ");
		result.append(initiateDeployment);
		result.append(')');
		return result.toString();
	}

} //DevOpsEngineerImpl
