// Third Largest Element

class ThirdLargeElement{
    static int thirdLargestElement(int a[]){
        int first=a[0];
        for(int i=1;i<a.length;i++){
            if(first<a[i]){
                first=a[i];
            }
        }
        int second=Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){
            if(second<a[i] && first>a[i]){
                second=a[i];
            }
        }
        int third=Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++){
            if(third<a[i] && second>a[i]){
                third=a[i];
            }
        }
        return third;
    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        int res=thirdLargestElement(a);
        System.out.println(res);
    }
}
