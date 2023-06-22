public class Main {
    public static void main(String[] args) {
        //Autores
        Autor autor1 = new Autor("Machado de Assis", "Brasileiro");
        Autor autor2 = new Autor("Stephen King", "Estadunidence");
        Autor autor3 = new Autor("Edgar Allan Poe", " Estadunidense");
        Autor autor4 = new Autor("Luís Vaz Camões", "Português");
       Autor autor5 = new Autor("Nilo Ney Coutinho Menezes", "Brasileiro");
        Autor autor6 = new Autor("Paul J. Deitel", "Estadunidence");

        //livros
        Livro livro1 = new Livro("Quincas Borba", autor1);
        Livro livro2 = new Livro("O Iluminado", autor2);
        Livro livro3 = new Livro("O Poço e o Pêndulo", autor3);
        Livro livro4 = new Livro("Os Lusíadas", autor4);
        Livro livro5 = new Livro("Introdução À Programação Com Python ", autor5);
        Livro livro6 = new Livro("Java: Como Programar", autor6);

        // Usuários
        Leitor leitor1 = new Leitor("Carlos");
        Leitor leitor2 = new Leitor("Gabriela");
        Leitor leitor3 = new Leitor("João");

        // Associando leitores aos livros
        leitor1.pegarLivroEmprestado(livro1);
        leitor1.pegarLivroEmprestado(livro5);
        leitor2.pegarLivroEmprestado(livro2);
        leitor2.pegarLivroEmprestado(livro4);
        leitor3.pegarLivroEmprestado(livro3);
        leitor3.pegarLivroEmprestado(livro6);
      
        leitor1.imprimirLivrosEmprestados();
        leitor2.imprimirLivrosEmprestados();
        leitor3.imprimirLivrosEmprestados();

    }
}
