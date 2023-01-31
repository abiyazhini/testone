package org.employee;

public class Employee {
	public void empId() {
		System.out.println("Employee ID: 1000");
		}
		public void empName() {
			System.out.println("Employee Name: Vanchi");
		}
		public void empDob() {
			System.out.println("Employee DOB: 02.05.1987");
		}
		
		public void empPhone() {
			System.out.println("Employee Phone: 9500705770");
		}
		public void empEmail() {
			System.out.println("Employee Email: abc@gmail.com");
		}
		public void empAddress() {
			System.out.println("Employee Address: 100, East Street, JKM");
		}
		
		public static void main(String[] args) {
			Employee emp = new Employee();
			emp.empId();
			emp.empName();
			emp.empDob();
			emp.empPhone();
			emp.empEmail();
			emp.empAddress();

		}
}
