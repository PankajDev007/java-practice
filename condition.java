import java.util.*;
class condition{
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        age=sc.nextInt();
        if(age>=18)
            {
                System.out.println("Adult");
            }
            else
                {
                    System.out.println("Not Adult");
                }

    }
}