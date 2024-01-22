public class D1EX6 {
    //Write a program that requests two positive numbers from the user and then outputs the quotient and
    //the remainder, e.g., if the user enters 7 and 3, your program should output something like “7 divided
    //by 3 is 2, remainder 1”. You cannot use the “/” or “%” operators.
    public static void main(String[] args) {
        System.out.println("Please enter a positive number: ");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int j = scan.nextInt(); //This is the numerator
        System.out.println("Please enter another positive number: ");
        int k = scan.nextInt(); //This is the denominator
        int jOri = j;

        if((j<0) || (k<0)){
            System.out.println("You have entered a negative number. >:|");
        }else{
            int carry = 0;
            int remainder = 0;
            int runTot = 0;
            while(j > k){
               j = j - k;
               carry++;
            }
            remainder = j;
            System.out.println(jOri + " divided by " + k + " is equal to " + carry + " with remainder " + remainder);
        }
    }
}
