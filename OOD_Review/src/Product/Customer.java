package Product;

public class Customer {

	private int id;
	private String name;
	private Date dob;
	private String phone;
	private String address;

	public Customer(int id, String name, Date dob, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.phone = phone;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", dob=" + dob + ", phone=" + phone + ", address=" + address
				+ "]";
	}

}
