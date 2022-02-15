package com.thomas;

public class Game {

    public static void addItemOnLabyrinthe(int posX, int posY)
    {
        //explorer les 2 tableaux (boost et normale) et affecter la position (x, y) avec setPosition() de l'interface IPacGomme
    }

    public static void main(String[] args)
    {
        int height = 100;
        int width = 100;

        int posX = (int)Math.random() * (width - 0);
        int posY = (int)Math.random() * (height - 0);
        addItemOnLabyrinthe(posX, posY);
    }

    
}
