package Shipment;

public class reverse {
//public static void main (String[] args) {
//	String name ="Madhu";
//	String reverse;
//	for(int i=name.length()-1;i>=0;i--) {
//		char a = name.charAt(i);
//		System.out.print(a);
//	}
//
//
//}
//}
// public static void main(String[] args) {
//	 String a = "Madhu";
//	 StringBuilder b = new StringBuilder();
//	 b.append(a);
//	 b.reverse();
//	 System.out.println(b);
// }
 
	public static void main(String[] args) {
		int row = 6;
		int i,j;
		for( i=0; i<5; i++) {
			for( j=2*(row-i); j>=0; j--) {
				System.out.print(" ");
			}
			for(j=0; j<=i ;j++) {
			System.out.print("* ");
		}
			System.out.println();
		}
	}
}