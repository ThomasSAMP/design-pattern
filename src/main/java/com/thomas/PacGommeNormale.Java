package com.thomas;
import java.awt.Color;

public class PacGommeNormale implements IPacGomme {
    size = 5;
    color = Color.YELLOW;

    public List<PacGommeNormale> listPacGommeNormale = new ArrayList<PacGommeNormale>();

    public PacGommeNormale(size, color) {
        this.size = size;
        this.color = color;
    }

    public static void main (String[] arg) {
        listPacGommeNormale.add(new PacGommeNormale());
        listPacGommeNormale.add(new PacGommeNormale());
        listPacGommeNormale.add(new PacGommeNormale());
        listPacGommeNormale.add(new PacGommeNormale());
        listPacGommeNormale.add(new PacGommeNormale());
        listPacGommeNormale.add(new PacGommeNormale());
        listPacGommeNormale.add(new PacGommeNormale());
        listPacGommeNormale.add(new PacGommeNormale());
        listPacGommeNormale.add(new PacGommeNormale());
        listPacGommeNormale.add(new PacGommeNormale());
    }


}
