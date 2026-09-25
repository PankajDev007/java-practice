import java.util.*;
class strings{
    public static void main(String[] args) {
        String str="abcd";
        String str2=new String("Pankaj");
        System.out.println(str2);
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first name:");
        str=sc.nextLine();
        System.out.print("Enter last name:");
        str2=sc.nextLine();
        String str3=str+" "+str2;
        System.out.println("Full name="+str3);
    }
}