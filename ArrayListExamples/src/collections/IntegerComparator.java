package collections;
import java.util.Comparator;

public class IntegerComparator implements Comparator<Integer>{
	
	@Override
	public int compare(Integer num1,Integer num2) {
		
		//int num1=(int)o1;
		//int num2=(int)o2;
		return num2-num1;
		/*if(num1>num2) {
			return 1;
		}
		if(num1<num2) {
			return -1;
		}
		return 0;*/
	}

}



