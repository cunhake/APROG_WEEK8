import java.util.Scanner;

public class EssencialD {
    static Scanner ler = new Scanner(System.in);
    static int[] frequencias = new int[21];

    public static void main(String[] args) {
        int n;
        n = ler.nextInt();
        int[] array = new int[n];
        array = lerClassificacoes(n);
        calcularFrequencias(array);
        mostrarFrequencias();
    }

    public static int[] lerClassificacoes(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = ler.nextInt();
        }
        return array;
    }

    public static void calcularFrequencias(int[] array){
        for (int i = 0; i < 21; i++) {
            frequencias[i] = 0;
            for (int j = 0; j < array.length; j++) {
                if(i == array[j]){
                    frequencias[i]++;
                }
            }
        }
    }

    public static void mostrarFrequencias(){
        for (int i = 0; i < 21; i++) {
            System.out.println(i +" " + frequencias[i]);
        }
    }
}
