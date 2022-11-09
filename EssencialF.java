import java.util.Scanner;

public class EssencialF {
    static Scanner ler = new Scanner(System.in);
    static double[] arrayJuros = new double[6];

    public static void main(String[] args) {
        lerjuros();
        double valorDeposito = ler.nextDouble();
        System.out.printf("final value=" + "%.2f%n", calcularValorFinal(valorDeposito));
    }

    public static void lerjuros(){
        for (int i = 0; i < 6; i++) {
            arrayJuros[i] = ler.nextDouble();
        }
    }

    public static double calcularValorFinal(double valorInicial){
        double valorfinal = valorInicial;
        for (int i = 0; i < 6; i++) {
            valorfinal += (valorfinal*arrayJuros[i]);
        }
        return valorfinal;
    }


}
