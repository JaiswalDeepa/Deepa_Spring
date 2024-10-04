package spring.core.entity;

public class Employee {
	private int id;
	private String name;
	private String gender;
	private Address address;
	
	public Employee() {
		super();
		System.out.println("Employee.Employee()");
		
	}

	

	public Employee(int id, String name, String gender, Address address) {
		super();
		System.out.println("Injection by Constructor");
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Emoloyee.setId()");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Emoloyee.setName()");
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		System.out.println("Emoloyee.setGender()");
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}

	
	
	
	

}
