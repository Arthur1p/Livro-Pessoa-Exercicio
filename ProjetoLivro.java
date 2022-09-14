public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];

        p[0] = new Pessoa("Arthur", "M", 26);
        p[1] = new Pessoa("Maria", "F", 40);

        l[0] = new Livro("Programação", "Alan Turing", 200, p[0]);
        l[1] = new Livro("Livro da Maria", "Maria Braga", 50, p[1]);

        System.out.println(l[0].detalhes());
    }
}
