/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.teacher.portal;

/**
 *
 * @author F2017266455
 */
public class Course {
    
    private String title;
    private int creditHours;
    private String type;
    private String category;
    
    
    public Course(String title, int creditHours, String type, String category) {
        this.title = title;
        this.creditHours = creditHours;
        this.type = type;
        this.category = category;
    }
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    
    
    
    
    
    
}
