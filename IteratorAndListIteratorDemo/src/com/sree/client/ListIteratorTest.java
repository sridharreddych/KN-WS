package com.sree.client;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.sree.model.Employee;

public class ListIteratorTest {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1001, "Martin", 90000.00, "martin.s@sree.com"));
		empList.add(new Employee(1002, "Sean", 95000.00, "sean.m@sree.com"));
		empList.add(new Employee(1003, "Joya", 30000.00, "joya.s@sree.com"));
		empList.add(new Employee(1004, "Harman", 50000.00, "harman.s@sree.com"));
		empList.add(new Employee(1005, "sam", 40000.00, "sam.s@sree.com"));

		//iterateListUsingListIterator(empList);
		//addElementsInListUsingListIterator(empList);
		//deleteElementsInListUsingListIterator(empList);
		replaceElementsInListUsingListIterator(empList);
	}
	
 private static void iterateListUsingListIterator(List<Employee> empList) {
	 
	 ListIterator<Employee> listIterator = empList.listIterator();
	 System.out.println("Forward Direction :::::");
	 while (listIterator.hasNext()) {
		Employee employee = listIterator.next();
		System.out.println(employee);
	}
	 System.out.println("Backward Direction :::::");
	 while (listIterator.hasPrevious()) {
		Employee employee = (Employee) listIterator.previous();
		System.out.println(employee);
	}
 }
 
 private static void addElementsInListUsingListIterator(List<Employee> empList) {
	 ListIterator<Employee> listIterator = empList.listIterator();
	 System.out.println("Forward Direction :::::");
	 while (listIterator.hasNext()) {
		Employee employee = listIterator.next();
		if(!employee.getName().equalsIgnoreCase("kk")) {
			listIterator.add(new Employee(9999, "kk", 9000.00, "kk@sreetech.com"));
			break;
		}
	}
	 for (Employee employee : empList) {
		 System.out.println(employee);
		
	}
	 
 }
 
 private static void deleteElementsInListUsingListIterator(List<Employee> empList) {
	 ListIterator<Employee> listIterator = empList.listIterator();
	
	 while (listIterator.hasNext()) {
		Employee employee = listIterator.next();
		if(employee.getName().equalsIgnoreCase("joya")) {
			listIterator.remove();
		}
	}
	 for (Employee employee : empList) {
		 System.out.println(employee);
		
	}
 }
 
 private static void replaceElementsInListUsingListIterator(List<Employee> empList) {
	 ListIterator<Employee> listIterator = empList.listIterator();
	
	 while (listIterator.hasNext()) {
		Employee employee = listIterator.next();
		if(employee.getName().equalsIgnoreCase("joya")) {
			employee.setName("Joya Bingel");
			listIterator.set(employee);
		}
	}
	 for (Employee employee : empList) {
		 System.out.println(employee);
		
	}
 }
 
 
}


