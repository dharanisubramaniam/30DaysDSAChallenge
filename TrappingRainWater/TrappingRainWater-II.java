class Solution {
    public int trap(int[] height) {
        	int n=height.length;
		int i=0;
		int j=n-1;
		int iMax=0;
		int jMax=0;
		int output=0;
		while(i<j){
		    if(height[i]<height[j]){
		        if(height[i]>=iMax){
		            iMax=height[i];
		           
		        }else{
		            output+=iMax-height[i];
		        }
		        i++;
		    }else{
		        if(height[j]>=jMax){
		            jMax=height[j];
		        }else{
		            output+=jMax-height[j];
		        }
		        j--;
		    }
		}
        return output;
    }
}