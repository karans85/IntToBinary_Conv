import java.lang.*;
import java.util.Scanner;

/*
 * This Java source file was auto generated by running 'gradle buildInit --type java-library'
 * by 'Karanjit_Singh' at '13/2/17 11:41 AM' with Gradle 3.1
 *
 * @author Karanjit_Singh, @date 13/2/17 11:41 AM
 */
public class IntToBinary {

    public String toBinaryString(int i) {
        return Integer.toBinaryString(i);
    }

    public static void main (String[]args){

        Scanner bi = new Scanner(System.in);
        System.out.println("Please enter the number to be converted:");
        int numb1 = bi.nextInt();
        IntToBinary i1 = new IntToBinary();
        System.out.println(i1.toBinaryString(numb1));


    }
}
