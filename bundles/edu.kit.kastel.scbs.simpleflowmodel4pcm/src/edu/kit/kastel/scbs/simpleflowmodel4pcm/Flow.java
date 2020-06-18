/**
 */
package edu.kit.kastel.scbs.simpleflowmodel4pcm;

import edu.kit.ipd.sdq.composition.securityanalyses.basic.IdentifiedElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.Flow#getSink <em>Sink</em>}</li>
 *   <li>{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.Flow#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage#getFlow()
 * @model
 * @generated
 */
public interface Flow extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Sink</b></em>' containment reference list.
	 * The list contents are of type {@link edu.kit.kastel.scbs.simpleflowmodel4pcm.Sink}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sink</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sink</em>' containment reference list.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage#getFlow_Sink()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Sink> getSink();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(Source)
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage#getFlow_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Source getSource();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.Flow#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Source value);

} // Flow
