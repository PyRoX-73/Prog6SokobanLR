class Niveau{

    /* Spécification :
    *   0: case vide
    *   1: mur
    *   2: but
    *   3: joueur */

    // Attributes
    private char[][] table;
    private int column, line;
    private String p_name; //

    // Constructor

    Niveau(String name, int line, int column) {
        this.p_name = name;
        this.table = new char[line][column];
    }

    // Methods

    void fixeNom(String s){
        return;
    }
    void videCase(int i, int j){
        this.table[i][j] = ' ';
    }
    void ajouteMur(int i, int j){
        this.table[i][j] = '#';
    }
    void ajouteBut(int i, int j){
        this.table[i][j] = '.';
    }
    int lignes(){
        return this.line;
    }
    int colonnes(){
        return this.column;
    }
    String nom(){
        return this.p_name;
    }
    boolean estVide(int l, int c){
        if (this.table[l][c] == 0){
            return true;
        }
        else{
            return false;
        }
    }
    boolean aBut(int l, int c){
        if (this.table[l][c] == 0){
            return true;
        }
        else{
            return false;
        }
    }
    boolean aPousseur(int l ,int c){
        return false;
    }
    boolean aCaisse(int l, int c){
        return false;
    }
}