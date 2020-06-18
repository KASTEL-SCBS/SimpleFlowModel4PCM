/**
 */
package edu.kit.kastel.scbs.simpleflowmodel4pcm.impl;

import edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureIdentification;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature Identification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SignatureIdentificationImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SignatureIdentificationImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SignatureIdentificationImpl#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignatureIdentificationImpl extends MinimalEObjectImpl.Container implements SignatureIdentification {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected RepositoryComponent component;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected OperationInterface interface_;

	/**
	 * The cached value of the '{@link #getSignature() <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignature()
	 * @generated
	 * @ordered
	 */
	protected OperationSignature signature;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureIdentificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Simpleflowmodel4pcmPackage.Literals.SIGNATURE_IDENTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent getComponent() {
		if (component != null && ((EObject) component).eIsProxy()) {
			InternalEObject oldComponent = (InternalEObject) component;
			component = (RepositoryComponent) eResolveProxy(oldComponent);
			if (component != oldComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__COMPONENT, oldComponent, component));
			}
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RepositoryComponent basicGetComponent() {
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(RepositoryComponent newComponent) {
		RepositoryComponent oldComponent = component;
		component = newComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__COMPONENT, oldComponent, component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationInterface getInterface() {
		if (interface_ != null && ((EObject) interface_).eIsProxy()) {
			InternalEObject oldInterface = (InternalEObject) interface_;
			interface_ = (OperationInterface) eResolveProxy(oldInterface);
			if (interface_ != oldInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__INTERFACE, oldInterface, interface_));
			}
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationInterface basicGetInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(OperationInterface newInterface) {
		OperationInterface oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSignature getSignature() {
		if (signature != null && ((EObject) signature).eIsProxy()) {
			InternalEObject oldSignature = (InternalEObject) signature;
			signature = (OperationSignature) eResolveProxy(oldSignature);
			if (signature != oldSignature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__SIGNATURE, oldSignature, signature));
			}
		}
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationSignature basicGetSignature() {
		return signature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignature(OperationSignature newSignature) {
		OperationSignature oldSignature = signature;
		signature = newSignature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__SIGNATURE, oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__INTERFACE:
			if (resolve)
				return getInterface();
			return basicGetInterface();
		case Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__SIGNATURE:
			if (resolve)
				return getSignature();
			return basicGetSignature();
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
		case Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__COMPONENT:
			setComponent((RepositoryComponent) newValue);
			return;
		case Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__INTERFACE:
			setInterface((OperationInterface) newValue);
			return;
		case Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__SIGNATURE:
			setSignature((OperationSignature) newValue);
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
		case Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__COMPONENT:
			setComponent((RepositoryComponent) null);
			return;
		case Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__INTERFACE:
			setInterface((OperationInterface) null);
			return;
		case Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__SIGNATURE:
			setSignature((OperationSignature) null);
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
		case Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__COMPONENT:
			return component != null;
		case Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__INTERFACE:
			return interface_ != null;
		case Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__SIGNATURE:
			return signature != null;
		}
		return super.eIsSet(featureID);
	}

} //SignatureIdentificationImpl
