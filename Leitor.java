import java.util.ArrayList;

public class Leitor {
    private String nome;
    private ArrayList<Livro> livros;

    public Leitor(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void pegarLivroEmprestado(Livro livro) {
        livros.add(livro);
        livro.adicionarLeitor(this);
    }

    public void imprimirLivrosEmprestados() {
        System.out.println("Livros emprestados pelo usuário " + nome + ":");
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }
    }
}
