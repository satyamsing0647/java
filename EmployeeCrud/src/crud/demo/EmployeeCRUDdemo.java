package crud.demo;

import java.util.Scanner;

/**
 * Auhtor : Satyam.3.Singh
 * Date   : 7 Nov 2024
 * Time   : 5:17:06 pm
 * Email  : satyam.3.singh@coforge.com
 */

public class EmployeeCRUDdemo {
	public static void main(String[] args) {

		Employee e=new Employee();
		String city=null,name=null,contact=null;
		int e_id=0;;

		System.out.println("************** Global Tech Solutions **************");
		System.out.println("----------- Employee Management System ----------");
		while(true)
		{
			System.out.println("Press 1 for New Employee \t Press 2 to Display Employees");
			System.out.println("Press 3 for Update Employee \t Press 4 to Delete Employee");
			System.out.println("Press 5 to update email using resultset \t press 6 for Exit"); 

			Scanner s=new Scanner(System.in);
			int option=s.nextInt();

			switch(option)
			{
			case 1: System.out.println("Enter Customer Name, City & Contact no :");
			e.insertEmployee(name,city,contact);
			name = s.next();
			System.out.println("Enter City: ");
			city = s.next();
			System.out.println("Enter Contact No: ");
			contact = s.next();
			e.insertEmployee(name, city, contact);
			break;

			case 2: e.getEmployee();
			
			break;

			case 3: System.out.println("Enter Employee Id & City to be Updated:");
		     e_id= s.nextInt();
             s.nextLine();
             System.out.println("Enter New City: ");
             city = s.nextLine();
			e.updateEmployee(e_id,city);
			break;

			case 4: System.out.println("Enter Employee Id  to be Deleted:");
			e_id = s.nextInt();
			e.deleteEmployee(e_id);
			break;
			
			case 5: System.out.println("Enter Employee id for email updation");
			e.updateEmployeeEmail(e_id);		
		
			
			case 6: System.out.println("Program Terminated");
				
			System.exit(0);
			s.close();

			default: System.out.println("Invalid Selection");
			break;
			}
		}

	}
}
