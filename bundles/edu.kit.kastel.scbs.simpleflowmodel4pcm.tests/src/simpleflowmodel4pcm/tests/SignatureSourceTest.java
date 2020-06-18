/**
 */
package simpleflowmodel4pcm.tests;

import junit.textui.TestRunner;

import simpleflowmodel4pcm.SignatureSource;
import simpleflowmodel4pcm.Simpleflowmodel4pcmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Signature Source</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SignatureSourceTest extends SignatureIdentificationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SignatureSourceTest.class);
	}

	/**
	 * Constructs a new Signature Source test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureSourceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Signature Source test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SignatureSource getFixture() {
		return (SignatureSource)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Simpleflowmodel4pcmFactory.eINSTANCE.createSignatureSource());
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

} //SignatureSourceTest
