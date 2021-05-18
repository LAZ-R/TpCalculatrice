package fr.eni.calculatrice.bo;

import fr.eni.calculatrice.exceptions.DepassementCapaciteException;
import fr.eni.calculatrice.exceptions.DivisionParZero;
import fr.eni.calculatrice.exceptions.MauvaisOperateurException;

/** Classe qui représente les opérations arithmétiques courantes
 *
 * @author laz_R
 * @version 1.0
 */
public class Operation {

    /** Méthode de vérification de l'opérateur entré par l'utilisateur
     *
     * @param operateur char
     * @throws MauvaisOperateurException (si mauvais opérateur renseigné)
     */
    public void verif(char operateur) throws MauvaisOperateurException {
        if (operateur != '+' && operateur != '-' && operateur != '*' && operateur != '/') {
            throw new MauvaisOperateurException("Merci d'entrer un des operateurs demandé");
        }
    }

    /** Méthode qui représente l'addition de deux entiers.
     *
     * @param int1 int
     * @param int2 int
     * @return int (résultat de l'opération)
     * @throws DepassementCapaciteException (si le résultat de l'opération dépasse les bornes limites du type int)
     */
    public int ajouter(int int1, int int2) throws DepassementCapaciteException {

        // Vérification des bornes du résultat
        if ((long)int1 + (long)int2 > 2147483647 || (long)int1 + (long)int2 < -2147483648) {
            throw new DepassementCapaciteException("Le résultat dépasse les capacités de la calculatrice.");
        }

        int i = int1 + int2;

        return i;
    }

    /** Méthode qui représente la soustraction de deux entiers.
     *
     * @param int1 int
     * @param int2 int
     * @return int (résultat de l'opération)
     * @throws DepassementCapaciteException (si le résultat de l'opération dépasse les bornes limites du type int)
     */
    public int soustraire(int int1, int int2) throws DepassementCapaciteException {

        // Vérification des bornes du résultat
        if ((long)int1 - (long)int2 > 2147483647 || (long)int1 - (long)int2 < -2147483648) {
            throw new DepassementCapaciteException("Le résultat dépasse les capacités de la calculatrice.");
        }

        int i = int1 - int2;

        return i;
    }

    /** Méthode qui représente la multiplication de deux entiers.
     *
     * @param int1 int
     * @param int2 int
     * @return int (résultat de l'opération)
     * @throws DepassementCapaciteException (si le résultat de l'opération dépasse les bornes limites du type int)
     */
    public int multiplier(int int1, int int2) throws DepassementCapaciteException {

        // Vérification des bornes du résultat
        if ((long)int1 * (long)int2 > 2147483647 || (long)int1 * (long)int2 < -2147483648) {
            throw new DepassementCapaciteException("Le résultat dépasse les capacités de la calculatrice.");
        }

        int i = int1 * int2;

        return i;
    }

    /** Méthode qui représente la division de deux entiers.
     *
     * @param int1 int
     * @param int2 int
     * @return int (résultat de l'opération)
     * @throws DivisionParZero (le le diviseur est égale à 0)
     * @throws DepassementCapaciteException (si le résultat de l'opération dépasse les bornes limites du type int)
     */
    public int diviser(int int1, int int2) throws DivisionParZero, DepassementCapaciteException {

        // Vérification d'un cas de divion par 0
        if (int2 == 0) {
            throw new DivisionParZero("La divion par zéro est mathématiquement impossible");
        }
        // Vérification des bornes du résultat
        if ((long)int1 / (long)int2 > 2147483647 || (long)int1 / (long)int2 < -2147483648) {
            throw new DepassementCapaciteException("Le résultat est dépasse les capacités de la calculatrice.");
        }

        int i = int1 / int2;

        return i;
    }
}
