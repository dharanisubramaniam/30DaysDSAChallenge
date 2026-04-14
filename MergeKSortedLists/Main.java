package com.dsa.main;

import com.dsa.linkedlists.Node;

import java.util.ArrayList;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {

         Node head1= new Node(1,new Node(4,new Node(5)));
        Node head2= new Node(1,new Node(3,new Node(4)));
        Node head3= new Node(2,new Node(6));
        Node[] lists={head1,head2,head3};
        Node result=mergeKListsArrayList(lists);
        Node current=result;
        while(current!=null){
            System.out.println("result value:"+current.value);
            current=current.next;
        }
    }

    public static Node mergeKLists(Node[] lists){
        if(lists.length<1)return null;
       Node output=lists[0];
        for(int i=1;i<lists.length;i++){
            Node current=lists[i];
            if(lists[i] !=null){
                while(current.next!=null && output.next!=null){
                    Node temp=current.next;
                    Node temp2=output.next;
                    if(output.value <= current.value){
                        System.out.println("1:output inside less condition"+output.value);
                        current.next=output;
                        output=output.next;
                        Node output1=output;
                        while(output1!=null){
                            System.out.println("5:output value inside while"+output1.value);
                            output1=output1.next;
                        }
                    }else{
                        output.next=current;
                        output.next.next=temp2;
                    }
                    current=temp;
                    output=temp2;
                }
                if(output.next!=null){output.next=current;}
                if(current.next!=null){current.next=output;}

            }
        }

        return output;
    }

    //using array list
    public static Node mergeKListsArrayList(Node[] lists){
        if(lists.length<1){return null;};
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            Node current=lists[i];
            if(lists[i]!=null) {
                while (current != null) {
                    list.add(current.value);
                    current=current.next;
                }
            }
        }
        Collections.sort(list);
        Node head=new Node(0);
        Node current=head;
        for(int i:list){
           current.next = new Node(i);
            current=current.next;
        }
        return head.next;
    }
}
