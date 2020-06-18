/**
 */
package edu.kit.kastel.scbs.simpleflowmodel4pcm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generic Sink</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.GenericSink#getTargetDescription <em>Target Description</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage#getGenericSink()
 * @model
 * @generated
 */
public interface GenericSink extends Sink {
	/**
	 * Returns the value of the '<em><b>Target Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Description</em>' attribute.
	 * @see #setTargetDescription(String)
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage#getGenericSink_TargetDescription()
	 * @model required="true"
	 * @generated
	 */
	String getTargetDescription();

	/**
	 * Sets the value of the '{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.GenericSink#getTargetDescription <em>Target Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Description</em>' attribute.
	 * @see #getTargetDescription()
	 * @generated
	 */
	void setTargetDescription(String value);

} // GenericSink
