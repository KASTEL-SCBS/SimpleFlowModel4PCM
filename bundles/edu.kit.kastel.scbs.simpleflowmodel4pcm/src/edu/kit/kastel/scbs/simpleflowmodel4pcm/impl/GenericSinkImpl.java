/**
 */
package edu.kit.kastel.scbs.simpleflowmodel4pcm.impl;

import edu.kit.kastel.scbs.simpleflowmodel4pcm.GenericSink;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Sink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.GenericSinkImpl#getTargetDescription <em>Target Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericSinkImpl extends SinkImpl implements GenericSink {
	/**
	 * The default value of the '{@link #getTargetDescription() <em>Target Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetDescription() <em>Target Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDescription()
	 * @generated
	 * @ordered
	 */
	protected String targetDescription = TARGET_DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericSinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Simpleflowmodel4pcmPackage.Literals.GENERIC_SINK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetDescription() {
		return targetDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDescription(String newTargetDescription) {
		String oldTargetDescription = targetDescription;
		targetDescription = newTargetDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Simpleflowmodel4pcmPackage.GENERIC_SINK__TARGET_DESCRIPTION, oldTargetDescription,
					targetDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Simpleflowmodel4pcmPackage.GENERIC_SINK__TARGET_DESCRIPTION:
			return getTargetDescription();
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
		case Simpleflowmodel4pcmPackage.GENERIC_SINK__TARGET_DESCRIPTION:
			setTargetDescription((String) newValue);
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
		case Simpleflowmodel4pcmPackage.GENERIC_SINK__TARGET_DESCRIPTION:
			setTargetDescription(TARGET_DESCRIPTION_EDEFAULT);
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
		case Simpleflowmodel4pcmPackage.GENERIC_SINK__TARGET_DESCRIPTION:
			return TARGET_DESCRIPTION_EDEFAULT == null ? targetDescription != null
					: !TARGET_DESCRIPTION_EDEFAULT.equals(targetDescription);
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
		result.append(" (targetDescription: ");
		result.append(targetDescription);
		result.append(')');
		return result.toString();
	}

} //GenericSinkImpl
