/**
 */
package org.nasdanika.models.agent;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Skill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A skill: procedural knowledge an agent loads on demand, in the sense of Anthropic Agent Skills (SKILL.md), i.e. instructions plus supporting resources.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.agent.Skill#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link org.nasdanika.models.agent.Skill#getResources <em>Resources</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.agent.AgentPackage#getSkill()
 * @model
 * @generated
 */
public interface Skill extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Skill body in Markdown: the how-to the agent follows when the skill is triggered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instructions</em>' attribute.
	 * @see #setInstructions(String)
	 * @see org.nasdanika.models.agent.AgentPackage#getSkill_Instructions()
	 * @model unique="false"
	 * @generated
	 */
	String getInstructions();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.agent.Skill#getInstructions <em>Instructions</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instructions</em>' attribute.
	 * @see #getInstructions()
	 * @generated
	 */
	void setInstructions(String value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.agent.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' containment reference list.
	 * @see org.nasdanika.models.agent.AgentPackage#getSkill_Resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getResources();

} // Skill
