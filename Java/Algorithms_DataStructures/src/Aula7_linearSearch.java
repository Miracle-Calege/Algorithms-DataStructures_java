public class Aula7_linearSearch {
    public static void main(String[] args) {


    /*
    procura linear->acessa indice por indice da estrutura de dados ate achar o valor pretendido
    nao e eficiente para estruturas de dados grandes
     */
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        int index = linearSearch(array, 1);

        if(index!=-1){
            System.out.println("Elemento encontrado no indice: "+index);
        }else{
            System.out.println("Elemento nao encontrado");
        }
    }

        private static int linearSearch ( int[] array, int valor){
            for(int i=0;i<array.length;i++){
                if(array[i]==valor){
                    return i;
                }

            }
            return -1;

        }

}
