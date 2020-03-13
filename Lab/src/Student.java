/**
 * The Student class represents a student in a student
 * administration system.
 * It holds the student details relevant in our context. *
 *
 * @author Ehsan
 * @version 0.0
 */
public class Student {

    // the student’s first name
    private String firstName;
    // the student’s last name
    private String lastName;
    // the student ID
    private String id;
    //the grade
    private int grade;

    /**
     * ￼￼￼
     * Create a new student with a given name and ID number. *
     *
     * @param fName first name of student
     * @param lname last name of student
     * @param sID   student ID
     */
    public Student(String fName, String lname, String sID) {
        firstName = fName;
        lastName = lname;
        id = sID;
        grade = 0;
    }

    /**
     * get the first name of student
     *
     * @return firstName field
     */
    public String getFirstName() {
        return firstName;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public int getGrade(){
        return grade;

    }
    /**
     * @param fName set first name of a student
     */
    public void setFirstName(String fName) {
        firstName = fName;
    }

    /**
     * Print the student’s last name and ID number to the output terminal.
     */
    public void print() {
        System.out.println(lastName + ", student ID: "
                + id + ", grade: " + grade);
    }
    /**
     * *
     * @param num set the grade of student
     */
    public void setGrade(int num) {
        grade = num;

    }
}

