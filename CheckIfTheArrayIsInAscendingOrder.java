import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayInAscendingOrder
{
	public static void main (String[] args) throws java.lang.Exception
	{
	//program to check if the array is in ascending 
	int[] num={8,6,0,90};
	if(num.length<1){
	    System.out.println("Invalid array size");
	}
	//logic
	//In loop check every next element is greater then the previous element
    //if not return false
    boolean isAscending =true;
    for(int i=0;i<num.length;i++){
        if(num[i]>num[i+1]){
       isAscending=false;
       break;
            
        }
    }
    if(isAscending){
    System.out.println("True: The array is in ascending order");
    }else{
        System.out.println("False: The array is not in ascending order");
    }
	
	//using sorting
		// check if an array is sorted
		int[] input={4,8,3,0,2};
		int[] arr={4,8,3,0,2};
		int temp=0;
		for(int i=0;i<arr.length;i++){
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[j]<arr[i]){
		            temp=arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
		        }
		    }
		   
		}
		System.out.println("Sorted array:"+Arrays.toString(arr));
		boolean result=false;
		Arrays.equals(input,arr);
		if(result){
		    System.out.println("The given array is sorted");
		}else{
		    System.out.println("The given array is not sorted");
		}

	}
}
