package spring.core.entity;

public class Address {
	private String city;
	private String state;
	
	public Address() {
		super();
		System.out.println("Address.Address()");
	}
	
	public Address(String city, String state) {
		super();
		System.out.println("Address.Address(2)");
		this.city = city;
		this.state = state;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	
	

}
