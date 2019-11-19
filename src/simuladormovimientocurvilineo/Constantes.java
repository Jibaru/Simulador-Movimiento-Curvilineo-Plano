/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladormovimientocurvilineo;

/**
 *
 * @author Jibaru
 */
public class Constantes {
    
    public final static String textFormatoError = 
        "El formato no es soportado.\n" +
        "Debe ingresar los datos de la siguiente \n"+
        "forma:\n\n"+
        "        a*t^b+c*t^d+-m*t^n\n\n"+
        "Donde cada letra es un número real";
    
    public final static String textCamposIncompletos = 
        "Los campos velocidad inicial, ángulo de \n"+
        "inclinación, velocidad en x, velocidad en y, \n"+
        "y tiempo de vuelo deben estar completos para \n"+
        "poder continuar.";
}
