package col;
import java.util.*;
public class MapEx {
	public static void main(String[] args) {
		//Use of TreeMap Constructor
		Map<Integer,Employee> map =new TreeMap<>(new EmployeeKeyComparator());
		Employee e1 = new Employee(1,"Sujay");
		Employee e2 = new Employee(2,"Sourav");
		Employee e3 = new Employee(3,"Neeraj");
		map.put(1, e1);
		map.put(2,e2);
		map.put(3,e3);
		Employee fetched1 =map.get(1);
		Employee fetched2 =map.get(2);
		Employee fetched3 =map.get(3);
		
		MapEx ex =new MapEx();
		ex.print(map);
		map.remove(2);
		ex.print(map);
	}
	public void printByEntries(Map<Integer,Employee>map) {
		Set<Map.Entry<Integer,Employee>> entries = map.entrySet();
		for(Map.Entry<Integer,Employee>entry:entries) {
			int key=entry.getKey();
			Employee value=entry.getValue();
			System.out.println(value.getName());
		}
	}
	
	public void printbyValues(Map<Integer,Employee>map) {
		Collection<Employee>values=map.values();
				for(Employee e:values) {
					System.out.println(e.getName());
				}
	}
	
	
	public void print(Map<Integer,Employee> map) {
		Set<Integer> keys =map.keySet();
		for(int key :keys) {
			Employee value = map.get(key);
			System.out.println(value.getId()+" "+value.getName());
		}
		System.out.println();
	}

}
