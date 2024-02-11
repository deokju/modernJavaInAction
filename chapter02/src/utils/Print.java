package utils;

import domain.Apple;

import java.util.List;

public class Print {

    public static<T> void print(String title, List<T> list) {
        System.out.println("===================");
        System.out.print(title);
        for(T t: list) {
            System.out.print("[ ");
            System.out.print(t);
            System.out.print(" ]");
        }
        System.out.println("");

    }
}
