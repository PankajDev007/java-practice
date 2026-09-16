class rev{
    public static void main(String[] args) {
        int no = 9473;
        while(no<0){
            int digit = no%10;
            System.out.print(digit);
            no = no/10;
            no++;

        }
        System.out.println();

    }
}