// Longest Common Prefix
// ["gee","geeksfor","geez"] -> "gee"
import java.util.Arrays;
class Main{
    public static void LongestPrefix(String args[]){
        String strArr[]={"gee","geesfor","geez"};
        Arrays.sort(strArr);
        String first=strArr[0];
        String last=strArr[strArr.length-1];
        String ans="";
        int minLength=Math.min(first.length(),last.length());
        int i=0;
        while(i<minLength && first.charAt(i)==last.charAt(i)){
            i++;
        }
        ans=first.substring(0,i);
        System.out.println(ans);
    }
}
