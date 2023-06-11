package primenumber;

public class ArrayPrimeNumber {
// Max and Min Prime Numbers From the Array
	public static void main(String[] args) {
	       
		int[] arr= {5,93,3,31,23,2};
		int min=arr[0],max=0;
		for(int i=0;i<=arr.length-1;i++) {
			boolean flag=true;
			for(int j=2;j<=arr[i]/2;j++) {
				if(arr[i]%j==0) {
					flag=false;
					break;
				}
			}
			
			if(flag==true) {
				if(max<arr[i]) 
					max=arr[i];				
			    if(min>arr[i]) 
					min=arr[i];
			}
						
	}
System.out.println("max prime "+max+"\n"+"min prime "+min);
int sum=max+min;
System.out.println("Sum : "+"\n"+sum);
 }
 }