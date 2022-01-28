/**
 */
package energy.comsumption.sample.mm.EnergyProvider.util;

import energy.comsumption.sample.mm.EnergyProvider.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyConsumptionPackage
 * @generated
 */
public class EnergyConsumptionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static EnergyConsumptionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnergyConsumptionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = EnergyConsumptionPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnergyConsumptionSwitch<Adapter> modelSwitch = new EnergyConsumptionSwitch<Adapter>() {
		@Override
		public Adapter caseEnergyProvider(EnergyProvider object) {
			return createEnergyProviderAdapter();
		}

		@Override
		public Adapter caseCity(City object) {
			return createCityAdapter();
		}

		@Override
		public Adapter caseHouseHold(HouseHold object) {
			return createHouseHoldAdapter();
		}

		@Override
		public Adapter caseElectricalEnergyConsumption(ElectricalEnergyConsumption object) {
			return createElectricalEnergyConsumptionAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link energy.comsumption.sample.mm.EnergyProvider.EnergyProvider <em>Energy Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see energy.comsumption.sample.mm.EnergyProvider.EnergyProvider
	 * @generated
	 */
	public Adapter createEnergyProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link energy.comsumption.sample.mm.EnergyProvider.City <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see energy.comsumption.sample.mm.EnergyProvider.City
	 * @generated
	 */
	public Adapter createCityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link energy.comsumption.sample.mm.EnergyProvider.HouseHold <em>House Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see energy.comsumption.sample.mm.EnergyProvider.HouseHold
	 * @generated
	 */
	public Adapter createHouseHoldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption <em>Electrical Energy Consumption</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption
	 * @generated
	 */
	public Adapter createElectricalEnergyConsumptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //EnergyConsumptionAdapterFactory
