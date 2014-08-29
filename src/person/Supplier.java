package person;

/**
 * @author Roland Katona
 *
 */
public class Supplier extends Person {
	private String contactName;
	private String vatNumber;
	private String imageString;

	/**
	 * Default constructor
	 */
	public Supplier() {
		super();
		vatNumber = "";
	}

	/**
	 * @param name
	 * @param email
	 * @param contactNumber
	 * @param address
	 * @param contactName
	 * @param vatNumber
	 */
	public Supplier(String name, String email, String contactNumber, String address,
			String contactName, String vatNumber) {
		super(name, email, contactNumber, address);
		this.vatNumber = vatNumber;
		this.contactName = contactName;
		this.imageString = null;
	}

	/**
	 * @return vatNumber
	 */
	public String getVatNumber() {
		return vatNumber;
	}

	/**
	 * @param vatNumber
	 */
	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}

	/**
	 * @return contactName
	 */
	public String getContactName() {
		return contactName;
	}

	/**
	 * @param contactName
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

}
