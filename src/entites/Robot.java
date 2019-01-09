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
public class Robot {

    /*
    les propriétés
     */
    protected String nom;
    protected Integer x;
    protected Integer y;
    protected String direction;

    /*
    les constructeurs (generé par clic droit)
     */
    public Robot() {
        this.x = 0;
        this.y = 0;
        this.direction = "Est";
    }

    public Robot(String nom) {
        this.nom = nom;
        this.x = 0;
        this.y = 0;
        this.direction = "Est";
    }

    public Robot(String nom, Integer x, Integer y, String direction) {
        this.nom = nom;
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    /*
    les getters and setters(généré par clic droit) :
    les gets permettent de recupérer le contenu des variables (proprietées)
    les sets permettent de modifier le contenu des variables (proprietées)
     */
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    /*
    Les surcharges de méthodes (refefinir les a"é²&ctions d'une fonction)
     */
    //ToString : Permet de redéfinir l'affichage, lors de l'appelle d'une variable
    @Override
    public String toString() {
        return this.nom + " ma direction est: " + this.direction + " mon x est = à " + this.x + " mon y est = à " + this.y;
    }

    /*
    nos fonctions
     */
    public void avance() {
        if (this.direction == "Est") {
            this.x++;
        } else if (this.direction == "Sud") {
            this.y--;
        } else if (this.direction == "Ouest") {
            this.x--;
        } else if (this.direction == "Nord") {
            this.y++;
        }
    }

    public void droite() {
        if (this.direction == "Est") {
            this.direction = "Sud";
        } else if (this.direction == "Sud") {
            this.direction = "Ouest";
        } else if (this.direction == "Ouest") {
            this.direction = "Nord";
        } else if (this.direction == "Nord") {
            this.direction = "Est";
        }

    }

}
