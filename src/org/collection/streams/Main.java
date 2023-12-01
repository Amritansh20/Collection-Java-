package org.collection.streams;

public class Main {
    public static void main(String[] args) {
//        FunctionalInterface functionalInterface = new FunctionalInterface() {
//            @Override
//            public int add(int a, int b) {
//                return a+b;
//            }
//        };

        FunctionalInterface functionalInterface1 = (int a, int b)->{
            return a+b;
        };
        System.out.println(functionalInterface1.add(2,3));
    }
}

// Is ananymous class ke jagha lambda use krte hai. Another way to represent

