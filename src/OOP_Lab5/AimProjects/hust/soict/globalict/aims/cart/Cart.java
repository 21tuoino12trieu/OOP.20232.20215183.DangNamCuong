package OOP_Lab5.AimProjects.hust.soict.globalict.aims.cart;

import java.util.*;

import OOP_Lab5.AimProjects.hust.soict.globalict.aims.media.Media;
import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;

public class Cart{
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    public Cart(){
    
    }
    public ObservableList<Media> getItemsOrdered() {
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
        itemsOrdered = new ObservableList<Media>() {
            @Override
            public void addListener(ListChangeListener<? super Media> listChangeListener) {

            }

            @Override
            public void removeListener(ListChangeListener<? super Media> listChangeListener) {

            }

            @Override
            public boolean addAll(Media... media) {
                return false;
            }

            @Override
            public boolean setAll(Media... media) {
                return false;
            }

            @Override
            public boolean setAll(Collection<? extends Media> collection) {
                return false;
            }

            @Override
            public boolean removeAll(Media... media) {
                return false;
            }

            @Override
            public boolean retainAll(Media... media) {
                return false;
            }

            @Override
            public void remove(int i, int i1) {

            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Media> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Media media) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Media> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Media> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Media get(int index) {
                return null;
            }

            @Override
            public Media set(int index, Media element) {
                return null;
            }

            @Override
            public void add(int index, Media element) {

            }

            @Override
            public Media remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Media> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Media> listIterator(int index) {
                return null;
            }

            @Override
            public List<Media> subList(int fromIndex, int toIndex) {
                return null;
            }

            @Override
            public void addListener(InvalidationListener invalidationListener) {

            }

            @Override
            public void removeListener(InvalidationListener invalidationListener) {

            }
        };
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
