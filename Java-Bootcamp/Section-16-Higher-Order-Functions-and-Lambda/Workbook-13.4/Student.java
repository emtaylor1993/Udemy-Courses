/**
 * STUDENT
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Student object.
 * 
 * @packages
 *    None
 */

public class Student {
    private String name;
    private double score;

    /**
     * Function Name: Student
     * @param name  (String)
     * @param score (double)
     * 
     * Constructor for the Student object.
     */
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    /**
     * Function Name: getName
     * @return (String)
     * 
     * Getter for the name attribute.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Function Name: setName
     * @param name (String)
     * 
     * Setter for the name attribute.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Function Name: getScore
     * @return (double)
     * 
     * Getter for the score attribute.
     */
    public double getScore() {
        return this.score;
    }

    /**
     * Function Name: setScore
     * @param score (double)
     * 
     * Setter for the score attribute.
     */
    public void setScore(double score) {
        this.score = score;
    }
}