class StringCompression {
   public int compress(char[] chars) {
    int write = 0;
    int read = 0;
    int count=0;
    while (read < chars.length) {
        int i=read;
       while(i<chars.length && chars[i] == chars[read]){
              i++;
           
        }
        chars[write]=chars[read];
        count=i-read;
        
        read=i;
        write++;
        if(count>1){
            char[] countDigits=Integer.toString(count).toCharArray();
            for(int j=0;j<countDigits.length;j++){
              chars[write]=countDigits[j];
              write++;
            }
        }
      
    }
    
    return write;
}
}