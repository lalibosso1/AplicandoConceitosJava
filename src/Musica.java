public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    void exibirFicha(){
        System.out.println("Título:" +titulo);
        System.out.println("Artista:" +artista);
        System.out.println("Ano de Lançamento:" +anoLancamento);
    }

    void avaliar(double nota){
    somaDasAvaliacoes += nota;
    numAvaliacoes++;
    }

    double calcularMedia(){
    return somaDasAvaliacoes / numAvaliacoes;
    }

}
