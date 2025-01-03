package oopinjava;

class Television
{
    int channelNumber;
    int volume;

    void changeChannel(int ch)
    {
        channelNumber = ch;
    }

    void changeVolume(int vol)
    {
        volume = vol;
    }

    // Default Constructor
    Television()
    {
        System.out.println("Running Default Constructor");
    }

    // All Argument Constructor
    Television(int ch, int vol)
    {
        channelNumber = ch;
        volume = vol;

        System.out.println("Running All Argument Constructor");
    }
}


public class Example1 {
    public static void main(String[] args) {
        int x = 12;

        Television samsungTv = new Television();
        Television miTv = new Television(455,80);


        System.out.println(samsungTv.channelNumber);
        System.out.println(samsungTv.volume);

        samsungTv.changeChannel(100);
        samsungTv.changeVolume(60);

        System.out.println(samsungTv.channelNumber);
        System.out.println(samsungTv.volume);

    }
}