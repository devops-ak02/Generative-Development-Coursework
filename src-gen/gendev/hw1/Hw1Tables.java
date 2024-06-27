/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /gendev.hw1/model/hw1.ecore
 * using:
 *   /gendev.hw1/model/hw1.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package gendev.hw1;

// import gendev.hw1.Hw1Package;
// import gendev.hw1.Hw1Tables;
import java.lang.String;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.DataTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * Hw1Tables provides the dispatch tables for the hw1 for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class Hw1Tables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(Hw1Package.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_hw1 = IdManager.getNsURIPackageId("http://www.example.org/hw1", null, Hw1Package.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Client = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Client", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_CloudService = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("CloudService", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Deployment = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Deployment", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DevOpsEngineer = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("DevOpsEngineer", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Project = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("Project", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_ProjectManager = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("ProjectManager", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_QualityAssurance = Hw1Tables.PACKid_http_c_s_s_www_example_org_s_hw1.getClassId("QualityAssurance", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EDate = Hw1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EDate", 0);
	public static final /*@NonInvalid*/ DataTypeId DATAid_EInt = Hw1Tables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId SET_PRIMid_String = TypeId.SET.getSpecializedId(TypeId.STRING);
	public static final /*@NonInvalid*/ String STR_Passed = "Passed";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Deployment = TypeId.BAG.getSpecializedId(Hw1Tables.CLSSid_Deployment);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_CloudService = TypeId.ORDERED_SET.getSpecializedId(Hw1Tables.CLSSid_CloudService);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DevOpsEngineer = TypeId.ORDERED_SET.getSpecializedId(Hw1Tables.CLSSid_DevOpsEngineer);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Project = TypeId.ORDERED_SET.getSpecializedId(Hw1Tables.CLSSid_Project);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			Hw1Tables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Client = new EcoreExecutorType(Hw1Package.Literals.CLIENT, PACKAGE, 0);
		public static final EcoreExecutorType _CloudArchitect = new EcoreExecutorType(Hw1Package.Literals.CLOUD_ARCHITECT, PACKAGE, 0);
		public static final EcoreExecutorType _CloudService = new EcoreExecutorType(Hw1Package.Literals.CLOUD_SERVICE, PACKAGE, 0);
		public static final EcoreExecutorType _CloudSolution = new EcoreExecutorType(Hw1Package.Literals.CLOUD_SOLUTION, PACKAGE, 0);
		public static final EcoreExecutorType _Deployment = new EcoreExecutorType(Hw1Package.Literals.DEPLOYMENT, PACKAGE, 0);
		public static final EcoreExecutorType _DevOpsEngineer = new EcoreExecutorType(Hw1Package.Literals.DEV_OPS_ENGINEER, PACKAGE, 0);
		public static final EcoreExecutorType _Employee = new EcoreExecutorType(Hw1Package.Literals.EMPLOYEE, PACKAGE, 0);
		public static final EcoreExecutorType _Project = new EcoreExecutorType(Hw1Package.Literals.PROJECT, PACKAGE, 0);
		public static final EcoreExecutorType _ProjectManager = new EcoreExecutorType(Hw1Package.Literals.PROJECT_MANAGER, PACKAGE, 0);
		public static final EcoreExecutorType _QualityAssurance = new EcoreExecutorType(Hw1Package.Literals.QUALITY_ASSURANCE, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Client,
			_CloudArchitect,
			_CloudService,
			_CloudSolution,
			_Deployment,
			_DevOpsEngineer,
			_Employee,
			_Project,
			_ProjectManager,
			_QualityAssurance
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Client__Client = new ExecutorFragment(Types._Client, Hw1Tables.Types._Client);
		private static final ExecutorFragment _Client__OclAny = new ExecutorFragment(Types._Client, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Client__OclElement = new ExecutorFragment(Types._Client, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CloudArchitect__CloudArchitect = new ExecutorFragment(Types._CloudArchitect, Hw1Tables.Types._CloudArchitect);
		private static final ExecutorFragment _CloudArchitect__Employee = new ExecutorFragment(Types._CloudArchitect, Hw1Tables.Types._Employee);
		private static final ExecutorFragment _CloudArchitect__OclAny = new ExecutorFragment(Types._CloudArchitect, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CloudArchitect__OclElement = new ExecutorFragment(Types._CloudArchitect, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CloudService__CloudService = new ExecutorFragment(Types._CloudService, Hw1Tables.Types._CloudService);
		private static final ExecutorFragment _CloudService__OclAny = new ExecutorFragment(Types._CloudService, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CloudService__OclElement = new ExecutorFragment(Types._CloudService, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _CloudSolution__CloudArchitect = new ExecutorFragment(Types._CloudSolution, Hw1Tables.Types._CloudArchitect);
		private static final ExecutorFragment _CloudSolution__CloudService = new ExecutorFragment(Types._CloudSolution, Hw1Tables.Types._CloudService);
		private static final ExecutorFragment _CloudSolution__CloudSolution = new ExecutorFragment(Types._CloudSolution, Hw1Tables.Types._CloudSolution);
		private static final ExecutorFragment _CloudSolution__Employee = new ExecutorFragment(Types._CloudSolution, Hw1Tables.Types._Employee);
		private static final ExecutorFragment _CloudSolution__OclAny = new ExecutorFragment(Types._CloudSolution, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _CloudSolution__OclElement = new ExecutorFragment(Types._CloudSolution, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Deployment__Deployment = new ExecutorFragment(Types._Deployment, Hw1Tables.Types._Deployment);
		private static final ExecutorFragment _Deployment__OclAny = new ExecutorFragment(Types._Deployment, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Deployment__OclElement = new ExecutorFragment(Types._Deployment, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DevOpsEngineer__DevOpsEngineer = new ExecutorFragment(Types._DevOpsEngineer, Hw1Tables.Types._DevOpsEngineer);
		private static final ExecutorFragment _DevOpsEngineer__Employee = new ExecutorFragment(Types._DevOpsEngineer, Hw1Tables.Types._Employee);
		private static final ExecutorFragment _DevOpsEngineer__OclAny = new ExecutorFragment(Types._DevOpsEngineer, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DevOpsEngineer__OclElement = new ExecutorFragment(Types._DevOpsEngineer, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Employee__Employee = new ExecutorFragment(Types._Employee, Hw1Tables.Types._Employee);
		private static final ExecutorFragment _Employee__OclAny = new ExecutorFragment(Types._Employee, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Employee__OclElement = new ExecutorFragment(Types._Employee, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Project__OclAny = new ExecutorFragment(Types._Project, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Project__OclElement = new ExecutorFragment(Types._Project, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Project__Project = new ExecutorFragment(Types._Project, Hw1Tables.Types._Project);

		private static final ExecutorFragment _ProjectManager__Employee = new ExecutorFragment(Types._ProjectManager, Hw1Tables.Types._Employee);
		private static final ExecutorFragment _ProjectManager__OclAny = new ExecutorFragment(Types._ProjectManager, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ProjectManager__OclElement = new ExecutorFragment(Types._ProjectManager, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ProjectManager__ProjectManager = new ExecutorFragment(Types._ProjectManager, Hw1Tables.Types._ProjectManager);

		private static final ExecutorFragment _QualityAssurance__OclAny = new ExecutorFragment(Types._QualityAssurance, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _QualityAssurance__OclElement = new ExecutorFragment(Types._QualityAssurance, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _QualityAssurance__QualityAssurance = new ExecutorFragment(Types._QualityAssurance, Hw1Tables.Types._QualityAssurance);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Client__employeeId = new EcoreExecutorProperty(Hw1Package.Literals.CLIENT__EMPLOYEE_ID, Types._Client, 0);
		public static final ExecutorProperty _Client__initiates = new EcoreExecutorProperty(Hw1Package.Literals.CLIENT__INITIATES, Types._Client, 1);
		public static final ExecutorProperty _Client__name = new EcoreExecutorProperty(Hw1Package.Literals.CLIENT__NAME, Types._Client, 2);

		public static final ExecutorProperty _CloudArchitect__designArchitecture = new EcoreExecutorProperty(Hw1Package.Literals.CLOUD_ARCHITECT__DESIGN_ARCHITECTURE, Types._CloudArchitect, 0);

		public static final ExecutorProperty _CloudService__serviceName = new EcoreExecutorProperty(Hw1Package.Literals.CLOUD_SERVICE__SERVICE_NAME, Types._CloudService, 0);
		public static final ExecutorProperty _CloudService__serviceType = new EcoreExecutorProperty(Hw1Package.Literals.CLOUD_SERVICE__SERVICE_TYPE, Types._CloudService, 1);
		public static final ExecutorProperty _CloudService__Project__uses = new ExecutorPropertyWithImplementation("Project", Types._CloudService, 2, new EcoreLibraryOppositeProperty(Hw1Package.Literals.PROJECT__USES));

		public static final ExecutorProperty _CloudSolution__architectureDesign = new EcoreExecutorProperty(Hw1Package.Literals.CLOUD_SOLUTION__ARCHITECTURE_DESIGN, Types._CloudSolution, 0);
		public static final ExecutorProperty _CloudSolution__serviceProvider = new EcoreExecutorProperty(Hw1Package.Literals.CLOUD_SOLUTION__SERVICE_PROVIDER, Types._CloudSolution, 1);

		public static final ExecutorProperty _Deployment__deploymentId = new EcoreExecutorProperty(Hw1Package.Literals.DEPLOYMENT__DEPLOYMENT_ID, Types._Deployment, 0);
		public static final ExecutorProperty _Deployment__deploymentStatus = new EcoreExecutorProperty(Hw1Package.Literals.DEPLOYMENT__DEPLOYMENT_STATUS, Types._Deployment, 1);
		public static final ExecutorProperty _Deployment__doing = new EcoreExecutorProperty(Hw1Package.Literals.DEPLOYMENT__DOING, Types._Deployment, 2);
		public static final ExecutorProperty _Deployment__qacheck = new EcoreExecutorProperty(Hw1Package.Literals.DEPLOYMENT__QACHECK, Types._Deployment, 3);
		public static final ExecutorProperty _Deployment__Project__automates = new ExecutorPropertyWithImplementation("Project", Types._Deployment, 4, new EcoreLibraryOppositeProperty(Hw1Package.Literals.PROJECT__AUTOMATES));

		public static final ExecutorProperty _DevOpsEngineer__initiateDeployment = new EcoreExecutorProperty(Hw1Package.Literals.DEV_OPS_ENGINEER__INITIATE_DEPLOYMENT, Types._DevOpsEngineer, 0);
		public static final ExecutorProperty _DevOpsEngineer__Deployment__doing = new ExecutorPropertyWithImplementation("Deployment", Types._DevOpsEngineer, 1, new EcoreLibraryOppositeProperty(Hw1Package.Literals.DEPLOYMENT__DOING));

		public static final ExecutorProperty _Employee__employeeId = new EcoreExecutorProperty(Hw1Package.Literals.EMPLOYEE__EMPLOYEE_ID, Types._Employee, 0);
		public static final ExecutorProperty _Employee__name = new EcoreExecutorProperty(Hw1Package.Literals.EMPLOYEE__NAME, Types._Employee, 1);
		public static final ExecutorProperty _Employee__role = new EcoreExecutorProperty(Hw1Package.Literals.EMPLOYEE__ROLE, Types._Employee, 2);

		public static final ExecutorProperty _Project__automates = new EcoreExecutorProperty(Hw1Package.Literals.PROJECT__AUTOMATES, Types._Project, 0);
		public static final ExecutorProperty _Project__endDate = new EcoreExecutorProperty(Hw1Package.Literals.PROJECT__END_DATE, Types._Project, 1);
		public static final ExecutorProperty _Project__projectId = new EcoreExecutorProperty(Hw1Package.Literals.PROJECT__PROJECT_ID, Types._Project, 2);
		public static final ExecutorProperty _Project__projectName = new EcoreExecutorProperty(Hw1Package.Literals.PROJECT__PROJECT_NAME, Types._Project, 3);
		public static final ExecutorProperty _Project__startDate = new EcoreExecutorProperty(Hw1Package.Literals.PROJECT__START_DATE, Types._Project, 4);
		public static final ExecutorProperty _Project__uses = new EcoreExecutorProperty(Hw1Package.Literals.PROJECT__USES, Types._Project, 5);
		public static final ExecutorProperty _Project__Client__initiates = new ExecutorPropertyWithImplementation("Client", Types._Project, 6, new EcoreLibraryOppositeProperty(Hw1Package.Literals.CLIENT__INITIATES));
		public static final ExecutorProperty _Project__ProjectManager__manages = new ExecutorPropertyWithImplementation("ProjectManager", Types._Project, 7, new EcoreLibraryOppositeProperty(Hw1Package.Literals.PROJECT_MANAGER__MANAGES));

		public static final ExecutorProperty _ProjectManager__manages = new EcoreExecutorProperty(Hw1Package.Literals.PROJECT_MANAGER__MANAGES, Types._ProjectManager, 0);
		public static final ExecutorProperty _ProjectManager__projectsHandled = new EcoreExecutorProperty(Hw1Package.Literals.PROJECT_MANAGER__PROJECTS_HANDLED, Types._ProjectManager, 1);

		public static final ExecutorProperty _QualityAssurance__qualityassuranceId = new EcoreExecutorProperty(Hw1Package.Literals.QUALITY_ASSURANCE__QUALITYASSURANCE_ID, Types._QualityAssurance, 0);
		public static final ExecutorProperty _QualityAssurance__testStatus = new EcoreExecutorProperty(Hw1Package.Literals.QUALITY_ASSURANCE__TEST_STATUS, Types._QualityAssurance, 1);
		public static final ExecutorProperty _QualityAssurance__Deployment__qacheck = new ExecutorPropertyWithImplementation("Deployment", Types._QualityAssurance, 2, new EcoreLibraryOppositeProperty(Hw1Package.Literals.DEPLOYMENT__QACHECK));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Client =
			{
				Fragments._Client__OclAny /* 0 */,
				Fragments._Client__OclElement /* 1 */,
				Fragments._Client__Client /* 2 */
			};
		private static final int /*@NonNull*/ [] __Client = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CloudArchitect =
			{
				Fragments._CloudArchitect__OclAny /* 0 */,
				Fragments._CloudArchitect__OclElement /* 1 */,
				Fragments._CloudArchitect__Employee /* 2 */,
				Fragments._CloudArchitect__CloudArchitect /* 3 */
			};
		private static final int /*@NonNull*/ [] __CloudArchitect = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CloudService =
			{
				Fragments._CloudService__OclAny /* 0 */,
				Fragments._CloudService__OclElement /* 1 */,
				Fragments._CloudService__CloudService /* 2 */
			};
		private static final int /*@NonNull*/ [] __CloudService = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _CloudSolution =
			{
				Fragments._CloudSolution__OclAny /* 0 */,
				Fragments._CloudSolution__OclElement /* 1 */,
				Fragments._CloudSolution__CloudService /* 2 */,
				Fragments._CloudSolution__Employee /* 2 */,
				Fragments._CloudSolution__CloudArchitect /* 3 */,
				Fragments._CloudSolution__CloudSolution /* 4 */
			};
		private static final int /*@NonNull*/ [] __CloudSolution = { 1,1,2,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Deployment =
			{
				Fragments._Deployment__OclAny /* 0 */,
				Fragments._Deployment__OclElement /* 1 */,
				Fragments._Deployment__Deployment /* 2 */
			};
		private static final int /*@NonNull*/ [] __Deployment = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DevOpsEngineer =
			{
				Fragments._DevOpsEngineer__OclAny /* 0 */,
				Fragments._DevOpsEngineer__OclElement /* 1 */,
				Fragments._DevOpsEngineer__Employee /* 2 */,
				Fragments._DevOpsEngineer__DevOpsEngineer /* 3 */
			};
		private static final int /*@NonNull*/ [] __DevOpsEngineer = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Employee =
			{
				Fragments._Employee__OclAny /* 0 */,
				Fragments._Employee__OclElement /* 1 */,
				Fragments._Employee__Employee /* 2 */
			};
		private static final int /*@NonNull*/ [] __Employee = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Project =
			{
				Fragments._Project__OclAny /* 0 */,
				Fragments._Project__OclElement /* 1 */,
				Fragments._Project__Project /* 2 */
			};
		private static final int /*@NonNull*/ [] __Project = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ProjectManager =
			{
				Fragments._ProjectManager__OclAny /* 0 */,
				Fragments._ProjectManager__OclElement /* 1 */,
				Fragments._ProjectManager__Employee /* 2 */,
				Fragments._ProjectManager__ProjectManager /* 3 */
			};
		private static final int /*@NonNull*/ [] __ProjectManager = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _QualityAssurance =
			{
				Fragments._QualityAssurance__OclAny /* 0 */,
				Fragments._QualityAssurance__OclElement /* 1 */,
				Fragments._QualityAssurance__QualityAssurance /* 2 */
			};
		private static final int /*@NonNull*/ [] __QualityAssurance = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Client.initFragments(_Client, __Client);
			Types._CloudArchitect.initFragments(_CloudArchitect, __CloudArchitect);
			Types._CloudService.initFragments(_CloudService, __CloudService);
			Types._CloudSolution.initFragments(_CloudSolution, __CloudSolution);
			Types._Deployment.initFragments(_Deployment, __Deployment);
			Types._DevOpsEngineer.initFragments(_DevOpsEngineer, __DevOpsEngineer);
			Types._Employee.initFragments(_Employee, __Employee);
			Types._Project.initFragments(_Project, __Project);
			Types._ProjectManager.initFragments(_ProjectManager, __ProjectManager);
			Types._QualityAssurance.initFragments(_QualityAssurance, __QualityAssurance);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Client__Client = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Client__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Client__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CloudArchitect__CloudArchitect = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CloudArchitect__Employee = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CloudArchitect__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CloudArchitect__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CloudService__CloudService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CloudService__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CloudService__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _CloudSolution__CloudSolution = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CloudSolution__CloudArchitect = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CloudSolution__CloudService = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CloudSolution__Employee = {};
		private static final ExecutorOperation /*@NonNull*/ [] _CloudSolution__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _CloudSolution__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Deployment__Deployment = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Deployment__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Deployment__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DevOpsEngineer__DevOpsEngineer = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DevOpsEngineer__Employee = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DevOpsEngineer__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DevOpsEngineer__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Employee__Employee = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Employee__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Employee__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Project__Project = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Project__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Project__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ProjectManager__ProjectManager = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProjectManager__Employee = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ProjectManager__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ProjectManager__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _QualityAssurance__QualityAssurance = {};
		private static final ExecutorOperation /*@NonNull*/ [] _QualityAssurance__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _QualityAssurance__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Client__Client.initOperations(_Client__Client);
			Fragments._Client__OclAny.initOperations(_Client__OclAny);
			Fragments._Client__OclElement.initOperations(_Client__OclElement);

			Fragments._CloudArchitect__CloudArchitect.initOperations(_CloudArchitect__CloudArchitect);
			Fragments._CloudArchitect__Employee.initOperations(_CloudArchitect__Employee);
			Fragments._CloudArchitect__OclAny.initOperations(_CloudArchitect__OclAny);
			Fragments._CloudArchitect__OclElement.initOperations(_CloudArchitect__OclElement);

			Fragments._CloudService__CloudService.initOperations(_CloudService__CloudService);
			Fragments._CloudService__OclAny.initOperations(_CloudService__OclAny);
			Fragments._CloudService__OclElement.initOperations(_CloudService__OclElement);

			Fragments._CloudSolution__CloudArchitect.initOperations(_CloudSolution__CloudArchitect);
			Fragments._CloudSolution__CloudService.initOperations(_CloudSolution__CloudService);
			Fragments._CloudSolution__CloudSolution.initOperations(_CloudSolution__CloudSolution);
			Fragments._CloudSolution__Employee.initOperations(_CloudSolution__Employee);
			Fragments._CloudSolution__OclAny.initOperations(_CloudSolution__OclAny);
			Fragments._CloudSolution__OclElement.initOperations(_CloudSolution__OclElement);

			Fragments._Deployment__Deployment.initOperations(_Deployment__Deployment);
			Fragments._Deployment__OclAny.initOperations(_Deployment__OclAny);
			Fragments._Deployment__OclElement.initOperations(_Deployment__OclElement);

			Fragments._DevOpsEngineer__DevOpsEngineer.initOperations(_DevOpsEngineer__DevOpsEngineer);
			Fragments._DevOpsEngineer__Employee.initOperations(_DevOpsEngineer__Employee);
			Fragments._DevOpsEngineer__OclAny.initOperations(_DevOpsEngineer__OclAny);
			Fragments._DevOpsEngineer__OclElement.initOperations(_DevOpsEngineer__OclElement);

			Fragments._Employee__Employee.initOperations(_Employee__Employee);
			Fragments._Employee__OclAny.initOperations(_Employee__OclAny);
			Fragments._Employee__OclElement.initOperations(_Employee__OclElement);

			Fragments._Project__OclAny.initOperations(_Project__OclAny);
			Fragments._Project__OclElement.initOperations(_Project__OclElement);
			Fragments._Project__Project.initOperations(_Project__Project);

			Fragments._ProjectManager__Employee.initOperations(_ProjectManager__Employee);
			Fragments._ProjectManager__OclAny.initOperations(_ProjectManager__OclAny);
			Fragments._ProjectManager__OclElement.initOperations(_ProjectManager__OclElement);
			Fragments._ProjectManager__ProjectManager.initOperations(_ProjectManager__ProjectManager);

			Fragments._QualityAssurance__OclAny.initOperations(_QualityAssurance__OclAny);
			Fragments._QualityAssurance__OclElement.initOperations(_QualityAssurance__OclElement);
			Fragments._QualityAssurance__QualityAssurance.initOperations(_QualityAssurance__QualityAssurance);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Client = {
			Hw1Tables.Properties._Client__employeeId,
			Hw1Tables.Properties._Client__initiates,
			Hw1Tables.Properties._Client__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CloudArchitect = {
			Hw1Tables.Properties._CloudArchitect__designArchitecture,
			Hw1Tables.Properties._Employee__employeeId,
			Hw1Tables.Properties._Employee__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Employee__role
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CloudService = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._CloudService__serviceName,
			Hw1Tables.Properties._CloudService__serviceType
		};

		private static final ExecutorProperty /*@NonNull*/ [] _CloudSolution = {
			Hw1Tables.Properties._CloudSolution__architectureDesign,
			Hw1Tables.Properties._CloudArchitect__designArchitecture,
			Hw1Tables.Properties._Employee__employeeId,
			Hw1Tables.Properties._Employee__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Employee__role,
			Hw1Tables.Properties._CloudService__serviceName,
			Hw1Tables.Properties._CloudSolution__serviceProvider,
			Hw1Tables.Properties._CloudService__serviceType
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Deployment = {
			Hw1Tables.Properties._Deployment__deploymentId,
			Hw1Tables.Properties._Deployment__deploymentStatus,
			Hw1Tables.Properties._Deployment__doing,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Deployment__qacheck
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DevOpsEngineer = {
			Hw1Tables.Properties._Employee__employeeId,
			Hw1Tables.Properties._DevOpsEngineer__initiateDeployment,
			Hw1Tables.Properties._Employee__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Employee__role
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Employee = {
			Hw1Tables.Properties._Employee__employeeId,
			Hw1Tables.Properties._Employee__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Employee__role
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Project = {
			Hw1Tables.Properties._Project__automates,
			Hw1Tables.Properties._Project__endDate,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._Project__projectId,
			Hw1Tables.Properties._Project__projectName,
			Hw1Tables.Properties._Project__startDate,
			Hw1Tables.Properties._Project__uses
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ProjectManager = {
			Hw1Tables.Properties._Employee__employeeId,
			Hw1Tables.Properties._ProjectManager__manages,
			Hw1Tables.Properties._Employee__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._ProjectManager__projectsHandled,
			Hw1Tables.Properties._Employee__role
		};

		private static final ExecutorProperty /*@NonNull*/ [] _QualityAssurance = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			Hw1Tables.Properties._QualityAssurance__qualityassuranceId,
			Hw1Tables.Properties._QualityAssurance__testStatus
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Client__Client.initProperties(_Client);
			Fragments._CloudArchitect__CloudArchitect.initProperties(_CloudArchitect);
			Fragments._CloudService__CloudService.initProperties(_CloudService);
			Fragments._CloudSolution__CloudSolution.initProperties(_CloudSolution);
			Fragments._Deployment__Deployment.initProperties(_Deployment);
			Fragments._DevOpsEngineer__DevOpsEngineer.initProperties(_DevOpsEngineer);
			Fragments._Employee__Employee.initProperties(_Employee);
			Fragments._Project__Project.initProperties(_Project);
			Fragments._ProjectManager__ProjectManager.initProperties(_ProjectManager);
			Fragments._QualityAssurance__QualityAssurance.initProperties(_QualityAssurance);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of Hw1Tables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new Hw1Tables();
	}

	private Hw1Tables() {
		super(Hw1Package.eNS_URI);
	}
}
