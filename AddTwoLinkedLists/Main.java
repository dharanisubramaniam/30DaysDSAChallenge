package com.dsa.main;

import com.dsa.linkedlists.Node;


public class Main {

    public static void main(String[] args) {

      //creating the two linkedlists
        Node l1=new Node(2,new Node(4,new Node(3)));
        Node l2=new Node(5,new Node(6,new Node(4)));

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
        Node l3 = addTwoLLOne(l1,l2);
        Node current3 =l3;
        while(current3!=null){
            System.out.println("output"+current3.value);
            current3=current3.next;
        }
    }
    public static Node addTwoLLOne(Node l1,Node l2){
        Node current1=l1;
        Node current2=l2;
        Node l3=new Node(0);
        int total=0;
        int reminder=0;
        int sum=0;
        Node current3 =l3;
        while(current1 != null || current2 !=null || reminder!=0) {
            //corrected version
            //handle the edge cases or else there will be null pointer exception
            int value1= current1!=null? current1.value : 0;
            int value2= current2!=null? current2.value : 0;

            total=current1.value+current2.value+reminder;

            reminder=total/10;
            sum = total%10;

            current3.next=new Node(sum);

            if(current1!=null)current1=current1.next;
            if(current2!=null)current2=current2.next;

            current3=current3.next;


        }
        return l3.next;
    }

    public static Node addTwoLL(Node l1,Node l2){
        //my version
        Node current1=l1;
        Node current2=l2;
        Node l3=new Node(0);
        int sum=0;
        int reminder=0;
        Node current3 =l3;
        while(current1 != null && current2 !=null){
            sum=current1.value+current2.value;
            if(sum>=10){
                sum=sum-10;
                current3.next=new Node(sum);
                reminder++;
            }else{
                current3.next=new Node(sum+reminder);
                reminder=0;
            }

            current1=current1.next;
            current2=current2.next;
            current3=current3.next;
         }
        return l3.next;
    }



  public static Node largestOfTwoLists(Node l1,Node l2){
        Node temp1=l1;
        Node temp2=l2;
        int count1=0;
      int count2=0;
        while(temp1!=null){
            count1+=1;
            temp1=temp1.next;
        }
        while(temp2!=null){
            count2+=1;
            temp2=temp2.next;
        }
        return count1>=count2?l1:l2;
  }



}
