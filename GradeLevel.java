/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram1;

/**
 *
 * @author saqua
 */
public class GradeLevel {
    private String letterGrade;
    private int minPoints;
    private double percentage;
    
    public GradeLevel(){
        letterGrade = "";
        minPoints = 0;
        percentage = 0.0;
    }
    
    
    public GradeLevel(String letterGrade, int minPoints, double percentage){
        this.letterGrade = letterGrade;
        this.minPoints = minPoints;
        this.percentage = percentage; 
    }

    /**
     * @return the letterGrade
     */
    public String getLetterGrade() {
        return letterGrade;
    }

    /**
     * @param letterGrade the letterGrade to set
     */
    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    /**
     * @return the minPoints
     */
    public int getMinPoints() {
        return minPoints;
    }

    /**
     * @param minPoints the minPoints to set
     */
    public void setMinPoints(int minPoints) {
        this.minPoints = minPoints;
    }

    /**
     * @return the percentage
     */
    public double getPercentage() {
        return percentage;
    }

    /**
     * @param percentage the percentage to set
     */
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String lA = letterGrade+ " "+ Integer.toString(minPoints);
        return lA; 
    }
}
