import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        HashMap<String,Integer> Notes =new HashMap<>();
        Notes.put("Ahmed",20);
        Notes.put("Simo",10);
        Notes.put("Aya",17);
        Notes.put("Ismail",12);
        System.out.println(Notes.toString());
        Notes.replace("Ismail",17);
        System.out.println(Notes.toString());
        Notes.remove("Ahmed");
        System.out.println(Notes.toString());
        System.out.println("La taille du Hashap"+Notes.size());
        double somme = 0.0, max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        for (Integer note : Notes.values()) {
            somme += note/Notes.size();
            if (note > max) max = note;
            if (note < min) min = note;
        }
        System.out.println(somme+" "+max+" "+min);
        for (Integer note : Notes.values()) {
            if (note==20) System.out.println("20 existe");
            else System.out.println("20 n'existe pas");
        }
    }
}