package com.house.ar;

public class CartItem {
    int image;
   String title;
   double price;
   CartItem(String title, int price, int image){
       this.title = title;
       this.price = price;
         this.image = image;
   }
    public String getTitle() {
         return title;
    }
    public void setTitle(String title) {
         this.title = title;
    }
    public double getPrice() {
         return price;
    }
    public void setPrice(double price) {
         this.price = price;
    }
    public int getImage() {
         return image;
    }
    public void setImage(int image) {
         this.image = image;
    }
}
