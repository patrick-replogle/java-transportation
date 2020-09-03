package transport;

// class -> blueprint for objects
// abstract class -> blueprint for classes
abstract class AbstractVehicle
{
    // parent and child know of the protected fields
    protected int fuel;

    // default constructor -> no parameters
    public AbstractVehicle()
    {
        fuel = 1;
    }

    public AbstractVehicle(int fuel)
    {
        this.fuel = fuel;
    }

    // abstract method -> creates a method but leaves it up to child class to implement what it does
    abstract String getPath();
    abstract String getName();
    // regular methods
    void move()
    {
        fuel--;
    }

    void move(int steps)
    {
        fuel = fuel - steps;
    }

    int getFuelLevel()
    {
        return fuel;
    }

    void addFuel(int i)
    {
        fuel = fuel + i;
    }

}