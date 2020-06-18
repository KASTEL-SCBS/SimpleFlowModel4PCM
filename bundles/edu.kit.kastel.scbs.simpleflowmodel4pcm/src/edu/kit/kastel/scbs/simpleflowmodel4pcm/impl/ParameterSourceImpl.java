/**
 */
package edu.kit.kastel.scbs.simpleflowmodel4pcm.impl;

import edu.kit.kastel.scbs.simpleflowmodel4pcm.ParameterIdentification;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.ParameterSource;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.repository.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.ParameterSourceImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterSourceImpl extends SignatureSourceImpl implements ParameterSource {
	/**
	 * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Simpleflowmodel4pcmPackage.Literals.PARAMETER_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectResolvingEList<Parameter>(Parameter.class, this,
					Simpleflowmodel4pcmPackage.PARAMETER_SOURCE__PARAMETER);
		}
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Simpleflowmodel4pcmPackage.PARAMETER_SOURCE__PARAMETER:
			return getParameter();
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
		case Simpleflowmodel4pcmPackage.PARAMETER_SOURCE__PARAMETER:
			getParameter().clear();
			getParameter().addAll((Collection<? extends Parameter>) newValue);
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
		case Simpleflowmodel4pcmPackage.PARAMETER_SOURCE__PARAMETER:
			getParameter().clear();
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
		case Simpleflowmodel4pcmPackage.PARAMETER_SOURCE__PARAMETER:
			return parameter != null && !parameter.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterIdentification.class) {
			switch (derivedFeatureID) {
			case Simpleflowmodel4pcmPackage.PARAMETER_SOURCE__PARAMETER:
				return Simpleflowmodel4pcmPackage.PARAMETER_IDENTIFICATION__PARAMETER;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ParameterIdentification.class) {
			switch (baseFeatureID) {
			case Simpleflowmodel4pcmPackage.PARAMETER_IDENTIFICATION__PARAMETER:
				return Simpleflowmodel4pcmPackage.PARAMETER_SOURCE__PARAMETER;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ParameterSourceImpl
