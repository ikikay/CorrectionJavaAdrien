/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entites;

/**
 *
 * @author Ikikay
 */
public class RobotNG extends Robot {

    /*
    les propriétés
     */
    private boolean turbo;

    /*
    les constructeurs (generé par clic droit)
     */
    public RobotNG(String nom) {
        super(nom);
        this.turbo = false;
    }

    /*
    les getters and setters(généré par clic droit) :
    les gets permettent de recupérer le contenu des variables (proprietées)
    les sets permettent de modifier le contenu des variables (proprietées)
     */
    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    /*
    Les surcharges de méthodes
     */
    @Override
    public String toString() {
        if (this.turbo == true) {
            return this.nom + " ma direction est: " + this.direction + 
                    " mon x est = à " + this.x + 
                    " mon y est = à " + this.y + 
                    " le turbo est activé";
        } else {
            return " mon x est = à " + this.x + 
                    " mon y est = à " + this.y + 
                    " le turbo est désactivé";
        }

      }

    /*
    nos fonctions
     */
    //Petit "a"
    /*
    public void avance(Integer unNombre) {
        for (Integer i = 1; i <= unNombre; i++){
            super.avance();
        }
    }
  
     */
    //Petit "b"
    public void avance(Integer unNombre) {
        if (turbo == true) {

            if (this.direction == "Est") {
                this.x = this.x + (unNombre * 3);
            } else if (this.direction == "Sud") {
                this.y = this.y - (unNombre * 3);
            } else if (this.direction == "Ouest") {
                this.x = this.x - (unNombre * 3);
            } else if (this.direction == "Nord") {
                this.y = this.y + (unNombre * 3);
            }
        } else {
            if (this.direction == "Est") {
                this.x = this.x + unNombre;
            } else if (this.direction == "Sud") {
                this.y = this.y - unNombre;
            } else if (this.direction == "Ouest") {
                this.x = this.x - unNombre;
            } else if (this.direction == "Nord") {
                this.y = this.y + unNombre;
            }
        }
    }
}
