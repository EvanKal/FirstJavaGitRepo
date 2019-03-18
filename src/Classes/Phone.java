/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Los_e
 */
public abstract class Phone {
    private String brand;
    private double  price;
    
    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public  abstract void SetPrice();

    @Override
    public String toString() {
        return "Phone{" + "brand=" + brand + ", price=" + price + '}';
    }
    
    
    
}
