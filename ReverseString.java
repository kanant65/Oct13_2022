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
		
		
		sc.close();
	}
	public static void reverse(String str) {
	
        char[] temparray = str.toCharArray(); 
        int left, right = 0; 
        right = temparray.length - 1; 
  
        for (left = 0; left < right; left++, right--) { 
            
            char temp = temparray[left]; 
            temparray[left] = temparray[right]; 
            temparray[right] = temp; 
        } 
  
        for (char c : temparray) 
            System.out.print(c); 
        System.out.println(); 
		}
	}

