public class Person
{
	String name, address;
  String studentID;
	
	//parameterized constructor
	public Person(String newName, String newAddress, String newStudentID){
		name = newName;
		address = newAddress;
    studentID = newStudentID;
  }	
	
	void getDetails(){
    
		System.out.println("My name is " + name + "\nI am from " + address +"\n");
  }
  
  void Display(){
    System.out.println("MY ID is " + studentID + "\n");
  }
  
}