package com.sree.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.sree.model.Employee;

public class IteratorTest {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(1001, "Martin", 90000.00, "martin.s@sree.com"));
		empList.add(new Employee(1002, "Sean", 95000.00, "sean.m@sree.com"));
		empList.add(new Employee(1003, "Joya", 30000.00, "joya.s@sree.com"));
		empList.add(new Employee(1004, "Harman", 50000.00, "harman.s@sree.com"));
		empList.add(new Employee(1005, "sam", 40000.00, "sam.s@sree.com"));

		Iterator<Employee> iterator = empList.iterator();
		while (iterator.hasNext()) {
			Employee employee = iterator.next();
			if (employee.getSalary() <= 40000.00)
				iterator.remove();
		}

		Iterator<Employee> iterator2 = empList.iterator();
		while (iterator2.hasNext()) {
			Employee employee = iterator2.next();
			System.out.println(employee);
		}
		
		System.out.println("------------------------");
		Iterator<Employee> iterator3 = empList.iterator();
		iterator3.forEachRemaining(System.out::println);
	}

}
