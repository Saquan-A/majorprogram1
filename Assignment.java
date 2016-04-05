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
public class Assignment {
    private int points;
    private int maxPoints;
    
    public Assignment(){
        points = 0;
        maxPoints = 0;
    }
    
    public Assignment(int points, int maxPoints) {
        this.points = points;
        this.maxPoints = maxPoints;
        
    }

    /**
     * @return the points
     */
    public int getPoints() {
        return points;
    }

    /**
     * @param points the points to set
     */
    public void setPoints(int points) {
        this.points = points;
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
      String largeString2 =Integer.toString(points)+" "+Integer.toString(maxPoints);
          return largeString2;
    }
}
