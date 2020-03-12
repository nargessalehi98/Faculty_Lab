import javax.swing.*;

/**
 * this class is about course's data
 *
 * @author Narges
 * @version 0.0
 */
public class Course {
    // the name of course
    private String name;
    // the professor of course
    private Professor professor;
    // the list of course's student
    private Student[] students;
    // the list of course's lab
    private Lab[] labs;
    // the limit number of course capacity
    private int maxCapacity;
    // the number of current capacity
    private int currentCapacity;

    /**
     * creat new course
     *
     * @param name      name of course
     * @param professor of course
     * @param credit    of course
     */
    public Course(String name, Professor professor, int credit) {
        students = new Student[15];
        labs = new Lab[20];
        this.name = name;
        this.professor = professor;
        credit = 4;
        maxCapacity = 15;
    }

    /**
     * @param name assign a name to course
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return name of course
     */
    public String getName() {
        return name;
    }

    /**
     * @param professor set a professor to course
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * @return professor of the course
     */
    public Professor getProfessor() {
        return professor;
    }

    /**
     * @param students list of course
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * @return student list of course
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * @param cap at the moment cap
     */
    public void setCapacity(int cap) {
        currentCapacity = cap;
    }

    /**
     * @return current capacity of course
     */
    public int getCurrentCapacity() {
        return currentCapacity;
    }

    /**
     * @return list of course's labs
     */
    public Lab[] getLabs() {
        return labs;
    }

    /**
     * @param lab add lab to course's lab list
     */
    public void addLab(Lab lab) {
        for (int i = 0; i < labs.length; i++) {
            if (labs[i] == null) {
                labs[i] = lab;
            }
        }
    }

    /**
     * @param student Add student in course and the first lab that has capacity
     */
    public void enrollStudent(Student student) {
        for (Lab lab : labs) {
            if (lab.hasCapacity())
                lab.enrollStudent(student);
            else
                System.out.println("Labs are full !");
        }
    }

    public void printC() {
        System.out.println("\nABOUT COURSE:Professor of course is:" + professor.getFirstName() +
                "\nthe course's capacity is :" + getCurrentCapacity());
        for (Student i : getStudents()) {
            System.out.println("the students are :"+i.getFirstName());
        }

    }
}
