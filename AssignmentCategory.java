/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram1;
import java.util.ArrayList;

/**
 *
 * @author saqua
 */
public class AssignmentCategory {
    private ArrayList<Assignment> assignments;
    private int category;
    private int pointsEarned;
    private int pointsAssigned; 
    
    public AssignmentCategory() {
      assignments = new ArrayList<Assignment>();
      category = 0;
      pointsEarned = 0;
      pointsAssigned = 0;
          
    }
    
    public AssignmentCategory(int category){
        this.category = category;
        assignments = new ArrayList<Assignment>();
    }

    /**
     * @return the assignments
     */
    public int getNumassignments(){
        return assignments.size();
    }
    public Assignment getassignments(int index){
        return assignments.get(index); 
    }
    public void setassignments(int index, Assignment item ) {
        assignments.set(index, item);
    }
    public void addassignments( Assignment item) {
        assignments.add(item);
    }
    public void removeassignments(int index){
        assignments.remove(index);
    }
    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    /**
     * @param assignments the assignments to set
     */
    public void setAssignments(ArrayList<Assignment> assignments) {
        this.assignments = assignments;
    }

    /**
     * @return the category
     */
    public int getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(int category) {
        this.category = category;
    }

    /**
     * @return the pointsEarned
     */
    public int getPointsEarned() {
        return pointsEarned;
    }

    /**
     * @param pointsEarned the pointsEarned to set
     */
    public void setPointsEarned(int pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    /**
     * @return the pointsAssigned
     */
    public int getPointsAssigned() {
        return pointsAssigned;
    }

    /**
     * @param pointsAssigned the pointsAssigned to set
     */
    public void setPointsAssigned(int pointsAssigned) {
        this.pointsAssigned = pointsAssigned;
    }
    @Override
    public String toString() {
        String largeString3 = Integer.toString(category)+" "+assignments.size()+"\n";   
         for (int i = 0 ; i <assignments.size(); i++){
         largeString3 = largeString3+assignments.get(i).toString()+"\n";
         }
         return largeString3;
    }
    
}
