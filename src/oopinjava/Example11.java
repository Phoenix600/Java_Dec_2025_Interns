package oopinjava;

// Added C as prefix to indicate this is Class
// CLivingBeing <--- CAnimal <---- CBird <--- CEagle
class CLivingBeing
{
    // make data members private
    private String respirationType;

    // constructors
    public CLivingBeing()
    {
        // Every class gets its properties from Object class
        super(); // to call Object Class Constructor
    }

    public CLivingBeing(String respirationType)
    {
        this.respirationType = respirationType;
    }

    // Getters and Setter
    public String getRespirationType() {
        return respirationType;
    }

    public void setRespirationType(String respirationType) {
        this.respirationType = respirationType;
    }

    // toString

    @Override
    public String toString() {
        return "CLivingBeing{" +
                "respirationType='" + respirationType + '\'' +
                '}';
    }
}

// CAnimal Class
class CAnimal extends CLivingBeing
{
    // make data member private please
    String habitat;

    public CAnimal()
    {
        super();
    }

    public CAnimal(String habitat) {
        super();
        this.habitat = habitat;
    }

    public CAnimal(String respirationType, String habitat) {
        super(respirationType);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "CAnimal{" +
                "habitat='" + habitat + '\'' +
                '}';
    }
}

// cBird Class
class CBird extends CAnimal
{
    boolean canFly;

    public CBird()
    {
        super();
    }

    public CBird(String habitat) {
        super(habitat);
    }

    public CBird(String respirationType, String habitat, Boolean canFly) {
        super(respirationType, habitat);
        this.canFly = canFly;
    }

    public boolean getIsCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    @Override
    public String toString() {
        return "CBird{" +
                "canFly=" + canFly +
                '}';
    }
}


///  Eagle Class
class CEagle extends CBird
{
    double wingSpan;

    public CEagle()
    {
        super();
    }

    public CEagle(String respirationType, String habitat,Boolean canFly ,double wingSpan)
    {
        super(respirationType,habitat,canFly);
        this.wingSpan = wingSpan;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return "CEagle{" +
                "wingSpan=" + wingSpan +
                ", canFly=" + canFly +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}

public class Example11 {
    public static void main(String[] args)
    {
        // Creating the object of LivingBeing
        // avian respiratory system is for birds 😁
        System.out.println("Creating the LivingBeing object");
        CLivingBeing livingBeing = new CLivingBeing("Avian respiratory system");
        System.out.println( "Respiratory Type " + livingBeing.getRespirationType());

        System.out.println("Creating the CAnimal object");
        CAnimal animal = new CAnimal(" avian respiratory system","Forest and GrassLands");
        System.out.println("Respiratory Type " + animal.getRespirationType()); // from  parent class
        System.out.println("Habitat  " + animal.getHabitat()); // child class

        // Are Eagle Bird can fly ree.. that's why it is true 😅
        System.out.println("Creating the CBird object");
        CBird bird = new CBird(" avian respiratory system","Forest and GrassLands",true);
        System.out.println("Respiratory Type " + bird.getRespirationType()); // from  parent class
        System.out.println("Habitat  " + bird.getHabitat());
        System.out.println("Can Fly : " + bird.getIsCanFly());

        // Wings of eagle can be from five and a half feet to eight feet.
        System.out.println("Creating the CEagle object");
        CEagle eagle = new CEagle(" avian respiratory system","Forest and GrassLands",true,5.5);
        System.out.println("Respiratory Type " + eagle.getRespirationType()); // from  parent class
        System.out.println("Habitat  " + eagle.getHabitat());
        System.out.println("Can Fly : " + eagle.getIsCanFly());
        System.out.println("Wingspan : " + eagle.getWingSpan());


    }
}
