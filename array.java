import java.util.*;
class array{
    public static int arr[]=new int[20];
    public static Scanner sc=new Scanner(System.in);
    public static void insert(){
        System.out.print("How many elements you want to insert ?");
        int ch=sc.nextInt();
        for(int i=1;i<=ch;i++){
            System.out.print("Enter element"+i+":");
            arr[i]=sc.nextInt();
        }
        System.out.println("Inserted !!");
    
    }
    public static void display(){
        System.out.println("Array is:");
        for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        insert();
        display();
    }
}
