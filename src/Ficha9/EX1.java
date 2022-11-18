package Ficha9;
import java.util.*;

public class EX1 {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(5);
        nums.add(3);
        nums.add(8);
        nums.add(3);

        //a lista é apresentada por ordem crescente organizada automaticamente pela lista no HashSet e no TreeSet
        //a lista é apresentada pela ordem de entra no LinkedHashSet
        nums.forEach(System.out::println);
    }
}
