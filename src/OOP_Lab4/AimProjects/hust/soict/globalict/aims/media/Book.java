package AimProjects.hust.soict.globalict.aims.media;

import java.util.ArrayList;

public class Book extends Media {
    private ArrayList<String> authors = new ArrayList<String>();
    public Book(int id, String title, String category, float cost){
        super(id, title, category, cost);
    }
    public Book(){
        
    }
    public void addAuthor(String authorName){
        if(!authors.contains(authorName)){
            authors.add(authorName);
        }
        else{
            System.out.println("This authors have been added");
        }
    }
    public void removeAuthor(String authorName){
        if(!authors.contains(authorName)){
            System.out.println("Cannot find author's name");
        }
        else{
            authors.remove(authorName);
        }
    }

}
