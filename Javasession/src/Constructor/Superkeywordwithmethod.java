package Constructor;

class Person { 
    void message() 
    { 
        System.out.println("This is person class\n"); 
    } 
} 

class Student extends Person { 
    void message() 
    { 
        System.out.println("This is student class"); 
    } 
    
    void display() 
    { 
        
        message(); 
  
       
        super.message(); 
    } 
} 
public class Superkeywordwithmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(); 
		  
        // calling display() of Student 
        s.display(); 
	}

}
