import java.util.Stack;

public class Aula1_Stack {
    public static void main(String[] args) {

        //stack->e uma estrutura de dados que obedece a ordem LIFO (Last in first out) primeiro a entrar ultimo a sair
        //organiza os dados de forma "amontuada"(um em cima do outro)
        //push(object)->usado para adicionar elementos na stack
        //pop()->remove o elemento no topo
        //empty()->um metodo de retorno boolean que verifica se a estrutura esta vazia
        //peek()->retorna o elemento no topo
        //search(object)->um metodo de retorno boolean retorna a posicao do elemento(retorna -1 se nao existe esse elemento)
        Stack<String> stack=new Stack<>();//Stack <tipo de dado> nome=new Stack<>()->para criar uma stack

        stack.push("God of war");
        stack.push("FC 26");
        stack.push("GTA");
        stack.push("Need for speed");
        //System.out.println(stack.empty());
        //String topo=stack.pop();//para remover do topo e colocar numa variavel
        //String topo=stack.peek();
        //System.out.println(topo);
       // System.out.println(stack);//->imprime a stack
        System.out.println(stack.search("clash of clans"));





    }
}
