package com.yildirimomer;

import java.util.ArrayList;
import java.util.List;

public class TestQ2 {

    /**Q2
     * the recursive function which takes one integer parameter.
     * returns result list, Takes the remaining integers from dividing the number by 2.
     *
     *
     * Please bearin mind that finding the algorithm
     * needed to generate the output below is the main point of the question.
     * @param x
     * @return array of result
     */
    public static List<Integer> recursiveFunc(int x){
        List<Integer> retVal =new ArrayList<>();
        if (x/2 >= 1 ){
            retVal.add(x);
            retVal.addAll(recursiveFunc(x/2));
        }
        return retVal;
    }

    public static void main(String[] args) {
        // write your code here
        List<Integer> result = recursiveFunc(29);
        result.forEach(p-> System.out.println(p));
        System.out.println("finished");
    }

}
