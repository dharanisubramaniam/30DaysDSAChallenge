class TrappingRainWater {
    public int trap(int[] height) {
        int n=height.length;
		int i=0;
		int j=0;
		int max=0;
		int potential=0;
		int output=0;
		while(i<n){
		    while(height[i]<height[j] && height[i]<max){
		        potentaial+=(max-height[i]);
		        i++;
		        j++;
		    }
		    while(height[i]>height[j] && height[i]<max){
		        potentaial+=(max-height[i]);
		        i++;
		        j++;
		    }
		     if(height[i]>max){
		        max=height[i];
		        output=output+potentaial;
		        potential=0;
		       
		    }
		}
      return output;
    }
}