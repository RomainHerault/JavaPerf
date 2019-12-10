package org.polytechtours.javaperformance.tp.paintingants;

import java.awt.*;
import java.util.HashMap;

public class ColorManager {

    HashMap<String, Color> hmap;

    public ColorManager()
    {
        hmap = new HashMap<String, Color>();
    }

    public Color getColor(int R,int G, int B)
    {
        if(hmap.containsKey(RGBtoString(R,G,B)))
        {
            return hmap.get(RGBtoString(R,G,B));
        }
        else
        {
            Color newcolor = new Color(R,G,B);
            hmap.put(RGBtoString(R,G,B),newcolor);
            return newcolor;
        }
    }

    private String RGBtoString(int R,int G,int B)
    {
        return "R" + Integer.toString(R) + "G" + Integer.toString(G) + "B" + Integer.toString(B);
    }

}
