import java.util.Scanner;
import java.io.File;

class LecteurNiveau {
    private String p_fileName;
    private Scanner p_sc;

    public void setScanner(Scanner sc, String fileName) throws java.io.IOException{
        sc = new Scanner(new File(fileName));
    }

    public void getScanner(){

    }
    LecteurNiveau(String fileName) throws java.io.IOException {
        this.p_fileName = fileName;
        Scanner sc = new Scanner(new File(p_fileName));
    };

    public void litProchainNiveau(Scanner sc){
        char c = '\0'; // Empty character.

        while(c != ';'){
            c = sc.next().charAt(0); // nextChar n'existe pas sur Java, il faut donc utiliser cette combine.
        }
    }
}
