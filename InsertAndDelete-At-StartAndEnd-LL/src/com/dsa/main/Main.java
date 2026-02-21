package com.dsa.main;

import com.dsa.linkedlists.Node;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Node head = new Node(1);
        //insert at start
        Node current=head;

        int val=1;
       while(val<5){
           val+=1;
           insertAtEnd(val,head);
       }
      while(current!=null){

          System.out.println("end current value:"+current.value);
          current=current.next;
      }

      //Node head= insertAtBeginning(val,head);

    }
    public static void insertAtEnd(int val,Node head){
       // System.out.println("value:"+current.value);
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=new Node(val);

    }
    public static Node insertAtBeginning(int val,Node head){
        // System.out.println("value:"+current.value);

        Node newHead = new Node(val);
        newHead.next=head;
        return newHead;
    }

    public static Node deleteLastNode(Node head){
        if(head==null)return null;
        if(head.next == null){return null;}
        else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            if (current.next.next == null) {
                current.next = null;
            }
        }
        return head;
    }

    public static Node deleteFirstNode(Node head){
        if(head == null)return null;
        return head.next;
    }

   

}
