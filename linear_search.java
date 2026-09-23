import java.util.*;
class linear_search {
    public static void main(String[] args) {
        int arr[] = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements youu want to enter?");
        int ch=sc.nextInt();
        for(int i=0;i<ch;i++){
            System.out.print("Enter element"+i+":");
            arr[i]=sc.nextInt();
        }
        System.out.println("Inserted !!");
        System.out.print("Array = {");
        for(int i=0;i<ch;i++){
            System.out.print(arr[i]);
            if(i<ch-1){
                System.out.print(",");
            }
        }
        System.out.println("}");
        System.out.print("Key for linear search:");
        int key=sc.nextInt();
        boolean found=false;
        for(int i=0;i<ch;i++){
            if(arr[i]==key){
                found=true;
                break;
            }
        }
            if(found){
                 System.out.print("Found");
            }
            else{ 
                System.out.print("Not Found");
            }
        }
}
