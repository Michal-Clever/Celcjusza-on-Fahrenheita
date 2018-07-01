import java.util.Scanner;

public class CelsjuszaOnFahrenheita {
    public static void main(String[] args) {

        Scanner stopnie = new Scanner(System.in);
        System.out.println("Witam, program służy do przeliczania stopni Celsjusza na Fahrenheita");
        System.out.println("Podaj stopnie Celcjusza: ");
        int Celcjusza = stopnie.nextInt();
        System.out.println("Stopnie Celcjusza wynoszą: " + Celcjusza);
        double Fahrenheita = Celcjusza * 1.8 + 32;
        System.out.println("Po przeliczeniu stopnie Fahrenheitana wynoszą: " + Fahrenheita);
    }
}
