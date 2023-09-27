package Practice;

import java.util.Arrays;

public class Sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a_array1= {15,25,10,45, 64,38};
		String []b_array2= {"watermelon","apple","mango","banana","pinaple","orange"};
		
		System.out.println("original numeric array:"+Arrays.toString(a_array1));
		Arrays.sort(a_array1);
		System.out.println("stored numeric array:"+Arrays.toString(a_array1));
		
		System.out.println("original string array:"+Arrays.toString(b_array2));
		Arrays.sort(b_array2);
		System.out.println("stored string array:"+Arrays.toString(b_array2));
		
		

	}

}
