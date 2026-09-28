import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

/**
 * A world where wombats live.
 * 
 * @author Michael Kölling
 * @version 2.0
 */
public class WombatWorld extends World //class name has to matcg filename
{
    /**
     * Create a new world with 10x10 cells and
     * with a cell size of 60x60 pixels.
     */
    public WombatWorld() 
    {
        super(10, 10, 60);        
        setBackground("cell.jpg");
        setPaintOrder(Wombat.class, Leaf.class);  // draw wombat on top of leaf
        prepare();
    }

    /**
     * Populate the world with a fixed scenario of wombats and leaves.
     */    
    public void populate()
    {
        addObject(new Wombat(), 7, 1);
        addObject(new Wombat(), 6, 6);
        addObject(new Wombat(), 1, 7);
        randomLeaves(20);
    }

    /**
     * Place a number of leaves into the world at random places.
     * The number of leaves can be specified.
     */
    public void randomLeaves(int howMany)
    {
        for (int i=0; i<howMany; i++) {
            Leaf leaf = new Leaf();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(leaf, x, y);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wombat wombat = new Wombat();
        addObject(wombat,2,3);
        Wombat wombat2 = new Wombat();
        addObject(wombat2,6,3);
        Wombat wombat3 = new Wombat();
        addObject(wombat3,4,6);
        wombat2.setLocation(6,3);
        Wombat wombat4 = new Wombat();
        addObject(wombat4,8,8);
        Wombat wombat5 = new Wombat();
        addObject(wombat5,2,8);
        Wombat wombat6 = new Wombat();
        addObject(wombat6,5,0);
        Leaf leaf = new Leaf();
        addObject(leaf,8,2);
        Leaf leaf2 = new Leaf();
        addObject(leaf2,6,6);
        Leaf leaf3 = new Leaf();
        addObject(leaf3,2,1);
        Leaf leaf4 = new Leaf();
        addObject(leaf4,4,4);
        Leaf leaf5 = new Leaf();
        addObject(leaf5,0,7);
        Leaf leaf6 = new Leaf();
        addObject(leaf6,6,9);
    }
}