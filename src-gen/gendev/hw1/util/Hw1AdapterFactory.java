/**
 */
package gendev.hw1.util;

import gendev.hw1.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gendev.hw1.Hw1Package
 * @generated
 */
public class Hw1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Hw1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hw1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Hw1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Hw1Switch<Adapter> modelSwitch = new Hw1Switch<Adapter>() {
		@Override
		public Adapter caseClient(Client object) {
			return createClientAdapter();
		}

		@Override
		public Adapter caseProject(Project object) {
			return createProjectAdapter();
		}

		@Override
		public Adapter caseProjectManager(ProjectManager object) {
			return createProjectManagerAdapter();
		}

		@Override
		public Adapter caseCloudArchitect(CloudArchitect object) {
			return createCloudArchitectAdapter();
		}

		@Override
		public Adapter caseDeployment(Deployment object) {
			return createDeploymentAdapter();
		}

		@Override
		public Adapter caseCloudService(CloudService object) {
			return createCloudServiceAdapter();
		}

		@Override
		public Adapter caseQualityAssurance(QualityAssurance object) {
			return createQualityAssuranceAdapter();
		}

		@Override
		public Adapter caseCloudSolution(CloudSolution object) {
			return createCloudSolutionAdapter();
		}

		@Override
		public Adapter caseDevOpsEngineer(DevOpsEngineer object) {
			return createDevOpsEngineerAdapter();
		}

		@Override
		public Adapter caseEmployee(Employee object) {
			return createEmployeeAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.Client <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.Client
	 * @generated
	 */
	public Adapter createClientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.ProjectManager <em>Project Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.ProjectManager
	 * @generated
	 */
	public Adapter createProjectManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.CloudArchitect <em>Cloud Architect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.CloudArchitect
	 * @generated
	 */
	public Adapter createCloudArchitectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.Deployment <em>Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.Deployment
	 * @generated
	 */
	public Adapter createDeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.CloudService <em>Cloud Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.CloudService
	 * @generated
	 */
	public Adapter createCloudServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.QualityAssurance <em>Quality Assurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.QualityAssurance
	 * @generated
	 */
	public Adapter createQualityAssuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.CloudSolution <em>Cloud Solution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.CloudSolution
	 * @generated
	 */
	public Adapter createCloudSolutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.DevOpsEngineer <em>Dev Ops Engineer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.DevOpsEngineer
	 * @generated
	 */
	public Adapter createDevOpsEngineerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gendev.hw1.Employee <em>Employee</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gendev.hw1.Employee
	 * @generated
	 */
	public Adapter createEmployeeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Hw1AdapterFactory
