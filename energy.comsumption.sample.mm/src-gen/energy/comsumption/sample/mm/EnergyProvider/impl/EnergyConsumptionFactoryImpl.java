/**
 */
package energy.comsumption.sample.mm.EnergyProvider.impl;

import energy.comsumption.sample.mm.EnergyProvider.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnergyConsumptionFactoryImpl extends EFactoryImpl implements EnergyConsumptionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnergyConsumptionFactory init() {
		try {
			EnergyConsumptionFactory theEnergyConsumptionFactory = (EnergyConsumptionFactory) EPackage.Registry.INSTANCE
					.getEFactory(EnergyConsumptionPackage.eNS_URI);
			if (theEnergyConsumptionFactory != null) {
				return theEnergyConsumptionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EnergyConsumptionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumptionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EnergyConsumptionPackage.ENERGY_PROVIDER:
			return createEnergyProvider();
		case EnergyConsumptionPackage.CITY:
			return createCity();
		case EnergyConsumptionPackage.HOUSE_HOLD:
			return createHouseHold();
		case EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION:
			return createElectricalEnergyConsumption();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyProvider createEnergyProvider() {
		EnergyProviderImpl energyProvider = new EnergyProviderImpl();
		return energyProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City createCity() {
		CityImpl city = new CityImpl();
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HouseHold createHouseHold() {
		HouseHoldImpl houseHold = new HouseHoldImpl();
		return houseHold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElectricalEnergyConsumption createElectricalEnergyConsumption() {
		ElectricalEnergyConsumptionImpl electricalEnergyConsumption = new ElectricalEnergyConsumptionImpl();
		return electricalEnergyConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumptionPackage getEnergyConsumptionPackage() {
		return (EnergyConsumptionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnergyConsumptionPackage getPackage() {
		return EnergyConsumptionPackage.eINSTANCE;
	}

} //EnergyConsumptionFactoryImpl
