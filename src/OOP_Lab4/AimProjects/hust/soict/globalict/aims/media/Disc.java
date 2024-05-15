package AimProjects.hust.soict.globalict.aims.media;

public class Disc extends Media implements Playable {
    private int length;
    private String director;
    public Disc(){

    }
    public Disc(int id, String title, String category, float cost, int length, String director){
        super(id, title, category, cost);
        this. length = length;
        this. director = director;
    }
    public void setLength(int length){
        this. length= length;
    }
    
    public int getLenght(){
        return length;
    }
    public void setDirector(String director){
        this.director = director;
    }
    public String getDirector(){
        return director;
    }
    public void play(){
        System.out.println("Playing DVD: "+this.getTitle());
        System.out.println("DVD length: "+this.getLenght());
    }
}
