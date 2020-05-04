package p0504;

import java.util.Scanner;

public class E26 {

	public static void main(String[] args) {
	 Scanner s =new Scanner(System.in);
	     
	 	int n1,i;
		System.out.print("몇개의 *을 입력할까요? : ");
		n1=s.nextInt();
		
		if (n1>=1){
		for(i=1;i<=n1;i++){
			System.out.print("*");
		}
		
		System.out.print("\n");
		}
		s.close();
	}

}
