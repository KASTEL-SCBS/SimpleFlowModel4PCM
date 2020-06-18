/**
 */
package edu.kit.kastel.scbs.simpleflowmodel4pcm.impl;

import edu.kit.kastel.scbs.simpleflowmodel4pcm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Simpleflowmodel4pcmFactoryImpl extends EFactoryImpl implements Simpleflowmodel4pcmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Simpleflowmodel4pcmFactory init() {
		try {
			Simpleflowmodel4pcmFactory theSimpleflowmodel4pcmFactory = (Simpleflowmodel4pcmFactory) EPackage.Registry.INSTANCE
					.getEFactory(Simpleflowmodel4pcmPackage.eNS_URI);
			if (theSimpleflowmodel4pcmFactory != null) {
				return theSimpleflowmodel4pcmFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Simpleflowmodel4pcmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simpleflowmodel4pcmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Simpleflowmodel4pcmPackage.FLOWS:
			return createFlows();
		case Simpleflowmodel4pcmPackage.FLOW:
			return createFlow();
		case Simpleflowmodel4pcmPackage.SIGNATURE_SOURCE:
			return createSignatureSource();
		case Simpleflowmodel4pcmPackage.PARAMETER_SOURCE:
			return createParameterSource();
		case Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION:
			return createSignatureIdentification();
		case Simpleflowmodel4pcmPackage.PARAMETER_IDENTIFICATION:
			return createParameterIdentification();
		case Simpleflowmodel4pcmPackage.GENERIC_SINK:
			return createGenericSink();
		case Simpleflowmodel4pcmPackage.SIGNATURE_SINK:
			return createSignatureSink();
		case Simpleflowmodel4pcmPackage.PARAMETER_SINK:
			return createParameterSink();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flows createFlows() {
		FlowsImpl flows = new FlowsImpl();
		return flows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureSource createSignatureSource() {
		SignatureSourceImpl signatureSource = new SignatureSourceImpl();
		return signatureSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSource createParameterSource() {
		ParameterSourceImpl parameterSource = new ParameterSourceImpl();
		return parameterSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureIdentification createSignatureIdentification() {
		SignatureIdentificationImpl signatureIdentification = new SignatureIdentificationImpl();
		return signatureIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterIdentification createParameterIdentification() {
		ParameterIdentificationImpl parameterIdentification = new ParameterIdentificationImpl();
		return parameterIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericSink createGenericSink() {
		GenericSinkImpl genericSink = new GenericSinkImpl();
		return genericSink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureSink createSignatureSink() {
		SignatureSinkImpl signatureSink = new SignatureSinkImpl();
		return signatureSink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSink createParameterSink() {
		ParameterSinkImpl parameterSink = new ParameterSinkImpl();
		return parameterSink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simpleflowmodel4pcmPackage getSimpleflowmodel4pcmPackage() {
		return (Simpleflowmodel4pcmPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Simpleflowmodel4pcmPackage getPackage() {
		return Simpleflowmodel4pcmPackage.eINSTANCE;
	}

} //Simpleflowmodel4pcmFactoryImpl
