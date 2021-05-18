package fr.eni.calculatrice.exceptions;

/** Exception à lever quand l'utilisateur a entré un opérateur, mais invalide
 *
 * @author laz_R
 * @version 1.0
 */
public class MauvaisOperateurException extends Exception{
    public MauvaisOperateurException(String message) {
        super(message);
    }
}
