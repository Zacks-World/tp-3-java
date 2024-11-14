import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> mots = new ArrayList<>();
        mots.add("ahmed");
        mots.add("Hamza");
        mots.add("ayoub");
        mots.add("Yasser");
        mots.add("Houd");
        mots.add("Rim");

        // Filtrer les mots contenant "a"
        List<String> motsContientA = mots.stream()
                .filter(mot -> mot.contains("a"))
                .collect(Collectors.toList());
        System.out.println("Mots contenant 'a' : " + motsContientA);

        // Filtrer les mots de longueur > 3, inverser chaque mot et collecter le résultat
        List<String> motsTransformes = mots.stream()
                .filter(mot -> mot.length() > 3)    // Filtrer les mots de longueur > 3
                .map(Main::inverserMot)             // Inverser chaque mot
                .collect(Collectors.toList());      // Collecter dans une nouvelle liste
        // Afficher la liste transformée
        System.out.println("Mots transformés : " + motsTransformes);
        List<List<Character>> cara = mots.stream()
                .filter(mot -> mot.contains("e"))                // Filtrer les mots contenant 'e'
                .map(mot -> mot.chars()                            // Convertir chaque mot en un flux d'entiers
                        .mapToObj(c -> (char) c)                  // Convertir chaque entier en un caractère
                        .collect(Collectors.toList()))           // Collecter chaque mot en une liste de caractères
                .collect(Collectors.toList());
        System.out.println("Caracteres 'E' : " + cara);
        List<String> motsTransformesMaj = motsTransformes.stream()
                .map(String::toUpperCase)           // Transformer en majuscules
                .collect(Collectors.toList());
        System.out.println("Mots transformés majuscules : " + motsTransformesMaj);
        List<Integer> Longueur = motsTransformes.stream()
                .map(String::length)           // Transformer en majuscules
                .collect(Collectors.toList());
        System.out.println("Longueur : " + Longueur);
        List<List<Character>> CaraTous = mots.stream()
                .map(mot -> mot.chars()                            // Convertir chaque mot en un flux d'entiers
                        .mapToObj(c -> (char) c)                  // Convertir chaque entier en un caractère
                        .collect(Collectors.toList()))           // Collecter chaque mot en une liste de caractères
                .collect(Collectors.toList());
        System.out.println(CaraTous);
        List<Character> CaraTous2 = CaraTous.stream()
                .flatMap(List::stream)  // Flatten each sublist into a stream of characters
                .collect(Collectors.toList());
        System.out.println(CaraTous2);
        List<String> NameIndex= mots.stream()
                .map(mot->mot+"-"+mots.indexOf(mot))
                .collect(Collectors.toList());
        System.out.println(NameIndex);
    }

    // Méthode pour inverser un mot
    public static String inverserMot(String mot) {
        return new StringBuilder(mot).reverse().toString();
    }
}
