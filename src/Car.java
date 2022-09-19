
public class Car {
	private String make;
	private String model;
	private int year;
	
//	karena kita akan menggunakan setter, constructor ini:
//	Car(String make, String model, int year){
//		this.make = make;
//		this.model = model;
//		this.year = year;	
//	}
//	...kita ganti dengan:
	Car(String make, String model, int year){
	this.setMake(make);
	this.setModel(model);
	this.setYear(year);	
}
	
//	karena semua field merupakan private kita butuh menggunakan getter untuk membuka aksesnya ke Class lain
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
//	kita buat setter
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
}
