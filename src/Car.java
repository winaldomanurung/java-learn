
public class Car {
	private String make;
	private String model;
	private int year;
	

	Car(String make, String model, int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);	
	}
	
//	overloaded constructor
	Car(Car x){
		this.copy(x);
	}
	
//	getter
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
//	setter
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
//	method untuk copy
	public void copy(Car x) {
		this.setMake(x.make);
		this.setModel(x.model);
		this.setYear(x.year);
	}
}