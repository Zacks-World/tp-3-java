import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Employe> Employes=new ArrayList<>();
        Employe Emp1=new Employe("Elguazzar","Info",10000);
        Employe Emp2=new Employe("Ouhensous","RH",12000);
        Employe Emp3=new Employe("Fanan","Droit",20000);
        Employes.add(Emp1);
        Employes.add(Emp2);
        Employes.add(Emp3);
        double salarie = Employes.stream().mapToDouble(Employe::getSalaire).sum();
        System.out.println("Salarie: " + salarie);
        List<Employe> EmpSorted= Employes.stream().sorted(Comparator.comparing(Employe::getNom)).collect(Collectors.toList());
        System.out.println(EmpSorted);
        List<Employe> EmployeMin=Employes.stream().min(Comparator.comparing(Employe::getSalaire)).stream().collect(Collectors.toList());
        System.out.println(EmployeMin);
        System.out.print("Entrer a value : ");
        Double V=scanner.nextDouble();
        List<Employe> EmployeSup=Employes.stream().filter(employe-> employe.getSalaire()>V).collect(Collectors.toList());
        System.out.println(EmployeSup);
        Optional<Employe> EmployeMax=Employes.stream().reduce((emp1, emp2) -> emp1.getSalaire() > emp2.getSalaire() ? emp1 : emp2);
        System.out.println(EmployeMax);
        String EmployeConcat1 = Employes.stream()
                .reduce("", (concat, emp) -> concat + emp.getNom(), String::concat);
        System.out.println("Concatenated employee names: " + EmployeConcat1);
        String EmployeConcat = Employes.stream()
                .map(Employe::getNom)
                .reduce("", (name1, name2) -> name1 + name2);
        System.out.println("Concatenated employee names: " + EmployeConcat);
    }
}