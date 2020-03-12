/**
 * this class gives data about professor
 *
 * @author Narges
 * @version 0.0
 */
public class Professor {
    //name of professor
    private String firstName;
    // last name of professor
    private String lastName;
    // list of courses of professor
    private Course[] courses;

    /**
     * creat a new professor
     *
     * @param firstName first name of professor
     * @param lastName  last name of professor
     */
    public Professor(String firstName, String lastName) {
        courses = new Course[10];
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * @return the first name of professor
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return list of courses of a professor
     */
    public Course[] getCourses() {
        return courses;
    }

    /**
     * @param courses assign courses
     */
    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    /**
     * @param course add a course for a professor
     */
    public void addCourse(Course course) {
        for (int i = 0; i < courses.length; i++) {
            if (courses[i] == null) {
                courses[i] = course;
            }
        }
    }

    public void printp() {
        System.out.println("About Professor : First name of professor is :" + firstName);
        System.out.println("His courses are :");
        for (Course cours : courses) {
            System.out.println( cours.getName());
        }

    }
}
