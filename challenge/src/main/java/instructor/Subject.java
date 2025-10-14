package instructor;

public class Subject {
    private int id;
    private String code;
    private String title;
    private Instructor instructor;

    public Subject(int id,String code,String  title,Instructor instructor){
        this.id = id;
        this.code = code;
        this.title = title;
        this.instructor = instructor;
    }
    public String normalizedCode(){
        if (code != null){
            return code.trim().toUpperCase();
        }
        return null;
    }

    public String properTitle(){
        if (title == null || (title.isEmpty())){
            return title;
        }

        String[] trimmage = title.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i=0; i<trimmage.length; i++){
            res.append(Character.toUpperCase(trimmage[i].charAt(0)));
            res.append(trimmage[i].substring(1).toLowerCase());
            res.append(" ");
        } 
        return res.toString().trim();
    }

    public boolean isIntroCourse(){
        if (code == null && title == null){
            return false;
        }
        if (code == null){
            return (title.startsWith("INTRO-"));
        }
        if (title == null){
            return (code.toLowerCase().contains("intro"));
        }
        return (code.toLowerCase().contains("intro") || title.startsWith("INTRO-"));
    }

    public String syllabusLine(){
        StringBuilder res = new StringBuilder();
        res.append(code+" - "+title);
        res.append("(Instructor : "+instructor.getLastName()+", "+instructor.getFirstName()+")");
        return res.toString();
    }
}
