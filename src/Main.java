import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = null;
        try {
            scan = new Scanner(System.in);
            System.out.println("Enter your age: ");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            scan.nextInt();
        }

    }
}