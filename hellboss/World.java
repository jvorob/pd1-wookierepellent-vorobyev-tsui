/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hellboss;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author George Vorobyev <quaffle97@gmail.com>
 */
public class World{
    public static World w;
    
    public Mouse mouse;
    
    public static final int MODE_PLAY = 0;
    public static final int MODE_MENU = 1;
    
    public int viewX = 250;
    public int viewY = 250;
    
    public static int frames;
    public static float time;
    public static int fps;
    
    public World(Mouse m)
    {
        mouse = m;
        w = this;
        startGame();
    }
    
    private void startGame()
    {
	    //init things
    }
    
    private void loadLevel(String fileName)
    {
	    //todo
    }
    
    private void saveLevel()
    {
	    //todo
    }
    
    public void update(float time, Keyboard keys, Mouse m)//per-frame game updates
    {
            updateWorld(time, keys, m);
    }
    
    public void updateWorld(float time, Keyboard keys, Mouse m)
    {
	    //todo
    }
    
    public void draw(BufferedImage b)
    {
        drawWorld(b);
         
    }
    
    public void drawWorld(BufferedImage b)
    {
        
	Graphics2D g = b.createGraphics();
	//Misc.prln("aasf");//Misc.prln is just a convenient shorthand i wrote for system.out.println
	//it doesnt work for everything though, peek inside the class
	g.setColor(Color.red);
	g.fillOval(50,50,50,50);
	    //todo
    }
}
