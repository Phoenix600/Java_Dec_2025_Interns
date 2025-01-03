package oopinjava;


class MyTelevision
{
    // Data Members
    private int channelNumber;
    private int volumne;
    private String brandName;
    private boolean isAndroid; // is, has, contains
    private boolean isOn;

    // Constructor
    public MyTelevision() {
        System.out.println("MyTelevision() called");
    }

    public MyTelevision(int channelNumber, int volumne,
                        String brandName, boolean isAndroid,
                        boolean isOn
                        )
    {
        this.channelNumber = channelNumber;
        this.volumne = volumne;
        // this for you
    }

    // Member Functions or Members
    public void displayChannel()
    {
        System.out.println("Channel Number : " + this.channelNumber);
        return;
    }
     public void displayVolume()
    {
        System.out.println("Volume : " + this.volumne);
        return;
    }

    // getters and setter
    public int getChannelNumber()
    {
        return this.channelNumber;
    }

    public void setChannelNumber(int channelNumber)
    {
        this.channelNumber = channelNumber;
    }

    public int getVolumne() {
        return volumne;
    }

    public void setVolumne(int volumne) {
        this.volumne = volumne;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public boolean isAndroid() {
        return isAndroid;
    }

    public void setAndroid(boolean android) {
        isAndroid = android;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String toString()
    {
        return  this.channelNumber + "..." + this.volumne + "\n";
    }

}


public class Example3 {
    public static void main(String[] args) {
        MyTelevision samsungTv  = new MyTelevision();
        System.out.println(samsungTv);

        MyTelevision lgTv = new MyTelevision(116,80,"LGTV",true,false);
        System.out.println(lgTv);
    }
}
