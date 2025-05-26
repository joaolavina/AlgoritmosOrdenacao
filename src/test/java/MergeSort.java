import java.util.Random;

import org.junit.Before;
import org.junit.Test;

import com.ordenacao.algoritmos.Ordenador;

public class MergeSort {
    
    private Ordenador ordenador = new Ordenador();
    private Random random = new Random();
    private int[] vetorDezMilOrdenado;
    private int[] vetorDezMilAleatorio;
    private int[] vetorDezMilOrdemInversa;
    private int[] vetorCemMilOrdenado;
    private int[] vetorCemMilAleatorio;
    private int[] vetorCemMilOrdemInversa;
    private int[] vetorUmMilhaoOrdenado;
    private int[] vetorUmMilhaoAleatorio;
    private int[] vetorUmMilhaoOrdemInversa;

    @Before
    public void setUp() {
        random.setSeed(0);

        int dezMil = 10000;
        vetorDezMilOrdenado = gerarVetorOrdenado(dezMil);
        vetorDezMilAleatorio = gerarVetorAleatorio(dezMil);
        vetorDezMilOrdemInversa = gerarVetorOrdemInversa(dezMil);

        int cemMil = 100000;
        vetorCemMilOrdenado = gerarVetorOrdenado(cemMil);
        vetorCemMilAleatorio = gerarVetorAleatorio(cemMil);
        vetorCemMilOrdemInversa = gerarVetorOrdemInversa(cemMil);

        int umMilhao = 1000000;
        vetorUmMilhaoOrdenado = gerarVetorOrdenado(umMilhao);
        vetorUmMilhaoAleatorio = gerarVetorAleatorio(umMilhao);
        vetorUmMilhaoOrdemInversa = gerarVetorOrdemInversa(umMilhao);
    }

    @Test
    public void melhorCasoDezMilTeste() {
        int[] vetor = ordenador.mergeSort(vetorDezMilOrdenado);
    }

    @Test
    public void medioCasoDezMilTeste() {
        int[] vetor = ordenador.mergeSort(vetorDezMilAleatorio);
    }

    @Test
    public void piorCasoDezMilTeste() {
        int[] vetor = ordenador.mergeSort(vetorDezMilOrdemInversa);
    }

    @Test
    public void melhorCasoCemMilTeste() {
        int[] vetor = ordenador.mergeSort(vetorCemMilOrdenado);
    }

    @Test
    public void medioCasoCemMilTeste() {
        int[] vetor = ordenador.mergeSort(vetorCemMilAleatorio);
    }

    @Test
    public void piorCasoCemMilTeste() {
        int[] vetor = ordenador.mergeSort(vetorCemMilOrdemInversa);
    }

    @Test
    public void melhorCasoUmMilhaoTeste() {
        int[] vetor = ordenador.mergeSort(vetorUmMilhaoOrdenado);
    }

    @Test
    public void medioCasoUmMilhaoTeste() {
        int[] vetor = ordenador.mergeSort(vetorUmMilhaoAleatorio);
    }

    @Test
    public void piorCasoUmMilhaoTeste() {
        int[] vetor = ordenador.mergeSort(vetorUmMilhaoOrdemInversa);
    }

    private int[] gerarVetorOrdenado(int tamanho) {
        int[] vetor = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = i;
        }
        return vetor;
    }

    private int[] gerarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        vetor = random.ints(tamanho, 0, tamanho).toArray();
        return vetor;
    }

    private int[] gerarVetorOrdemInversa(int tamanho) {
        int[] vetor = new int[tamanho];
          for (int i = vetor.length - 1; i > 0; i--) {
            vetor[i] = i;
        }

        return vetor;
    }
}
