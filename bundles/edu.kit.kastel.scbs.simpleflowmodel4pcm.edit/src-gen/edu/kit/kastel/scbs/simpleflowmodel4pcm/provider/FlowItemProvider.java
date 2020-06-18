/**
 */
package edu.kit.kastel.scbs.simpleflowmodel4pcm.provider;

import edu.kit.ipd.sdq.composition.securityanalyses.basic.provider.IdentifiedElementItemProvider;

import edu.kit.kastel.scbs.simpleflowmodel4pcm.Flow;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmFactory;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link edu.kit.kastel.scbs.simpleflowmodel4pcm.Flow} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FlowItemProvider extends IdentifiedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(Simpleflowmodel4pcmPackage.Literals.FLOW__SINK);
			childrenFeatures.add(Simpleflowmodel4pcmPackage.Literals.FLOW__SOURCE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Flow.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Flow"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Flow) object).getId();
		return label == null || label.length() == 0 ? getString("_UI_Flow_type")
				: getString("_UI_Flow_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Flow.class)) {
		case Simpleflowmodel4pcmPackage.FLOW__SINK:
		case Simpleflowmodel4pcmPackage.FLOW__SOURCE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(Simpleflowmodel4pcmPackage.Literals.FLOW__SINK,
				Simpleflowmodel4pcmFactory.eINSTANCE.createGenericSink()));

		newChildDescriptors.add(createChildParameter(Simpleflowmodel4pcmPackage.Literals.FLOW__SINK,
				Simpleflowmodel4pcmFactory.eINSTANCE.createSignatureSink()));

		newChildDescriptors.add(createChildParameter(Simpleflowmodel4pcmPackage.Literals.FLOW__SINK,
				Simpleflowmodel4pcmFactory.eINSTANCE.createParameterSink()));

		newChildDescriptors.add(createChildParameter(Simpleflowmodel4pcmPackage.Literals.FLOW__SOURCE,
				Simpleflowmodel4pcmFactory.eINSTANCE.createSignatureSource()));

		newChildDescriptors.add(createChildParameter(Simpleflowmodel4pcmPackage.Literals.FLOW__SOURCE,
				Simpleflowmodel4pcmFactory.eINSTANCE.createParameterSource()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Simpleflowmodel4pcmEditPlugin.INSTANCE;
	}

}
