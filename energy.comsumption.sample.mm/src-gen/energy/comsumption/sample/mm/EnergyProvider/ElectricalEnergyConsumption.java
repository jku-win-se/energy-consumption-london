/**
 */
package energy.comsumption.sample.mm.EnergyProvider;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Electrical Energy Consumption</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption#getKwh <em>Kwh</em>}</li>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption#getHousehold <em>Household</em>}</li>
 * </ul>
 *
 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage#getElectricalEnergyConsumption()
 * @model
 * @generated
 */
public interface ElectricalEnergyConsumption extends EObject {
	/**
	 * Returns the value of the '<em><b>Date Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time</em>' attribute.
	 * @see #setDateTime(Date)
	 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage#getElectricalEnergyConsumption_DateTime()
	 * @model
	 * @generated
	 */
	Date getDateTime();

	/**
	 * Sets the value of the '{@link energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption#getDateTime <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time</em>' attribute.
	 * @see #getDateTime()
	 * @generated
	 */
	void setDateTime(Date value);

	/**
	 * Returns the value of the '<em><b>Kwh</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kwh</em>' attribute.
	 * @see #setKwh(Double)
	 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage#getElectricalEnergyConsumption_Kwh()
	 * @model
	 * @generated
	 */
	Double getKwh();

	/**
	 * Sets the value of the '{@link energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption#getKwh <em>Kwh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kwh</em>' attribute.
	 * @see #getKwh()
	 * @generated
	 */
	void setKwh(Double value);

	/**
	 * Returns the value of the '<em><b>Household</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link energy.comsumption.sample.mm.EnergyProvider.HouseHold#getElectricalEnergyConsumption <em>Electrical Energy Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Household</em>' reference.
	 * @see #setHousehold(HouseHold)
	 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage#getElectricalEnergyConsumption_Household()
	 * @see energy.comsumption.sample.mm.EnergyProvider.HouseHold#getElectricalEnergyConsumption
	 * @model opposite="electricalEnergyConsumption" required="true"
	 * @generated
	 */
	HouseHold getHousehold();

	/**
	 * Sets the value of the '{@link energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption#getHousehold <em>Household</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Household</em>' reference.
	 * @see #getHousehold()
	 * @generated
	 */
	void setHousehold(HouseHold value);

} // ElectricalEnergyConsumption
