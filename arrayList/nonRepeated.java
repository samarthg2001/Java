

public class nonRepeated {

    public static void main(String[] args) {
        String str="ABCDADC";
        String res="";
        boolean flag=true;
        str=str.toUpperCase();
        for(int i=0;i<=str.length()-1;i++){
            String value=String.valueOf(str.charAt(i));

            for(int j=i+1;j<=str.length()-1;j++){
                 if(value.equals(String.valueOf(str.charAt(j)))){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                res=value;
                break;
            }
            flag=true;
 
        }

System.out.println(res+" first non repeating char in word"+ " "+str);

    }
    
}