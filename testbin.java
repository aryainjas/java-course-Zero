//this will be updated 
import java.util.* ;
public class testbin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int toole_adad;
        Array = new int[num];
        //split the number in to its digits
        String num1 = Integer.toString(num);
        String[] num2 = num1.split("");
        toole_adad = num2.length;
        //print 
        /*System.out.println("The binary number is");
        for (int i = 0; i < num2.length; i++) {
            System.out.print(num2[i]);
            //space seperated
            if (i != num2.length - 1) {
                System.out.print(" ");
            }
        }
        */
        for (int i = 0; i < num2.length; i++) {
            System.out.print(num2[i] + "*" + "10^" + (num2.length - i - 1));
            if (i != num2.length - 1) {
                System.out.print("+");
            }
        }
    }
}

