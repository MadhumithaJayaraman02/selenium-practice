package Shipment;

public class Fibonacci {
//	public static void main(String[] args) {
//		 int a=0,b=1,c=10,sum=0;
//		 for(int i=0;i<c;++i) {
//			 System.out.println(a + " ");
//			 sum=a+b;
//			 a=b;
//			 b= sum;
//		
//		 }
//		
	
	public static void main(String[] args) {
		int a=0, b=1, sum=0;
		for(int i=0; i<10; ++i) {
			System.out.println(a);
			sum =a+b;
			a=b;
			b=sum;
			
		}
		 
	}
}