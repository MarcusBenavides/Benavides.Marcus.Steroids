import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    private int speed;
    private int damage;
    
    public Laser(int s)
    {
        speed = s;
        damage = 1;
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public void setSpeed(int s)
    {
        speed = s;
    }
    
    public void act()
    {
         move(speed);
         checkBoundaries();
    }
    
    
  
    public void checkBoundaries()
    {
        GreenfootImage img = getImage();
        int width = img.getWidth();
        int height = img.getHeight();
        
        World livesIn = getWorld();
        
        int left = getX() - width/2;
        int right = getX() +width/2;
        int top = getY() - height/2;
        int botton = getY() + height/2;
        
        if(left <= 0 )
        {
            livesIn.removeObject(this);
        }
        else if (right >= livesIn.getWidth())
        {
            livesIn.removeObject(this);
        }
        else if (top <= 0)
        {
            livesIn.removeObject(this);
        }
        else if (botton >= livesIn.getWidth())
        {
            livesIn.removeObject(this);
        }
    }
}
