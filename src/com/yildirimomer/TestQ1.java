package com.yildirimomer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestQ1 {

    /**
     * functionQ1
     * the function that sorts a bunch of words by the number of character “a”s within the word (decreasing
     * order). If some words contain the same amount of character “a”s then you need to sort those words by their
     * lengths.
     *
     * the method consuming array due to given letter count, returning new modified ordered list
     * @param inputArray
     * @return
     */
    public static List<String> functionQ1(List<String> inputArray){
        List<String> retVal = new ArrayList<>();
        List<String> strWithLetter = new ArrayList<>();
        List<String> strWithoutLetter = new ArrayList<>();
        inputArray.forEach(word ->{
            if ( letterCounter('a',word)> 0){
                strWithLetter.add(word);
            }else{
                strWithoutLetter.add(word);
            }
        });
        strWithLetter.sort(new java.util.Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int s1Count = letterCounter('a',s1);
                int s2Count = letterCounter('a',s2);
                if ( s1Count==s2Count ){
                    return s2.length() - s1.length();    // comparision
                }else {
                    return s2Count - s1Count;    // comparision
                }
            }
        });
        strWithoutLetter.sort(new java.util.Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // TODO: Argument validation (nullity, length)
                return  s2.length() - s1.length();// comparision
            }
        });
        strWithLetter.forEach(p-> retVal.add(p));
        strWithoutLetter.forEach(p-> retVal.add(p));
        return  retVal;

    }


    /**
     * the function find count of given letter into the string
     * @param letter
     * @param strWord
     * @return
     */
    public static int letterCounter(char letter, String strWord){
         int retVal= 0;
         for (char let : strWord.toCharArray()) {
             if (let == letter) retVal ++;
         }
         return retVal;
     }

    public static void main(String[] args) {
	// write your code here
        List<String> arrStr = Arrays.asList("aaaasd", "a", "aab", "aaabcd", "ef", "cssssssd", "fdz", "kf", "zc",
                "lklklklklklklklkl", "l" , "asdasd" , "aasd","c");
        List<String> strAr = functionQ1(arrStr);
         strAr.forEach(a-> System.out.println(a));
         System.out.println("finished");

    }

}
