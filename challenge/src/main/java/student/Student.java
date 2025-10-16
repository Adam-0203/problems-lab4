package student;

public class Student extends Person {
    public static Major CSMajor = new Major("123", "computer science");
    private String cne;
    private Major major;

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(prenom,nom,telephone,email);
        this.cne = cne;
        this.major = major;
        this.major.addStudent(this);

    }
    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(nom,prenom,telephone,email,cne,CSMajor);
    }
    public Student(){super();}

    public void displayStudent(){
        System.out.println("the student "+this.getId()+": "+this.getFirstName()+" "+this.getLastName()+", majors in "+major.getName());
    }

    // Getters
    public String getCNE(){return cne;}
    public Major getMajor(){return major;}

    // Setters
    public void setCNE(String cne){this.cne = cne;}
    public void setMajor(Major major){
        if (this.major != null) {this.major.removeStudent(this);}
        this.major = major;
        this.major.addStudent(this);
    }
    public String getFullNameFormatted(){
        StringBuilder retourner = new StringBuilder();
        retourner.append(this.getLastName().toUpperCase());
        retourner.append(", ");
        retourner.append(this.getFirstName());
        return retourner.toString();
    }

    @Override
    public String toString(){
        return this.getFirstName() +" "+ this.getLastName();
    }

}

