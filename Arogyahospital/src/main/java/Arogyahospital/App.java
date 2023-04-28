package Arogyahospital;
import java.sql.*;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {  
         int option;
        Scanner sc = new Scanner(System.in);
    	DaoInterface dao=new DaoImpl();
    	
    	do{
    	System.out.println("------Welcome To ArogyaHospitals------");
    	
    		System.out.println("Press [1] for Patient Registartion");
    		System.out.println("Press [2] for Medicine Records");
    		System.out.println("Press [3] for Supplier Records");
    		System.out.println("Press [4] for Contact Us");
    		System.out.println("Press [0] for Exiting the Application");
    		System.out.println("Enter Your choice");
    		option=sc.nextInt();
    		if(option<0 || option>4){
    			System.out.println("Wrong Choice");
    		}
    			else if(option==1) {
    				while(true){
        	    		System.out.println("----Welcome To Patient Records----");
                        System.out.println("Press [1] for adding new member");
        	    		System.out.println("Press [2] to view list of all available members");
        	    		System.out.println("Press [3] to search member by ID");
        	    		System.out.println("Press [4] to search member from a particular age group");
        	    		System.out.println("Press [5] to search member from a particular city");
        	    		System.out.println("Press [6] to delete data of a member");
        	            System.out.println("Press [7] to mark recovery of a member");
        	    		System.out.println("Press [0] to exit");
        	    	 
        	    	System.out.println("Enter Your choice");
        	    	option=sc.nextInt();
        	    	if(option<0 || option>7) {
        	    		System.out.println("You Have Entered Inavlid");
        	    	} 
        	    	else if(option==1) {
        	            Patient p=new Patient();
        	            System.out.println("Enter the name of patient");
        	            String name = sc.next();
        	            p.setName(name);
        	            System.out.println("Enter the gender of patient");
        	            String gender = sc.next();
        	            p.setGender(gender);
        	            System.out.println("Enter the Aadhar number of patient");
        	            String Aadhar = sc.next();
        	            p.setAadharNumber(Aadhar);
        	            System.out.println("Enter the Mobile number of patient");
        	            String phoneNum = sc.next();
        	            p.setContactNumber(phoneNum);
        	            System.out.println("Enter the city of patient");
        	            String city = sc.next();
        	            p.setCity(city);
        	            System.out.println("Enter the Address of patient");
        	            String address = sc.next();
        	            p.setAddress(address);
        	            System.out.println("Enter the date of Admission of patient");
        	            String date = sc.next();
        	            p.setDateOfAdmission(date);
        	            System.out.println("Enter the Guardian Name of patient");
        	            String guardianNam = sc.next();
        	            p.setGuardianName(guardianNam);
        	            System.out.println("Enter the Gaurdian Address of patient");
        	            String gaurdianAdd = sc.next();
        	            p.setGuardianAddress(gaurdianAdd);
        	            System.out.println("Enter the Gaurdian Contact Number of patient");
        	            String guardiannum = sc.next();
        	            p.setGaurdianContactNumber(guardiannum);
        	            System.out.println("Enter the Age of patient");
        	            int age = sc.nextInt();
        	            p.setAge(age);
        	            System.out.println("Enter the Status of patient");
        	            String status = sc.next();
        	            p.setstatus(status);
        	            
        	            dao.patientRegistration(p);
        	          
        	    	}
        	    	else if(option==2) {
        	    	
        	    		dao.displaypatient();
        	    		
        	    	}
        	    	else if(option==3) {
        	    	
        	    		dao.Searchbyid();
        	          
        	    	}
        	    	else if(option==4) {
        	    	
        	    		dao.Searchbyage();
        	    		
        	    	}
        	    	else if(option==5) {
        	    	
        	    		dao.Searchbycity();
        	    		
        	    	}
        	    	else if(option==6) {
        	    	
        	    		dao.deletePatientById();
        	    		
        	    	}
        	    	else if(option==7) {
        	    	
        	    		dao.recoveryPatient();
        	    		
        	    	}
        	    	else if(option==0) {
        	    	
        	    		System.out.println("Exiting module...done");
        	    		break;
        	    	}
        	    	}
    				}
        	    	else if(option==2) {
        	    		 Medicine m=new Medicine();
            	    		while(true) {
            	    		 System.out.println("----Welcome to Medicine Records----");
            	    		 System.out.println("Press [1] for Medicine Registartion");
            	    		 System.out.println("Press [2] for Display All Medicines");
            	    	     System.out.println("Press [3] for Enter Particular ID To Search Medicine");
            	    	     System.out.println("Press [4] for Enter Particular ID To Delete Medicine");
            	    		 System.out.println("Press [0] for Exit the program");
            	    		 System.out.println("Ener your choice");
            	    		 int option1 = sc.nextInt();
            	    		
            	    		 if(option1<0 || option1>4) {
            	    			 System.out.println("You Have Entered Invalid Option");
            	    		 }
            	    		 else if(option1==1) {
            	    		
         	             System.out.println("Enter the name of Medicine");
         	             String medicineName = sc.next();
         	             m.setMedicineName(medicineName);
         	             System.out.println("Enter the Price of Medicine");
         	             int Unitprice = sc.nextInt();
         	             m.setUnitprice(Unitprice);
         	             System.out.println("Enter the Quantity of Medicine");
         	             int Quantity = sc.nextInt();
         	             m.setQuantity(Quantity);
         	             System.out.println("Enter the Manufacture date of Medicine");
         	             String Manufacturedate = sc.next();
         	             m.setManufacturedate(Manufacturedate);
         	             System.out.println("Enter the Expiry date of Medicine");
         	             String Expirydate = sc.next();
         	             m.setExpiryDate(Expirydate);
         	             dao.medicineRegistation(m);
         	             break;	
            	    		 }
            	    		 else if(option1==2) {
            	    		
            	    			 dao.showMedicineList();
            	    			
            	    		 }
            	    		 else if(option1==3) {
            	    		
            	    			 dao.searchMedicinebyId();
            	    			
            	    		 }
            	    		 else if(option1==4) {
            	    		
            	    			 dao.deleteMedicinebyId();
            	    			
            	    		 }
            	    		 else if(option1==0) {
            	    		
            	    			 System.out.println("Exiting the module....done");
            	    			 break;
            	   
            	    		 }
            	    		 }
        	    	}
            	    	
            	    		else if(option==3) {
            	    			Supplier s=new Supplier();
            	            	while(true) {
            	       	    		 System.out.println("----Welcome to Supplier Records----");
            	       	    		 System.out.println("Press [1] for Supplier Registartion");
            	       	    		 System.out.println("Press [2] for Display All Suppliar Details");
            	       	    	     System.out.println("Press [3] for Enter Particular ID To Display Suppliar details");
            	       	    	     System.out.println("Press [4] for Enter Particular ID To Delete Suppliar Details3");
            	       	    		 System.out.println("Press [0] for Exit the program");
            	       	    		 System.out.println("Ener your choice");
            	       	    		 int option1 = sc.nextInt();
            	       	    		 
            	       	    		 if(option1<0 || option1>4) {
            	       	    			 System.out.println("You have Entered invalid");
            	       	    		 } 
            	       	    		 else if(option1==1) {
            	       	    		
            	    	             System.out.println("Enter the name of Supplier");
            	    	             String supplierName = sc.next();
            	    	             s.setSupplierName(supplierName);
            	    	             System.out.println("Enter the date and time of supply Medicine");
            	    	             String DateAndTimeofSupply = sc.next();
            	    	             s.setDateAndTimeofSupply(DateAndTimeofSupply);
            	    	            
            	    	             dao.supplierRegistration(s);
            	       	    		 }
            	       	    		 else if(option1==2) {
            	       	    		 
            	       	    			 dao.viewAllSupplierDetails();
            	       	    			
            	       	    		 }
            	       	    		 else if(option1==3) {
            	       	    		
            	       	    			 dao.searchSupplierById();
            	       	    			
            	       	    		 }
            	       	    		 else if(option1==4) {
            	       	    		 
            	       	    			 dao.deleteSupplierDetailsById();
            	       	    			
            	       	    		 }
            	       	    		 else if(option1==0) {
            	       	    			 System.out.println("Exeting this Module...");
                                        
            	       	    			 break;
            	       	    		 }
            	       	    			 
               	    		 }
            	    		}
            	    		else if(option==4) {
            	    			System.out.println("----------contact----------");
            	    			System.out.println("Address   :1-1-1/2b,Opposite Kalamandhir,Banglore");
            	    			System.out.println("contact   :000 000 0000,000 000 0000");
            	    			System.out.println("Mail      : ArogyaHospital@gmail.com");
            	    			System.out.println("FaceBook  : ArogyaHospitals ");
            	    			System.out.println("InstaGram : ArogyaHospital");
            	    			System.out.println("Feel Free To Contact Us");
            	    			
            	    		}
            	    		
            	    		else if(option==0) {
            	    			System.out.println("Exiting Application....done");
            	    			break;
            	    		}
            	    		else {
            	    			break;
            	    		}
        	    	} while(true);
    	}
    	}
    	