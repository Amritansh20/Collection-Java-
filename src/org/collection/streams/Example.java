package org.collection.streams;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //iterative way
        int sum=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                sum += list.get(i)* list.get(i);
            }
        }
        System.out.println(sum);

        //Decalrative way
        //Sequential stream
        // Sequential is similar to for loop.
        // Same complexity for both iterative and sequential way

       int sum2= list.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                System.out.println("I am inside filter method");
                return integer%2==0;
            }
        }).map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer){
                System.out.println("I am inside map method");
                return integer*integer;
            }
        }).reduce(0, new BinaryOperator<Integer>() {
           @Override
           public Integer apply(Integer integer, Integer integer2) {
               System.out.println("First number is " + integer);
               System.out.println("First number is " + integer2);
               System.out.println("I am inside reduce method");
               return integer+integer2;
           }
       });
       System.out.println(sum2);

       //All methods implement these Functional Interface
        //Using lamda expression instead of ananymous class
       int sum3=list.stream().filter(integer -> integer%2==0).map(integer -> integer*integer).reduce(0,(integer, integer2) -> integer+integer2);
        System.out.println(sum3);
    }
}
