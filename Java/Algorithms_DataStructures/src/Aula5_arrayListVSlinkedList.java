import java.util.ArrayList;
import java.util.LinkedList;

public class Aula5_arrayListVSlinkedList {
        public  static void main(String[] args) {


        //para estruturas de dados dinamicas usamos objectos/wrapper classes e nao tipos primitivos como tipo de dado
    /* primitivo                                objecto
    int                                          Integer
    long                                          Long
    String                                         String
    char                                            Character
    double                                          Double
     */
        LinkedList<Integer> linkedlist = new LinkedList<>();
        ArrayList<Integer> arraylist = new ArrayList<>();

        long tempoInicial;
        long tempoFinal;
        long diferenca;

        for (int i = 0; i < 1000000; i++) {
            linkedlist.offer(i);
            arraylist.add(i);
        }

        //**********************LinkedList************
        tempoInicial=System.nanoTime();//retorna o tempo actual da jvm em milissegundos
        //linkedlist.getFirst();
        // linkedlist.get(500000);
        linkedlist.remove(500000);
        tempoFinal=System.nanoTime();
        diferenca=tempoFinal-tempoInicial;
        System.out.println("LinkedList:\t"+diferenca);

        //**********************ArrayList************
        tempoInicial=System.nanoTime();
        //arraylist.get(0);
        //arraylist.get(500000);//neste teste conclui-se que arraylist sao mais rapidas que linkedlist para retornar um elemento via indice
        arraylist.remove(500000);//
        tempoFinal=System.nanoTime();
        diferenca=tempoFinal-tempoInicial;
        System.out.println("ArrayList:\t"+diferenca);
        /*  ArrayList vs LinkedList
            ArrayList sao eficientes para retorno de dados via indice
            LinkedList sao eficientes para insercao e eliminacao de dados


         */


    }
}
