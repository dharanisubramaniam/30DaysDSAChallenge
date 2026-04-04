

class MergeSortedArrays
{
	public static void mergeOne(int[] nums1, int m, int[] nums2, int n)
	{
		//merge two sorted arrays
		
		int k=m+n;
		int j=0;
		int l=0;
		for(int i=0;i<k;i++){
		   System.out.println("i:"+i);
		   System.out.println("j:"+j);
		    if(nums2[j]<nums1[i] &&j<n){
		        int temp=nums2[j];
		        nums2[j]=nums1[i];
		        nums1[i]=temp;
		        j++;
		    }
		    
		     if(i>(m-1) && l<n){
		         
		         System.out.println("inside if:"+j);
		        nums1[i]=nums2[l];
		        l++;
		    }
		}
		
System.out.println("Ouput:"+Arrays.toString(nums1));
	}
	// working swap version - O(m*n)
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
    if (n == 0) return;
    int i = 0; // Pointer for nums1
    
    while (i < m) {
        if (nums1[i] > nums2[0]) {
            // 1. Swap the elements
            int temp = nums1[i];
            nums1[i] = nums2[0];
            nums2[0] = temp;
            
            // 2. Critical Step: Re-sort nums2 
            // Put the new temp in the correct spot so nums2[0] is always min
            int first = nums2[0];
            int k;
            for (k = 1; k < n && nums2[k] < first; k++) {
                nums2[k - 1] = nums2[k];
            }
            nums2[k - 1] = first;
        }
        i++;
    }
    
    // 3. Finally, copy the remaining sorted nums2 into the end of nums1
    for (int j = 0; j < n; j++) {
        nums1[m + j] = nums2[j];
    }
}
}
