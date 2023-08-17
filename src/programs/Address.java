package programs;

public class Address {
 private String city;
 private int pin;
 
 public Address(String city, int pin) {
		super();
		this.city = city;
		this.pin = pin;
	}
 
 @Override
public String toString() {
	return " [city=" + city + ", pin=" + pin + "]";
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
public int getPin() {
	return pin;
}
public void setPin(int pin) {
	this.pin = pin;
}
 
}
