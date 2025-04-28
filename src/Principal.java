public class Principal {
    public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();
    pessoa.exibirMensagem();

    Calculadora calculadora = new Calculadora();
    int resultado = calculadora.dobrarNumero(10);
    System.out.println(resultado);

    Musica minhaMusica = new Musica();

    minhaMusica.titulo = "Nome da Música";
    minhaMusica.artista = "Nome do Artista";
    minhaMusica.anoLancamento = 2023;

    minhaMusica.exibirFicha();

    minhaMusica.avaliar(4.5);
    minhaMusica.avaliar(3.8);
    minhaMusica.avaliar(5.0);

    double mediaAvaliacoes = minhaMusica.calcularMedia();
    System.out.println("Média das avaliações: " + mediaAvaliacoes);

    Carro carro = new Carro();

    carro.modelo = "Meganni";
    carro.ano = 2010;
    carro.cor = "Prata";

    carro.exibeFichaTecnica();
    System.out.println(carro.calculoAno());

    Aluno aluno = new Aluno();

    aluno.nome = "Son Chaeyoung";
    aluno.idade = 26;

    aluno.exibeAluno();
    }
}
