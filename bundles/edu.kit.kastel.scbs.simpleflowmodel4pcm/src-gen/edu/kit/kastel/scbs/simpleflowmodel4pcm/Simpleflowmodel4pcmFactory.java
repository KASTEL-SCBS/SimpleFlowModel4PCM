/**
 */
package edu.kit.kastel.scbs.simpleflowmodel4pcm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage
 * @generated
 */
public interface Simpleflowmodel4pcmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Simpleflowmodel4pcmFactory eINSTANCE = edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Flows</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flows</em>'.
	 * @generated
	 */
	Flows createFlows();

	/**
	 * Returns a new object of class '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow</em>'.
	 * @generated
	 */
	Flow createFlow();

	/**
	 * Returns a new object of class '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Source</em>'.
	 * @generated
	 */
	Source createSource();

	/**
	 * Returns a new object of class '<em>Signature Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature Source</em>'.
	 * @generated
	 */
	SignatureSource createSignatureSource();

	/**
	 * Returns a new object of class '<em>Parameter Source</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Source</em>'.
	 * @generated
	 */
	ParameterSource createParameterSource();

	/**
	 * Returns a new object of class '<em>Sink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sink</em>'.
	 * @generated
	 */
	Sink createSink();

	/**
	 * Returns a new object of class '<em>Signature Identification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature Identification</em>'.
	 * @generated
	 */
	SignatureIdentification createSignatureIdentification();

	/**
	 * Returns a new object of class '<em>Parameter Identification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Identification</em>'.
	 * @generated
	 */
	ParameterIdentification createParameterIdentification();

	/**
	 * Returns a new object of class '<em>Generic Sink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Sink</em>'.
	 * @generated
	 */
	GenericSink createGenericSink();

	/**
	 * Returns a new object of class '<em>Signature Sink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Signature Sink</em>'.
	 * @generated
	 */
	SignatureSink createSignatureSink();

	/**
	 * Returns a new object of class '<em>Parameter Sink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Sink</em>'.
	 * @generated
	 */
	ParameterSink createParameterSink();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Simpleflowmodel4pcmPackage getSimpleflowmodel4pcmPackage();

} //Simpleflowmodel4pcmFactory
