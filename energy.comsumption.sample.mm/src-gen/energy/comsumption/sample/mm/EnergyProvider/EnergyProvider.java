/**
 */
package energy.comsumption.sample.mm.EnergyProvider;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Energy Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.EnergyProvider#getCities <em>Cities</em>}</li>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.EnergyProvider#getHousehold <em>Household</em>}</li>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.EnergyProvider#getCompanyName <em>Company Name</em>}</li>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.EnergyProvider#getElectricalEnergyConsumption <em>Electrical Energy Consumption</em>}</li>
 * </ul>
 *
 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage#getEnergyProvider()
 * @model
 * @generated
 */
public interface EnergyProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>Cities</b></em>' containment reference list.
	 * The list contents are of type {@link energy.comsumption.sample.mm.EnergyProvider.City}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cities</em>' containment reference list.
	 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage#getEnergyProvider_Cities()
	 * @model containment="true"
	 * @generated
	 */
	EList<City> getCities();

	/**
	 * Returns the value of the '<em><b>Household</b></em>' containment reference list.
	 * The list contents are of type {@link energy.comsumption.sample.mm.EnergyProvider.HouseHold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Household</em>' containment reference list.
	 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage#getEnergyProvider_Household()
	 * @model containment="true"
	 * @generated
	 */
	EList<HouseHold> getHousehold();

	/**
	 * Returns the value of the '<em><b>Company Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Company Name</em>' attribute.
	 * @see #setCompanyName(String)
	 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage#getEnergyProvider_CompanyName()
	 * @model
	 * @generated
	 */
	String getCompanyName();

	/**
	 * Sets the value of the '{@link energy.comsumption.sample.mm.EnergyProvider.EnergyProvider#getCompanyName <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Company Name</em>' attribute.
	 * @see #getCompanyName()
	 * @generated
	 */
	void setCompanyName(String value);

	/**
	 * Returns the value of the '<em><b>Electrical Energy Consumption</b></em>' containment reference list.
	 * The list contents are of type {@link energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Electrical Energy Consumption</em>' containment reference list.
	 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage#getEnergyProvider_ElectricalEnergyConsumption()
	 * @model containment="true"
	 * @generated
	 */
	EList<ElectricalEnergyConsumption> getElectricalEnergyConsumption();

} // EnergyProvider
