package Arogyahospital;

public class Medicine {
	int MedicineID; 
	String MedicineName;
	int Unitprice;
	int Quantity; 
	String Manufacturedate;
	String ExpiryDate;
	public int getMedicineID() {
		return MedicineID;
	}
	public void setMedicineID(int medicineID) {
		MedicineID = medicineID;
	}
	public String getMedicineName() {
		return MedicineName;
	}
	public void setMedicineName(String medicineName) {
		MedicineName = medicineName;
	}
	public int getUnitprice() {
		return Unitprice;
	}
	public void setUnitprice(int unitprice) {
		Unitprice = unitprice;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getManufacturedate() {
		return Manufacturedate;
	}
	public void setManufacturedate(String manufacturedate) {
		Manufacturedate = manufacturedate;
	}
	public String getExpiryDate() {
		return ExpiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		ExpiryDate = expiryDate;
	}

}
