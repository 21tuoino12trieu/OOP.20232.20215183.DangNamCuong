package AimProjects.hust.soict.globalict.aims.store;
import java.util.ArrayList;

import AimProjects.hust.soict.globalict.aims.media.Media;

public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<>();
    public Store(){
        this.itemsInStore = new ArrayList<Media>();
    }
    
    public void addMedia(Media m){
        if(!itemsInStore.contains(m)){
            itemsInStore.add(m);
        }
    }

    public void removeMedia(Media m){
        if(itemsInStore.contains(m)){
            itemsInStore.remove(m);
        }
    }

    public Media searchTitle(String title){
        for(int i=0; i<itemsInStore.size();i++){
            if(itemsInStore.get(i).getTitle().equalsIgnoreCase(title)){
            return itemsInStore.get(i);
            }
        }
        return null;
    }

    public void display(){
        System.out.println("===============STORE============");
        for(int i=0; i< itemsInStore.size();i++){
            System.out.println(itemsInStore.get(i).toString());
        }
    }
}
