/**
 */
package energy.comsumption.sample.mm.EnergyProvider;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionFactory
 * @model kind="package"
 * @generated
 */
public interface EnergyConsumptionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "EnergyProvider";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.lowcomote.eu/EnergyProvider";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ec";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnergyConsumptionPackage eINSTANCE = energy.comsumption.sample.mm.EnergyProvider.impl.EnergyConsumptionPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link energy.comsumption.sample.mm.EnergyProvider.impl.EnergyProviderImpl <em>Energy Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see energy.comsumption.sample.mm.EnergyProvider.impl.EnergyProviderImpl
	 * @see energy.comsumption.sample.mm.EnergyProvider.impl.EnergyConsumptionPackageImpl#getEnergyProvider()
	 * @generated
	 */
	int ENERGY_PROVIDER = 0;

	/**
	 * The feature id for the '<em><b>Cities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROVIDER__CITIES = 0;

	/**
	 * The feature id for the '<em><b>Household</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROVIDER__HOUSEHOLD = 1;

	/**
	 * The feature id for the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROVIDER__COMPANY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Electrical Energy Consumption</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROVIDER__ELECTRICAL_ENERGY_CONSUMPTION = 3;

	/**
	 * The number of structural features of the '<em>Energy Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROVIDER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Energy Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENERGY_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link energy.comsumption.sample.mm.EnergyProvider.impl.CityImpl <em>City</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see energy.comsumption.sample.mm.EnergyProvider.impl.CityImpl
	 * @see energy.comsumption.sample.mm.EnergyProvider.impl.EnergyConsumptionPackageImpl#getCity()
	 * @generated
	 */
	int CITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY__NAME = 0;

	/**
	 * The number of structural features of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>City</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link energy.comsumption.sample.mm.EnergyProvider.impl.HouseHoldImpl <em>House Hold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see energy.comsumption.sample.mm.EnergyProvider.impl.HouseHoldImpl
	 * @see energy.comsumption.sample.mm.EnergyProvider.impl.EnergyConsumptionPackageImpl#getHouseHold()
	 * @generated
	 */
	int HOUSE_HOLD = 2;

	/**
	 * The feature id for the '<em><b>House Hold Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_HOLD__HOUSE_HOLD_ID = 0;

	/**
	 * The feature id for the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_HOLD__CITY = 1;

	/**
	 * The feature id for the '<em><b>Electrical Energy Consumption</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_HOLD__ELECTRICAL_ENERGY_CONSUMPTION = 2;

	/**
	 * The number of structural features of the '<em>House Hold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_HOLD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>House Hold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSE_HOLD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link energy.comsumption.sample.mm.EnergyProvider.impl.ElectricalEnergyConsumptionImpl <em>Electrical Energy Consumption</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see energy.comsumption.sample.mm.EnergyProvider.impl.ElectricalEnergyConsumptionImpl
	 * @see energy.comsumption.sample.mm.EnergyProvider.impl.EnergyConsumptionPackageImpl#getElectricalEnergyConsumption()
	 * @generated
	 */
	int ELECTRICAL_ENERGY_CONSUMPTION = 3;

	/**
	 * The feature id for the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ENERGY_CONSUMPTION__DATE_TIME = 0;

	/**
	 * The feature id for the '<em><b>Kwh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ENERGY_CONSUMPTION__KWH = 1;

	/**
	 * The feature id for the '<em><b>Household</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ENERGY_CONSUMPTION__HOUSEHOLD = 2;

	/**
	 * The number of structural features of the '<em>Electrical Energy Consumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ENERGY_CONSUMPTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Electrical Energy Consumption</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELECTRICAL_ENERGY_CONSUMPTION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link energy.comsumption.sample.mm.EnergyProvider.EnergyProvider <em>Energy Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Energy Provider</em>'.
	 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyProvider
	 * @generated
	 */
	EClass getEnergyProvider();

	/**
	 * Returns the meta object for the containment reference list '{@link energy.comsumption.sample.mm.EnergyProvider.EnergyProvider#getCities <em>Cities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cities</em>'.
	 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyProvider#getCities()
	 * @see #getEnergyProvider()
	 * @generated
	 */
	EReference getEnergyProvider_Cities();

	/**
	 * Returns the meta object for the containment reference list '{@link energy.comsumption.sample.mm.EnergyProvider.EnergyProvider#getHousehold <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Household</em>'.
	 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyProvider#getHousehold()
	 * @see #getEnergyProvider()
	 * @generated
	 */
	EReference getEnergyProvider_Household();

	/**
	 * Returns the meta object for the attribute '{@link energy.comsumption.sample.mm.EnergyProvider.EnergyProvider#getCompanyName <em>Company Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Company Name</em>'.
	 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyProvider#getCompanyName()
	 * @see #getEnergyProvider()
	 * @generated
	 */
	EAttribute getEnergyProvider_CompanyName();

	/**
	 * Returns the meta object for the containment reference list '{@link energy.comsumption.sample.mm.EnergyProvider.EnergyProvider#getElectricalEnergyConsumption <em>Electrical Energy Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Electrical Energy Consumption</em>'.
	 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyProvider#getElectricalEnergyConsumption()
	 * @see #getEnergyProvider()
	 * @generated
	 */
	EReference getEnergyProvider_ElectricalEnergyConsumption();

	/**
	 * Returns the meta object for class '{@link energy.comsumption.sample.mm.EnergyProvider.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>City</em>'.
	 * @see energy.comsumption.sample.mm.EnergyProvider.City
	 * @generated
	 */
	EClass getCity();

	/**
	 * Returns the meta object for the attribute '{@link energy.comsumption.sample.mm.EnergyProvider.City#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see energy.comsumption.sample.mm.EnergyProvider.City#getName()
	 * @see #getCity()
	 * @generated
	 */
	EAttribute getCity_Name();

	/**
	 * Returns the meta object for class '{@link energy.comsumption.sample.mm.EnergyProvider.HouseHold <em>House Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>House Hold</em>'.
	 * @see energy.comsumption.sample.mm.EnergyProvider.HouseHold
	 * @generated
	 */
	EClass getHouseHold();

	/**
	 * Returns the meta object for the attribute '{@link energy.comsumption.sample.mm.EnergyProvider.HouseHold#getHouseHoldId <em>House Hold Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>House Hold Id</em>'.
	 * @see energy.comsumption.sample.mm.EnergyProvider.HouseHold#getHouseHoldId()
	 * @see #getHouseHold()
	 * @generated
	 */
	EAttribute getHouseHold_HouseHoldId();

	/**
	 * Returns the meta object for the reference '{@link energy.comsumption.sample.mm.EnergyProvider.HouseHold#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>City</em>'.
	 * @see energy.comsumption.sample.mm.EnergyProvider.HouseHold#getCity()
	 * @see #getHouseHold()
	 * @generated
	 */
	EReference getHouseHold_City();

	/**
	 * Returns the meta object for the reference list '{@link energy.comsumption.sample.mm.EnergyProvider.HouseHold#getElectricalEnergyConsumption <em>Electrical Energy Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Electrical Energy Consumption</em>'.
	 * @see energy.comsumption.sample.mm.EnergyProvider.HouseHold#getElectricalEnergyConsumption()
	 * @see #getHouseHold()
	 * @generated
	 */
	EReference getHouseHold_ElectricalEnergyConsumption();

	/**
	 * Returns the meta object for class '{@link energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption <em>Electrical Energy Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Electrical Energy Consumption</em>'.
	 * @see energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption
	 * @generated
	 */
	EClass getElectricalEnergyConsumption();

	/**
	 * Returns the meta object for the attribute '{@link energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption#getDateTime <em>Date Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Time</em>'.
	 * @see energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption#getDateTime()
	 * @see #getElectricalEnergyConsumption()
	 * @generated
	 */
	EAttribute getElectricalEnergyConsumption_DateTime();

	/**
	 * Returns the meta object for the attribute '{@link energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption#getKwh <em>Kwh</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kwh</em>'.
	 * @see energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption#getKwh()
	 * @see #getElectricalEnergyConsumption()
	 * @generated
	 */
	EAttribute getElectricalEnergyConsumption_Kwh();

	/**
	 * Returns the meta object for the reference '{@link energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption#getHousehold <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Household</em>'.
	 * @see energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption#getHousehold()
	 * @see #getElectricalEnergyConsumption()
	 * @generated
	 */
	EReference getElectricalEnergyConsumption_Household();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EnergyConsumptionFactory getEnergyConsumptionFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link energy.comsumption.sample.mm.EnergyProvider.impl.EnergyProviderImpl <em>Energy Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see energy.comsumption.sample.mm.EnergyProvider.impl.EnergyProviderImpl
		 * @see energy.comsumption.sample.mm.EnergyProvider.impl.EnergyConsumptionPackageImpl#getEnergyProvider()
		 * @generated
		 */
		EClass ENERGY_PROVIDER = eINSTANCE.getEnergyProvider();

		/**
		 * The meta object literal for the '<em><b>Cities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_PROVIDER__CITIES = eINSTANCE.getEnergyProvider_Cities();

		/**
		 * The meta object literal for the '<em><b>Household</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_PROVIDER__HOUSEHOLD = eINSTANCE.getEnergyProvider_Household();

		/**
		 * The meta object literal for the '<em><b>Company Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENERGY_PROVIDER__COMPANY_NAME = eINSTANCE.getEnergyProvider_CompanyName();

		/**
		 * The meta object literal for the '<em><b>Electrical Energy Consumption</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENERGY_PROVIDER__ELECTRICAL_ENERGY_CONSUMPTION = eINSTANCE
				.getEnergyProvider_ElectricalEnergyConsumption();

		/**
		 * The meta object literal for the '{@link energy.comsumption.sample.mm.EnergyProvider.impl.CityImpl <em>City</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see energy.comsumption.sample.mm.EnergyProvider.impl.CityImpl
		 * @see energy.comsumption.sample.mm.EnergyProvider.impl.EnergyConsumptionPackageImpl#getCity()
		 * @generated
		 */
		EClass CITY = eINSTANCE.getCity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITY__NAME = eINSTANCE.getCity_Name();

		/**
		 * The meta object literal for the '{@link energy.comsumption.sample.mm.EnergyProvider.impl.HouseHoldImpl <em>House Hold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see energy.comsumption.sample.mm.EnergyProvider.impl.HouseHoldImpl
		 * @see energy.comsumption.sample.mm.EnergyProvider.impl.EnergyConsumptionPackageImpl#getHouseHold()
		 * @generated
		 */
		EClass HOUSE_HOLD = eINSTANCE.getHouseHold();

		/**
		 * The meta object literal for the '<em><b>House Hold Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSE_HOLD__HOUSE_HOLD_ID = eINSTANCE.getHouseHold_HouseHoldId();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE_HOLD__CITY = eINSTANCE.getHouseHold_City();

		/**
		 * The meta object literal for the '<em><b>Electrical Energy Consumption</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSE_HOLD__ELECTRICAL_ENERGY_CONSUMPTION = eINSTANCE.getHouseHold_ElectricalEnergyConsumption();

		/**
		 * The meta object literal for the '{@link energy.comsumption.sample.mm.EnergyProvider.impl.ElectricalEnergyConsumptionImpl <em>Electrical Energy Consumption</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see energy.comsumption.sample.mm.EnergyProvider.impl.ElectricalEnergyConsumptionImpl
		 * @see energy.comsumption.sample.mm.EnergyProvider.impl.EnergyConsumptionPackageImpl#getElectricalEnergyConsumption()
		 * @generated
		 */
		EClass ELECTRICAL_ENERGY_CONSUMPTION = eINSTANCE.getElectricalEnergyConsumption();

		/**
		 * The meta object literal for the '<em><b>Date Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRICAL_ENERGY_CONSUMPTION__DATE_TIME = eINSTANCE.getElectricalEnergyConsumption_DateTime();

		/**
		 * The meta object literal for the '<em><b>Kwh</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELECTRICAL_ENERGY_CONSUMPTION__KWH = eINSTANCE.getElectricalEnergyConsumption_Kwh();

		/**
		 * The meta object literal for the '<em><b>Household</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ELECTRICAL_ENERGY_CONSUMPTION__HOUSEHOLD = eINSTANCE.getElectricalEnergyConsumption_Household();

	}

} //EnergyConsumptionPackage
