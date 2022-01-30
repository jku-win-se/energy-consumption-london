/**
 */
package energy.comsumption.sample.mm.EnergyProvider.impl;

import energy.comsumption.sample.mm.EnergyProvider.City;
import energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption;
import energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionFactory;
import energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage;
import energy.comsumption.sample.mm.EnergyProvider.EnergyProvider;
import energy.comsumption.sample.mm.EnergyProvider.HouseHold;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnergyConsumptionPackageImpl extends EPackageImpl implements EnergyConsumptionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass energyProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass houseHoldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass electricalEnergyConsumptionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EnergyConsumptionPackageImpl() {
		super(eNS_URI, EnergyConsumptionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EnergyConsumptionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EnergyConsumptionPackage init() {
		if (isInited)
			return (EnergyConsumptionPackage) EPackage.Registry.INSTANCE.getEPackage(EnergyConsumptionPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEnergyConsumptionPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EnergyConsumptionPackageImpl theEnergyConsumptionPackage = registeredEnergyConsumptionPackage instanceof EnergyConsumptionPackageImpl
				? (EnergyConsumptionPackageImpl) registeredEnergyConsumptionPackage
				: new EnergyConsumptionPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEnergyConsumptionPackage.createPackageContents();

		// Initialize created meta-data
		theEnergyConsumptionPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEnergyConsumptionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EnergyConsumptionPackage.eNS_URI, theEnergyConsumptionPackage);
		return theEnergyConsumptionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnergyProvider() {
		return energyProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnergyProvider_Cities() {
		return (EReference) energyProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnergyProvider_Household() {
		return (EReference) energyProviderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnergyProvider_CompanyName() {
		return (EAttribute) energyProviderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnergyProvider_ElectricalEnergyConsumption() {
		return (EReference) energyProviderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCity() {
		return cityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCity_Name() {
		return (EAttribute) cityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHouseHold() {
		return houseHoldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHouseHold_HouseHoldId() {
		return (EAttribute) houseHoldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHouseHold_City() {
		return (EReference) houseHoldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHouseHold_ElectricalEnergyConsumption() {
		return (EReference) houseHoldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElectricalEnergyConsumption() {
		return electricalEnergyConsumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricalEnergyConsumption_DateTime() {
		return (EAttribute) electricalEnergyConsumptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElectricalEnergyConsumption_Kwh() {
		return (EAttribute) electricalEnergyConsumptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElectricalEnergyConsumption_Household() {
		return (EReference) electricalEnergyConsumptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumptionFactory getEnergyConsumptionFactory() {
		return (EnergyConsumptionFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		energyProviderEClass = createEClass(ENERGY_PROVIDER);
		createEReference(energyProviderEClass, ENERGY_PROVIDER__CITIES);
		createEReference(energyProviderEClass, ENERGY_PROVIDER__HOUSEHOLD);
		createEAttribute(energyProviderEClass, ENERGY_PROVIDER__COMPANY_NAME);
		createEReference(energyProviderEClass, ENERGY_PROVIDER__ELECTRICAL_ENERGY_CONSUMPTION);

		cityEClass = createEClass(CITY);
		createEAttribute(cityEClass, CITY__NAME);

		houseHoldEClass = createEClass(HOUSE_HOLD);
		createEAttribute(houseHoldEClass, HOUSE_HOLD__HOUSE_HOLD_ID);
		createEReference(houseHoldEClass, HOUSE_HOLD__CITY);
		createEReference(houseHoldEClass, HOUSE_HOLD__ELECTRICAL_ENERGY_CONSUMPTION);

		electricalEnergyConsumptionEClass = createEClass(ELECTRICAL_ENERGY_CONSUMPTION);
		createEAttribute(electricalEnergyConsumptionEClass, ELECTRICAL_ENERGY_CONSUMPTION__DATE_TIME);
		createEAttribute(electricalEnergyConsumptionEClass, ELECTRICAL_ENERGY_CONSUMPTION__KWH);
		createEReference(electricalEnergyConsumptionEClass, ELECTRICAL_ENERGY_CONSUMPTION__HOUSEHOLD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(energyProviderEClass, EnergyProvider.class, "EnergyProvider", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnergyProvider_Cities(), this.getCity(), null, "cities", null, 0, -1, EnergyProvider.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnergyProvider_Household(), this.getHouseHold(), null, "household", null, 0, -1,
				EnergyProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnergyProvider_CompanyName(), ecorePackage.getEString(), "companyName", null, 0, 1,
				EnergyProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getEnergyProvider_ElectricalEnergyConsumption(), this.getElectricalEnergyConsumption(), null,
				"electricalEnergyConsumption", null, 0, -1, EnergyProvider.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cityEClass, City.class, "City", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCity_Name(), ecorePackage.getEString(), "name", null, 0, 1, City.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(houseHoldEClass, HouseHold.class, "HouseHold", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHouseHold_HouseHoldId(), ecorePackage.getEString(), "houseHoldId", null, 0, 1,
				HouseHold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getHouseHold_City(), this.getCity(), null, "city", null, 1, 1, HouseHold.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getHouseHold_ElectricalEnergyConsumption(), this.getElectricalEnergyConsumption(),
				this.getElectricalEnergyConsumption_Household(), "electricalEnergyConsumption", null, 0, -1,
				HouseHold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(electricalEnergyConsumptionEClass, ElectricalEnergyConsumption.class, "ElectricalEnergyConsumption",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElectricalEnergyConsumption_DateTime(), ecorePackage.getEDate(), "dateTime", null, 0, 1,
				ElectricalEnergyConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElectricalEnergyConsumption_Kwh(), ecorePackage.getEDoubleObject(), "kwh", null, 0, 1,
				ElectricalEnergyConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElectricalEnergyConsumption_Household(), this.getHouseHold(),
				this.getHouseHold_ElectricalEnergyConsumption(), "household", null, 1, 1,
				ElectricalEnergyConsumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EnergyConsumptionPackageImpl
