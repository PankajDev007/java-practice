import java.util.*;
class brek{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int no;
        do {
            no=sc.nextInt();
            if(no%10==0) {
                break;
            }
            System.out.println(no);
        }while(no!=0);
    }
}