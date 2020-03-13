/**
 * this class gives data about each course's lab
 * @author Narges
 * @version 0.0
 */
public class Lab {
    // the lab's course
    private Course course;
    // the lab's TA
    private String TA;
    // the day which lab is working
    private String day;
    // list pf lab's student
    private Student[] students;
    //number of student whom enroll
    private int currentSize;
    // the limit of lac
    private int capacity;

    /**
     * creat a new lab
     * @param TA teacher assistant
     * @param day the day which lab is working
     * @param course the lab's name
     * @param capacity the limit of lac
     */
    public Lab(String TA, String day, Course course ,int capacity){
        students=new Student[15];
        this.TA=TA;
        this.day=day;
        this.course=course;
        currentSize=0;
        this.capacity=capacity;
    }

    /**
     * set a TA
     * @param TA teacher assistant
     */
    public void setTA(String TA){
        this.TA=TA;
    }

    /**
     * @return TA
     */
    public String getTA(){
        return TA;
    }

    /**
     * @param day set a day for lab
     */
    public void setDay(String day){
        this.day=day;
    }

    /**
     * return the lab's day
     * @return day
     */
    public String getDay(){
        return day;
    }

    /**
     * @param students set student to student list
     */
    public void setStudents(Student[] students){
        this.students=students;
    }

    /**
     * return list of student
     * @return students
     */
    public Student[] getStudents(){
        return students;
    }
    /**
     * check out if there is capacity yet or not
     * @return true or false
     */
    public boolean hasCapacity(){
        return currentSize < capacity;
    }

    /**
     * @param currentSize of the lab
     */
    public void setCurrentSize(int currentSize){
        this.currentSize=currentSize;
    }
    /**
     * @param student assign a new student to this lab
     */

    public void enrollStudent(Student student){
        currentSize=0;
        if (currentSize < capacity)
            students[currentSize++] = student;
        else {
            System.out.println("Lab is full!!!");
        }
    }
    public void printL(){
        System.out.println("\nABOUT LAB:lab's TA is :"+TA+
                "\nthe current sizs is:"+currentSize+
                "\nthe day is :"+day+
                "\nhas capacity:"+hasCapacity());
        for (Student i : getStudents()) {
            System.out.println("the students are :"+i.getFirstName());
        }
    }
}
