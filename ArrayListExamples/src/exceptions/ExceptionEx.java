package exceptions;

import col.Employee;

public class ExceptionEx {
	private Employee employee;
	
	public static void main(String[] args) {
		ExceptionEx ex= new ExceptionEx();
		try {
			ex.execute();
		}catch(IncorrectIdException exception) {
			System.out.println("It was Incorrect");
		}catch(Exception e) {
			System.out.println("Spmething went wrong");
		}
		finally {
			System.out.println("I always get exceuted");
		}
		System.out.println("after execute in main");
	}
	
	public void execute() {
		try {
			/*
			  int id = employee.getId();
			  By default exceptions are checked
			  User defined Exceptions are created using Throwable,Exception Class
			  RuntimeExceptions are Unchecked Exception and are created using RuntimeException class
			  Throwable e = new NullPointerException();  //Checked Exception
			 */
			if(employee.getId()<0) {
				RuntimeException e = new IncorrectIdException("Id  can't be negative");
				throw e;
			}
			//System.out.println("after handling Exception");
		}catch( Throwable e) {
			//e.printStackTrace();
			System.out.println("handled Exception");
		}
	}
}
