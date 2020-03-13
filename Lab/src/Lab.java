import java.sql.SQLOutput;

/**
 * this Lab class present information about Lab student
 *
 * @author Narges
 * @version 0.0
 */
public class Lab {
    //the array of student's class
    private Student[] students;
    //the student average grade
    private int avg;
    // the day which lab take place
    private String day;
    // the capacity of the class
    private int capacity;
    // the current student whom register
    private int currentSize;

    /**
     * creat a new lab with given capacity and day
     *
     * @param cap the capacity of the class
     * @param d   the day which lab take place
     */
    public Lab(int cap, String d) {
        students = new Student[cap];
        day = d;
        currentSize = 0;
    }

    /**
     * assign student to this Lab
     *
     * @param std student's name
     */
    public void enrollStudent(Student std) {
        if (currentSize < students.length) {
            students[currentSize++] = std;
        } else {
            System.out.println("Lab is full!!!");
        }
    }
    /**
     * print the student information and average grade
     */
    public void print() {
        for (Student student : students) {
            System.out.println("std fname: " + student.getFirstName()
                    + " std id:" + student.getId()
                    + " std grade:" + student.getGrade());
        }
        System.out.println("Lab AVG:" + avg);
    }

    /**
     * @return students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * @param students list of student
     */
    public void setStudents(Student[] students) {
        this.students = students;

    }

    /**
     * @return avg the average of grades
     */
    public int getAvg() {
        return avg;
    }

    /**
     * to calculate average of grades
     */
    public void calculateAvg() {
        avg = 0;
        int counter = 0;
        for (Student student : students) {
            avg += student.getGrade();
            counter++;
        }
        avg = avg / counter;
    }

    /**
     * @return day of the lab
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day day of lab
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * return capacity value
     *
     * @return capacity
     */
    public int getCapacity() {
        return students.length;
    }

    /**
     * @param capacity change the value of capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}
