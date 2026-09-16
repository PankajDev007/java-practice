class rev{
    public static void main(String[] args) {
        int no = 9473;
        int digit;
        while(no<0){
            digit = no%10;
            System.out.print(digit);
            no = no/10;
            no++;

        }

    }
}