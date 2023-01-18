import java.util.NoSuchElementException;
import java.util.Scanner;

class Essai_Scanner{
    public static void main(String[] args){

        Scanner my_scanner;
        int entr_ent = 0;

        //String ligne = "";

        my_scanner = new Scanner(System.in);
        System.out.println("Saisissez une ligne");

        // Catching two exceptions : NoSuchElement and InputMismatch.
        try {
            entr_ent = my_scanner.nextInt();
            System.out.println("Vous avez saisi l'entier" + entr_ent);
        }
        catch(java.util.InputMismatchException e){
            System.out.println("Entrez un entier.");
        }
        catch(NoSuchElementException e){
            System.err.println("Aucune ligne saisie.");
        }

    }
}