/**
 */
package gendev.hw1;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cloud Solution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link gendev.hw1.CloudSolution#getArchitectureDesign <em>Architecture Design</em>}</li>
 *   <li>{@link gendev.hw1.CloudSolution#getServiceProvider <em>Service Provider</em>}</li>
 * </ul>
 *
 * @see gendev.hw1.Hw1Package#getCloudSolution()
 * @model
 * @generated
 */
public interface CloudSolution extends CloudArchitect, CloudService {
	/**
	 * Returns the value of the '<em><b>Architecture Design</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Architecture Design</em>' attribute.
	 * @see #setArchitectureDesign(String)
	 * @see gendev.hw1.Hw1Package#getCloudSolution_ArchitectureDesign()
	 * @model
	 * @generated
	 */
	String getArchitectureDesign();

	/**
	 * Sets the value of the '{@link gendev.hw1.CloudSolution#getArchitectureDesign <em>Architecture Design</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Architecture Design</em>' attribute.
	 * @see #getArchitectureDesign()
	 * @generated
	 */
	void setArchitectureDesign(String value);

	/**
	 * Returns the value of the '<em><b>Service Provider</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Provider</em>' attribute.
	 * @see #setServiceProvider(String)
	 * @see gendev.hw1.Hw1Package#getCloudSolution_ServiceProvider()
	 * @model
	 * @generated
	 */
	String getServiceProvider();

	/**
	 * Sets the value of the '{@link gendev.hw1.CloudSolution#getServiceProvider <em>Service Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Provider</em>' attribute.
	 * @see #getServiceProvider()
	 * @generated
	 */
	void setServiceProvider(String value);

} // CloudSolution
