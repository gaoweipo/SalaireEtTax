import java.util.Scanner;

public class SalaireEtTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salaire of the worker:");
        double S1=sc.nextDouble();
        boolean resultat1=(S1>3000);
        if (resultat1=true)
            System.out.println("You need to pay the tax.");
        else
            System.out.println("You needn't to pay the tax.");
        System.out.println("Enter the salaire of the worker:");
        double S2=sc.nextDouble();
        boolean resultat2=(S2>3000);
        if (resultat2=true)
            System.out.println("You need to pay the tax.");
        else
            System.out.println("You needn't to pay the tax.");
        sc.close();
    }
}