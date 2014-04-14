package com.grapeshot.halfnes;


/**
 * Write a description of class AIController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
  
public class AIController
{
        
    // instance variables - replace the example below with your own
   private final NES nes;

    /**
     * Constructor for objects of class AIController
     */
    public AIController(NES nes)
    {
       this.nes = nes;
    }

    public void action()
    {
        long frameNum = nes.framecount;
        byte[] bytes = nes.getRamBytes();
    }
}
