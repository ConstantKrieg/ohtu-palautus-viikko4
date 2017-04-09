/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kim
 */
public class Course {
    
    private String name, term;
    
    private String week1, week2,week3,week4,week5,week6;

    public String getName() {
        return name;
    }

    public String getTerm() {
        return term;
    }
    
    
    
    public List<String> getWeeksAsList(){
        String[] weekArray = {"Here to fill so indexes match with the week numbers", week1, week2,week3,week4,week5,week6};
        return Arrays.asList(weekArray);
    }
}
