package MergeSort;

/**
 *
 * Os métodos mergeSort() e intercalar() presentes nesse algoritmo foram
 * adaptados do livro Algoritmos em Linguagem C - Professor Paulo Feofillof.
 *
 */
public class Ordenacao {

    public static void mergeSort(int inicio, int tamanho, String[] v) {
        if (inicio < tamanho - 1) {
            int meio = (inicio + tamanho) / 2;
            mergeSort(inicio, meio, v);
            mergeSort(meio, tamanho, v);
            intercalar(inicio, meio, tamanho, v);
        }
    }

    private static void intercalar(int inicio, int meio, int tamanho, String[] v) {
        int i, j, k;
        String[] auxiliar = new String[tamanho - inicio];
        i = inicio;
        j = meio;
        k = 0;
        while (i < meio && j < tamanho) {
            if (v[i].compareToIgnoreCase(v[j]) < 0) {
                auxiliar[k] = v[i];
                k++;
                i++;
            } else {
                auxiliar[k] = v[j];
                k++;
                j++;
            }
        }

        while (i < meio) {
            auxiliar[k] = v[i];
            k++;
            i++;
        }

        while (j < tamanho) {
            auxiliar[k] = v[j];
            k++;
            j++;
        }

        for (i = inicio; i < tamanho; i++) {
            v[i] = auxiliar[i - inicio];
        }
    }

}
