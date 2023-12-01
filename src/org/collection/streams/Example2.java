package org.collection.streams;

import java.util.Arrays;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        //        "kk", "kajahakakjk", "kajkkkkjhghjkk", "kjhgfdfghkllll"

        // list of string
        // check if the length of string is greater than 10
        // trim it to length 10
        // check if the first and the last char of the string is same then print

        List<String> list = Arrays.asList( "kk", "kajahakakjk", "kajkkkkjhghjkk", "kjhgfdfghkllll");
        List<String> list2= list.stream().map(new Function<String, String>() {

            @Override
            public String apply(String s) {
                if(s.length()>10){
                    return s.substring(0,10);
                }else{
                    return s;
                }
            }
        }).collect(Collectors.toList());
        System.out.println(list2);

        List<String> list3=list.stream().map(x-> x.length()>10 ? x.substring(0,10) : x).filter(x-> x.charAt(0)==x.charAt(x.length()-1)).collect(Collectors.toList());
        System.out.println(list3);
    }
}
