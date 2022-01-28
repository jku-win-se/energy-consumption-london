/**
 */
package energy.comsumption.sample.mm.EnergyProvider;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage
 * @generated
 */
public interface EnergyConsumptionFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EnergyConsumptionFactory eINSTANCE = energy.comsumption.sample.mm.EnergyProvider.impl.EnergyConsumptionFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Energy Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Energy Provider</em>'.
	 * @generated
	 */
	EnergyProvider createEnergyProvider();

	/**
	 * Returns a new object of class '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>City</em>'.
	 * @generated
	 */
	City createCity();

	/**
	 * Returns a new object of class '<em>House Hold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>House Hold</em>'.
	 * @generated
	 */
	HouseHold createHouseHold();

	/**
	 * Returns a new object of class '<em>Electrical Energy Consumption</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Electrical Energy Consumption</em>'.
	 * @generated
	 */
	ElectricalEnergyConsumption createElectricalEnergyConsumption();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EnergyConsumptionPackage getEnergyConsumptionPackage();

} //EnergyConsumptionFactory
