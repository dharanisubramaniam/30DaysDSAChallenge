package com.dsa.main;

import com.dsa.linkedlists.Node;


public class Main {

    public static void main(String[] args) {

      //creating the two linkedlists
        Node l1=new Node(1,new Node(4,new Node(5)));
        Node l2=new Node(2,new Node(3,new Node(6)));

        Node current1=l1;
        Node current2=l2;
        //assuming both lists are in same length
        while(current1 != null ){
            //System.out.println("current 1:"+current1.value);

            current1=current1.next;

        }
        while(current2!=null){
            //System.out.println("current 2:"+current2.value);
            current2=current2.next;
        }
        Node l3 = zipTwoLL(l1,l2);
        Node current3 =l3;
        while(current3!=null){
            System.out.println("output"+current3.value);
            current3=current3.next;
        } 
    }

    public static Node mergeTwoLL(Node l1,Node l2){
        //
        Node l3 = new Node(0);
        Node current1=l1;
        Node current2=l2;
        Node current3=l3;
        while(current1!=null && current2!=null){
            //to be efficient remove the if case and check after the while loop once and all
            /**if(current1==null){
                current3.next=current2;
                return l3.next;
            }
            if(current2==null){
                current3.next=current1;
                return l3.next;
            }**/
            if(current1.value<current2.value){
                current3.next=current1;
                current1=current1.next;
            }else{
                current3.next=current2;
                current2=current2.next;
            }
            current3=current3.next;
        }
        current3.next=(current1!=null)?current1:current2;
        return l3.next;
    }

    public static Node zipTwoLL(Node l1,Node l2){
        Node l3 = new Node(0);
        Node current1=l1;
        Node current2=l2;
        Node temp1;
        Node temp2;
        Node current3=l3;
        while(current1!=null && current2!=null){
           /** if(current1==null){
                current3.next=current2;
                return l3.next;
            }
            if(current2==null){
                current3.next=current1;
                return l3.next;
            }**/
            temp1=current1.next;
            temp2=current2.next;
            //making the next nodes null
           // current1.next=null;
           // current2.next=null;
            current3.next=current1;
            current3.next.next=current2;

            current1=temp1;
            current2=temp2;

            //jump to next 2 nodes
            current3= current3.next.next;


        }
        current3.next=(current1!=null)?current1:current2;
        return l3.next;
    }


}
