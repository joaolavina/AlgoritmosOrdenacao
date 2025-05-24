import org.junit.Test;

import com.ordenacao.algoritmos.Ordenador;

public class BubbleSortTeste {

    private Ordenador ordenador = new Ordenador();
    private int[] vetor;


    @Test
    public void melhorCasoTeste1(){
        vetor = new int[1000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }

        double tempoInicial = System.nanoTime();
        vetor = ordenador.bubbleSort(vetor);
        double tempoFinal = System.nanoTime();

        double tempoDecorrido = (tempoFinal - tempoInicial)/1_000_000.0;

        System.out.println("Melhor caso: " + tempoDecorrido + "ms");
    }

    @Test
    public void medioCasoTeste1(){
        vetor = new int[1000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 1000);
        }

        double tempoInicial = System.nanoTime();
        vetor = ordenador.bubbleSort(vetor);
        double tempoFinal = System.nanoTime();

        double tempoDecorrido = (tempoFinal - tempoInicial)/1_000_000.0;

        System.out.println("Caso médio: " + tempoDecorrido + "ms");
    }

    @Test
    public void piorCasoTeste1(){
        vetor = new int[1000];

        for (int i =  vetor.length - 1; i > 0; i--) {
            vetor[i] = i;
        }

        double tempoInicial = System.nanoTime();
        vetor = ordenador.bubbleSort(vetor);
        double tempoFinal = System.nanoTime();

        double tempoDecorrido = (tempoFinal - tempoInicial)/1_000_000.0;

        System.out.println("Pior caso: " + tempoDecorrido + "ms");
    }

    @Test
    public void melhorCasoTeste2(){
        vetor = new int[10000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }

        double tempoInicial = System.nanoTime();
        vetor = ordenador.bubbleSort(vetor);
        double tempoFinal = System.nanoTime();

        double tempoDecorrido = (tempoFinal - tempoInicial)/1_000_000.0;

        System.out.println("Melhor caso: " + tempoDecorrido + "ms");
    }

    @Test
    public void medioCasoTeste2(){
        vetor = new int[10000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 10000);
        }

        double tempoInicial = System.nanoTime();
        vetor = ordenador.bubbleSort(vetor);
        double tempoFinal = System.nanoTime();

        double tempoDecorrido = (tempoFinal - tempoInicial)/1_000_000.0;

        System.out.println("Caso médio: " + tempoDecorrido + "ms");
    }

    @Test
    public void piorCasoTeste2(){
        vetor = new int[10000];

        for (int i = vetor.length -1; i > 0; i--) {
            vetor[i] = i;
        }

        double tempoInicial = System.nanoTime();
        vetor = ordenador.bubbleSort(vetor);
        double tempoFinal = System.nanoTime();

        double tempoDecorrido = (tempoFinal - tempoInicial)/1_000_000.0;

        System.out.println("Pior caso: " + tempoDecorrido + "ms");
    }

    @Test
    public void melhorCasoTeste3(){
        vetor = new int[100000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i;
        }

        double tempoInicial = System.nanoTime();
        vetor = ordenador.bubbleSort(vetor);
        double tempoFinal = System.nanoTime();

        double tempoDecorrido = (tempoFinal - tempoInicial)/1_000_000.0;

        System.out.println("Melhor caso: " + tempoDecorrido + "ms");
    }

    @Test
    public void medioCasoTeste3(){
        vetor = new int[100000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100000);
        }

        double tempoInicial = System.nanoTime();
        vetor = ordenador.bubbleSort(vetor);
        double tempoFinal = System.nanoTime();

        double tempoDecorrido = (tempoFinal - tempoInicial)/1_000_000.0;

        System.out.println("Caso médio: " + tempoDecorrido + "ms");
    }

    @Test
    public void piorCasoTeste3(){
        vetor = new int[10000];

        for (int i = vetor.length-1 ; i > 0; i--) {
            vetor[i] = i;
        }

        double tempoInicial = System.nanoTime();
        vetor = ordenador.bubbleSort(vetor);
        double tempoFinal = System.nanoTime();

        double tempoDecorrido = (tempoFinal - tempoInicial)/1_000_000.0;

        System.out.println("Pior caso: " + tempoDecorrido + "ms");
    }
}
