import java.util.Arrays;

public class Aula8_binarySearch {
    /*
    Para usar este metodo a estrutura deve estar em ordem crescente
    metade da estrutura e eliminada durante o processo de execucao
    eficiente para conjunto de dados grandes
    complexidade o(log n)
     */

    public static void main(String[] args) {
        int array[] = new int[100];
        int alvo = 42;

        for (int i = 0; i < array.length; i++) {
            array[i]=i;

        }

       // int index= Arrays.binarySearch(array,alvo);binarySearch pode ser invocado importando a biblioteca util.Arrays, se o alvo nao for encontrado retorna -1

        int index=binarySearch(array,alvo);

        if(index==-1){
            System.out.println(alvo+ " nao encontrado");

        }else{
            System.out.println("Elemento encontrado no indice: "+index);
        }

    }
    private static int binarySearch(int array[],int alvo){
        int  indiceInicial=0;
        int indiceFinal=array.length-1;
        while (indiceInicial<=indiceFinal){
            int centro=indiceInicial+(indiceFinal-indiceInicial)/2;//formula para encontrar o indice central
            int valor=array[centro];
            System.out.println(" valor no indice central: "+valor);
            if(valor<alvo)indiceInicial=centro+1;//nao usamos {} se a condicao so tiver uma linha
            else if(valor>alvo) indiceFinal=centro-1;
            else return centro;
        }
        return -1;
        /*
        enquanto o indiceIncial <= inidceFinal encontraremos o centro, se o valor no centro for menor que o alvo indiceInicial=centro+1;   o valor no centro for maior que o alvo indiceFinal=centro-1; caso contrario o alvo foi achado

         */

    }



}
