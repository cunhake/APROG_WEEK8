import java.util.Scanner;

public class EssencialH {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        String comando, output="";
        int n = ler.nextInt();
        int[] array = new int[n];
        array = lerNumeros(n);
        ler.nextLine();
        comando = ler.nextLine();
        while (!comando.equals("exit")){
            switch (comando){
                case "right":array = right(array);
                    for (int i = 0; i < n; i++) {
                        output += "[" + array[i] + "]";
                    }
                    System.out.println(output);
                    break;
                case "left":array = left(array);
                    for (int i = 0; i < n; i++) {
                        output += "[" + array[i] + "]";
                    }
                    System.out.println(output);
                    break;
            }
            comando=ler.nextLine();
            output="";
        }
    }

    public static int[] lerNumeros(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = ler.nextInt();
        }
        return array;
    }

    public static int[] right(int[] array){

        int[] newArray = new int[array.length];
        newArray[0] = array[array.length-1];

        for (int i = 1; i < array.length; i++) {
            newArray[i] = array[i-1];
        }

        return newArray;
    }

    public static int[] left(int[] array){

        int[] newArray = new int[array.length];
        newArray[array.length-1] = array[0];

        for (int i = 0; i < array.length-1; i++) {
            newArray[i] = array[i+1];
        }

        return newArray;
    }
}
