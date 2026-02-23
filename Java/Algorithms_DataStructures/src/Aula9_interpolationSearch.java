public class Aula9_interpolationSearch {
    public static void main(String[] args) {
        /*
        interpolation search e a uma optimizacao da binarySearch, ou seja, os dados tambem deve estar organizados aqui e durante a sua execucao parte dos dados sao ignorados/eliminados
        usa-se uma especie de probabilidade para saber onde provavelmente o dado procurado estara

         */

        int[]array={1,2,3,4,5,6,7,8,9};

        int index=interpolationSearch(array,8);
        if(index==-1){
            System.out.println("nao encontrado");

        }else{
            System.out.println("Elemento encontrado no indice: "+index);
        }
    }

    private static int interpolationSearch(int []array,int valor){
        int indiceFinal=array.length-1;
        int indiceInicial=0;

        while(valor>=array[indiceInicial] && valor <=array[indiceFinal] && indiceInicial<=indiceFinal) {
            int prob = indiceInicial + (indiceFinal - indiceInicial) * (valor - array[indiceInicial]) / (array[indiceFinal] - array[indiceInicial]);//formula para calcular o provavel indice do valor procurado
            System.out.println("Prob: " + prob);
            if (array[prob] == valor) return prob;
            else if (array[prob] < valor) indiceInicial = prob + 1;
            else indiceFinal = prob - 1;
        }
        return -1;
        }

    }

