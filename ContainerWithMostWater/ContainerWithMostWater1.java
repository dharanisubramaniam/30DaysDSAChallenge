class ContainerWithMostWater {
    public int maxArea(int[] arr) {
        int i=0;
		int j=arr.length-1;
		int area=0;
		int finalArea=0;
		
		while(i<j ){
		    int smallerElement = arr[i]<=arr[j]?arr[i]:arr[j];            
                area=smallerElement*(j-i);
               if(area>finalArea){
		            finalArea=area;
		        }
		   if(arr[i]<arr[j]){
		       i++;
		   }else{
		       j--;
		   }
		    
		}
        return finalArea;
    }
}