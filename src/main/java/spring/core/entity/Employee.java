package spring.core.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int id;
	private String name;
	private String gender;
	private Address address;
	private List<Integer> contacts;
	private Set<Integer> set;
	private Map<Integer,String> map;
	
	public Employee() {
		super();
		System.out.println("Employee.Employee()");
		
	}

	public Employee(int id, String name, String gender, Address address, List<Integer> contacts, Set<Integer> set,
			Map<Integer, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.contacts = contacts;
		this.set = set;
		this.map = map;
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

	public List<Integer> getContacts() {
		return contacts;
	}

	public void setContacts(List<Integer> contacts) {
		this.contacts = contacts;
	}

	public Set<Integer> getSet() {
		return set;
	}

	public void setSet(Set<Integer> set) {
		this.set = set;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", contacts="
				+ contacts + ", set=" + set + ", map=" + map + "]";
	}

	

	
	
	
	

}
