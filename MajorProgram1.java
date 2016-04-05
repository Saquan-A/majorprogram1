/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package majorprogram1;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java. nio.file.StandardOpenOption;
import java.util.List;
        import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author saqua
 */
public class MajorProgram1 {
  
  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        MajorGui g = new MajorGui();
        g.setVisible(true);
        g.setLocationRelativeTo(null);
        StudentAssignments user = new StudentAssignments();
        /*JFileChooser chooser = new JFileChooser();
    FileNameExtensionFilter filter = new FileNameExtensionFilter(
        "Text Files", "txt");
    chooser.setFileFilter(filter);
    int returnVal = chooser.showOpenDialog(null);
    if(returnVal == JFileChooser.APPROVE_OPTION) {
          try {
              System.out.println("You chose to open this file: " +
                      chooser.getSelectedFile().getName());
              File loc = chooser.getSelectedFile();
              String loc1 = loc.getPath();
              user.readGradeFile(loc1);
          } catch (FileNotFoundException ex) {
              Logger.getLogger(MajorGui.class.getName()).log(Level.SEVERE, null, ex);
          }
       System.out.println(user.getGradeReport());
        JOptionPane.showMessageDialog(null, user.getGradeReport());

       
    }*/
        
        PrintStream output = new PrintStream(new File("C:\\Users\\saqua\\Documents\\GradeReport.txt"));
        System.setOut(output);
        output.print(user.getGradeReport());
        
        
    }
    // TODO code application logic here
}
