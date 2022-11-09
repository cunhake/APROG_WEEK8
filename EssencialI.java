import java.util.Scanner;

public class EssencialI {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        String[] array = new String[12];
        array = lerProprietarios();
        String nomePesquisa = ler.nextLine();
        pesquisar(array, nomePesquisa);
    }

    public static String[] lerProprietarios(){
        String[] array = new String[12];
        for (int i = 0; i < 12; i++) {
            array[i] = ler.nextLine();
        }
        return array;
    }

    public static void pesquisar(String[] array, String nomePesquisa){
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(nomePesquisa)){
                escreverPesquisa(nomePesquisa, i);
                flag=true;
            }
        }
        if(!flag){
            System.out.println("Do not live in the building");
        }
    }

    public static void escreverPesquisa(String nome, int posicao){
        int entrada, piso;
        System.out.println("name="+nome);
        if((double)(posicao+1)/4 <=1){
            entrada = 0;
        }else{
            if((double)(posicao+1)/4 <=2){
                entrada = 1;
            }else {
                entrada = 2;
            }
        }
        if(posicao < 4)
        {
            piso = posicao;
        }else{
            if(posicao<8){
                piso = posicao -4;
            }else {
                piso = posicao -8;
            }
        }
        System.out.println("entrance="+entrada);
        System.out.println("floor="+piso);
    }
}
