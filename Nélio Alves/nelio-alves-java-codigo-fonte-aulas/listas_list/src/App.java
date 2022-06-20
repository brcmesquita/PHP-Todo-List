import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Integer> listInteger = new ArrayList<>();
        List<String> listString = new ArrayList<>();

        listString.add("Bruno");    // 0
        listString.add("Raphael");  // 1
        listString.add("Cabral");   // 2
        listString.add("Mesquita"); // 3
        listString.add(3, "de");    // o número na frente indica o índice exato, no caso, agora é o número 3
        listString.add("Eliane");
        listString.add("Priscilla");
        listString.add("Andrezza");
        listString.add("João");
        listString.add("Victória");
        listString.add("Nicolas");
        listString.add("Eduarda");
        listString.add("Milena");

        for (String item : listString) {
            System.out.println(item);
        }

        System.out.println("\n----------------\n");

        System.out.println("\nmostrar o tamanho da lista (tipo length): " + listString.size());

        System.out.println("\n----------------\n");
        
        listString.remove("Bruno"); // para remover um item da lista usando string
        listString.remove(3); // para remover um item da lista usando integer
        listString.removeIf(x -> x.charAt(0) == 'C'); // para remover os itens que começam com a letra C

        for (String item : listString) {
            System.out.println(item);
        }

        System.out.println("\n----------------\n");

        System.out.println("Index de Raphael: " + listString.indexOf("Raphael")); // retorna o valor do índice do nome

        System.out.println("\n----------------\n");

        List<String> filtro = listString.stream().filter(x -> x.charAt(0) == 'R').collect(Collectors.toList());
        for (String item : filtro) {
            System.out.println("Nomes encontrador com R -> " + item);
        }

        System.out.println("\n----------------\n");
        
        String name2 = listString.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println("Encontra o primeiro nome escrito com A, ou retorna nulo -> " + name2);
        
        String name1 = listString.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
        System.out.println("Encontra o primeiro nome escrito com B, ou retorna nulo -> " + name1);

    }
}
