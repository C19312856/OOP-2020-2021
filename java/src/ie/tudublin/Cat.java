package ie.tudublin;

public class Cat extends Animal
{
    private int numLives;

    public Cat(String name)
    {
        super(name);
        numLives = 9;
    }

    void kill()
    {
        if(numLives>0)
        {
            numLives = numLives - 1;
            System.out.println("Ouch");
        }
        else
        {
            System.out.println("Dead");
        }
    }

    public int getNumLives() {
        return numLives;
    }

    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

}