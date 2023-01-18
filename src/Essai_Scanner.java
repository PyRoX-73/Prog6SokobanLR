import java.util.NoSuchElementException;
import java.util.Scanner;

class Essai_Scanner{
    public static void Test(){

        Scanner my_scanner;
        boolean loop = true;
        int entr_ent = 0;

        //String ligne = "";

        my_scanner = new Scanner(System.in);
        System.out.println("Saisissez une entier.");

        // Catching two exceptions : NoSuchElement and InputMismatch.
        while(loop == true) {
            try {
                entr_ent = my_scanner.nextInt();
                System.out.println("Vous avez saisi l'entier \n" + entr_ent);
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrez un entier.");
                my_scanner.nextLine(); // L'entrée incorrecte reste dans le scanner si on ne met pas cette ligne.
            } catch (NoSuchElementException e) {
                System.err.println("Aucune ligne saisie.");
                loop = false ;
            }
        }
    }
}