import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        HashSet groupeA=new HashSet<>();
        HashSet groupeB=new HashSet<>();
        groupeA.add("Ahmed");
        groupeA.add("Lhachmi");
        groupeA.add("Mehaydi");
        groupeB.add("Ahmed");
        groupeB.add("Mustafa");
        groupeB.add("Zouhair");
        System.out.println(groupeA.toString());
        System.out.println(groupeB.toString());
        groupeB.retainAll(groupeA);
        System.out.println(groupeB.toString());
        groupeA.addAll(groupeB);
        System.out.println(groupeA.toString());

    }
}