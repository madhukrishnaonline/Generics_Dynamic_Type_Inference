package com.generics;

import java.util.ArrayList;
import java.util.Date;

public class App 
{
	public <T> T showMethods(Class<T> clazz) throws Exception
	{
		return (T) clazz.getDeclaredConstructor(new Class[] {}).newInstance();
	}
	
	public <T extends Person> T showMethods1(Class<T> clazz) throws Exception
	{
		return (T) clazz.getDeclaredConstructor(new Class[] {}).newInstance();
	}
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception 
	{
		System.out.println("=====Not Type Safe Hierarchy======");
		App app = new App();
		Student student = app.showMethods(Student.class);
		System.out.println(student);
		Employee employee = app.showMethods(Employee.class);
		System.out.println(employee);
		Date date = app.showMethods(Date.class);
		System.out.println(date);
		ArrayList li = app.showMethods(ArrayList.class);
		System.out.println(li);
		
		System.out.println("=====Type Safe Hierarchy======");
		Student student2 = app.showMethods1(Student.class);
		System.out.println(student2);
		Employee employee2 = app.showMethods1(Employee.class);
		System.out.println(employee2);
		/*Date date2 = app.showMethods1(Date.class);
		System.out.println(date2);*/
	}
}//class