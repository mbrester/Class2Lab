/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author Mitch
 */
public class WelcomeService {
   Calendar c1 = Calendar.getInstance();
   
   
   
   public String getWelcomeMessige(String name){
       if(c1.get(Calendar.HOUR_OF_DAY)<12){
           return "Good Morning " + name;
       }else if(c1.get(Calendar.HOUR_OF_DAY)> 11 || c1.get(Calendar.HOUR_OF_DAY) < 17 ){
           return "Good AfterNoon " + name;
       }else{
           return "Good Evening " + name;
       }
       
   }
}
