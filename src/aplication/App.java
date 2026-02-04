package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitties.Employee;
import entitties.OutsourcedEmployee;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list_employees = new ArrayList<>();
		
		
		System.out.print("Enther the number of employees: ");
		int number_employees = sc.nextInt();
		
		for(int i = 1; i <= number_employees ; i++) {
			System.out.println("Employess #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char contract = sc.next().charAt(0);
			
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				System.out.print("Value per hour: ");
				Double ValuePerHour = sc.nextDouble();
			if(contract == 'y') {
				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, ValuePerHour, additionalCharge);
				list_employees.add(emp);
			}else {
				Employee emp = new Employee(name, hours, ValuePerHour);
				list_employees.add(emp);
			}	
		}
		System.out.println("PAYMENTS:");
		for(Employee employee: list_employees) {
				System.out.println(employee.getName() + " - $ " + String.format("%.2f",employee.payment()));
		}
		
	sc.close();	
}
	}

