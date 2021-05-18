package fr.eni.calculatrice.main;

import fr.eni.calculatrice.bo.Operation;
import fr.eni.calculatrice.exceptions.DepassementCapaciteException;
import fr.eni.calculatrice.exceptions.DivisionParZero;
import fr.eni.calculatrice.exceptions.MauvaisOperateurException;
import java.util.InputMismatchException;
import java.util.Scanner;

/** Programme qui simule une calculatrice extrêmement simple sur la console, avec input utilisateur.
 *
 * @author laz_R
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        // Déclaration des instances
        Scanner scan = new Scanner(System.in);
        Operation operation = new Operation();

        // Déclaration des variables
        int resultat = 0;
        int int1 = 0;
        int int2 = 0;
        char operateur = '+';

        // Traitement
        System.out.println();
        System.out.println("+ - CALCULATRICE - +");
        System.out.println();

        // Récupération de la valeur 1
        while (true) {
            System.out.println("entrez valeur 1");
            try {
                int1 = scan.nextInt();
                scan.nextLine();
                break;
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.err.println("Merci d'entrer un nombre entier (compris entre -2 147 483 648 et 2 147 483 647)");
            }
        }

        // Récupération de l'opérateur
        while (true) {
            System.out.println("entrez opérateur | + | - | * | / |");
            try {
                operateur = scan.nextLine().charAt(0);
                operation.verif(operateur);
                break;

            } catch (StringIndexOutOfBoundsException e) {
                System.err.println("Merci d'entrer un operateur");
            } catch (MauvaisOperateurException e) {
                System.err.println(e.getMessage());
            }
        }

        // Récupération de la valeur 2
        while (true) {
            System.out.println("entrez valeur 2");
            try {
                int2 = scan.nextInt();
                scan.nextLine();
                break;
            } catch (InputMismatchException e) {
                scan.nextLine();
                System.err.println("Merci d'entrer un nombre entier (compris entre -2 147 483 648 et 2 147 483 647)");
            }
        }

        // Traitement en fonction de l'opérateur choisi par l'utilisateur
        switch (operateur) {

            // l'utilisateur a choisi d'additionner
            case '+' :
                try {
                    resultat = operation.ajouter(int1,int2);
                    // Affichage final
                    System.out.printf("%n%d %s %d = %d%n%n", int1, operateur, int2, resultat);
                } catch (DepassementCapaciteException e) {
                    System.err.println(e.getMessage());
                }
                break;

            // l'utilisateur a choisi de soustraire
            case '-' :
                try {
                    resultat = operation.soustraire(int1,int2);
                    // Affichage final
                    System.out.printf("%n%d %s %d = %d%n%n", int1, operateur, int2, resultat);
                } catch (DepassementCapaciteException e) {
                    System.err.println(e.getMessage());
                }
                break;

            // l'utilisateur a choisi de multiplier
            case '*' :
                try {
                    resultat = operation.multiplier(int1,int2);
                    // Affichage final
                    System.out.printf("%n%d %s %d = %d%n%n", int1, operateur, int2, resultat);
                } catch (DepassementCapaciteException e) {
                    System.err.println(e.getMessage());
                }
                break;

            // l'utilisateur a choisi de diviser
            case '/' :
                try {
                    resultat = operation.diviser(int1,int2);
                    // Affichage final
                    System.out.printf("%n%d %s %d = %d%n%n", int1, operateur, int2, resultat);
                } catch (DivisionParZero d){
                    System.err.println(d.getMessage());
                } catch (DepassementCapaciteException e) {
                    System.err.println(e.getMessage());
                }
                break;
        }
    }
}
