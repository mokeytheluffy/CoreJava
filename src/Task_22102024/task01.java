package Task_22102024;

public class task01 {
    public static void main(String[] args) {
        // Reverse the number using for loop.[In- 12345, Out - 54321]
        //Hint --> num/10
        /*
        int rev= 0;
        int rem;
        int num =12345;
        for (; num!=0;num= num/10)  {
            rem = num%10;
            rev = (rev*10)+rem;

            System.out.println(rev);

         */
        int reverse= 0;
        int rem;
        for (int i=12345;i!= 0;) {
            rem =i%10;
            reverse =reverse*10+rem;
            i= i/10;
        }
        System.out.println(reverse);
    }
}

