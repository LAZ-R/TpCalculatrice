package fr.eni.calculatrice.exceptions;

/** Exception à lever quand le résultat d'une opération dépasse les bornes du type int
 *
 * @author laz_R
 * @version 1.0
 */
public class DepassementCapaciteException extends Exception{
    public DepassementCapaciteException(String message) {
        super(message);
    }
}
