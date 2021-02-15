
public class Employee {

	//instance variables
	String firstName;		//Employee first name
	String lastName;		//Employee last name
	Double monthlySalary;	//Employee salary
	
	//Methods as "protected" to allow for inheritance and modification later
	
	//First Name Methods
	protected void setFirstName(String name){
		firstName = name;		
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	//Last Name Methods
	protected void setLastName(String name){
		lastName = name;		
	}
	
	public String getLastName(){
		return lastName;
	}
	
	//Salary Methods
	public void setMonthlySalary(Double Salary){
		if (Salary >= 0){				//If Salary is positive, salary is set
			monthlySalary = Salary;
		}else{							//Else, Salary is set to 0
			monthlySalary = (double) 0;
		}
	}
	
	public double getMonthlySalary(){
		return monthlySalary;
	}
	
	//Class Constructor
	public Employee(String firstname, String lastname, double Salary){
		this.setFirstName(firstname);
		this.setLastName(lastname);
		this.setMonthlySalary(Salary);
	}
}
