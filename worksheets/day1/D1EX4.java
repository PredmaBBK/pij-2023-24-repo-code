public class D1EX4 {
    //Write a program that asks for a number from the user, then says whether the number is prime or not.
    //Remember that a prime number is a positive number (i.e., it is greater than 0) that is divisible only by
    //1 and itself. You can use the modulo operator (if a % b is zero, then a is divisible by b).

    //Improvement is having the code rerun forever until a specific key is entered by the user.

    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int j = scan.nextInt();
        int i = 2; //Sets the first possible factor from which we should start testing.
        Boolean primeStatus = Boolean.TRUE; //A boolean variable that records whether the current int is prime.
        while(i < j){
            if((j % i) == 0){
                System.out.println("Your number is not prime.");
                primeStatus = Boolean.FALSE;
                break;
            }
            i++;
        }
        if (primeStatus == Boolean.TRUE) {
            System.out.println("Your number is prime.");
        }
    }
}
