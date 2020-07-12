/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fil_rouge;

/**
 *
 * @author Hamad
 */
public class Activity {
    public String description;
    public int duree;
    public Activity(String description, int duree){
        this.description=description;
        this.duree=duree;
    }
    public int getDuration(){
         return this.duree;
    }
    public String toString(){
        return "" +this.toString();
    }
}
