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
public class Category {
   
   
   public static int QUIZZES = 0;
   public static int EXAM = 1;
   public static int LABS = 2;
   public static int PROGRAMS = 3;
   public static int FINALEXAM = 4;
   
   public static String categoryToString(int category) {
      String s = "";
       if(category == 0 ){
         s  = "Quizzes";
       }
       if(category == 1){ 
          s=  "Exams";
      }
      if (category == 2){
          s = "Labs";
      }
      if(category == 3){
          s = "Programs";
      }
      if(category == 4){
          s = "Final Exam";
      }
       return s;
   }
}
   

