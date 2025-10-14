package instructor;

public class Instructor extends student.Person{
    private String employeeNumber;

    public Instructor(String firstName, String secondName, String telephone, String email,String employeeNumber){
        super(firstName,secondName,telephone,email);
        this.employeeNumber = employeeNumber;
    }

    public String cleanEmployeeNumber(){
        if (employeeNumber != null){
            return employeeNumber.trim();
        }
        return null;
    }

    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]", employeeNumber,this.getLastName(),this.getFirstName());
    }

    public String toCard(){
        StringBuilder res = new StringBuilder();
        res.append("Instructor\n");
        res.append("-------------\n");
        res.append("Employee "+this.getId()+": "+employeeNumber+"\n");
        res.append("Name : "+this.getLastName()+", "+this.getFirstName()+"\n");
        res.append("Email: "+this.getEmail()+"\n");
        res.append("Phone: "+this.getPhone()+"\n");
        return res.toString();
    }

    public String displayName(){
        StringBuilder res = new StringBuilder();
        if (this.getLastName() != null){
            res.append(this.getLastName());
            res.append(" ");
        } 
        if (this.getFirstName() != null){
            res.append(this.getFirstName());
        } 
        return res.toString();
    }
}
