/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author saqua
 */
public class StudentAssignments {
    private ArrayList<AssignmentCategory> assignCategories;
    private GradingScale gradingScale; 
    private int SPoints = 0;
    private int STotal = 0;
     
 
    public StudentAssignments() {
        assignCategories = new ArrayList<AssignmentCategory>();
    }
    public void addAssignment( int cat, int points, int maxPoints) {
        Assignment work = new Assignment(points, maxPoints);
        assignCategories.get(cat).addassignments(work);
    }
    
    public void readGradeFile(String inputFileName) throws FileNotFoundException {
        File data = new File(inputFileName);
    Scanner reader = new Scanner(data);
    gradingScale = new GradingScale(reader.nextInt());
     String letter;
        int num1;
        int num2;    
        int num3;
    while(reader.hasNext()){
       letter = reader.next();
       if(!letter.equals("*")){
           num1 = reader.nextInt();
        GradeLevel gL = new GradeLevel(letter,num1,((double)num1/gradingScale.getMaxPoints()*100));
        gradingScale.addgradeLevels(gL);
       }
       else {
           for(int n = 0; n<5;n++){
           num1=reader.nextInt();
           AssignmentCategory assignCat = new AssignmentCategory(num1);
           num1 = reader.nextInt();
           for(int i = 0; i<num1; i++){
           num2 = reader.nextInt();
           num3 = reader.nextInt();
           Assignment task = new Assignment(num2,num3);
           assignCat.addassignments(task);
           assignCat.setPointsEarned(assignCat.getPointsEarned()+num2);
           assignCat.setPointsAssigned(assignCat.getPointsAssigned()+num3);
           }
           assignCategories.add(assignCat);
       }
    }
    }
    }
    
    public void saveGradeFile(String outputFileName){
    
    }
    public String getGradeReport(){
        String largeString4 = "Grade Report\n";
        for(int i=0;i<4;i++){
        largeString4 = largeString4+Category.categoryToString(i)+" "
                +Integer.toString(assignCategories.get(i).getPointsEarned())
                +"/"+Integer.toString(assignCategories.get(i).getPointsAssigned())
                        +" Points";
        SPoints += assignCategories.get(i).getPointsEarned();
        STotal += assignCategories.get(i).getPointsAssigned();
        largeString4 = largeString4+"\n";
        for(int u=0;u<assignCategories.get(i).getNumassignments();u++){
            largeString4 = largeString4+Integer.toString(assignCategories.get(i).getassignments(u).getPoints())
                    +"/"+Integer.toString(assignCategories.get(i).getassignments(u).getMaxPoints())+"\n";
        }
        largeString4 = largeString4+"\n";
        }
        largeString4 = largeString4+"Total: "+Integer.toString(SPoints)+"/"+Integer.toString(STotal)+
                " = "+Double.toString(((double)SPoints)/((double)STotal)*100)+"%"+"\n\n";
        largeString4 = largeString4+"Grading Scale"+"\n";
        for(int y=0;y<10;y++){
        largeString4 = largeString4+gradingScale.getgradeLevels(y).getLetterGrade()+" ";
        largeString4 = largeString4+Integer.toString(gradingScale.getgradeLevels(y).getMinPoints())+" ";
        largeString4 = largeString4+Double.toString(gradingScale.getgradeLevels(y).getPercentage())+"%\n";
        }
    return largeString4;
    }
        
     public String getCategoryReport(int y){
         String Largestring5 = "Category Report\n";
         
         Largestring5 = Largestring5+Category.categoryToString(y)+" "+Integer.toString(assignCategories.get(y).getPointsAssigned())+"Points";
         SPoints += assignCategories.get(y).getPointsEarned();
         STotal += assignCategories.get(y).getPointsAssigned();
         Largestring5 = Largestring5+"\n";
         for(int u=0;u<assignCategories.get(y).getNumassignments();u++){
            Largestring5 = Largestring5+Integer.toString(assignCategories.get(y).getassignments(u).getPoints())
                    +"/"+Integer.toString(assignCategories.get(y).getassignments(u).getMaxPoints())+"\n";
         }
         return Largestring5;
         
     }   
    }
    
    
    
    
    
  
