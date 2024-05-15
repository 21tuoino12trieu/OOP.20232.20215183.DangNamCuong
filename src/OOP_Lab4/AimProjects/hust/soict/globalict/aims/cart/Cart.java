package AimProjects.hust.soict.globalict.aims.cart;

import java.util.ArrayList;

import AimProjects.hust.soict.globalict.aims.media.Media;

public class Cart{
    private ArrayList<Media>itemsOrdered = new ArrayList<Media>();
    public Cart(){
    
    }
    public ArrayList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
    public void  addMedia(Media m){
        if(!itemsOrdered.contains(m)){
            itemsOrdered.add(m);
        }
    }

    public void removeMedia(Media m){
        if(itemsOrdered.contains(m)){
            itemsOrdered.remove(m);
        }
    }
    
    public float totalCost(){
        float total = 0;
        for(int i = 0; i<itemsOrdered.size(); i++){
              total = total + itemsOrdered.get(i).getCost();
        }
        return total;
    }
    public void listMedia(){
        System.out.println("===============CART===============");
        for(int i=0;i< itemsOrdered.size();i++){
            System.out.println(itemsOrdered.get(i).toString());
        }
    }


    public Media searchID(int id){
        for(int i= 0;i<itemsOrdered.size();i++){
        if(itemsOrdered.get(i).getID()==id){
            return itemsOrdered.get(i);
        }
      }
      return null;
    }

    public Media searchName(String title){
         for(int i=0;i < itemsOrdered.size();i++){
            if(itemsOrdered.get(i).getTitle().equalsIgnoreCase(title)){
                return itemsOrdered.get(i);
            }
         }
         return null;
    }

    public int getSize(){
        return itemsOrdered.size();
    }
    
    public void newCart(){
        itemsOrdered = new ArrayList<Media>();
    }
    
    public void filter(String title) {
		Media item = searchName(title);
		if(item == null) System.out.println("Can't find item");
		else System.out.println(item.toString());
	}
	public void filter(int id) {
		Media item = searchID(id);
		if(item == null) System.out.println("Can't find item");
		else System.out.println(item.toString());
	}


}
