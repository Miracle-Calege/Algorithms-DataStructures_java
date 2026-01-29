import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula3_PriorityQueue {
    public static void main(String[] args) {
        //PriorityQueue->obedece um processo FIFO, mas os primeiros sendo os de maior prioridade e os outros de menor prioridade

        Queue<String>queue=new PriorityQueue<>();//->a vai exbir em ordem crescente para inverter a ordem colocamos  Collections.reverseOrder() no constructor

        queue.offer("Miracle Calege");
        queue.offer("Siswe Calege");
        queue.offer("Telcio Calege");
        queue.offer("Joao Matola");
        queue.offer("Jacques Mbaki");
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());

        }
    }
}
