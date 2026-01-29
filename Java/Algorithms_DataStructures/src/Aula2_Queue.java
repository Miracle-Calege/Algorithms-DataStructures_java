import java.util.LinkedList;
import java.util.Queue;

public class Aula2_Queue {

    public static void main(String[] args) {
        //Queue->usa o processo FIFO(first-in first out) primeiro a entrar primeiro a sair
        //Queue e uma interface e nao uma classe por isso nao pode ser instanciada directamente, a sua implementacao pode ser feita com LinkedList ou PriorityQueue
        //offer()->adiciona um elemeto no fim da lista
        // poll()->remove o elemento no inicio da lista
        //peek()->retorna o elemento no inicio da lista
        //isEmpty()->verifica se a lista esta vazia e retorna um valor logico
        //size()->retorna o tamanho da lista
        //contains(object)->verifica se a lista contem o objecto e retorna um valor logico
        Queue<String> queue=new LinkedList<>();//-> para criar uma queue Queue<Object>nome=new LinkedList/PriorityQueue<>();

        queue.offer("Karen");
        queue.offer("Telcio");
        queue.offer("Timoteo");
        queue.offer("Jorge");
        //System.out.println(queue.peek());
        //queue.poll();
        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("Calege"));
        System.out.println(queue);






    }
}
