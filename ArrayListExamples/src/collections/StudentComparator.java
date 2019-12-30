package collections;

import java.util.Comparator;

public class StudentComparator implements comparator<Student> {
	
	public int comapare(Student o1,Student o2) {
		if(o1.getId > o2.getId)
			return 1;
		if(o2.getId() > o1.getId)
			return -1;
		return 0;
	}
}
