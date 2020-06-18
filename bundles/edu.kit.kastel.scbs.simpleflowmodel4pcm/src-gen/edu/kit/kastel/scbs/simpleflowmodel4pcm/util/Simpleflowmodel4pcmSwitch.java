/**
 */
package edu.kit.kastel.scbs.simpleflowmodel4pcm.util;

import edu.kit.ipd.sdq.composition.securityanalyses.basic.IdentifiedElement;

import edu.kit.kastel.scbs.simpleflowmodel4pcm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage
 * @generated
 */
public class Simpleflowmodel4pcmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Simpleflowmodel4pcmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simpleflowmodel4pcmSwitch() {
		if (modelPackage == null) {
			modelPackage = Simpleflowmodel4pcmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Simpleflowmodel4pcmPackage.FLOWS: {
			Flows flows = (Flows) theEObject;
			T result = caseFlows(flows);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Simpleflowmodel4pcmPackage.FLOW: {
			Flow flow = (Flow) theEObject;
			T result = caseFlow(flow);
			if (result == null)
				result = caseIdentifiedElement(flow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Simpleflowmodel4pcmPackage.SOURCE: {
			Source source = (Source) theEObject;
			T result = caseSource(source);
			if (result == null)
				result = caseIdentifiedElement(source);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Simpleflowmodel4pcmPackage.SIGNATURE_SOURCE: {
			SignatureSource signatureSource = (SignatureSource) theEObject;
			T result = caseSignatureSource(signatureSource);
			if (result == null)
				result = caseSignatureIdentification(signatureSource);
			if (result == null)
				result = caseSource(signatureSource);
			if (result == null)
				result = caseIdentifiedElement(signatureSource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Simpleflowmodel4pcmPackage.PARAMETER_SOURCE: {
			ParameterSource parameterSource = (ParameterSource) theEObject;
			T result = caseParameterSource(parameterSource);
			if (result == null)
				result = caseSignatureSource(parameterSource);
			if (result == null)
				result = caseParameterIdentification(parameterSource);
			if (result == null)
				result = caseSignatureIdentification(parameterSource);
			if (result == null)
				result = caseSource(parameterSource);
			if (result == null)
				result = caseIdentifiedElement(parameterSource);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Simpleflowmodel4pcmPackage.SINK: {
			Sink sink = (Sink) theEObject;
			T result = caseSink(sink);
			if (result == null)
				result = caseIdentifiedElement(sink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Simpleflowmodel4pcmPackage.SIGNATURE_IDENTIFICATION: {
			SignatureIdentification signatureIdentification = (SignatureIdentification) theEObject;
			T result = caseSignatureIdentification(signatureIdentification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Simpleflowmodel4pcmPackage.PARAMETER_IDENTIFICATION: {
			ParameterIdentification parameterIdentification = (ParameterIdentification) theEObject;
			T result = caseParameterIdentification(parameterIdentification);
			if (result == null)
				result = caseSignatureIdentification(parameterIdentification);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Simpleflowmodel4pcmPackage.GENERIC_SINK: {
			GenericSink genericSink = (GenericSink) theEObject;
			T result = caseGenericSink(genericSink);
			if (result == null)
				result = caseSink(genericSink);
			if (result == null)
				result = caseIdentifiedElement(genericSink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Simpleflowmodel4pcmPackage.SIGNATURE_SINK: {
			SignatureSink signatureSink = (SignatureSink) theEObject;
			T result = caseSignatureSink(signatureSink);
			if (result == null)
				result = caseSink(signatureSink);
			if (result == null)
				result = caseSignatureIdentification(signatureSink);
			if (result == null)
				result = caseIdentifiedElement(signatureSink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Simpleflowmodel4pcmPackage.PARAMETER_SINK: {
			ParameterSink parameterSink = (ParameterSink) theEObject;
			T result = caseParameterSink(parameterSink);
			if (result == null)
				result = caseSink(parameterSink);
			if (result == null)
				result = caseParameterIdentification(parameterSink);
			if (result == null)
				result = caseIdentifiedElement(parameterSink);
			if (result == null)
				result = caseSignatureIdentification(parameterSink);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flows</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flows</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlows(Flows object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSource(Source object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignatureSource(SignatureSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Source</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Source</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterSource(ParameterSource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSink(Sink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature Identification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature Identification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignatureIdentification(SignatureIdentification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Identification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Identification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterIdentification(ParameterIdentification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericSink(GenericSink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signature Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signature Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignatureSink(SignatureSink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Sink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Sink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterSink(ParameterSink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identified Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifiedElement(IdentifiedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Simpleflowmodel4pcmSwitch
