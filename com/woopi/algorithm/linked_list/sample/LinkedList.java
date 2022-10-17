package com.woopi.algorithm.linked_list.sample;

/**
 * https://velog.io/@frombozztoang/Java-Linked-List-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0
 */
public class LinkedList {
    	// 첫번째 노드를 가리키는 필드
        private Node head;
        // 마지막 노드를 가리키는 필드
        private Node tail;
        private int size = 0;

        /*
         * 리스트의 맨 처음에 노드를 추가
         */
        public void addFirst(Object input){
            Node newNode = new Node(input); //노드 생성
            
            newNode.next = head; //새로운 노드의 다음 노드로 헤드를 지정
            
            head = newNode; //head를 새로운 노드로 지정 
            size++; 
            
            if(head.next == null)
                tail = head;
        }

        /*
         * 리스트의 맨 마지막에 노드를 추가
         */
        public void addLast(Object input) {
            Node newNode = new Node(input); //노드 생성
            
            if(size == 0) //리스트의 노드가 없는 경우, 첫번째 노드로 추가하는 메소드 사용 
                addFirst(input); 
            else {
                tail.next = newNode; //마지막 노드의 다음 노드로 생성한 노드를 지정
                tail = newNode; //마지막 노드를 갱신 
                size++; 
                }
        }

        private class Node{
            private Object data; //데이터가 저장될 필드 
            private Node next; 	 //다음 노드를 가리키는 필드
            
            public Node(Object input) {
                this.data = input;
                this.next = null;
            }
               
            public String toString() { //노드의 내용 출력
                return String.valueOf(this.data);
            }
        }

}
