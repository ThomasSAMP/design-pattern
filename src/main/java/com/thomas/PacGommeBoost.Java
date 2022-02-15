package com.thomas;
import java.awt.Color;

public class PacGommeBoost implements IPacGomme { 
    size = 10;
    color = Color.BLUE;

    public PacGommeBoost(size, color) {
        this.size = size;
        this.color = color;
    }

    public static void main (String[] arg) {
        List<PacGommeBoost> listPacGommeBoost = new ArrayList<PacGommeBoost>();
        listPacGommeBoost.add(new PacGommeBoost());
        listPacGommeBoost.add(new PacGommeBoost());
        listPacGommeBoost.add(new PacGommeBoost());
        listPacGommeBoost.add(new PacGommeBoost());
        listPacGommeBoost.add(new PacGommeBoost());
    }
}
