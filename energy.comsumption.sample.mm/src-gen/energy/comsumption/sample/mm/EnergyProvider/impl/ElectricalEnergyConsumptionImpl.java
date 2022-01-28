/**
 */
package energy.comsumption.sample.mm.EnergyProvider.impl;

import energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption;
import energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage;
import energy.comsumption.sample.mm.EnergyProvider.HouseHold;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Electrical Energy Consumption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.impl.ElectricalEnergyConsumptionImpl#getDateTime <em>Date Time</em>}</li>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.impl.ElectricalEnergyConsumptionImpl#getKwh <em>Kwh</em>}</li>
 *   <li>{@link energy.comsumption.sample.mm.EnergyProvider.impl.ElectricalEnergyConsumptionImpl#getHousehold <em>Household</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElectricalEnergyConsumptionImpl extends MinimalEObjectImpl.Container
		implements ElectricalEnergyConsumption {
	/**
	 * The default value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateTime() <em>Date Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTime()
	 * @generated
	 * @ordered
	 */
	protected Date dateTime = DATE_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getKwh() <em>Kwh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKwh()
	 * @generated
	 * @ordered
	 */
	protected static final Double KWH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKwh() <em>Kwh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKwh()
	 * @generated
	 * @ordered
	 */
	protected Double kwh = KWH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHousehold() <em>Household</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHousehold()
	 * @generated
	 * @ordered
	 */
	protected HouseHold household;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElectricalEnergyConsumptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EnergyConsumptionPackage.Literals.ELECTRICAL_ENERGY_CONSUMPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateTime() {
		return dateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTime(Date newDateTime) {
		Date oldDateTime = dateTime;
		dateTime = newDateTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__DATE_TIME, oldDateTime, dateTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getKwh() {
		return kwh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKwh(Double newKwh) {
		Double oldKwh = kwh;
		kwh = newKwh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__KWH, oldKwh, kwh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HouseHold getHousehold() {
		if (household != null && household.eIsProxy()) {
			InternalEObject oldHousehold = (InternalEObject) household;
			household = (HouseHold) eResolveProxy(oldHousehold);
			if (household != oldHousehold) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__HOUSEHOLD, oldHousehold,
							household));
			}
		}
		return household;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HouseHold basicGetHousehold() {
		return household;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHousehold(HouseHold newHousehold, NotificationChain msgs) {
		HouseHold oldHousehold = household;
		household = newHousehold;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__HOUSEHOLD, oldHousehold, newHousehold);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHousehold(HouseHold newHousehold) {
		if (newHousehold != household) {
			NotificationChain msgs = null;
			if (household != null)
				msgs = ((InternalEObject) household).eInverseRemove(this,
						EnergyConsumptionPackage.HOUSE_HOLD__ELECTRICAL_ENERGY_CONSUMPTION, HouseHold.class, msgs);
			if (newHousehold != null)
				msgs = ((InternalEObject) newHousehold).eInverseAdd(this,
						EnergyConsumptionPackage.HOUSE_HOLD__ELECTRICAL_ENERGY_CONSUMPTION, HouseHold.class, msgs);
			msgs = basicSetHousehold(newHousehold, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__HOUSEHOLD, newHousehold, newHousehold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__HOUSEHOLD:
			if (household != null)
				msgs = ((InternalEObject) household).eInverseRemove(this,
						EnergyConsumptionPackage.HOUSE_HOLD__ELECTRICAL_ENERGY_CONSUMPTION, HouseHold.class, msgs);
			return basicSetHousehold((HouseHold) otherEnd, msgs);
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
		case EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__HOUSEHOLD:
			return basicSetHousehold(null, msgs);
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
		case EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__DATE_TIME:
			return getDateTime();
		case EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__KWH:
			return getKwh();
		case EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__HOUSEHOLD:
			if (resolve)
				return getHousehold();
			return basicGetHousehold();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__DATE_TIME:
			setDateTime((Date) newValue);
			return;
		case EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__KWH:
			setKwh((Double) newValue);
			return;
		case EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__HOUSEHOLD:
			setHousehold((HouseHold) newValue);
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
		case EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__DATE_TIME:
			setDateTime(DATE_TIME_EDEFAULT);
			return;
		case EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__KWH:
			setKwh(KWH_EDEFAULT);
			return;
		case EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__HOUSEHOLD:
			setHousehold((HouseHold) null);
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
		case EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__DATE_TIME:
			return DATE_TIME_EDEFAULT == null ? dateTime != null : !DATE_TIME_EDEFAULT.equals(dateTime);
		case EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__KWH:
			return KWH_EDEFAULT == null ? kwh != null : !KWH_EDEFAULT.equals(kwh);
		case EnergyConsumptionPackage.ELECTRICAL_ENERGY_CONSUMPTION__HOUSEHOLD:
			return household != null;
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
		result.append(" (dateTime: ");
		result.append(dateTime);
		result.append(", kwh: ");
		result.append(kwh);
		result.append(')');
		return result.toString();
	}

} //ElectricalEnergyConsumptionImpl
