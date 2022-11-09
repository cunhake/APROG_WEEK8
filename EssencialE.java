import java.util.Scanner;

public class EssencialE {
    static Scanner ler = new Scanner(System.in);
    static String[] nomesFunc = new String[20];
    static double[] salarioFunc = new double[20];
    static int cont = 0;
    public static void main(String[] args) {
        lerfuncionarios();
        imprimir(calcularMedia());
    }

    public static void lerfuncionarios(){
        nomesFunc[0] = ler.nextLine();
        salarioFunc[0] = ler.nextDouble();
        while(!nomesFunc[cont].equals("end")){
            cont++;
            ler.nextLine();
            nomesFunc[cont] = ler.nextLine();
            if(!nomesFunc[cont].equals("end")){
                salarioFunc[cont] = ler.nextDouble();
            }
        }
    }

    public static double calcularMedia(){
        double soma = 0;
        for (int i = 0; i < cont; i++) {
            soma += salarioFunc[i];
        }
        return soma/cont;
    }

    public static void imprimir(double media){
        System.out.printf("%.1f%n", media);
        for (int i = 0; i < cont; i++) {
            if(salarioFunc[i]<media){
                System.out.println(nomesFunc[i]);
            }
        }
    }
}
