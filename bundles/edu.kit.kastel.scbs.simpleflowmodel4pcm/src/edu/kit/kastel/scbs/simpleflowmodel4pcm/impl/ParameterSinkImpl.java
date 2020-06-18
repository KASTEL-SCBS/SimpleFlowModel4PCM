/**
 */
package edu.kit.kastel.scbs.simpleflowmodel4pcm.impl;

import edu.kit.kastel.scbs.simpleflowmodel4pcm.ParameterIdentification;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.ParameterSink;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureIdentification;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.Parameter;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Sink</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.ParameterSinkImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.ParameterSinkImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.ParameterSinkImpl#getSignature <em>Signature</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.ParameterSinkImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParameterSinkImpl extends SinkImpl implements ParameterSink {
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
	protected ParameterSinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Simpleflowmodel4pcmPackage.Literals.PARAMETER_SINK;
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
							Simpleflowmodel4pcmPackage.PARAMETER_SINK__COMPONENT, oldComponent, component));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Simpleflowmodel4pcmPackage.PARAMETER_SINK__COMPONENT,
					oldComponent, component));
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
							Simpleflowmodel4pcmPackage.PARAMETER_SINK__INTERFACE, oldInterface, interface_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Simpleflowmodel4pcmPackage.PARAMETER_SINK__INTERFACE,
					oldInterface, interface_));
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
							Simpleflowmodel4pcmPackage.PARAMETER_SINK__SIGNATURE, oldSignature, signature));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Simpleflowmodel4pcmPackage.PARAMETER_SINK__SIGNATURE,
					oldSignature, signature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameter() {
		if (parameter == null) {
			parameter = new EObjectResolvingEList<Parameter>(Parameter.class, this,
					Simpleflowmodel4pcmPackage.PARAMETER_SINK__PARAMETER);
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
		case Simpleflowmodel4pcmPackage.PARAMETER_SINK__COMPONENT:
			if (resolve)
				return getComponent();
			return basicGetComponent();
		case Simpleflowmodel4pcmPackage.PARAMETER_SINK__INTERFACE:
			if (resolve)
				return getInterface();
			return basicGetInterface();
		case Simpleflowmodel4pcmPackage.PARAMETER_SINK__SIGNATURE:
			if (resolve)
				return getSignature();
			return basicGetSignature();
		case Simpleflowmodel4pcmPackage.PARAMETER_SINK__PARAMETER:
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
		case Simpleflowmodel4pcmPackage.PARAMETER_SINK__COMPONENT:
			setComponent((RepositoryComponent) newValue);
			return;
		case Simpleflowmodel4pcmPackage.PARAMETER_SINK__INTERFACE:
			setInterface((OperationInterface) newValue);
			return;
		case Simpleflowmodel4pcmPackage.PARAMETER_SINK__SIGNATURE:
			setSignature((OperationSignature) newValue);
			return;
		case Simpleflowmodel4pcmPackage.PARAMETER_SINK__PARAMETER:
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
		case Simpleflowmodel4pcmPackage.PARAMETER_SINK__COMPONENT:
			setComponent((RepositoryComponent) null);
			return;
		case Simpleflowmodel4pcmPackage.PARAMETER_SINK__INTERFACE:
			setInterface((OperationInterface) null);
			return;
		case Simpleflowmodel4pcmPackage.PARAMETER_SINK__SIGNATURE:
			setSignature((OperationSignature) null);
			return;
		case Simpleflowmodel4pcmPackage.PARAMETER_SINK__PARAMETER:
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
		case Simpleflowmodel4pcmPackage.PARAMETER_SINK__COMPONENT:
			return component != null;
		case Simpleflowmodel4pcmPackage.PARAMETER_SINK__INTERFACE:
			return interface_ != null;
		case Simpleflowmodel4pcmPackage.PARAMETER_SINK__SIGNATURE:
			return signature != null;
		case Simpleflowmodel4pcmPackage.PARAMETER_SINK__PARAMETER:
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
		if (baseClass == SignatureIdentification.class) {
			switch (derivedFeatureID) {
			case Simpleflowmodel4pcmPackage.PARAMETER_SINK__COMPONENT:
				return Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__COMPONENT;
			case Simpleflowmodel4pcmPackage.PARAMETER_SINK__INTERFACE:
				return Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__INTERFACE;
			case Simpleflowmodel4pcmPackage.PARAMETER_SINK__SIGNATURE:
				return Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__SIGNATURE;
			default:
				return -1;
			}
		}
		if (baseClass == ParameterIdentification.class) {
			switch (derivedFeatureID) {
			case Simpleflowmodel4pcmPackage.PARAMETER_SINK__PARAMETER:
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
		if (baseClass == SignatureIdentification.class) {
			switch (baseFeatureID) {
			case Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__COMPONENT:
				return Simpleflowmodel4pcmPackage.PARAMETER_SINK__COMPONENT;
			case Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__INTERFACE:
				return Simpleflowmodel4pcmPackage.PARAMETER_SINK__INTERFACE;
			case Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION__SIGNATURE:
				return Simpleflowmodel4pcmPackage.PARAMETER_SINK__SIGNATURE;
			default:
				return -1;
			}
		}
		if (baseClass == ParameterIdentification.class) {
			switch (baseFeatureID) {
			case Simpleflowmodel4pcmPackage.PARAMETER_IDENTIFICATION__PARAMETER:
				return Simpleflowmodel4pcmPackage.PARAMETER_SINK__PARAMETER;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ParameterSinkImpl
