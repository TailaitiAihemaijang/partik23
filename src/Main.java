import java.util.Scanner;

/**
 * ClassName: Main
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Musteqqim
 * @Create 5/12/2023 7:38 AM
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayi giriniz");
        int a = input.nextInt();
        int basNumber = 0;
        while (a!= 0){
            basNumber += a % 10;
            a /= 10;
        }
        System.out.print("basma sayilar toplami : " + basNumber);

    }
}
