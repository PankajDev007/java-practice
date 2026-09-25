import java.util.*;
class strings{
    void func(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        String str1;
        String str2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first name:");
        str1=sc.nextLine();
        System.out.print("Enter last name:");
        str2=sc.nextLine();
        String str3=str+" "+str2;
        System.out.println("Full name="+str3);
    }
}