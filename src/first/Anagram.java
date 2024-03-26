package first;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("First :");
		String s1= input.nextLine();
		System.out.println("second: ");
		String s2= input.nextLine();
		
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		String str1 = new String(arr1);
		String str2 = new String(arr2);
		if(str1.equals(str2))
		System.out.println("true");
		else
		System.out.println("false");


		
		
		}
	
    static boolean isAnagram(String a, String b) {

        char achar[] = a.toCharArray();
        char bchar[] = b.toCharArray();

        Arrays.sort(achar);
        Arrays.sort(bchar);

        String s1 = new String(achar);
        String s2 = new String(bchar);

        if(s1.equals(s2)){
            return true;
        }else{
            return false;
        }
    }
}


