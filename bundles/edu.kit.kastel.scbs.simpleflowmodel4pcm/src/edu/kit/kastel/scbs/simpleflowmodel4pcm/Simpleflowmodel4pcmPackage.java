/**
 */
package edu.kit.kastel.scbs.simpleflowmodel4pcm;

import edu.kit.ipd.sdq.composition.securityanalyses.basic.BasicPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmFactory
 * @model kind="package"
 * @generated
 */
public interface Simpleflowmodel4pcmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simpleflowmodel4pcm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/simpleflowmodel4pcm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simpleflowmodel4pcm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Simpleflowmodel4pcmPackage eINSTANCE = edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.FlowsImpl <em>Flows</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.FlowsImpl
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getFlows()
	 * @generated
	 */
	int FLOWS = 0;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWS__FLOW = 0;

	/**
	 * The number of structural features of the '<em>Flows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Flows</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOWS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.FlowImpl
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ID = BasicPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SINK = BasicPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SOURCE = BasicPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = BasicPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = BasicPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SourceImpl
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__ID = BasicPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = BasicPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = BasicPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SignatureIdentificationImpl <em>Signature Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SignatureIdentificationImpl
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getSignatureIdentification()
	 * @generated
	 */
	int SIGNATURE_IDENTIFICATION = 6;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_IDENTIFICATION__COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_IDENTIFICATION__INTERFACE = 1;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_IDENTIFICATION__SIGNATURE = 2;

	/**
	 * The number of structural features of the '<em>Signature Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_IDENTIFICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Signature Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_IDENTIFICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SignatureSourceImpl <em>Signature Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SignatureSourceImpl
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getSignatureSource()
	 * @generated
	 */
	int SIGNATURE_SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_SOURCE__COMPONENT = SIGNATURE_IDENTIFICATION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_SOURCE__INTERFACE = SIGNATURE_IDENTIFICATION__INTERFACE;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_SOURCE__SIGNATURE = SIGNATURE_IDENTIFICATION__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_SOURCE__ID = SIGNATURE_IDENTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Signature Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_SOURCE_FEATURE_COUNT = SIGNATURE_IDENTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Signature Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_SOURCE_OPERATION_COUNT = SIGNATURE_IDENTIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.ParameterSourceImpl <em>Parameter Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.ParameterSourceImpl
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getParameterSource()
	 * @generated
	 */
	int PARAMETER_SOURCE = 4;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SOURCE__COMPONENT = SIGNATURE_SOURCE__COMPONENT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SOURCE__INTERFACE = SIGNATURE_SOURCE__INTERFACE;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SOURCE__SIGNATURE = SIGNATURE_SOURCE__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SOURCE__ID = SIGNATURE_SOURCE__ID;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SOURCE__PARAMETER = SIGNATURE_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SOURCE_FEATURE_COUNT = SIGNATURE_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SOURCE_OPERATION_COUNT = SIGNATURE_SOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SinkImpl <em>Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SinkImpl
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getSink()
	 * @generated
	 */
	int SINK = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK__ID = BasicPackage.IDENTIFIED_ELEMENT__ID;

	/**
	 * The number of structural features of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_FEATURE_COUNT = BasicPackage.IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINK_OPERATION_COUNT = BasicPackage.IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.ParameterIdentificationImpl <em>Parameter Identification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.ParameterIdentificationImpl
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getParameterIdentification()
	 * @generated
	 */
	int PARAMETER_IDENTIFICATION = 7;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICATION__COMPONENT = SIGNATURE_IDENTIFICATION__COMPONENT;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICATION__INTERFACE = SIGNATURE_IDENTIFICATION__INTERFACE;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICATION__SIGNATURE = SIGNATURE_IDENTIFICATION__SIGNATURE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICATION__PARAMETER = SIGNATURE_IDENTIFICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parameter Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICATION_FEATURE_COUNT = SIGNATURE_IDENTIFICATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Parameter Identification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_IDENTIFICATION_OPERATION_COUNT = SIGNATURE_IDENTIFICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.GenericSinkImpl <em>Generic Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.GenericSinkImpl
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getGenericSink()
	 * @generated
	 */
	int GENERIC_SINK = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SINK__ID = SINK__ID;

	/**
	 * The feature id for the '<em><b>Target Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SINK__TARGET_DESCRIPTION = SINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generic Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SINK_FEATURE_COUNT = SINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Generic Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_SINK_OPERATION_COUNT = SINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SignatureSinkImpl <em>Signature Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SignatureSinkImpl
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getSignatureSink()
	 * @generated
	 */
	int SIGNATURE_SINK = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_SINK__ID = SINK__ID;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_SINK__COMPONENT = SINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_SINK__INTERFACE = SINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_SINK__SIGNATURE = SINK_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Signature Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_SINK_FEATURE_COUNT = SINK_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Signature Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNATURE_SINK_OPERATION_COUNT = SINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.ParameterSinkImpl <em>Parameter Sink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.ParameterSinkImpl
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getParameterSink()
	 * @generated
	 */
	int PARAMETER_SINK = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SINK__ID = SINK__ID;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SINK__COMPONENT = SINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SINK__INTERFACE = SINK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SINK__SIGNATURE = SINK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SINK__PARAMETER = SINK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Parameter Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SINK_FEATURE_COUNT = SINK_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Parameter Sink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SINK_OPERATION_COUNT = SINK_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.Flows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flows</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Flows
	 * @generated
	 */
	EClass getFlows();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.Flows#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Flows#getFlow()
	 * @see #getFlows()
	 * @generated
	 */
	EReference getFlows_Flow();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.Flow#getSink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sink</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Flow#getSink()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Sink();

	/**
	 * Returns the meta object for the containment reference '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.Flow#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Flow#getSource()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Source();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureSource <em>Signature Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Source</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureSource
	 * @generated
	 */
	EClass getSignatureSource();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.ParameterSource <em>Parameter Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Source</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.ParameterSource
	 * @generated
	 */
	EClass getParameterSource();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.Sink <em>Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sink</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Sink
	 * @generated
	 */
	EClass getSink();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureIdentification <em>Signature Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Identification</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureIdentification
	 * @generated
	 */
	EClass getSignatureIdentification();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureIdentification#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureIdentification#getComponent()
	 * @see #getSignatureIdentification()
	 * @generated
	 */
	EReference getSignatureIdentification_Component();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureIdentification#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureIdentification#getInterface()
	 * @see #getSignatureIdentification()
	 * @generated
	 */
	EReference getSignatureIdentification_Interface();

	/**
	 * Returns the meta object for the reference '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureIdentification#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Signature</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureIdentification#getSignature()
	 * @see #getSignatureIdentification()
	 * @generated
	 */
	EReference getSignatureIdentification_Signature();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.ParameterIdentification <em>Parameter Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Identification</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.ParameterIdentification
	 * @generated
	 */
	EClass getParameterIdentification();

	/**
	 * Returns the meta object for the reference list '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.ParameterIdentification#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameter</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.ParameterIdentification#getParameter()
	 * @see #getParameterIdentification()
	 * @generated
	 */
	EReference getParameterIdentification_Parameter();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.GenericSink <em>Generic Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Sink</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.GenericSink
	 * @generated
	 */
	EClass getGenericSink();

	/**
	 * Returns the meta object for the attribute '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.GenericSink#getTargetDescription <em>Target Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Description</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.GenericSink#getTargetDescription()
	 * @see #getGenericSink()
	 * @generated
	 */
	EAttribute getGenericSink_TargetDescription();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureSink <em>Signature Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signature Sink</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.SignatureSink
	 * @generated
	 */
	EClass getSignatureSink();

	/**
	 * Returns the meta object for class '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.ParameterSink <em>Parameter Sink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Sink</em>'.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.ParameterSink
	 * @generated
	 */
	EClass getParameterSink();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Simpleflowmodel4pcmFactory getSimpleflowmodel4pcmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.FlowsImpl <em>Flows</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.FlowsImpl
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getFlows()
		 * @generated
		 */
		EClass FLOWS = eINSTANCE.getFlows();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOWS__FLOW = eINSTANCE.getFlows_Flow();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.FlowImpl
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Sink</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SINK = eINSTANCE.getFlow_Sink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SOURCE = eINSTANCE.getFlow_Source();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SourceImpl
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SignatureSourceImpl <em>Signature Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SignatureSourceImpl
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getSignatureSource()
		 * @generated
		 */
		EClass SIGNATURE_SOURCE = eINSTANCE.getSignatureSource();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.ParameterSourceImpl <em>Parameter Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.ParameterSourceImpl
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getParameterSource()
		 * @generated
		 */
		EClass PARAMETER_SOURCE = eINSTANCE.getParameterSource();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SinkImpl <em>Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SinkImpl
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getSink()
		 * @generated
		 */
		EClass SINK = eINSTANCE.getSink();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SignatureIdentificationImpl <em>Signature Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SignatureIdentificationImpl
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getSignatureIdentification()
		 * @generated
		 */
		EClass SIGNATURE_IDENTIFICATION = eINSTANCE.getSignatureIdentification();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_IDENTIFICATION__COMPONENT = eINSTANCE.getSignatureIdentification_Component();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_IDENTIFICATION__INTERFACE = eINSTANCE.getSignatureIdentification_Interface();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIGNATURE_IDENTIFICATION__SIGNATURE = eINSTANCE.getSignatureIdentification_Signature();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.ParameterIdentificationImpl <em>Parameter Identification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.ParameterIdentificationImpl
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getParameterIdentification()
		 * @generated
		 */
		EClass PARAMETER_IDENTIFICATION = eINSTANCE.getParameterIdentification();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_IDENTIFICATION__PARAMETER = eINSTANCE.getParameterIdentification_Parameter();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.GenericSinkImpl <em>Generic Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.GenericSinkImpl
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getGenericSink()
		 * @generated
		 */
		EClass GENERIC_SINK = eINSTANCE.getGenericSink();

		/**
		 * The meta object literal for the '<em><b>Target Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERIC_SINK__TARGET_DESCRIPTION = eINSTANCE.getGenericSink_TargetDescription();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SignatureSinkImpl <em>Signature Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.SignatureSinkImpl
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getSignatureSink()
		 * @generated
		 */
		EClass SIGNATURE_SINK = eINSTANCE.getSignatureSink();

		/**
		 * The meta object literal for the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.ParameterSinkImpl <em>Parameter Sink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.ParameterSinkImpl
		 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.impl.Simpleflowmodel4pcmPackageImpl#getParameterSink()
		 * @generated
		 */
		EClass PARAMETER_SINK = eINSTANCE.getParameterSink();

	}

} //Simpleflowmodel4pcmPackage
