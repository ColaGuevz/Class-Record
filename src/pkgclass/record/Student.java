package pkgclass.record;


public class Student 
{
    private String Firstname;
    private String Lastname;
    private String MiddleInitial;
    private double Grade;
    private int Absent;
    
    public Student(String Firstname, String Lastname, String MiddleInitial, double Grade, int Absent) 
    {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.MiddleInitial = MiddleInitial;
        this.Grade = Grade;
        this.Absent = Absent;
    }
    
    public String getFirstname() 
    {
        return Firstname;
    }

    public String getLastname() 
    {
        return Lastname;
    }

    public String getMiddleInitial() 
    {
        return MiddleInitial;
    }

    public double getGrade() 
    {
        return Grade;
    }

    public int getAbsent() 
    {
        return Absent;
    }

    

    
}
