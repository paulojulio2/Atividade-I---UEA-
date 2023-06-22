import java.util.ArrayList;

public class Autor {
    private String nome;
    private String nacionalidade;
    private ArrayList<Livro> livros;

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
}

