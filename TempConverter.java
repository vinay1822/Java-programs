import java.util.Scanner;

// this program convertes tempreture in Celcius to Farienhiet
public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter a Number:");
        float tempc = input.nextFloat();

        float tempF = (tempc * 9/5) + 32;
        System.out.println(tempF);
    }
}