public class thirdhiest {
    public static void main(String[] args) {
        int arr[]={12,5,65,8,66,21,2,06,60,0,5,648,6,589,8};   
    
    
        int highest=arr[0],secondhighest=arr[0],thirdhiest=arr[0] ;
        int h=arr[0],s=arr[0],t=arr[0];
        
        for(int k:arr){
            if(k>h){
                t=s;
                s=h;
                h=k;
            }
            else if(k<h && k>s){
                t=s;
                s=k;
            }
            else if(k<h && k<s && k>t ){
                t=k;
            }
        }
        System.out.println(h+" "+s+" "+t);
        for(int i:arr){
            if(i>highest && i>secondhighest&& i>thirdhiest){
                thirdhiest=secondhighest;
                secondhighest=highest;
            
                highest=i;
            }
            else if(i<highest && i>secondhighest){
                thirdhiest=secondhighest;
                secondhighest=i;
                System.out.println(secondhighest);
            }
            else if(i<highest && i<secondhighest && i>thirdhiest){
                thirdhiest=i;
                System.out.println(thirdhiest);
            }
        }
    


        System.out.println(highest+" higheset "+ secondhighest+ " second highest "+ thirdhiest+ " third highest");
    
    
    }
}
