package Arogyahospital;

public interface DaoInterface {
	   public void patientRegistration(Patient p);
	   public void displaypatient();
	   public void Searchbyid();
       public void Searchbyage();
	   public void Searchbycity();
	   public void deletePatientById();
	   public void recoveryPatient();
	   public void medicineRegistation(Medicine m);
	   public void showMedicineList();
	   public void searchMedicinebyId(); 
	   public void deleteMedicinebyId();
	   public void supplierRegistration(Supplier s);
	   public void viewAllSupplierDetails();
	   public void searchSupplierById();
	   public void deleteSupplierDetailsById();

}

