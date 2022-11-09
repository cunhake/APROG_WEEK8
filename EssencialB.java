import java.util.Scanner;

public class EssencialB {


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] array = new int[10];
        int cont = 0, menor = 999999999, contMenor = 0;

        array[0] = ler.nextInt();

        while(array[cont] > 0 ){
            cont++;
            array[cont] = ler.nextInt();
        }

        for (int i = 0; i < cont; i++) {
            if(array[i]<menor){
                menor = array[i];
                contMenor = 1;
            }else {
                if(array[i] == menor){
                    contMenor++;
                }
            }
        }

        if(cont != 0){
            System.out.println("min=" + menor);
            System.out.println("occurrences=" + contMenor);
        }
    }
}
