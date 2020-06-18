/**
 */
package edu.kit.kastel.scbs.simpleflowmodel4pcm;

import org.eclipse.emf.common.util.EList;

import org.palladiosimulator.pcm.repository.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.kit.kastel.scbs.simpleflowmodel4pcm.ParameterIdentification#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage#getParameterIdentification()
 * @model
 * @generated
 */
public interface ParameterIdentification extends SignatureIdentification {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference list.
	 * The list contents are of type {@link org.palladiosimulator.pcm.repository.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference list.
	 * @see edu.kit.kastel.scbs.simpleflowmodel4pcm.Simpleflowmodel4pcmPackage#getParameterIdentification_Parameter()
	 * @model required="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

} // ParameterIdentification
