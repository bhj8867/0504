package p0504;

import java.util.Scanner;

public class E27 {

	public static void main(String[] args) {
	Scanner s=new Scanner (System.in);
	int n1;
	System.out.print("몇개의 *표시? : ");
	n1=s.nextInt();
	int i=1;
	if (n1>=1){
	while(i<=n1){
	System.out.print("*");
		i++;	
	}
	System.out.print("\n");
	}
	System.out.print("줄바꿈 test");
	s.close();
	}

}
