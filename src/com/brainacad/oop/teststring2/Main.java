package com.brainacad.oop.teststring2;


public class Main {
    public static void main(String[] args) {

        System.out.println(uniqueChars("Using methods of class String"));
    }
    /*Create static method: uniqueChars(String s), which must take a string as argument
     * and return an array of distinct (unique) chars (char[] ) of the given string.*/
    public static char[] uniqueChars(String s) {

        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char arrayElement : arr) {
            if (s.indexOf(arrayElement) == s.lastIndexOf(arrayElement)) {
                sb.append(arrayElement);
            }
        }
        /*StringBuilder objects cannot call toCharArray, therefore, to return char[] we need to convert
        * StringBuilder to String, and then String to Char[] by calling toCharArray*/
        String resultString = sb.substring(0);
        char[] result = resultString.toCharArray();
        return result;
        /*The easier solution could be if we set the return to void and simply used
        * sout(arrayElement) in if(){}, yet the Lab asks us "return an array of distinct (unique) chars (char[] ),"
        * so I had no choice but to make it ugly*/
    }
}
