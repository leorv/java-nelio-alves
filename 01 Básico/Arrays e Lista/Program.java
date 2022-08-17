import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Bob");
        list.add("Alice");
        list.add("Alex");

        for (String nome : list) {
            System.out.println(nome);
        }

        // Add a new element between Bob and Maria:
        list.add(1, "marco");

        System.out.println("tamanho da lista: " + list.size());

        list.remove("Bob"); // A lista consegue remover comparando a string
        list.remove(1);

        // Removendo usando predicado:
        list.removeIf(x -> x.charAt(0) == 'M');

        // Encontrar posição de um elemento na lista.
        System.out.println("Index of Alice: " + list.indexOf("Alice"));
        System.out.println("index of Bob; " + list.indexOf("Bob"));


        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result){
            System.out.println("Result of filter (A): " + x);
        }

        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
        System.out.println("Filter A to a string: " + name);
        

    }
}