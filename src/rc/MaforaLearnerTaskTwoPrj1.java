package rc;

import javax.swing.JOptionPane;

/**
 * @author RC_Student_lab
 */
public class MaforaLearnerTaskTwoPrj1 {
      static Learner objLearner = new Learner() ;
    
      public static void main(String[] args) {
        
          getLearnerInput();
          displayFinalMark() ;
        
    }
    
      //A method to get the student details
    
    public static void getLearnerInput() {
        objLearner.setFullName(JOptionPane.showInputDialog("Enter your Full Name :"));
        objLearner.setSubject(JOptionPane.showInputDialog("Enter your Subject :"));
        objLearner.setAssignmentMark(Double.parseDouble(JOptionPane.showInputDialog("Enter your Assignment Mark :")));
        objLearner.setTestMark(Double.parseDouble(JOptionPane.showInputDialog("Enter your Test Mark :")));
        objLearner.setExamMark(Double.parseDouble(JOptionPane.showInputDialog("Enter your Exam Mark :")));
    }
    
    //Method to display the Final Mark
    
    public static void displayFinalMark() {
        double totalMark = objLearner.calcFinalMark() ;
        
        JOptionPane.showMessageDialog(null,"Your final Mark is " + totalMark);
    }
}
