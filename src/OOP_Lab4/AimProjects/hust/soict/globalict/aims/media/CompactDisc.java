package AimProjects.hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc {
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();
    public CompactDisc(int id, String title, String category, float cost, int length, String director, String artist){
        super(id, title, category, cost, length, director);
        this.artist = artist;
    }
    public CompactDisc(){
        
    }
    public void setArtist(String artist){
        this. artist = artist;
    }
    public String getArtist(){
        return artist;
    }
    public void addTrack(Track tr){
        if(!tracks.contains(tr)){
            tracks.add(tr);
        }
        else{
            System.out.println("This track have been added");
        }
    }
    public void removeTrack(Track tr){
        if(!tracks.contains(tr)){
            System.out.println("Cannot find this track");
        }
        else{
            tracks.remove(tr);
        }
    }

    public int getLength(){
        int sum_length = 0;
        for (Track track : tracks) {
            sum_length = sum_length + track.getLength();
        }
        return sum_length;
    }

}
