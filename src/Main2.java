import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite palavra 1: ");
        String palavra1 = sc.next();
        System.out.println("Digite palavra 2: ");
        String palavra2 = sc.next();

        List<Character> lista1 =  new ArrayList<>();
        List<Character> lista2 =  new ArrayList<>();

        for(char letra : palavra1.toCharArray()) {
            lista1.add(letra);
        }
        for(char letra : palavra2.toCharArray()) {
            lista2.add(letra);
        }

        List<Character> lista1_minus = lista1.stream()
                .map(Character::toLowerCase)
                .collect(Collectors.toList());
        Collections.sort(lista1_minus);

        List<Character> lista2_minus = lista2.stream()
                .map(Character::toLowerCase)
                .collect(Collectors.toList());
        Collections.sort(lista2_minus);

        System.out.println(lista1_minus.equals(lista2_minus));
    }
}
