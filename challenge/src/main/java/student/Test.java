package student;

public class Test {
    public static void main(String[] args) {
        Major FMSMajor = new Major("124", "fms");

        Student adam = new Student("Hajjaji","Adam","0612345678","a.b@gmail.com","DO1234");
        Student hamid = new Student("Mhmd","Hamid","0612345678","h.b@gmail.com","DO1235",FMSMajor);

        // hamid.setMajor(Student.CSMajor);

        System.out.println(adam.getFullNameFormatted());
        System.out.println("the number of students enrolled in FMS : "+FMSMajor.getStudentCount());
        FMSMajor.removeStudentByCNE("DO1235");
        Student.CSMajor.getOccupancyRate();

        FMSMajor.displayStudents();
        Student.CSMajor.displayStudents();
        System.out.println(Student.CSMajor.getStudentListAsString());
    }
}

