package com.cdk.companies.credit;

import java.util.Arrays;


/* 

Write a class class AlienLanguageTranslator that implements all the funcionality of the given
LanguageTranslator class. You will need to override all the methods given in the LanguageTranslator
interface.

*/
public class AlienLanguageTranslator implements LanguageTranslator{
    	public String fromDefaultLanguage(String languageTokens){
    	    
    	   char [] array= languageTokens.toCharArray();
    	   for(int i=0;i<array.length;i++){
    	       array[i]=(char)(array[i]+3);
    	   }
    	   return new String(array);
    	}
	
	// Translates the language to default language
	    public String toDefaultLanguage(String languageTokens){
	     char [] array= languageTokens.toCharArray();
    	   for(int i=0;i<array.length;i++){
    	        array[i]=(char)(array[i]-3);
    	   }
    	   return Arrays.toString(array);
	    }
	    public static void main(String[] args) {
	    	AlienLanguageTranslator alt=new AlienLanguageTranslator();
	    	System.out.println(alt.fromDefaultLanguage("Java"));;
	    	System.out.println(alt.toDefaultLanguage("Mdyd"));
		}
}
