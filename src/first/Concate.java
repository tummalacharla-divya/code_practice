package first;

import java.util.Scanner;

public class Concate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		double j=3.0;
		String s1="Conac";
		Scanner sc=new Scanner(System.in);
		
		int i1=sc.nextInt();
		Scanner sca=new Scanner(System.in);
		double j1=sc.nextDouble();
		String s2=sca.nextLine();
		System.out.println(i+i1);
		System.out.println(j+j1);
		System.out.println(s1+s2);
	}

}
