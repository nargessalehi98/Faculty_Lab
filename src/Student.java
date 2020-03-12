/**
 * this student class present data about student
 * @author Narges
 * @version 0.0
 */
public class Student {
    // student first name
    private String firstName;
    // student last name
    private String lastName;
    // student number
    private String id;
    // list of student grades
    private int[] grades;
    // the average of student grades
    private int average;
    // list of student courses
    private Course[] courses;

    /**
     * creat new student with specific name and id
     * @param fName first name
     * @param lname last name
     * @param sID student number
     */
    public Student(String fName, String lname, String sID) {
        firstName=fName;
        lastName=lname;
        id=sID;
        courses=new Course[10];
    }

    /**
     * @return first name of student
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * @return last name of student
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * @return return id
     */
    public String getId(){
        return id;
    }

    /**
     * @return student grades
     */
    public int[] getGrades(){
        return grades;
    }
    /**
     * *
     * @param num set the grade of student
     */
    public void setGrade(int[] num) {
        grades = num;

    }
    //All grades have equal weight
    /**
     * calculate the average of grades
     */
    public void calculateAverage(){
        int counter=0;
        for (int grade : grades) {
            average += grade;
            counter++;
        }
        average=average/counter;
    }

    /**
     * @return the average of grades
     */
    public int getAverage(){
        return average;
    }
    /**
     * print the average of grades
     */
    public void print(){
        System.out.println("About Student : The average is:" +average);
        System.out.println("\n");
    }

}
