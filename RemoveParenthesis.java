class RemoveParenthesis{
    public static void main(String ags[]){
        String str="(()())(())";
        String ans="";
        int oCount=0;
        int cCount=0;
        int start=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='('){
                oCount++;
            }
            else if(c==')'){
                cCount++;
            }
            if(oCount==cCount){
                ans=ans+str.substring(start+1,i);
                start=i+1;
            }
        }
        System.out.println(ans);
    }
}
