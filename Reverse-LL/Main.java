package com.dsa.main;

import com.dsa.linkedlists.Node;


public class Main {

    public static void main(String[] args) {

        //createList
        Node head = createList(1,6);
        Node current=head;
        while(current!=null){
            System.out.println(current.value);
            current=current.next;
        }
     Node reversedList=reverseLinkedList(head);
        while(reversedList!=null){
            System.out.println("inside reversed list:"+reversedList.value);
            reversedList=reversedList.next;
        }

    }
    public static Node createList(int start,int end){
        Node head = new Node(0);
        Node current=head;
        for(int i=start;i<=end;i++){
            current.next=new Node(i);
            current=current.next;
        }
        return head.next;
    }


    //reversing a linkedlist
    public static Node reverseLinkedList(Node head){
        if(head==null)return null;
        Node current=head;
        Node prev=null;
        while(current!=null){
            Node temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;


        }

        return prev;
    }




}
