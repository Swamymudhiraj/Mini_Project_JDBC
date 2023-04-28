package Arogyahospital;
import java.sql.*;
import java.util.Scanner;




public class DaoImpl implements DaoInterface {
	   Connection con;
    DaoImpl(){
        try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Arogyahospital","root","");
          
      } catch (Exception e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }    
      }
	public void patientRegistration(Patient p) {
        try {
        	
    PreparedStatement pstmt=con.prepareStatement("insert into Patient(name,gender,aadharNumber,contactNumber,city,address,dateOfAdmission,guardianName,guardianAddress,guardianContactNumber,age,status) values(?,?,?,?,?,?,?,?,?,?,?,?)");
            
            pstmt.setString(1,p.getName());
            pstmt.setString(2,p.getGender());
            pstmt.setString(3,p.getAadharNumber());
            pstmt.setString(4,p.getContactNumber());
            pstmt.setString(5,p.getCity());
            pstmt.setString(6,p.getAddress());
            pstmt.setString(7,p.getDateOfAdmission());
            pstmt.setString(8,p.getGuardianName());
            pstmt.setString(9,p.getGuardianAddress());
            pstmt.setString(10,p.getGaurdianContactNumber());
            pstmt.setInt(11,p.getAge());
            pstmt.setString(12,p.getstatus());
            
            int i=pstmt.executeUpdate();
            if(i!=0) {
                System.out.println("data saved successfully");
            }
            else {
                System.out.println("data is not saved successfully");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
	public void displaypatient() {
        try {
            //1. loading Driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
           // 2. Establish the connection
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Arogyahospital","root","");
            
            Statement st=con.createStatement();
    
            ResultSet rs=st.executeQuery("SELECT * FROM patient");
            ResultSetMetaData rsmd=rs.getMetaData();
    
            int colscount=rsmd.getColumnCount();
    
           for(int i=1;i<=colscount;i++)
           {
           System.out.print(rsmd.getColumnName(i)+"\t      ");
           }
           System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            
            while(rs.next())
            {
                for(int i=1;i<=colscount;i++)
                {
                System.out.print(rs.getString(i)+"\t      ");
                }
                 System.out.println();
            }
                        con.close();
           }
           catch(Exception e) {
           	System.out.println(e);
               
           }
 
	}
	 public void Searchbyid() {
		  try {
		         int ID;
		         Scanner sc = new Scanner(System.in);
		         System.out.println("Enter ID of Patient:");
		         ID = sc.nextInt();
	             Class.forName("com.mysql.cj.jdbc.Driver");
	             Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Arogyahospital","root","");
		         // Create SQL statement with a WHERE clause to filter data by ID 
		         PreparedStatement pstmt = con1.prepareStatement("SELECT * FROM patient WHERE id = ?");
		         pstmt.setInt(1, ID); // Set ID value to search data
		        ResultSet rs= pstmt.executeQuery();
		         // Process retrieved data
	            ResultSetMetaData rsmd=rs.getMetaData();
	            
	            int colscount=rsmd.getColumnCount();
	            for(int i=1;i<=colscount;i++)
	            {
	            System.out.print(rsmd.getColumnName(i)+"\t      ");
	            }
	            System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	             
		         while (rs.next()) {
		        	 for(int i=1;i<=colscount;i++)
		                {
		                System.out.print(rs.getString(i)+"\t      ");
		                }
		                 System.out.println();
	                        con.close();
		            }
		         
		      } catch (SQLException e) {
		         e.printStackTrace();
	 } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	 public void Searchbyage() {
		  try {
		         int Age;
		         Scanner sc = new Scanner(System.in);
		         System.out.println("Enter Particular Age of Patient:");
		         Age= sc.nextInt();
	             Class.forName("com.mysql.cj.jdbc.Driver");
	             Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Arogyahospital","root","");
		         // Create SQL statement with a WHERE clause to filter data by ID
		         PreparedStatement pstmt = con1.prepareStatement("SELECT * FROM patient WHERE age = ?");
		         pstmt.setInt(1, Age); // Set ID value to search data
		        ResultSet rs= pstmt.executeQuery();
		         // Process retrieved data
	            ResultSetMetaData rsmd=rs.getMetaData();
	            
	            int colscount=rsmd.getColumnCount();
	            for(int i=1;i<=colscount;i++)
	            {
	            System.out.print(rsmd.getColumnName(i)+"\t      ");
	            }
	            System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	             
		         while (rs.next()) {
		        	 for(int i=1;i<=colscount;i++)
		                {
		                System.out.print(rs.getString(i)+"\t      ");
		                }
		                 System.out.println();
	                        con.close();
		            }
		         
		      } catch (SQLException e) {
		         e.printStackTrace();
	 } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	 public void Searchbycity() {
		  try {
		         String City;
		         Scanner sc = new Scanner(System.in);
		         System.out.println("Enter Particular city of Patient:");
		         City = sc.next();
	             Class.forName("com.mysql.cj.jdbc.Driver");
	             Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Arogyahospital","root","");
		         // Create SQL statement with a WHERE clause to filter data by ID
		         PreparedStatement pstmt = con1.prepareStatement("SELECT * FROM patient WHERE city = ?");
		         pstmt.setString(1, City); // Set ID value to search data
		        ResultSet rs= pstmt.executeQuery();
		         // Process retrieved data
	            ResultSetMetaData rsmd=rs.getMetaData();
	            
	            int colscount=rsmd.getColumnCount();
	            for(int i=1;i<=colscount;i++)
	            {
	            System.out.print(rsmd.getColumnName(i)+"\t      ");
	            }
	            System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	             
		         while (rs.next()) {
		        	 for(int i=1;i<=colscount;i++)
		                {
		                System.out.print(rs.getString(i)+"\t      ");
		                }
		                 System.out.println();
	                        con.close();
		            }
		         
		      } catch (SQLException e) {
		         e.printStackTrace();
	 } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
	 public void deletePatientById() {

		         int ID;
		         Scanner sc = new Scanner(System.in);
		         System.out.println("Enter ID of Patient:");
		         ID = sc.nextInt();

		         try {
		             // 1. loading Driver class
		             Class.forName("com.mysql.cj.jdbc.Driver");
		             // 2. Establish the connection
		             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Arogyahospital", "root", "");

		             PreparedStatement pstmt = con.prepareStatement("DELETE FROM patient WHERE id=?");

		             pstmt.setInt(1, ID);

		             int i = pstmt.executeUpdate();
		             if (i == 1) {
		                 System.out.println("RECORD DELETED SUCCESSFULLY");
		             } else {
		                 System.out.println("ERROR OCCURRED WHILE DELETING RECORD");
		             }

		             con.close();
		         } catch (Exception e) {
		        	 System.out.println(e);
		        	 }
		         }
	 public void recoveryPatient() {
         String recovered;
         int ID;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter patient ID:");
         ID=sc.nextInt();
         System.out.println("Mark the status:");
         recovered=sc.next();
         
       try {
        //1. loading Driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

       // 2. Establish the connection
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Arogyahospital","root","");
      
        PreparedStatement pstmt=con.prepareStatement("UPDATE patient SET status=? WHERE id=? ");
        pstmt.setString(1,recovered);
        pstmt.setInt(2,ID);
        
        int i=pstmt.executeUpdate();
        if(i==1)
        {
            System.out.println("Record Updated Successfully");                   
        }
        else
        {
          System.out.println("ERROR OCCUR WHILE Updating");
        }  
       con.close();  
}
catch(Exception e) {
   System.out.println(e);
}
}
	 public void medicineRegistation(Medicine m) {
		  try {
		    PreparedStatement pstmt=con.prepareStatement("insert into medicine(MedicineName,Unitprice,Quantity,Manufacturedate,ExpiryDate) values(?,?,?,?,?)");
		            
		            pstmt.setString(1,m.getMedicineName());
		            pstmt.setInt(2,m.getUnitprice());
		            pstmt.setInt(3,m.getQuantity());
		            pstmt.setString(4,m.getManufacturedate());
		            pstmt.setString(5,m.getExpiryDate());
		            
		            int i=pstmt.executeUpdate();
		            if(i!=0) {
		                System.out.println("data saved successfully");
		            }
		            else {
		                System.out.println("data is not saved successfully");
		            }
		        } catch (SQLException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
	 }
	   public void showMedicineList() {
		   try {
	            //1. loading Driver class
	            Class.forName("com.mysql.cj.jdbc.Driver");
	           // 2. Establish the connection
	            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Arogyahospital","root","");
	            
	            Statement st=con.createStatement();
	    
	            ResultSet rs=st.executeQuery("SELECT * FROM medicine");
	            ResultSetMetaData rsmd=rs.getMetaData();
	    
	            int colscount=rsmd.getColumnCount();
	    
	           for(int i=1;i<=colscount;i++)
	           {
	           System.out.print(rsmd.getColumnName(i)+"\t    ");
	           }
	           System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	            
	            while(rs.next())
	            {
	                for(int i=1;i<=colscount;i++)
	                {
	                System.out.print(rs.getString(i)+"\t           ");
	                }
	                 System.out.println();
	            }
	                        con.close();
	           }
	           catch(Exception e) {
	           	System.out.println(e);
	               
	           }
		   
	   }
	   public void searchMedicinebyId() { //public void searchMedicinebyId()
		   try {
		         int ID;
		         Scanner sc = new Scanner(System.in);
		         System.out.println("Enter ID of Patient:");
		         ID = sc.nextInt();
	             Class.forName("com.mysql.cj.jdbc.Driver");
	             Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Arogyahospital","root","");
		         // Create SQL statement with a WHERE clause to filter data by ID 
		         PreparedStatement pstmt = con1.prepareStatement("SELECT * FROM medicine WHERE MedicineID = ?");
		         pstmt.setInt(1, ID); // Set ID value to search data
		        ResultSet rs= pstmt.executeQuery();
		         // Process retrieved data
	            ResultSetMetaData rsmd=rs.getMetaData();
	            
	            int colscount=rsmd.getColumnCount();
	            for(int i=1;i<=colscount;i++)
	            {
	            System.out.print(rsmd.getColumnName(i)+"\t    ");
	            }
	            System.out.println("\n-------------------------------------------------------------------------------------------------------------------");
	             
		         while (rs.next()) {
		        	 for(int i=1;i<=colscount;i++)
		                {
		                System.out.print(rs.getString(i)+"\t          ");
		                }
		                 System.out.println();
	                        con.close();
		            }
		         
		      } catch (SQLException e) {
		         e.printStackTrace();
	 } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
	   public void deleteMedicinebyId() {
		   int ID;
	         Scanner sc = new Scanner(System.in);
	         System.out.println("Enter ID of Patient:");
	         ID = sc.nextInt();

	         try {
	             // 1. loading Driver class
	             Class.forName("com.mysql.cj.jdbc.Driver");
	             // 2. Establish the connection
	             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Arogyahospital", "root", "");

	             PreparedStatement pstmt = con.prepareStatement("DELETE FROM medicine WHERE MedicineID=?");

	             pstmt.setInt(1, ID);

	             int i = pstmt.executeUpdate();
	             if (i == 1) {
	                 System.out.println("RECORD DELETED SUCCESSFULLY");
	             } else {
	                 System.out.println("ERROR OCCURRED WHILE DELETING RECORD");
	             }

	             con.close();
	         } catch (Exception e) {
	        	 System.out.println(e);
	        	 }
	   }
	   public void supplierRegistration(Supplier s) {
		   try {
			    PreparedStatement pstmt=con.prepareStatement("insert into suppliar(SupplierID,SupplierName,DateAndTimeofSupply) values(?,?,?)");
			            
			            pstmt.setInt(1,s.getSupplierID());
			            pstmt.setString(2,s.getSupplierName());
			            pstmt.setString(3,s.getDateAndTimeofSupply());

			            
			            int i=pstmt.executeUpdate();
			            if(i!=0) {
			                System.out.println("data saved successfully");
			            }
			            else {
			                System.out.println("data is not saved successfully");
			            }
			        } catch (SQLException e) {
			            // TODO Auto-generated catch block
			            e.printStackTrace();
			        }
	   }
	   public void viewAllSupplierDetails() {
		   try {
	            //1. loading Driver class
	            Class.forName("com.mysql.cj.jdbc.Driver");
	           // 2. Establish the connection
	            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Arogyahospital","root","");
	            
	            Statement st=con.createStatement();
	    
	            ResultSet rs=st.executeQuery("SELECT * FROM Suppliar");
	            ResultSetMetaData rsmd=rs.getMetaData();
	    
	            int colscount=rsmd.getColumnCount();
	    
	           for(int i=1;i<=colscount;i++)
	           {
	           System.out.print(rsmd.getColumnName(i)+"\t    ");
	           }
	           System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	            
	            while(rs.next())
	            {
	                for(int i=1;i<=colscount;i++)
	                {
	                System.out.print(rs.getString(i)+"\t           ");
	                }
	                 System.out.println();
	            }
	                        con.close();
	           }
	           catch(Exception e) {
	           	System.out.println(e);
	               
	           }
	   }
	   public void searchSupplierById() {
		   try {
		         int ID;
		         Scanner sc = new Scanner(System.in);
		         System.out.println("Enter ID of Patient:");
		         ID = sc.nextInt();
	             Class.forName("com.mysql.cj.jdbc.Driver");
	             Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/Arogyahospital","root","");
		         // Create SQL statement with a WHERE clause to filter data by ID 
		         PreparedStatement pstmt = con1.prepareStatement("SELECT * FROM Suppliar WHERE SupplierID = ?");
		         pstmt.setInt(1, ID); // Set ID value to search data
		        ResultSet rs= pstmt.executeQuery();
		         // Process retrieved data
	            ResultSetMetaData rsmd=rs.getMetaData();
	            
	            int colscount=rsmd.getColumnCount();
	            for(int i=1;i<=colscount;i++)
	            {
	            System.out.print(rsmd.getColumnName(i)+"\t    ");
	            }
	            System.out.println("\n-------------------------------------------------------------------------------------------------------------------");
	             
		         while (rs.next()) {
		        	 for(int i=1;i<=colscount;i++)
		                {
		                System.out.print(rs.getString(i)+"\t          ");
		                }
		                 System.out.println();
	                        con.close();
		            }
		         
		      } catch (SQLException e) {
		         e.printStackTrace();
	 } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
	   public void deleteSupplierDetailsById() {
		   int ID;
	         Scanner sc = new Scanner(System.in);
	         System.out.println("Enter ID of Patient:");
	         ID = sc.nextInt();

	         try {
	             // 1. loading Driver class
	             Class.forName("com.mysql.cj.jdbc.Driver");
	             // 2. Establish the connection
	             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Arogyahospital", "root", "");

	             PreparedStatement pstmt = con.prepareStatement("DELETE FROM Suppliar WHERE SupplierID=?");

	             pstmt.setInt(1, ID);

	             int i = pstmt.executeUpdate();
	             if (i == 1) {
	                 System.out.println("RECORD DELETED SUCCESSFULLY");
	             } else {
	                 System.out.println("ERROR OCCURRED WHILE DELETING RECORD");
	             }

	             con.close();
	         } catch (Exception e) {
	        	 System.out.println(e);
	         }
	   }	        	 
}
   