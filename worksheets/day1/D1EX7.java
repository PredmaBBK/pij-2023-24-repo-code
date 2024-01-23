public class D1EX7 {
    //Write a program that reads three numbers and prints them in order, from lowest to highest.
    public static void main(String[] args) {
        System.out.println("Please enter three numbers: ");
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();
        if ((i < j) && (i < k)) {
            if (j > k) {
                System.out.println("In descending order the numbers are: " + j + ", " + k + ", and " + i);
            } else {
                System.out.println("In descending order the numbers are: " + k + ", " + j + ", and " + i);
            }
        } else if ((i > k) && (i > j)) {
            if (j > k) {
                System.out.println("In descending order the numbers are: " + i + ", " + j + ", and " + k);
            } else {
                System.out.println("In descending order the numbers are: " + i + ", " + k + ", and " + j);
            }
        } else {
            if (j > k) {
                System.out.println("In descending order the numbers are: " + j + ", " + i + ", and " + k);
            } else {
                System.out.println("In descending order the numbers are: " + k + ", " + i + ", and " + j);
            }
        }
    }
}
