/**
 */
package simpleflowmodel4pcm.tests;

import junit.textui.TestRunner;

import simpleflowmodel4pcm.GenericSink;
import simpleflowmodel4pcm.Simpleflowmodel4pcmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Generic Sink</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GenericSinkTest extends SinkTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GenericSinkTest.class);
	}

	/**
	 * Constructs a new Generic Sink test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericSinkTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Generic Sink test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GenericSink getFixture() {
		return (GenericSink)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Simpleflowmodel4pcmFactory.eINSTANCE.createGenericSink());
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

} //GenericSinkTest
