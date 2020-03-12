import javax.print.attribute.Size2DSyntax;
import javax.swing.plaf.IconUIResource;

public class Main {
    public static void main(String[] args) {
        Student S1 = new Student("Narges", "Salehi", "9628055");
        Student S2 = new Student("maryam", "mohamadi", "9731022");

        Professor EE = new Professor("Ehsan", "Edalat");

        Course AP = new Course("AP", EE, 4 );
        Course ML = new Course("ML", EE, 4);
        Course DL=new Course("DL",EE,4 );

        Lab APLAb = new Lab("TA", "saturday", AP, 15);

        Faculty Computer = new Faculty("computer");

        S1.setGrade(new int[]{12, 13, 14});
        S1.calculateAverage();
        S1.print();

        EE.setCourses(new Course[]{AP, ML});
        EE.addCourse(new Course("DL", EE, 4));
        EE.setCourses(new Course[]{AP, ML,DL});
        EE.printp();

        APLAb.setTA("mana");
        APLAb.setCurrentSize(13);
        APLAb.setDay("saturday");
        APLAb.hasCapacity();
        APLAb.enrollStudent(S2);
        APLAb.setStudents(new Student[]{S1});
        APLAb.printL();


        AP.setProfessor(new Professor("Narges", "Salehi"));
        AP.setStudents(new Student[]{S1});
        AP.setCapacity(13);
        AP.addLab(APLAb);
        AP.enrollStudent(S2);
        AP.printC();

        Computer.setCourses(new Course[]{AP,ML});
        Computer.addCourse(new Course("DL",EE,4));
        Computer.setCourses(new Course[]{AP,ML});
        Computer.setStudents(new Student[]{S1});
        Computer.setProfessors(new Professor[]{EE});
        Computer.enrollStudent(S2);
        Computer.addCourse(DL);
        Computer.addProfessor(EE);
        Computer.isCourseValid(DL);
        Computer.isProfessorValid(EE);
        Computer.isStudentValid(S1);
        Computer.printF();

    }
}
