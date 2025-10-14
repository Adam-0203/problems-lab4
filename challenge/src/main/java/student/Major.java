package student;

public class Major {
    private static int numStudentMax = 50;
    private static int nextId = 1;
    private int id;
    private String code;
    private String name;
    public Student[] students = new Student[numStudentMax];
    private int studentCount;

    public Major(String code, String name) {
        this.code = code;
        this.name = name;
        this.id = nextId++;
        this.studentCount = 0;
    }

    // Method to add a student
    public void addStudent(Student s) {
        if (studentCount==numStudentMax){
            System.out.println("the maximum number of students has been reached.");
            return;
        }
        students[studentCount] = s;
        studentCount++;
    }

    // Getters
    public int getId(){return id;}
    public String getCode(){return code;}
    public String getName(){return name;}
    public int getStudentCount(){return studentCount;}


    // Display all students in the major
    public void displayStudents() {
        for (int i=0; i<studentCount; i++){
            students[i].displayStudent();
        }
    }

    public void removeStudent(Student s){
        Student[] newStudents = new Student[numStudentMax];
        boolean removal = false;
        int val = studentCount;
        studentCount--;
        for (int i=0; i<val-1; i++){
            if (students[i]==s){
                removal = true;
            }
            if (removal){
                newStudents[i] = students[i+1];
            }
            else{
                newStudents[i] = students[i];
            }
        }
        students = newStudents;
    }

    public Student findStudentByCNE(String cne){
        for (int i=0; i<studentCount; i++){
            if (students[i].getCNE() == cne){
                return students[i];
            }
        }
        return null;
    }

    public boolean removeStudentByCNE(String cne){
        Student theStudent = findStudentByCNE(cne);
        if (theStudent != null){
            removeStudent(theStudent);
            return true;
        }
        return false;
    }

    public void getOccupancyRate(){
        double percentage = (double) studentCount/numStudentMax;
        System.out.println(String.format("Computer science capacity: %d students\nCurrent enrollment: %d students\nOccupancy rate = %.2f%%",numStudentMax,studentCount,percentage));
    }

    public String getStudentListAsString(){
        StringBuilder studentsString = new StringBuilder();
        for (int i=0; i<studentCount; i++){
            studentsString.append(students[i].getFullNameFormatted());
            studentsString.append("\n");
        }
        return studentsString.toString();
    }

}
