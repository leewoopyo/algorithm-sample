package com.woopi.algorithm.linked_list.sample;

/**
 * Linked List를 직접 만들어보기
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("============ START =============");

        LinkedList linkedList = new LinkedList();
        System.out.println(linkedList.toString());

        linkedList.addLast("data_1");
        System.out.println(linkedList.toString());

        linkedList.addLast("data_2");
        System.out.println(linkedList.toString());

        linkedList.addFirst("data_3");
        System.out.println(linkedList.toString());

        System.out.println("============= END ==============");
    }
}

