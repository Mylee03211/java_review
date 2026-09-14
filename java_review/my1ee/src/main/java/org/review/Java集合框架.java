package org.review;


import java.util.*;


public class Java集合框架 {
    public static void main(String[] args) {
        List<String> string_list = new ArrayList<>();
        string_list.add("hello");
        string_list.add("world");
        for(String item : string_list){
            System.out.println(item);
        }

        System.out.println("===========");
        LinkedList<String> linked_list = new LinkedList<>();
        linked_list.add("hello");
        linked_list.addFirst("world");
        for(int i=0;i<linked_list.size();++i){
            System.out.println(linked_list.get(i));
        }


        System.out.println("===========");
        HashSet<String> hash_set = new HashSet<>();
        hash_set.add("hello");
        hash_set.add("world");
        hash_set.add("hello");
        System.out.println(hash_set);
        Iterator<String> iterator = hash_set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}