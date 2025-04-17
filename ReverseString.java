// Reverse Words in the String
//"Hi i am Akash" -> "Akash am i Hi"
import java.util.regex.Pattern;
class Main{
    public static void ReverseString(String ags[]){
        Pattern pat=Pattern.compile("\\s");
        String str="Hi i am Akash";
        String ans="";
        String temp[]=pat.split(str);
        for(int i=0;i<temp.length;i++){
            if(i==temp.length-1){
                ans=temp[i]+ans;
            }
            else{
             ans=" " + temp[i]+ans;   
            }
        }
        System.out.println(ans);
    }
}
