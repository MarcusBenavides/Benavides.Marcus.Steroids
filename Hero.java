import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    private int speed_;
    private int changeControls = 0;
    public Hero()
    {
        speed_ = 2;
        
    }
    public int getSpeed()
    {
        return speed_;
    }
    public void setSpeed(int s)
    {
        speed_ = s;
    }
    
    public void act()
    {
        processKeys();
        trackMouse();
    }
    public void processKeysAlt()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-5);
        
    }
    else if (Greenfoot.isKeyDown("right"))
    {
        turn(5);
    }
    else if (Greenfoot.isKeyDown("up"))
    {
        if(speed_ <= 10)
        {
            speed_++;
        }
    }
    else if (Greenfoot.isKeyDown("down"))
    {
            speed_--;
    }
    move(speed_);
}

public void processKeys()
{
    if(Greenfoot.isKeyDown("a"))
    {
        setLocation( getX() - speed_, getY() );
    }
     else if (Greenfoot.isKeyDown("d"))
     {
        setLocation( getX() + speed_, getY() );            
     }
     
     if(Greenfoot.isKeyDown("w"))
    {
        setLocation( getX(), getY() -speed_ );
    }
     else if (Greenfoot.isKeyDown("s"))
     {
        setLocation( getX(), getY() +speed_ );           
     }
     
    if(Greenfoot.isKeyDown("space"))
    {
        shoot();
    }
}

public void trackMouse()
{
    MouseInfo mi = Greenfoot.getMouseInfo();
    if(mi != null)
    {
        turnTowards(mi.getX(), mi.getY());
    }
}

public void shoot()
{
    Laser laser = new Laser(5);
    laser.setRotation(getRotation());
    getWorld().addObject(laser,getX(),getY());
    
}

}
