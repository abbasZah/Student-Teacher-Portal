
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.teacher.portal;

import java.util.ArrayList;

/**
 *
 * @author Abbas Zaheer
 */
public class DegreeProgram {
    
     //all attributes are in cammelCase Letters;
    
    private String type;
    private String name;
    
    private int duration;
    private int noOfQuarters;
    
    private double totalFee;
    
    
    private ArrayList<Course> courseList = new ArrayList<>();
    
    
                //Constructors

    public DegreeProgram(String type, String name, int duration, double totalFee, ArrayList<Course>obj) {
       
        this.type = type;
        this.name = name;
        this.duration = duration;
        this.noOfQuarters = duration*4;
        this.totalFee = totalFee;
        
        courseList=obj;
        
        
    }
    
    
    
                //Getters & Setters
    
    

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getNoOfQuarters() {
        return noOfQuarters;
    }

    public void setNoOfQuarters(int noOfQuarters) {
        this.noOfQuarters = noOfQuarters;
    }

    
    public double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }

   
    
}