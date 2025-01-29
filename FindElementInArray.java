import java.util.Scanner;

class FindElementInArray{
    public static void main(String args[]){
        int a;
        int arr[]={1,2,3,4,5,6};
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Element to Find :");
        a=scan.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                System.out.println("Element Found At Index : "+i);
                break;
            }
        }
        System.out.println("Not Found");
        
    }
}
