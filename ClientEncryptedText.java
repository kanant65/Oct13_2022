package com.stringtest.bll;

import java.util.Scanner;

import com.string.bll.EncryptedText;
public class ClientEncryptedText {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the text");
		String text= sc.nextLine();
		EncryptedText t = new EncryptedText(text, 10);
	    System.out.println(t.getEncryptedText());
	    System.out.println(t.getDecryptedText(10));
	    t.setKey(15, 20);
	    System.out.println(t.getDecryptedText(10));
	   // System.out.println(t.getDecryptedText(20));
	    sc.close();
	}

}
