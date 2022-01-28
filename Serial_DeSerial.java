package apu;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serial_DeSerial {
     public static void main(String args[]) throws IOException 
	  {
   	  

	    Student obj = new Student("Apurva", 101, 24, "Testing", "apurva@gmail.com", 123456789, "Female");
	    
	    FileOutputStream fos= null;
	    ObjectOutputStream oos= null;
	    
	    try{ 
	      fos = new FileOutputStream("C://Users//OM JATLA//Desktop//mii//Student.ser"); 
	      oos = new ObjectOutputStream(fos);
	      oos.writeObject(obj);
	      System.out.println("Serialzation Done!!");
	   }catch(IOException ioe){
	      System.out.println(ioe);
	    }
	    finally{
		      oos.close();
		      fos.close();
	    }
     
     //Deserialization
     Student o=null;
     try{
       FileInputStream fis = new FileInputStream("C://Users//OM JATLA//Desktop//mii//Student.ser");
       ObjectInputStream ois = new ObjectInputStream(fis);
       o = (Student)ois.readObject();
       ois.close();
       fis.close();
     }
     catch(IOException ioe)
     {
        ioe.printStackTrace();
        return;
     }catch(ClassNotFoundException cnfe)
      {
        System.out.println("Student Class is not found.");
        cnfe.printStackTrace();
        return;
      }
     System.out.println("Student Name:"+o.getName());
     System.out.println("Student Id:"+o.getId());
     System.out.println("Student Age:"+o.getAge());
     System.out.println("Student Department Name:"+o.getDeptName());
     System.out.println("Student Email Id:"+o.getEmail());
     System.out.println("Student Contact No.:"+o.getContact());
     System.out.println("Student Gender:"+o.getGender());
  }
}

//------------------------------Student-------------------------//
class Student implements java.io.Serializable{
	  
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private String name;
		private int id;
		private int age;
		private String deptName;
		private String email;
		private int contact;
		private String gender;
	  
	  
	  public Student(String name,int id, int age,String deptName,String email, int contact,String gender) 
	  {
	    this.setName(name);
	    this.setId(id);
	    this.setAge(age);
	    this.setDeptName(deptName);
	    this.setEmail(email);
	    this.setContact(contact);
	    this.setGender(gender);
	    
	  }
	  
	

		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}
		  

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getDeptName() {
			return deptName;
		}

		public void setDeptName(String deptName) {
			this.deptName = deptName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getContact() {
			return contact;
		}

		public void setContact(int contact) {
			this.contact = contact;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

	/*  public void setid(int id) {
	    this.id = id;
	  }
	  public void setid(int id) {
		    this.id = id;
		  }
		 
	  
	  public int getStuAge() {
	    return stuAge;
	  }
	  public void setStuAge(int stuAge) {
	    this.stuAge = stuAge;
	  }
	 
	  public String getStuAddress() {
	    return stuAddress;
	  }
	  public void setStuAddress(String stuAddress) {
	    this.stuAddress = stuAddress;
	  }
	  public int getStuHeight() {
	    return stuHeight;
	  }
	  public void setStuHeight(int stuHeight) {
	    this.stuHeight = stuHeight;
	    }
	    
	    	    */	
	}
