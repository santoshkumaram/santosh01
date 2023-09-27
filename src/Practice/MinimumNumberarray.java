package Practice;

public class MinimumNumberarray {

	public static void main(String[] args) {
		// TODO Auto-generated method 
	int[]arr=new int[] {32,40,10,5,56,3,1,-5,-2,-8};
int min=arr[0];
for(int i=0; i<arr.length;i++) {
	if(arr[i]<min)
		min=arr[i];
}
System.out.println("minimum number present in given array:"+min);

	}

}
