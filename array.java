import java.util.*;
class array{
    public static Scanner sc=new Scanner(System.in);
    public static int arr[]=new int[20];
    public static void create(){
        System.out.println("Array is created");
    }
    public static void insert(){
        for(int i=0;i<=arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void main(String[] args) {
        create();
        System.out.println("How many elements you want to insert ?");
        int ch=sc.nextInt();
        for(int j=0;j<ch;j++){
            System.out.println("Enter element"+j);
            insert();
        }

    }
}
