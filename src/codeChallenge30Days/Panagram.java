package codeChallenge30Days;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.lang.*;

public class Panagram {
    public static void main(String[] args) {
    	System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
    }

	private static String pangrams(String s) {
		// TODO Auto-generated method stub

		char[] c = s.replace(" ", "").toLowerCase().toCharArray();
        int len=c.length;
        if(len<26){
            return "not pangram";
        }
        for(int i=0;i<len;i++){
            int j=c[i];
            if(j<97||j>122){
                return "not pangram";
            }
        }
        return "pangram";
        
    
	}
}

