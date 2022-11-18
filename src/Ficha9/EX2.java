package Ficha9;

import java.util.*;

public class EX2 {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(5);
        nums.add(3);
        nums.add(8);
        nums.add(3);

        //a lista é apresentada crua incluindo os duplicados e não ordenada com o ArrayList e com o LinkedList
        nums.forEach(System.out::println);
    }
}
