/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correctionjava;

import entites.Robot;
import entites.RobotNG;
import java.util.ArrayList;

/**
 *
 * @author Ikikay
 */
public class Correctionjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création de Robots de Tests (4 NG et 1 normal)
        RobotNG n1 = new RobotNG("toto");
        RobotNG n2 = new RobotNG("titi");
        RobotNG n3 = new RobotNG("tonton");
        RobotNG n4 = new RobotNG("ludo");
        Robot n5 = new Robot("Wall-e");
        
        n2.setTurbo(true);
        n2.avance(5);
        // Création d'une liste contenant plusieurs classes différentes (Robot, RobotNG, ou même autres)
        ArrayList<Object> maListeDeRobot = new ArrayList<Object>();
        // Ajout des Robots dans la liste
        maListeDeRobot.add(n1);
        maListeDeRobot.add(n2);
        maListeDeRobot.add(n3);
        maListeDeRobot.add(n4);
        maListeDeRobot.add(n5);

        // Parcours la ArrayList
        for (Object unRobot : maListeDeRobot) {
            // Affiche l'objet en cours de bouclage
            System.out.println(unRobot);
            //ICI vue que le type de liste == Object, impossible d'utilisé les méthodes de robots
            //unRobot.avance() crée une erreur.
        }

        // ----------- EXEMPLE AUTRES -----------
        //Création d'une liste Robot et d'une liste RobotNG
        ArrayList<Robot> maListeDeRobotNormal = new ArrayList<Robot>();
        ArrayList<RobotNG> maListeDeRobotNG = new ArrayList<RobotNG>();
        // Ajout des Robots dans les listes
        maListeDeRobotNG.add(n1);
        maListeDeRobotNG.add(n2);
        maListeDeRobotNG.add(n3);
        maListeDeRobotNG.add(n4);
        maListeDeRobotNormal.add(n5);

        // Parcours la ArrayList Robot
        for (Robot unRobot : maListeDeRobotNormal) {
            // Affiche l'objet en cours de bouclage
            System.out.println(unRobot);
            //ICI vue que le type de liste == Robot => Impossible d'utiliser les méthodes de RobotNG
            //unRobot.avance(5) crée une erreur.
            //mais ceci fonctionne car fonction de Robot
            unRobot.avance();
        }
        // Parcours la ArrayList RobotNG
        for (RobotNG unRobot : maListeDeRobotNG) {
            // Affiche l'objet en cours de bouclage
            System.out.println(unRobot);
            unRobot.avance(5);
        }

    }

}
