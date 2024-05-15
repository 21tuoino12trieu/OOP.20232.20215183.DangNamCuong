package AimProjects.hust.soict.globalict.aims.media;

public class Track implements Playable {
    private String title;
    private int length;
    public Track(String title, int length){
        this. title = title;
        this. length = length;
    }
    public Track(){

    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getLength(){
        return length;
    }
    public void play(){
        System.out.println("Playing track: "+title);
        System.out.println("Track length: "+length);
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Track){
            Track t = (Track) obj;
            return title.equalsIgnoreCase(t.getTitle());
        }
        else{
            return false;
        }
    }
}
