package com.woopi.algorithm.linked_list.sample;

/**
 * https://velog.io/@frombozztoang/Java-Linked-List-%EA%B5%AC%ED%98%84%ED%95%98%EA%B8%B0
 */
public class LinkedList {
    // 첫번째 노드를 가리키는 필드
    private Node head;
    // 마지막 노드를 가리키는 필드
    private Node tail;
    //private int size = 0;

    /*
     * 1. 리스트 끝에 노드 추가
     */
    public void addLast (Object input) {
        //노드 생성
        Node newNode = new Node(input);

        //리스트에 head가 없을떄 == 아무 노드도 없다는 뜻이니 newNode가 첫 노드이자 마지막 노드임을 선언한다.
        if (head == null) {
            head = newNode;
            tail = newNode;
        //그게 아니라면, 기존 마지막 노드의 next에 새 노드를 넣고, tail을 새로운 노드로 선언해준다.
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /*
     * 2. 리스트 맨앞에 노드 추가
     */
    public void addFirst(Object input){
        //노드 생성
        Node newNode = new Node(input); 
        
        //새로운 노드의 다음 노드로 헤드를 지정
        newNode.next = head; 
        
        //head를 새로운 노드로 지정 
        head = newNode; 
        
        if(head.next == null)
            tail = head;
    }


    /*
     * 전체 노드 출력 메소드
     */
    public String toString () {
        //아무 데이터가 없을 때
        if (head == null) {
            return "NO DATA !!!!!";
        }

        StringBuilder result = new StringBuilder();
        Node temp = head;

        //출력 결과 append
        while (temp.next != null) {
            //출력 결과를 append
            result.append(temp.data).append(", ");
            //다음 노드를 변수 할당            
            temp = temp.next;
        }
        //마지막 출력 결과 append
        result.append(temp.data);

        return result.toString();
    }

    private class Node{
        private Object data; //데이터가 저장될 필드 
        private Node next; 	 //다음 노드를 가리키는 필드
        
        public Node () {}
        public Node (Object input) {
            this.data = input;
            this.next = null;
        }

        public String toString() {
            return "{" +
                " data='" + data + "'" +
                ", next='" + next + "'" +
                "}";
        }
    }
}
