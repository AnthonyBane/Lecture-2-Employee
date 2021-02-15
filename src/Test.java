import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> Employees = new ArrayList<Employee>();
		
		Employees.add(new Employee ("Nick", "Bane", 20));
		//Employees.add(new Employee ("Julian", "Bane", 15));
		//Employees.add(new Employee ("Anthony", "Bane", 10));
		
		for(Employee employee : Employees){
			System.out.println(employee.getFirstName());
			System.out.println(employee.getLastName());
			System.out.printf("£%.2f\n", employee.getMonthlySalary());
			System.out.printf("Yearly salary = £%.2f\n", employee.getMonthlySalary()*12);
			employee.setMonthlySalary(employee.getMonthlySalary()*1.1);
			System.out.printf("New Monthly Salary - £%.2f\n", employee.getMonthlySalary());
			System.out.printf("New yearly salary = £%.2f\n", employee.getMonthlySalary()*12);
		}
	
	}

}
