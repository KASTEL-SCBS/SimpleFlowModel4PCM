/**
 */
package edu.kit.kastel.scbs.simpleflowmodel4pcm;

import org.eclipse.emf.ecore.EObject;

import org.palladiosimulator.pcm.repository.OperationInterface;
import org.palladiosimulator.pcm.repository.OperationSignature;
import org.palladiosimulator.pcm.repository.RepositoryComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signature Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureIdentification#getComponent <em>Component</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureIdentification#getInterface <em>Interface</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureIdentification#getSignature <em>Signature</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage#getSignatureIdentification()
 * @model
 * @generated
 */
public interface SignatureIdentification extends EObject {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference.
	 * @see #setComponent(RepositoryComponent)
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage#getSignatureIdentification_Component()
	 * @model required="true"
	 * @generated
	 */
	RepositoryComponent getComponent();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureIdentification#getComponent <em>Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(RepositoryComponent value);

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' reference.
	 * @see #setInterface(OperationInterface)
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage#getSignatureIdentification_Interface()
	 * @model required="true"
	 * @generated
	 */
	OperationInterface getInterface();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureIdentification#getInterface <em>Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' reference.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(OperationInterface value);

	/**
	 * Returns the value of the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signature</em>' reference.
	 * @see #setSignature(OperationSignature)
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage#getSignatureIdentification_Signature()
	 * @model required="true"
	 * @generated
	 */
	OperationSignature getSignature();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureIdentification#getSignature <em>Signature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signature</em>' reference.
	 * @see #getSignature()
	 * @generated
	 */
	void setSignature(OperationSignature value);

} // SignatureIdentification
