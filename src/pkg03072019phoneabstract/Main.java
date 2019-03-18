/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03072019phoneabstract;

import Classes.Android;
import Classes.NonAndroid;
import Classes.Phone;

/**
 *
 * @author Los_e
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Phone phone1 = new Android("Nokia");
        Phone phone2 = new NonAndroid("Huawei");
        Phone phone3 = new Android("Xiaomi");
        Phone phone4 = new Android("Samsung");
        Phone phone5 = new NonAndroid("Honor");
        Phone phone6 = new Android("Alcatel");
        Phone phone7 = new Android("Motorola");
        Phone phone8 = new NonAndroid("LG");
        Phone phone9 = new Android("MLS");
        Phone phone10 = new NonAndroid("iPhone");
        
//        phone1.SetPrice();
//        phone2.SetPrice();
//        phone3.SetPrice();
//        
//        System.out.println(phone1);
//        System.out.println(phone2);
//        System.out.println(phone3);

//        Phone[] phoneArray = new Phone[10];
        Phone[] phoneArray = {phone1, phone2, phone3, phone4, phone5, phone6, phone7, phone8, phone9, phone10};
        int countAndroid = 0;
        int countNonAndroid = 0;
        
        for (int i = 0; i < phoneArray.length; i++) {
            
            System.out.println(phoneArray[i].getClass().getSimpleName());
            
            if (phoneArray[i] instanceof Android) { 
                countAndroid += 1;
            } else if (phoneArray[i] instanceof NonAndroid){
                countNonAndroid +=1;
            }
              
        }
        
        System.out.println("Android Phones: " + countAndroid + "\n" + "NonAndroid Phones: " + countNonAndroid );
        
    }
    
}
