package Constructor;

class Personnew { 
    Personnew() 
    { 
        System.out.println("Person class Constructor"); 
    } 
} 

class Student1 extends Person { 
    Student1() 
    { 
        // invoke or call parent class constructor 
        super(); 
  
        System.out.println("Student class Constructor"); 
    } 
} 
public class Superkeywordconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s = new Student1(); 
	}

}
