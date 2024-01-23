public class D1EX8 {
    //Write a program that reads a (arbitrarily long) sequence of positive numbers. The sequence is ended
    //when the users enters “-1”. At that point, the program must output the highest number in the sequence.
    public static void main(String[] args) {
        int j = 0;
        int last = 0;
        int maxi = 0;
        java.util.Scanner scan = new java.util.Scanner(System.in);

        while(last != -1){
            System.out.println("Please enter a number (enter -1 to end).");
            j = scan.nextInt();
            if (j > maxi){
                maxi = j;
            }
            last = j;
        }
        System.out.println("The largest number entered was: " + maxi);


    }
}
