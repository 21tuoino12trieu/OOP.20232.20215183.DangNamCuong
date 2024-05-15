package AimProjects.hust.soict.globalict.aims.media;


public class DigitalVideoDisc extends Disc  {
    public DigitalVideoDisc(int id, String title, String category, float cost, int length, String director){
           super(id, title, category, cost, length, director);
    }
    public DigitalVideoDisc(String title){
        super.setTitle(title);
    }
    public DigitalVideoDisc(String title,String category,float cost){
        super.setTitle(title);
        super.setCategory(category);
        super.setCost(cost);
    }
    public DigitalVideoDisc(String director, String category, String title, float cost){
        super.setDirector(director);
        super.setCategory(category);
        super.setTitle(title);
        super.setCost(cost);
    }
    public DigitalVideoDisc(){
        
    }

}
