import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class D1EX9 {
    //Read an arbitrarily long sequence of positive numbers from the user, until -1 is entered. At that point,
    //print “Yes” if the numbers were consecutive and increasing and “No” otherwise. For example, the
    //sequences “1,2,3,4,-1” and “5,6,7,8,9,10,11,-1” should lead to the output “Yes”, but “2,3,5,6,7,-1”,
    //“10,9,8,7,-1”, and “1,1,2,3,4,5,-1” should lead to the output ”No”.
    public static void main(String[] args) {
        int last = 0;
        int j = 0;
        boolean Consecutive = TRUE;
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Please enter a number (enter -1 to end).");
        j = scan.nextInt();
        last = j;

        while(last != -1){
            System.out.println("Please enter a number (enter -1 to end).");
            j = scan.nextInt();
            if((j != last + 1) && (j != -1)){
                Consecutive = FALSE;
            }
            last = j;
        }
        if(Consecutive == FALSE){
            System.out.println("The sequence of numbers was not consecutive.");
        } else{
            System.out.println("The sequence of numbers was consecutive.");
        }


    }

}
