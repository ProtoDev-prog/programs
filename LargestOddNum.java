// Largest Odd Number in the String
// "506" -> "5";
class LargestOddNum{
    public static void main(String args[]){
        String str="506";
        String ans="";
        for(int i=str.length()-1 ; i>=0 ;i--){
            if((str.charAt(i)%2)!=0){
                ans=str.substring(0,i+1);
            }
        }
        System.out.println(ans);
    }
}
