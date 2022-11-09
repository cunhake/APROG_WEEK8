import java.util.Scanner;

public class EssencialA {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        n = ler.nextInt();
        double[] array = new double[n];
        array = lerClassificacoes(n);
        System.out.printf("average=" + "%.1f%n", calcularMedia(array));
        System.out.println("failures=" + contarReprovados(array));
    }

    public static double[] lerClassificacoes(int n){
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
           array[i] = ler.nextDouble();
        }
        return array;
    }

    public static double calcularMedia(double[] array){
        double soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma = soma + array[i];
        }
        double media = soma / array.length;

        return media;
    }

    public static int contarReprovados(double[] array){
        int contReprovados = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 10){
                contReprovados++;
            }
        }
        return contReprovados;
    }
}
