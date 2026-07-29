package Basics;

public class Car {
	int model;
	String category;
	int manufacturingNo;
	
	public Car(int model, String category, int manufacturingNo) {
		this.model = model;
		this.category = category;
		this.manufacturingNo = manufacturingNo;
	}


	public int getModel() {
		return model;
	}


	public void setModel(int model) {
		this.model = model;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public int getManufacturingNo() {
		return manufacturingNo;
	}



	public void setManufacturingNo(int manufacturingNo) {
		this.manufacturingNo = manufacturingNo;
	}



	@Override
	public String toString() {
		return "Car [model=" + model + ", category=" + category + ", manufacturingNo=" + manufacturingNo + "]";
	}


	public static void main(String[] args) {
	
	}
}
