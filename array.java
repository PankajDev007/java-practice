import java.util.*;
class array{
    public static void main(String[] args) {
        int arr[]=new int[20];
        System.out.println("Array is created");
        Scanner sc=new Scanner(System.in);
        System.out.println("How many elements you want to insert ?");
        int ch=sc.nextInt();
        for(int i=0;i<=ch;i++){
            arr[i]=sc.nextInt();
        }

    }
}
