package rc;

/**
 * @author RC_Student_lab
 */
public class Learner {
    
    //The Attributes of the Learner
    private String fullName ;
    private String subject ;
    private double assignmentMark ;
    private double testMark ;
    private double examMark ;
    
    //Default constructor they set the default values for all values for all attributes

    public Learner() {
        this.fullName = "";
        this.subject = "";
        this.assignmentMark = 0.0;
        this.testMark = 0.0;
        this.examMark = 0.0;
    }
    
    //Accessor Methods-Getters that return the values for each all methods

    public String getFullName() {
        return fullName;
    }

    public String getSubject() {
        return subject;
    }
    
    public double getAssignmentMark() {
        return assignmentMark;
    }

    public double getTestMark() {
        return testMark;
    }

    public double getExamMark() {
        return examMark;
    }
    
    //Mutator Methods-Setters that assign values for each attribute

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public void setAssignmentMark(double assignmentMark) {
        this.assignmentMark = assignmentMark;
    }

    public void setTestMark(double testMark) {
        this.testMark = testMark;
    }

    public void setExamMark(double examMark) {
        this.examMark = examMark;
    }
    
    //Method to calculate the Final Mark which is the average mark for all the 3 marks
    
    public double calcFinalMark() {
        return (getAssignmentMark() + getTestMark() + getExamMark())/3 ;
    }
}
