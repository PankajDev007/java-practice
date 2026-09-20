import java.util.*;
class array{
    public static void main(String[] args) {
        int arr[]=new int[20];
        System.out.println("Array is created");
        Scanner sc=new Scanner(System.in);
        System.out.print("How many elements you want to insert ?");
        int ch=sc.nextInt();
        for(int i=1;i<=ch;i++){
            System.out.print("Enter element:"+i);
            arr[i]=sc.nextInt();
        }
        System.out.println("Inserted !!");
    }
}
