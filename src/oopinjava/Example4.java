package oopinjava;

class MyMovie
{
    String title;
    String genre;
    int duration;
    double rating;

    // constructors
    public MyMovie()
    {
        System.out.println("No Argument Constructor Called");
    }

    public MyMovie(String title, String genre, int duration,double rating)
    {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
        System.out.println("All Argument Constructor Called");
    }

    // getters and setter
    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "MyMovie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", duration=" + duration +
                ", rating=" + rating +
                '}';
    }
}


public class Example4 {
    public static void main(String[] args) {
        MyMovie pushpa = null;
        pushpa = new MyMovie();

        MyMovie pushpa2 = null;
        pushpa2 = new MyMovie("Pusha-2","Faltu",3,4.0);
        System.out.println(pushpa2);

    }
}
