package com.yildirimomer;
import java.util.*;

/**
 * Created by OMER YILDIRIM on 03.20.2021
 */

public class TestQ3 {

    /**Q3
     *Write a function which takes one parameter as an array/list. Find mostrepeated data within given array. Test
     *with different datasets.
     *
     * The function  finds most repeated data within the given data list.
     *
     * @param stringList
     * @return
     */
    public static String findMostRepeatedData(List<String> stringList){
       try {
           if (stringList.isEmpty()) return "";
           Map<String,Integer> stringMap = new HashMap<String, Integer>();
           for (String str : stringList) {
               if (stringMap.containsKey(str)){
                   stringMap.put(str, stringMap.get(str) + 1);
               }else {
                   stringMap.put(str,1);
               }
           }
           Optional<Map.Entry<String, Integer>> maxEntry = stringMap.entrySet()
                   .stream()
                   .max(Comparator.comparing(Map.Entry::getValue));
           return maxEntry.get().getKey();

       }catch (Throwable e){
           e.printStackTrace();
           return "";
       }
    }

    public static void main(String[] args) {
        // write your code here
        List<String> arrayOfStr = Arrays.asList("pie","pie","pie","apple","pie","apple","red","red","redkit","red","redkit","redkit","redkit");
        String result = findMostRepeatedData(arrayOfStr);
        System.out.println(result);
        System.out.println("finished");
    }


}