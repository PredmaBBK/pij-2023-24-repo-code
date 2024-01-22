public class D1EX5 {
    //Write a program that requests two numbers from the user and then outputs their product. You cannot use the “*” operator.
    //Can you make your program work correctly also if one or both numbers are negative?

    //This program works correctly but is highly repetitive. What ways are there of reducing the amount of code?
    //Could always take the absolute value of an input but record whether or not it needs to be flipped at the end
    //with a boolean multiplied by minus one. This still requires multiple if statements to ascertain
    //which of the inputs is negative.

    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Please enter a number: ");
        int j = scan.nextInt();
        System.out.println("Please enter another number: ");
        int k = scan.nextInt();
        int i = 0;
        int carry = 0;
        if(j < 0) {
            if (k < 0) {
                //Both numbers negative
                while (i < (-k)) {
                    carry = carry + (-j);
                    i++;
                }
            } else {
                //j negative and k positive
                while (i < k) {
                    carry = carry + (-j);
                    i++;
                }
                carry = -carry;
            }
        }
        else {
            if (k < 0) {
                //j positive and k negative
                while (i < (-k)) {
                    carry = carry + j;
                    i++;
                }
                carry = -carry;
            } else {
                //both positive
                while (i < k) {
                    carry = carry + j;
                    i++;
                }
            }
        }
        System.out.println("The product of your numbers is: " + carry);
    }
}
