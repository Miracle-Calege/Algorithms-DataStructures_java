import java.util.LinkedList;

public class Aula4_LinkedList {

    public static void main(String[] args) {
        //arraylist vs LinkedList
        //para inserir e deletar dados no arraylist a lista deve mover todos os elementos para fechar ou acomodar o novo elemento tornando isso desvantajoso(os dados estao organizados continuamente) enquanto Linkedlist e mais eficiente para inserir e deletar dados visto que um no contem os dados e o outro o endereco do proximo sem precisar de mover todos os elementos no processo de insercao ou eliminacao
        //LinkedList e desvantajoso na procura, percorre toda a lista para encontrar um determinado valor enquanto arrayList e mais eficiente
        //podemos usar os metodos de stack e queue nas linkedlist(usado metodos de uma deles a linkedlist vai se comportar como um deles)

        LinkedList<String> linkedList=new LinkedList<>();//->cria uma linkedlist: LinkedList<Object> nome=new LinkedList<>();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        linkedList.add(4,"E");//adiciona o um elemento num determinado indice
        linkedList.remove("E");//remove um determinado elemento
        System.out.println(linkedList.indexOf("F"));//retorna o indice de um determinado elemento
        System.out.println(linkedList.peekFirst());//retorna o primeiro elemento da lista
        System.out.println(linkedList.peekLast());//retorna o ultimo elemento da lista
        linkedList.addFirst("0");//adiciona no inicio da lista
        linkedList.addLast("G");//adiciona no fim da lista
        linkedList.removeFirst();//remove o primeiro elemento na lista
        linkedList.removeLast();//remove o ultimo elemento na lista
        System.out.println(linkedList);


        /*
        singly linked list
        um no com o dado e outro com endereco do proximo(percorremos a lista de frente para tras)

        doubly linked list

        um no com o endereco do anterior, outro com o no e outro com endereco do proximo(podemos percorrer a lista de tras para frente como tambem de frente para tras)

         */
    }
}
