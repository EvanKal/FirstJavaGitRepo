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
public class NonAndroid extends Phone{
    
    final double price = 37.99;

    public NonAndroid(String brand) {
        super(brand);
    }
    
        @Override
    public void SetPrice() {
                super.setPrice(price);
    }
    
}
