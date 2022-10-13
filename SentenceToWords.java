package com.stringtest.bll;
import java.util.Scanner;


public class SentenceToWords {
	static void sort(String[]s,int n) {
		for(int i=1;i<n;i++) {
			String temp=s[i];
			int j=i-1;
			while(j>=0 && temp.length() <s[j].length()) {
				s[j+1]=s[j];
				j--;
			}
			s[j+1]=temp;
		}
	}
		
		static void PrintString(String []s,int n) {
			for (int i=0; i<n; i++)
		        System.out.print(s[i]+" ");
		}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// User message.
		System.out.println("Enter a sentence : ");
		String sentence = sc.nextLine();
		
		//Break up the sentence into words and display
		String[] words = sentence.split(" ");
		int n=words.length;
		sort(words,n);
		PrintString(words,n);
		sc.close();
	}

}
