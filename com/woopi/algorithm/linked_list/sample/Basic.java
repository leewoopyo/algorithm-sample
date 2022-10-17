package com.woopi.algorithm.linked_list.sample;

/**
 * Linked List를 직접 만들어보기
 */
public class Basic {
    //맨 처음 노드 정보
    private static Node head;
    //맨 끝 노드 정보
    private static Node tail;

    public static void main(String[] args) {
        //노드 생성
        Node node1 = new Basic().new Node("value1");
        Node node2 = new Basic().new Node("value2");

        //노드 연결 (node1의 포인터에 node2의 데이터를 연결)
        //node1.setNext(node2);

        //리스트를 읽기 위해서는 맨 앞의 노드의 정보는 알고 있어야 한다.
        //가장 앞의 주소는 head 변수로서 세팅 해 줌
        head = node1;
        tail = node2;

        System.out.println(head);
        System.out.println(tail);

        add("1111");
        
    }

    /**
     * Linked List의 맨 끝에 노드를 추가 하는 메소드
     */
    public static void add (String data) {
        //노드 생성
        Node newNode = new Basic().new Node(data); 

        // #1 tail 정보가 있을경우
        if (head.getData().isEmpty()) { //리스트의 노드가 없는 경우, 첫번째 노드로 추가하는 메소드 사용 
    	    head = newNode;
            tail = newNode;
        } else {
            System.out.println(tail);
    	    tail.next = newNode; //마지막 노드의 다음 노드로 생성한 노드를 지정
            tail = newNode; //마지막 노드를 갱신 
            System.out.println(tail);
            System.out.println(head);
            // size++; 
    	}
        // #2 tail 정보가 없을경우
    }

    /**
     * Inner Class로 노드를 생성
     */
    public class Node {
        private String data;
        private Node next;

        public Node () {}
        public Node (String data) {
            this.data = data;
        }
        public Node (String data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return "{" +
                " data='" +  getData () + "'" +
                ", next='" + getNext () + "'" +
                "}";
        }

        public String getData () {
            return this.data;
        }

        public void setData (String data) {
            this.data = data;
        }

        public Node getNext () {
            return this.next;
        }

        public void setNext (Node next) {
            this.next = next;
        }
    }
}

