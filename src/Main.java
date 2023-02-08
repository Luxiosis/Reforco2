import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        System.out.println("Please enter your data below: (send 'bye' to exit) ");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf("Digite uma palavra: ");
            String palavra = sc.nextLine();
            if ("".equalsIgnoreCase(palavra)) {
                break;
            }
            lista.add(palavra);
        }

        List<String> minuscolo = lista.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        Collections.sort(minuscolo);
        String ultimo = minuscolo.get(lista.size() - 1);
        System.out.println(ultimo);
    }
}