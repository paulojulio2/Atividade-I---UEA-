import java.util.ArrayList;

public class Livro {
    private String titulo;
    private Autor autor;
    private ArrayList<Leitor> leitores;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.leitores = new ArrayList<>();
        autor.adicionarLivro(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public ArrayList<Leitor> getLeitores() {
        return leitores;
    }

    public void adicionarLeitor(Leitor leitor) {
        leitores.add(leitor);
    }
}
