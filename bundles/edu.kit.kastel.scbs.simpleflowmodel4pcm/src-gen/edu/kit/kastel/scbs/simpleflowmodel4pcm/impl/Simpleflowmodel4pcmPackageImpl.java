/**
 */
package edu.kit.kastel.scbs.simpleflowmodel4pcm.impl;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import de.uka.ipd.sdq.probfunction.ProbfunctionPackage;

import de.uka.ipd.sdq.stoex.StoexPackage;

import de.uka.ipd.sdq.units.UnitsPackage;

import edu.kit.ipd.sdq.composition.securityanalyses.basic.BasicPackage;

import edu.kit.kastel.scbs.simpleflowmodel4pcm.Flow;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.Flows;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.GenericSink;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.ParameterIdentification;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.ParameterSink;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.ParameterSource;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureIdentification;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureSink;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureSource;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmFactory;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.Sink;
import edu.kit.kastel.scbs.simpleflowmodel4pcm.Source;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.palladiosimulator.pcm.PcmPackage;

import org.palladiosimulator.pcm.repository.RepositoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Simpleflowmodel4pcmPackageImpl extends EPackageImpl implements Simpleflowmodel4pcmPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterIdentificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericSinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signatureSinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSinkEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Simpleflowmodel4pcmPackageImpl() {
		super(eNS_URI, Simpleflowmodel4pcmFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Simpleflowmodel4pcmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Simpleflowmodel4pcmPackage init() {
		if (isInited)
			return (Simpleflowmodel4pcmPackage) EPackage.Registry.INSTANCE
					.getEPackage(Simpleflowmodel4pcmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSimpleflowmodel4pcmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Simpleflowmodel4pcmPackageImpl theSimpleflowmodel4pcmPackage = registeredSimpleflowmodel4pcmPackage instanceof Simpleflowmodel4pcmPackageImpl
				? (Simpleflowmodel4pcmPackageImpl) registeredSimpleflowmodel4pcmPackage
				: new Simpleflowmodel4pcmPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		BasicPackage.eINSTANCE.eClass();
		IdentifierPackage.eINSTANCE.eClass();
		PcmPackage.eINSTANCE.eClass();
		ProbfunctionPackage.eINSTANCE.eClass();
		StoexPackage.eINSTANCE.eClass();
		UnitsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSimpleflowmodel4pcmPackage.createPackageContents();

		// Initialize created meta-data
		theSimpleflowmodel4pcmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimpleflowmodel4pcmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Simpleflowmodel4pcmPackage.eNS_URI, theSimpleflowmodel4pcmPackage);
		return theSimpleflowmodel4pcmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlows() {
		return flowsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlows_Flow() {
		return (EReference) flowsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Sink() {
		return (EReference) flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Source() {
		return (EReference) flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignatureSource() {
		return signatureSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterSource() {
		return parameterSourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSink() {
		return sinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignatureIdentification() {
		return signatureIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureIdentification_Component() {
		return (EReference) signatureIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureIdentification_Interface() {
		return (EReference) signatureIdentificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignatureIdentification_Signature() {
		return (EReference) signatureIdentificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterIdentification() {
		return parameterIdentificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterIdentification_Parameter() {
		return (EReference) parameterIdentificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericSink() {
		return genericSinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericSink_TargetDescription() {
		return (EAttribute) genericSinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignatureSink() {
		return signatureSinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterSink() {
		return parameterSinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simpleflowmodel4pcmFactory getSimpleflowmodel4pcmFactory() {
		return (Simpleflowmodel4pcmFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		flowsEClass = createEClass(FLOWS);
		createEReference(flowsEClass, FLOWS__FLOW);

		flowEClass = createEClass(FLOW);
		createEReference(flowEClass, FLOW__SINK);
		createEReference(flowEClass, FLOW__SOURCE);

		sourceEClass = createEClass(SOURCE);

		signatureSourceEClass = createEClass(SIGNATURE_SOURCE);

		parameterSourceEClass = createEClass(PARAMETER_SOURCE);

		sinkEClass = createEClass(SINK);

		signatureIdentificationEClass = createEClass(SIGNATURE_IDENTIFICATION);
		createEReference(signatureIdentificationEClass, SIGNATURE_IDENTIFICATION__COMPONENT);
		createEReference(signatureIdentificationEClass, SIGNATURE_IDENTIFICATION__INTERFACE);
		createEReference(signatureIdentificationEClass, SIGNATURE_IDENTIFICATION__SIGNATURE);

		parameterIdentificationEClass = createEClass(PARAMETER_IDENTIFICATION);
		createEReference(parameterIdentificationEClass, PARAMETER_IDENTIFICATION__PARAMETER);

		genericSinkEClass = createEClass(GENERIC_SINK);
		createEAttribute(genericSinkEClass, GENERIC_SINK__TARGET_DESCRIPTION);

		signatureSinkEClass = createEClass(SIGNATURE_SINK);

		parameterSinkEClass = createEClass(PARAMETER_SINK);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasicPackage theBasicPackage = (BasicPackage) EPackage.Registry.INSTANCE.getEPackage(BasicPackage.eNS_URI);
		RepositoryPackage theRepositoryPackage = (RepositoryPackage) EPackage.Registry.INSTANCE
				.getEPackage(RepositoryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		flowEClass.getESuperTypes().add(theBasicPackage.getIdentifiedElement());
		sourceEClass.getESuperTypes().add(theBasicPackage.getIdentifiedElement());
		signatureSourceEClass.getESuperTypes().add(this.getSignatureIdentification());
		signatureSourceEClass.getESuperTypes().add(this.getSource());
		parameterSourceEClass.getESuperTypes().add(this.getSignatureSource());
		parameterSourceEClass.getESuperTypes().add(this.getParameterIdentification());
		sinkEClass.getESuperTypes().add(theBasicPackage.getIdentifiedElement());
		parameterIdentificationEClass.getESuperTypes().add(this.getSignatureIdentification());
		genericSinkEClass.getESuperTypes().add(this.getSink());
		signatureSinkEClass.getESuperTypes().add(this.getSink());
		signatureSinkEClass.getESuperTypes().add(this.getSignatureIdentification());
		parameterSinkEClass.getESuperTypes().add(this.getSink());
		parameterSinkEClass.getESuperTypes().add(this.getParameterIdentification());

		// Initialize classes, features, and operations; add parameters
		initEClass(flowsEClass, Flows.class, "Flows", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlows_Flow(), this.getFlow(), null, "flow", null, 0, -1, Flows.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFlow_Sink(), this.getSink(), null, "sink", null, 1, -1, Flow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getFlow_Source(), this.getSource(), null, "source", null, 1, -1, Flow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signatureSourceEClass, SignatureSource.class, "SignatureSource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterSourceEClass, ParameterSource.class, "ParameterSource", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(sinkEClass, Sink.class, "Sink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(signatureIdentificationEClass, SignatureIdentification.class, "SignatureIdentification",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignatureIdentification_Component(), theRepositoryPackage.getRepositoryComponent(), null,
				"component", null, 1, 1, SignatureIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignatureIdentification_Interface(), theRepositoryPackage.getOperationInterface(), null,
				"interface", null, 1, 1, SignatureIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSignatureIdentification_Signature(), theRepositoryPackage.getOperationSignature(), null,
				"signature", null, 1, 1, SignatureIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterIdentificationEClass, ParameterIdentification.class, "ParameterIdentification",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterIdentification_Parameter(), theRepositoryPackage.getParameter(), null, "parameter",
				null, 1, -1, ParameterIdentification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericSinkEClass, GenericSink.class, "GenericSink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGenericSink_TargetDescription(), ecorePackage.getEString(), "targetDescription", null, 1, 1,
				GenericSink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(signatureSinkEClass, SignatureSink.class, "SignatureSink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterSinkEClass, ParameterSink.class, "ParameterSink", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Simpleflowmodel4pcmPackageImpl
