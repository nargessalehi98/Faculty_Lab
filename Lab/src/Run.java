/**
 * this class gives a test to the whole program and method is inside this class
 * @author Lab Master
 * @version 0.1
 */
public class Run {
    public static void main(String[] args) {
        Lab group4 = new Lab(3, "saturday");
        Student std1 = new Student("Ehsan", "Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        std1.print();
        std1.setGrade(15);
        std1.print();
        std2.print();
        std2.setGrade(11);
        std2.print();
        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();
        group4.enrollStudent(std1);
        group4.enrollStudent(std2);
        group4.enrollStudent(std3);
        group4.calculateAvg();
        //group4.print();

        System.out.println("/student object before modify :" + std1);
        System.out.println("/student first name befor modify :" + std1.getFirstName());
        modifyObject(std1);
        System.out.println("//student object after modify :" + std1);
        System.out.println("//student first name after modify :" + std1.getFirstName());
    }
    public static Student modifyObject(Student student) {
        System.out.println("student inside modify before new :" + student);
        System.out.println("student first name inside modify before new :" + student.getFirstName());
        student.setFirstName("narges");
        student = new Student("maryam", "mohamadi", "9731022");
        student.setFirstName("sanaz");
        System.out.println("student inside modify after new :" + student);
        System.out.println("student first name inside modify after new :" + student.getFirstName());
        return student;
    }
}
