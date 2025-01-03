package oopinjava;


class CelestialBody
{
    // data members
    private double mass;

    // constructor
    public CelestialBody(double mass)
    {
        this.mass = mass;
    }

    public double getMass()
    {
        return this.mass;
    }

    public void setMass(double mass)
    {
        this.mass = mass;
    }

    public String toString()
    {
        return "Mass : " + this.mass;
    }
}


class Star extends CelestialBody
{
    private double temperature;

    public Star(double temperature, double mass)
    {
        super(mass);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "temp : " + this.temperature + "..." + "mass : " + this.getMass();
    }
}

class Plant extends Star
{

    private boolean hasAtmosphere;

    public Plant(boolean hasAtmosphere, double temp, double mass)
    {
        super(temp,mass);
        this.hasAtmosphere = hasAtmosphere;
    }

    public boolean isHasAtmosphere() {
        return hasAtmosphere;
    }

    public void setHasAtmosphere(boolean hasAtmosphere) {
        this.hasAtmosphere = hasAtmosphere;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "hasAtmosphere=" + hasAtmosphere +
                '}';
    }
}

class MotherEarth extends Plant
{
    private boolean hasLife;

    public MotherEarth(boolean hasLife, boolean hasAtm, double temp, double mass)
    {
        super(hasAtm,temp, mass);
        this.hasLife = hasLife;
    }

    public boolean isHasLife() {
        return hasLife;
    }

    public void setHasLife(boolean hasLife) {
        this.hasLife = hasLife;
    }

    @Override
    public String toString() {
        return "MotherEarth{" +
                "hasLife=" + hasLife +
                '}';
    }
}

public class Example12 {
    public static void main(String[] args) {
        double mass = 5.9e24;
        double temp = 7952.0;
        boolean hasAtm = true;
        boolean hasLife = true;
//        CelestialBody celestialBody = new CelestialBody(5.9e24);
//        Star star = new Star(temp,mass);

        MotherEarth earth = new MotherEarth(hasLife,hasAtm,temp,mass);
        System.out.println(earth.getMass());
    }
}
