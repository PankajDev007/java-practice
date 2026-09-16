import java.util.*;
class continuee{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    
        do {
           int no=sc.nextInt();
            if(no%10==0) {
                continue;
            }
            System.out.println(no);
        }while(true);
    }
}