/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alfabeto;

/**
 *
 * @author Aldo
 */
public class Alfabeto {
    private String oracion;
    private String alfabeta = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String getOracion() {
        return oracion;
    }

    public void setOracion(String oracion) {
        this.oracion = oracion;
    }
    
    public Alfabeto(String oracion){
        this.setOracion(oracion.toUpperCase().replace(" ", "").replace(".", "").replace(",", "").replace("Ñ", ""));
        this.setOracion(this.getOracion().replace("Á", "A").replace("É", "E").replace("Í", "I").replace("Ó", "O").replace("Ú", "U").replace("Ü", "U"));
    }
    
    public void validar(){
        if(this.getOracion().length() < 26){
            System.out.println("No contiene todas las letras del abecedario");
        } else {
            for(int j = 0; j < this.getOracion().length(); j++){
                if(this.getOracion().charAt(0) == alfabeta.charAt(j)){
                    this.setOracion(this.getOracion().replace(this.getOracion().charAt(0)+"", ""));
                    this.alfabeta = this.alfabeta.replace(alfabeta.charAt(j)+"", "");
                    j = -1;
                }
            }
            if(this.alfabeta.length() == 0){
                System.out.println("Contiene todas las letras del abecedario");
            } else {
                System.out.println("No contiene todas las letras del abecedario");
            }
        }
    }
    
    public static void main(String[] args) {
        Alfabeto a = new Alfabeto("El pingüino Wenceslao hizo kilómetros bajo exhaustiva lluvia y frío, añoraba a su querido cachorro.");
        a.validar();
    }
    
}
