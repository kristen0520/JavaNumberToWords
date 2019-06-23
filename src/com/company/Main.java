package com.company;

public class Main {

    public static void main(String[] args) {
	    numberToWords(1092);
	    numberToWords(77);
	    numberToWords(90087632);
    }
    public static String numberToWords(int number){
        String digitString = "" + number;
        String[] digitArr = digitString.split("");
        String words = "";
        String[] wordsArr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        for( int i=0; i<digitArr.length; i++){
            int digit = Integer.parseInt(digitArr[i]);
            words = words + wordsArr[digit] + " ";
        }
        System.out.println(words);
        return words;
    }
}
