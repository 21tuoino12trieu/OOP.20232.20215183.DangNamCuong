package AimProjects.hust.soict.globalict.aims.media;
import java.util.*;
public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    public Media(){
        
    }
    public Media(int id, String title, String category, float cost){
        this.id = id;
        this.title = title;
        this.category = category;
        this.cost = cost; 
    }

    public void setID(int id){
        this.id = id;
    }
    public int getID(){
        return id;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setCategory(String category){
        this.category = category;
    }
    public String getCategory(){
        return category;
    }
    public void setCost(float cost){
        this. cost = cost;
    }
    public float getCost(){
        return cost;
    }
    
    @Override 
    public String toString() {
        return "ID: "+id+"\n"+
               "Title: "+title+"\n"+
               "Category: "+title+"\n"+
               "Cost: "+cost+"\n";
   }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Media){
            Media m = (Media)obj;
            return title.equalsIgnoreCase(m.getTitle());
        }
        else{
            return false;
        }
    }
}
