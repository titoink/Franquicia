package franquicia;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner lea = new Scanner (System.in);
         Franquicia fb = new BurguerKing("BK Sta Mónica");
         System.out.println("Pagar: " + fb.calcularTotalFinal(100));

         Franquicia restaurants [] = new Franquicia [3];
         restaurants [0] = new BurguerKing ("BK Circunvalación");
         restaurants [1] = new BarFriday   ("Galerias del Valle");
         restaurants [2] = new Franquicia  ("Franquicia sin nombre", "Sin Comida");


    }

}
