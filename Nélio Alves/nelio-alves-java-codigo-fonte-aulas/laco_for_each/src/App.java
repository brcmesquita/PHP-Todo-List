public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("..:: Aula sobre For Each ::..");

        String[] livros = new String[] {"João", "Marcos", "Pedro", "Coríntios"};

        // solução sem o for each
        for (int i = 0; i < livros.length; i++) {
            System.out.println(livros[i]);
        }

        System.out.println("-------------");

        // Solução com for each
        for (String livro : livros) {
            System.out.println(livro);
        }
    }
}