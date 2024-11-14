import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ArrayList<Produit> Produits = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        Produit produit1=new Produit(1L,"Shampoo",15);
        Produit produit2=new Produit(2L,"Vaseline",10);
        Produit produit3=new Produit(3L,"Deodorant",20);
        Produit produit4=new Produit(4L,"Parfum",200);
        Produits.add(produit1);
        Produits.add(produit2);
        Produits.add(produit3);
        Produits.add(produit4);
        Produits.remove(0);
        Produits.forEach(produit -> produit.toString());
        Produits.set(1,new Produit(1L,"Eau de toilette",60));
        System.out.print("Entrer Le nom : ");
        String Recherche=scanner.next();
        for (Produit produit:Produits)
        {
            if (produit.getNom().equals(Recherche))
                System.out.println(produit.toString());
        }



    }
}