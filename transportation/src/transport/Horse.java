package transport;

public class Horse implements Animal, Vehicle
{
    private int fuel = 0;
    private String name;

    public Horse(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public void move()
    {
        fuel -= 1;
    }

    @Override
    public void eat(int i)
    {
        fuel += i;
    }

    @Override
    public String speak()
    {
        return "Neigh";
    }

    @Override
    public String getPath()
    {   
        return "Grass";
    }

    @Override
    public int getFuelLevel()
    {
        return fuel;
    }

    @Override
    public void addFuel(int i)
    {
        eat(i);
    }
}