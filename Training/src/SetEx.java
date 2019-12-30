
import java.util.*;

//import collections.IntegerComparator;

public class SetEx {
	
	public void print(Set<Employee> set) {
		for(Employee e:set) {
			//Employee e=(Employee)o;
			System.out.println(e.getId() +" "+e.getName());
		}
	}
	public static void main(String[] args) {
		Employee e1=new Employee(1,"Maiti");
		Employee e2= new Employee(2,"jimmy");
		Employee e3=new Employee(3,"Satya");
		Employee e4= new Employee(1,"Maiti");
		boolean same=e1==e4;
		System.out.println("e1 and e2 same ="+same);
		boolean equal = e1.equals(e4);
		System.out.println("e1.equals(e2) = "+equal);
		
		Comparator<Employee> comparator = new EmployeeComparator();
		//set.sort(comparator);
		Set<Employee> set = new TreeSet<Employee>(comparator);
		boolean added = set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		System.out.println("size"+set.size());
		System.out.println("contains : "+set.contains(e2));
		SetEx ex = new SetEx();
		ex.print(set);
		//System.out.println("removed "+set.remove(2));
		//ex.print(set);
	}
}