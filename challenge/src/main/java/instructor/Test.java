package instructor;

public class Test {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("adam","hajjaji","0612345678","a.b@gmail.com","1234");
        Subject subject = new Subject(12, "introduction to java", "INTRO-Course", instructor);

        System.out.println(instructor.cleanEmployeeNumber());
        System.out.println(instructor.summaryLine());
        System.out.println(instructor.toCard());
        System.out.println(instructor.displayName());

        System.out.println(subject.normalizedCode());
        System.out.println(subject.properTitle());
        System.out.println(subject.isIntroCourse());
        System.out.println(subject.syllabusLine());

    }
}
