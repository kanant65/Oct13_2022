package com.stringtest.bll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SentenceToWords {

	public static void main(String[] args) {			
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter a String: ");
		String str=sc.nextLine()+" ";		
		List<String> list = new ArrayList<String>(); 		 
		char[] charArray = str.toCharArray(); 		
		String strTemp = ""; 		
		for (int i = 0; i < charArray.length; i++) { 			
			if (charArray[i] != ' ') { 
				strTemp = strTemp + charArray[i]; 
			} 
			
			else { 
				list.add(strTemp); 
				strTemp = ""; 
			} 
		} 
		String[] arr=new String[list.size()];	
		for (int i = 0; i < list.size(); i++) {
         		arr[i] = list.get(i);
		}        		
		for (String k : arr) {
        		System.out.println(k);
		} 
		int n=arr.length;
		System.out.println("Sorted words based on the length of the word are as follows ");
		System.out.println(SentenceToWords.sortStatement(arr, n));		
		sc.close();
	}

	public static String sortStatement(String s[],int n) {
		
		for (int i=1 ;i<n; i++)
	    {
	        String temp = s[i];	        
	        int j = i - 1;
	        while (j >= 0 && temp.length() < s[j].length())
	        {
	            s[j+1] = s[j];
	            j--;
	        }
	        s[j+1] = temp;
	    }
	 String text="";	
	for(int i=0;i<n;i++) {
		text=text+"\n"+s[i];
	}	  
 	 return text;
	}	
}
