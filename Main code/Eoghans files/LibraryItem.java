package com.mycompany.libraryproject;

public class LibraryItem {

    private int itemID;
    private String title;
    private boolean available;

    public LibraryItem(int itemID, String title, boolean available) {
        // constructor implementation
        this.itemID = itemID;
        this.title = title;
        this.available = available;
    }

    //ItemID getter
    public int getItemID() {
        return itemID;
    }

    //ItemID setter
    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    //Title getter
    public String getTitle() {
        return title;
    }

    ///title setterr
    public void setTitle(String title) {
        this.title = title;
    }

    //isAvaialable output (Boolean Y/N)
    public boolean isAvailable() {
        // getter implementation
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available; 
    }

    public String toString() {
        return "itemID: " + itemID 
               +"\ntitle: " + title;
    }
}