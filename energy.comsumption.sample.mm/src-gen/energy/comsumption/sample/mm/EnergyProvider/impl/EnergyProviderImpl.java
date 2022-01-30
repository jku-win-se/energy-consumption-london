/**
 */
package energy.comsumption.sample.mm.EnergyProvider.impl;

import energy.comsumption.sample.mm.EnergyProvider.City;
import energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption;
import energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage;
import energy.comsumption.sample.mm.EnergyProvider.EnergyProvider;
import energy.comsumption.sample.mm.EnergyProvider.HouseHold;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energy Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.impl.EnergyProviderImpl#getCities <em>Cities</em>}</li>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.impl.EnergyProviderImpl#getHousehold <em>Household</em>}</li>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.impl.EnergyProviderImpl#getCompanyName <em>Company Name</em>}</li>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.impl.EnergyProviderImpl#getElectricalEnergyConsumption <em>Electrical Energy Consumption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergyProviderImpl extends MinimalEObjectImpl.Container implements EnergyProvider {
	/**
	 * The cached value of the '{@link #getCities() <em>Cities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCities()
	 * @generated
	 * @ordered
	 */
	protected EList<City> cities;

	/**
	 * The cached value of the '{@link #getHousehold() <em>Household</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHousehold()
	 * @generated
	 * @ordered
	 */
	protected EList<HouseHold> household;

	/**
	 * The default value of the '{@link #getCompanyName() <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyName()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPANY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCompanyName() <em>Company Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompanyName()
	 * @generated
	 * @ordered
	 */
	protected String companyName = COMPANY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElectricalEnergyConsumption() <em>Electrical Energy Consumption</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricalEnergyConsumption()
	 * @generated
	 * @ordered
	 */
	protected EList<ElectricalEnergyConsumption> electricalEnergyConsumption;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergyProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnergyConsumptionPackage.Literals.ENERGY_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<City> getCities() {
		if (cities == null) {
			cities = new EObjectContainmentEList<City>(City.class, this,
					EnergyConsumptionPackage.ENERGY_PROVIDER__CITIES);
		}
		return cities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HouseHold> getHousehold() {
		if (household == null) {
			household = new EObjectContainmentEList<HouseHold>(HouseHold.class, this,
					EnergyConsumptionPackage.ENERGY_PROVIDER__HOUSEHOLD);
		}
		return household;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompanyName(String newCompanyName) {
		String oldCompanyName = companyName;
		companyName = newCompanyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnergyConsumptionPackage.ENERGY_PROVIDER__COMPANY_NAME, oldCompanyName, companyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElectricalEnergyConsumption> getElectricalEnergyConsumption() {
		if (electricalEnergyConsumption == null) {
			electricalEnergyConsumption = new EObjectContainmentEList<ElectricalEnergyConsumption>(
					ElectricalEnergyConsumption.class, this,
					EnergyConsumptionPackage.ENERGY_PROVIDER__ELECTRICAL_ENERGY_CONSUMPTION);
		}
		return electricalEnergyConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EnergyConsumptionPackage.ENERGY_PROVIDER__CITIES:
			return ((InternalEList<?>) getCities()).basicRemove(otherEnd, msgs);
		case EnergyConsumptionPackage.ENERGY_PROVIDER__HOUSEHOLD:
			return ((InternalEList<?>) getHousehold()).basicRemove(otherEnd, msgs);
		case EnergyConsumptionPackage.ENERGY_PROVIDER__ELECTRICAL_ENERGY_CONSUMPTION:
			return ((InternalEList<?>) getElectricalEnergyConsumption()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EnergyConsumptionPackage.ENERGY_PROVIDER__CITIES:
			return getCities();
		case EnergyConsumptionPackage.ENERGY_PROVIDER__HOUSEHOLD:
			return getHousehold();
		case EnergyConsumptionPackage.ENERGY_PROVIDER__COMPANY_NAME:
			return getCompanyName();
		case EnergyConsumptionPackage.ENERGY_PROVIDER__ELECTRICAL_ENERGY_CONSUMPTION:
			return getElectricalEnergyConsumption();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EnergyConsumptionPackage.ENERGY_PROVIDER__CITIES:
			getCities().clear();
			getCities().addAll((Collection<? extends City>) newValue);
			return;
		case EnergyConsumptionPackage.ENERGY_PROVIDER__HOUSEHOLD:
			getHousehold().clear();
			getHousehold().addAll((Collection<? extends HouseHold>) newValue);
			return;
		case EnergyConsumptionPackage.ENERGY_PROVIDER__COMPANY_NAME:
			setCompanyName((String) newValue);
			return;
		case EnergyConsumptionPackage.ENERGY_PROVIDER__ELECTRICAL_ENERGY_CONSUMPTION:
			getElectricalEnergyConsumption().clear();
			getElectricalEnergyConsumption().addAll((Collection<? extends ElectricalEnergyConsumption>) newValue);
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
		case EnergyConsumptionPackage.ENERGY_PROVIDER__CITIES:
			getCities().clear();
			return;
		case EnergyConsumptionPackage.ENERGY_PROVIDER__HOUSEHOLD:
			getHousehold().clear();
			return;
		case EnergyConsumptionPackage.ENERGY_PROVIDER__COMPANY_NAME:
			setCompanyName(COMPANY_NAME_EDEFAULT);
			return;
		case EnergyConsumptionPackage.ENERGY_PROVIDER__ELECTRICAL_ENERGY_CONSUMPTION:
			getElectricalEnergyConsumption().clear();
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
		case EnergyConsumptionPackage.ENERGY_PROVIDER__CITIES:
			return cities != null && !cities.isEmpty();
		case EnergyConsumptionPackage.ENERGY_PROVIDER__HOUSEHOLD:
			return household != null && !household.isEmpty();
		case EnergyConsumptionPackage.ENERGY_PROVIDER__COMPANY_NAME:
			return COMPANY_NAME_EDEFAULT == null ? companyName != null : !COMPANY_NAME_EDEFAULT.equals(companyName);
		case EnergyConsumptionPackage.ENERGY_PROVIDER__ELECTRICAL_ENERGY_CONSUMPTION:
			return electricalEnergyConsumption != null && !electricalEnergyConsumption.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (companyName: ");
		result.append(companyName);
		result.append(')');
		return result.toString();
	}

} //EnergyProviderImpl
