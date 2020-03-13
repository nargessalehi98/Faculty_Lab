import javax.swing.*;

/**
 * this class act about a faculty
 *
 * @author Narges
 * @version 0.0
 */
public class Faculty {
    // name of faculty
    private String name;
    // list of professor of faculty
    private Professor[] professors;
    //list of faculty student
    private Student[] students;
    // list of courses of faculty
    private Course[] courses;

    /**
     * creat a new faculty
     *
     * @param name of faculty
     */
    public Faculty(String name) {
        students = new Student[10];
        professors = new Professor[10];
        courses = new Course[10];
        this.name = name;
    }

    /**
     * @return name of faculty
     */
    public String getName() {
        return name;
    }

    /**
     * @param students assign student to faculty
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }

    /**
     * @return students of the faculty
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * @param courses assign courses to faculty's courses
     */
    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    /**
     * @param professors assign professor to the faculty's professor
     */
    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }

    /**
     * @return list of faculty's professors
     */
    public Professor[] getProfessors() {
        return professors;
    }

    /**
     * @return list of faculty's courses
     */
    public Course[] getCourses() {
        return courses;
    }

    /**
     * @param student enroll student to the faculty
     */
    public void enrollStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
            }
        }
    }

    /**
     * @param course add a course to faculty
     */
    public void addCourse(Course course) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = course;
            }
        }
    }

    /**
     * @param professor add a professor to faculty
     */
    public void addProfessor(Professor professor) {
    }

    /**
     * @param student check out if this student is in the faculty
     * @return true or false
     */
    public boolean isStudentValid(Student student) {
        for (Student value : students) {
            return value == student;
        }
        return false;
    }

    /**
     * @param course is a special course which is checking
     * @return true of false
     */
    public boolean isCourseValid(Course course) {
        for (Course value : courses) {
            return value == course;
        }
        return false;
    }

    /**
     * @param professor name of special professor which is checking
     * @return true of false
     */
    public boolean isProfessorValid(Professor professor) {
        for (Professor value : professors) {
            return value == professor;
        }
        return false;
    }

    public void printF() {
        System.out.println("\nABOUT FACULTY:the faculty name is :" + getName());
        for (Course i : getCourses()) {
            System.out.println("the course are :" + i.getName());

        }
        for (Student i : getStudents()) {
            System.out.println("the students are :"+i.getFirstName());

        }
        for (Professor i : getProfessors()) {
            System.out.println("the professor are :"+i.getFirstName());
        }
    }
}
