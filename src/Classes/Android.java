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
public class Android extends Phone {
    
    final double price = 24.99;
    final int test = 0;
    
    public Android(String brand) {
        super(brand);
    }

    
    @Override
    public void SetPrice() {
        super.setPrice(price);
    }
}
