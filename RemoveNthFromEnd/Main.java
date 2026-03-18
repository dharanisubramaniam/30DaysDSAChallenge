package com.dsa.main;

import com.dsa.linkedlists.Node;


public class Main {

    public static void main(String[] args) {

        //createList
        Node head = createList(1,6);
        Node current=head;
        while(current!=null){
           // System.out.println(current.value);
            current=current.next;
        }

     Node newList=removeNthNode(head,6);;
       while(newList!=null){
          System.out.println("inside removed list:"+newList.value);
           newList=newList.next;
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


    //remove nth node from list
    public static Node removeNthNode(Node head,int n){
        Node current=head;
        int length=0;
        while(current!=null){
            length++;
           // System.out.println(length);
            current=current.next;
        }
        if(n==length)return head.next;
        System.out.println(length);
        Node current1=head;
        Node prev=null;
        int nNode = length-n;
        int i=1;

        while(current1.next!=null){
            if(i==nNode){
                prev.next=current1.next;
                break;
            }
                i++;
                prev=current1;
                current1=current1.next;
             }
        return head;

        //alternate efficient brute force without using prev;
       // Node temp = head;
       // for(int i = 0; i < L - n - 1; i++) { // This loop won't even run if L=n
       //     temp = temp.next;
       // }
       // temp.next = temp.next.next; // If temp is head, this might skip node 2, not node 1!

    }

    //using two pointer first and second
    public static Node removeNthNodeTwo(Node head,int n){
        //also the dummy node avoids all these if condition as it returns dummy.next at end
        if(head==null)return null;
        if(head.next==null && n==1)return null;
        if(head.next==null && n>1)return head;

        Node first = head;
        Node second=head;
        Node prev=null;
        //when n= 6 first.next becomes null as it hits the end
        while(n>0){
            first=first.next;
            n--;
        }
        //here it fails at first and when it goes out of loop and do prev.next it hits null pointer exception
         while(first.next!=null){
             first=first.next;
             prev=second;
             second=second.next;

         }
         prev.next=second.next;
        return head;
    }
    //efficient version that avoids null pointer exception
    public static Node removeNthFromEnd(Node head, int n) {
        // 1. Create a dummy node that points to head
        Node dummy = new Node(0);
        dummy.next = head;

        Node first = dummy;
        Node second = dummy;

        // 2. Move 'first' so there is a gap of 'n' nodes between first and second
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }

        // 3. Move both until 'first' hits the end (null)
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // 4. 'second' is now exactly BEFORE the node to be deleted
        second.next = second.next.next;

        // 5. Return the actual head (not the dummy)
        return dummy.next;
    }

}
