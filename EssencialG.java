import java.util.Scanner;

public class EssencialG {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int n = ler.nextInt();
        int[] array = new int[n];
        array = lerNumeros(n);
        array = inverterArray(array);
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] lerNumeros(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = ler.nextInt();
        }
        return array;
    }


    public static int[] inverterArray(int[] array){
        int[] newArray = new int[array.length];
        int cont = array.length-1;

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[cont];
            cont--;
        }
        return newArray;
    }
}
