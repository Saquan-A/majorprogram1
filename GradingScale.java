/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author saqua
 */
public class GradingScale {
    private ArrayList<GradeLevel> gradeLevels;
    private int maxPoints; 
    
    public GradingScale() {
        gradeLevels = new ArrayList<GradeLevel>();
    }
    
    public GradingScale( int maxPoints) {
        this.maxPoints = maxPoints;
        gradeLevels = new ArrayList<GradeLevel>();
    }
        
  
    /**
     * @return the gradeLevels
     */
      public int getNumgradeLevels(){
        return gradeLevels.size();
    }
    public GradeLevel getgradeLevels(int index){
        return gradeLevels.get(index); 
    }
    public void setgradeLevels(int index, GradeLevel item ) {
       gradeLevels.set(index, item);
    }
    public void addgradeLevels( GradeLevel item) {
        gradeLevels.add(item);
    }
    public void removegradeLevels(int index){
        gradeLevels.remove(index);
    }
    public ArrayList<GradeLevel> getGradeLevels() {
        return gradeLevels;
    }

    /**
     * @param gradeLevels the gradeLevels to set
     */
    public void setGradeLevels(ArrayList<GradeLevel> gradeLevels) {
        this.gradeLevels = gradeLevels;
    }

    /**
     * @return the maxPoints
     */
    public int getMaxPoints() {
        return maxPoints;
    }

    /**
     * @param maxPoints the maxPoints to set
     */
    public void setMaxPoints(int maxPoints) {
        this.maxPoints = maxPoints;
    }
    
    /**
     *
     * @return
     */
    @Override
      public String toString() {
        String largeString = Integer.toString(maxPoints)+"\n";
        for(int i=0; i<gradeLevels.size(); i++){
            largeString = largeString+gradeLevels.get(i).toString()+"\n";
        }
       return largeString;         
    }

    
}
