package Ficha9;

import java.util.*;
public class EX3 {

    public static void main(String[] args) {
        int listSize=30000;
        Random rand = new Random();
        TreeMap<Integer,Integer> nums = new TreeMap<>();

        long startTime = System.nanoTime();
        for (int i=0;i<listSize;i++) {
            nums.put(i,rand.nextInt());
        }
        long stopTime = System.nanoTime();
        long putTime=(stopTime-startTime)/1000000;

        startTime = System.nanoTime();
        for (int i=0;i<listSize;i++) {
            System.out.println(nums.get(i));
        }
        stopTime = System.nanoTime();
        long searchTime = (stopTime-startTime)/1000000;
        System.out.println("Preencher a lista demorou: "+putTime+"ms");
        System.out.println("Pesquisar na lista demorou: "+searchTime+"ms");

        //PESQUISA: Aproximadamente 10ms por 100.000 items na lista

        /*
        Hashmap
            Preencher: 19ms
            Pesquisar: 273ms

        Hashtable
            Preencher: 28ms
            Pesquisar: 580ms

        Linkedhashmap
            Preencher: 22ms
            Pesquisar: 371ms

        Treemap
            Preencher: 29ms
            Pesquisar: 376ms

        Melhor a preencher: Hashmap (19ms)
        Pior a preencher Treemap (29ms)

        Melhor a ler: Hashmap (273ms)
        Pior a ler: Hashtable (580ms)
        */
    }
}
