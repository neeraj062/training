
public class CalcMain {
	
	public void print(Employee[] store) {
		
		for (Employee e : store) {
			System.out.println(e.getName()+" " + e.getBalance());
			boolean isManager = e instanceof Manager;
			if(isManager) {
				Manager m = (Manager) e;
				System.out.println("Manager :"+m.getName());
				Employee []managedEmployee = m.getManagedDetails();
				System.out.println("Manging the below Employees :");
				for(Employee managed: managedEmployee) {
					if(managed !=null)
						System.out.println(managed.getName()+ " " + managed.getBalance());
				}
			}
		}
	}

	public static void main(String[] args) {
	
		
		Employee store[] = new Employee[3];
		
		store[0]=new Employee(1,"Aman");;
		store[1]=new Employee(2,"Dhruv");;
		//store[2]=new Employee(3,"Vishal");
		
		
		Manager e= new Manager(4,"Manish");
		
		store[2]=e;
		
		store[0].addSalary(200);
		store[1].addSalary(300);
		store[2].addSalary(400);
		
		e.addEmployees(store[1]);
		e.addEmployees(store[0]);
		
		CalcMain emp = new CalcMain();
	
		emp.print(store);
	}

}
