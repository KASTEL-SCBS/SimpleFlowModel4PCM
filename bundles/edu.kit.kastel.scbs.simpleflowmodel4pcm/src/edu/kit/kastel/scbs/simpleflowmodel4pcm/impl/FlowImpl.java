/**
 */
package edu.kit.kastel.scbs.simpleflowmodel4pcm.impl;

import edu.kit.ipd.sdq.composition.securityanalyses.basic.impl.IdentifiedElementImpl;

import edu.kit.kastel.scbs.simpleflowmodel4pcm.Flow;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.Sink;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.Source;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.FlowImpl#getSink <em>Sink</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.FlowImpl#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowImpl extends IdentifiedElementImpl implements Flow {
	/**
	 * The cached value of the '{@link #getSink() <em>Sink</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSink()
	 * @generated
	 * @ordered
	 */
	protected EList<Sink> sink;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Source source;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Simpleflowmodel4pcmPackage.Literals.FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Sink> getSink() {
		if (sink == null) {
			sink = new EObjectContainmentEList<Sink>(Sink.class, this, Simpleflowmodel4pcmPackage.FLOW__SINK);
		}
		return sink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Source newSource, NotificationChain msgs) {
		Source oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Simpleflowmodel4pcmPackage.FLOW__SOURCE, oldSource, newSource);
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
	public void setSource(Source newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject) source).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Simpleflowmodel4pcmPackage.FLOW__SOURCE, null, msgs);
			if (newSource != null)
				msgs = ((InternalEObject) newSource).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Simpleflowmodel4pcmPackage.FLOW__SOURCE, null, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Simpleflowmodel4pcmPackage.FLOW__SOURCE, newSource,
					newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Simpleflowmodel4pcmPackage.FLOW__SINK:
			return ((InternalEList<?>) getSink()).basicRemove(otherEnd, msgs);
		case Simpleflowmodel4pcmPackage.FLOW__SOURCE:
			return basicSetSource(null, msgs);
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
		case Simpleflowmodel4pcmPackage.FLOW__SINK:
			return getSink();
		case Simpleflowmodel4pcmPackage.FLOW__SOURCE:
			return getSource();
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
		case Simpleflowmodel4pcmPackage.FLOW__SINK:
			getSink().clear();
			getSink().addAll((Collection<? extends Sink>) newValue);
			return;
		case Simpleflowmodel4pcmPackage.FLOW__SOURCE:
			setSource((Source) newValue);
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
		case Simpleflowmodel4pcmPackage.FLOW__SINK:
			getSink().clear();
			return;
		case Simpleflowmodel4pcmPackage.FLOW__SOURCE:
			setSource((Source) null);
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
		case Simpleflowmodel4pcmPackage.FLOW__SINK:
			return sink != null && !sink.isEmpty();
		case Simpleflowmodel4pcmPackage.FLOW__SOURCE:
			return source != null;
		}
		return super.eIsSet(featureID);
	}

} //FlowImpl
