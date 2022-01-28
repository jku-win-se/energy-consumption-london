/**
 */
package energy.comsumption.sample.mm.EnergyProvider;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>House Hold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.HouseHold#getHouseHoldId <em>House Hold Id</em>}</li>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.HouseHold#getCity <em>City</em>}</li>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.HouseHold#getElectricalEnergyConsumption <em>Electrical Energy Consumption</em>}</li>
 * </ul>
 *
 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage#getHouseHold()
 * @model
 * @generated
 */
public interface HouseHold extends EObject {
	/**
	 * Returns the value of the '<em><b>House Hold Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House Hold Id</em>' attribute.
	 * @see #setHouseHoldId(String)
	 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage#getHouseHold_HouseHoldId()
	 * @model id="true"
	 * @generated
	 */
	String getHouseHoldId();

	/**
	 * Sets the value of the '{@link energy.comsumption.sample.mm.EnergyProvider.HouseHold#getHouseHoldId <em>House Hold Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>House Hold Id</em>' attribute.
	 * @see #getHouseHoldId()
	 * @generated
	 */
	void setHouseHoldId(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>City</em>' reference.
	 * @see #setCity(City)
	 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage#getHouseHold_City()
	 * @model required="true"
	 * @generated
	 */
	City getCity();

	/**
	 * Sets the value of the '{@link energy.comsumption.sample.mm.EnergyProvider.HouseHold#getCity <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' reference.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(City value);

	/**
	 * Returns the value of the '<em><b>Electrical Energy Consumption</b></em>' reference list.
	 * The list contents are of type {@link energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption}.
	 * It is bidirectional and its opposite is '{@link energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption#getHousehold <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electrical Energy Consumption</em>' reference list.
	 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage#getHouseHold_ElectricalEnergyConsumption()
	 * @see energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption#getHousehold
	 * @model opposite="household"
	 * @generated
	 */
	EList<ElectricalEnergyConsumption> getElectricalEnergyConsumption();

} // HouseHold
