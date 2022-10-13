package com.stringtest.bll;
import java.lang.*; 
import java.io.*; 
import java.util.*;
import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter a string : ");
		String str = sc.nextLine();//scan value and store it.
		System.out.println("Origional string : "+str);
		

		reverse(str);
		char charArray[] =reverse(str);
		for(char c:charArray) {
		System.out.print(c);
		}
		
		sc.close();
	}
	public static char[] reverse(String str) {
	
        char[] temparray = str.toCharArray(); 
        int left, right = 0; 
        right = temparray.length - 1; 
        char ch[] =new char[str.length()];
        for (left = 0; left < right; left++, right--) { 
            
            char temp = temparray[left]; 
            temparray[left] = temparray[right]; 
            temparray[right] = temp;
            
        }
        
        return temparray;
	}
	
}

