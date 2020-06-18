/**
 */
package simpleflowmodel4pcm.tests;

import junit.textui.TestRunner;

import simpleflowmodel4pcm.ParameterSink;
import simpleflowmodel4pcm.Simpleflowmodel4pcmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Parameter Sink</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterSinkTest extends SinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ParameterSinkTest.class);
	}

	/**
	 * Constructs a new Parameter Sink test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Parameter Sink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ParameterSink getFixture() {
		return (ParameterSink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Simpleflowmodel4pcmFactory.eINSTANCE.createParameterSink());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ParameterSinkTest
