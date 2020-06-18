/**
 */
package simpleflowmodel4pcm.tests;

import junit.textui.TestRunner;

import simpleflowmodel4pcm.SignatureSink;
import simpleflowmodel4pcm.Simpleflowmodel4pcmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Signature Sink</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SignatureSinkTest extends SinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SignatureSinkTest.class);
	}

	/**
	 * Constructs a new Signature Sink test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureSinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Signature Sink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SignatureSink getFixture() {
		return (SignatureSink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Simpleflowmodel4pcmFactory.eINSTANCE.createSignatureSink());
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

} //SignatureSinkTest
