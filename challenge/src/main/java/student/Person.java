package student;

public class Person {
    private static int nextId = 1;
    private int id;
    private String firstName;
    private String secondName;
    private String phone;
    private String email;

    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        this.secondName = secondName;
        this.phone = telephone;
        this.email = email;
    }
    public Person(){}

    public int getId(){return id;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return secondName;}
    public String getPhone(){return phone;}
    public String getEmail(){return email;}

    @Override
    public String toString(){
        return firstName +" "+ secondName;
    }
}

