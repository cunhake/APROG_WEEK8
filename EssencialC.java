import java.util.Scanner;

public class EssencialC {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        n = ler.nextInt();
        int[] array = new int[n];
        array = lerNumeros(n);
        if(verificarSequencia(array)){
            System.out.println("always ascending = true");
        }else{
            System.out.println("always ascending = false");
        }
    }
    public static int[] lerNumeros(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = ler.nextInt();
        }
        return array;
    }

    public static boolean verificarSequencia(int[] array){
        for (int i = 1; i < array.length; i++) {
            if(array[i] <= array[i-1]){
                return false;
            }
        }
        return true;
    }
}
