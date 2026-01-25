public class missingNumber {
    
    public static int[] plusOne(int[] digits) {
        String value="";
        for(int i:digits){
   value+=i;
        }
        int n = Integer.parseInt(value);
        n++ ;
       value=Integer.toString(n);
       int len=value.length();
      char c;
      int singledigit;
      int[] arrayName = new int[len];
           for(int i=0;i<len;i++){
           c=value.charAt(i);
           singledigit=c-'0';

           arrayName[i]=singledigit;
       }    
   return arrayName ;   
       }
   
    public static void main(String[] args) {
        

//        int [] num={9,8,7,6,5,4,3,2,1,0};
  //      int[] solution=plusOne(num);
    //    for(int i:solution){System.out.println(i);}
    System.out.println(10%10);
    
    }
}
