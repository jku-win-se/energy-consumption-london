/**
 */
package energy.comsumption.sample.mm.EnergyProvider.impl;

import energy.comsumption.sample.mm.EnergyProvider.City;
import energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption;
import energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage;
import energy.comsumption.sample.mm.EnergyProvider.HouseHold;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>House Hold</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.impl.HouseHoldImpl#getHouseHoldId <em>House Hold Id</em>}</li>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.impl.HouseHoldImpl#getCity <em>City</em>}</li>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.impl.HouseHoldImpl#getElectricalEnergyConsumption <em>Electrical Energy Consumption</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HouseHoldImpl extends MinimalEObjectImpl.Container implements HouseHold {
	/**
	 * The default value of the '{@link #getHouseHoldId() <em>House Hold Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseHoldId()
	 * @generated
	 * @ordered
	 */
	protected static final String HOUSE_HOLD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHouseHoldId() <em>House Hold Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHouseHoldId()
	 * @generated
	 * @ordered
	 */
	protected String houseHoldId = HOUSE_HOLD_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected City city;

	/**
	 * The cached value of the '{@link #getElectricalEnergyConsumption() <em>Electrical Energy Consumption</em>}' reference list.
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
	protected HouseHoldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnergyConsumptionPackage.Literals.HOUSE_HOLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHouseHoldId() {
		return houseHoldId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHouseHoldId(String newHouseHoldId) {
		String oldHouseHoldId = houseHoldId;
		houseHoldId = newHouseHoldId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergyConsumptionPackage.HOUSE_HOLD__HOUSE_HOLD_ID,
					oldHouseHoldId, houseHoldId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City getCity() {
		if (city != null && city.eIsProxy()) {
			InternalEObject oldCity = (InternalEObject) city;
			city = (City) eResolveProxy(oldCity);
			if (city != oldCity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EnergyConsumptionPackage.HOUSE_HOLD__CITY,
							oldCity, city));
			}
		}
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public City basicGetCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(City newCity) {
		City oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EnergyConsumptionPackage.HOUSE_HOLD__CITY, oldCity,
					city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElectricalEnergyConsumption> getElectricalEnergyConsumption() {
		if (electricalEnergyConsumption == null) {
			electricalEnergyConsumption = new EObjectWithInverseResolvingEList<ElectricalEnergyConsumption>(
					ElectricalEnergyConsumption.class, this,
					EnergyConsumptionPackage.HOUSE_HOLD__ELECTRICAL_ENERGY_CONSUMPTION,
					EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__HOUSEHOLD);
		}
		return electricalEnergyConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EnergyConsumptionPackage.HOUSE_HOLD__ELECTRICAL_ENERGY_CONSUMPTION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getElectricalEnergyConsumption())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EnergyConsumptionPackage.HOUSE_HOLD__ELECTRICAL_ENERGY_CONSUMPTION:
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
		case EnergyConsumptionPackage.HOUSE_HOLD__HOUSE_HOLD_ID:
			return getHouseHoldId();
		case EnergyConsumptionPackage.HOUSE_HOLD__CITY:
			if (resolve)
				return getCity();
			return basicGetCity();
		case EnergyConsumptionPackage.HOUSE_HOLD__ELECTRICAL_ENERGY_CONSUMPTION:
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
		case EnergyConsumptionPackage.HOUSE_HOLD__HOUSE_HOLD_ID:
			setHouseHoldId((String) newValue);
			return;
		case EnergyConsumptionPackage.HOUSE_HOLD__CITY:
			setCity((City) newValue);
			return;
		case EnergyConsumptionPackage.HOUSE_HOLD__ELECTRICAL_ENERGY_CONSUMPTION:
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
		case EnergyConsumptionPackage.HOUSE_HOLD__HOUSE_HOLD_ID:
			setHouseHoldId(HOUSE_HOLD_ID_EDEFAULT);
			return;
		case EnergyConsumptionPackage.HOUSE_HOLD__CITY:
			setCity((City) null);
			return;
		case EnergyConsumptionPackage.HOUSE_HOLD__ELECTRICAL_ENERGY_CONSUMPTION:
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
		case EnergyConsumptionPackage.HOUSE_HOLD__HOUSE_HOLD_ID:
			return HOUSE_HOLD_ID_EDEFAULT == null ? houseHoldId != null : !HOUSE_HOLD_ID_EDEFAULT.equals(houseHoldId);
		case EnergyConsumptionPackage.HOUSE_HOLD__CITY:
			return city != null;
		case EnergyConsumptionPackage.HOUSE_HOLD__ELECTRICAL_ENERGY_CONSUMPTION:
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
		result.append(" (houseHoldId: ");
		result.append(houseHoldId);
		result.append(')');
		return result.toString();
	}

} //HouseHoldImpl
