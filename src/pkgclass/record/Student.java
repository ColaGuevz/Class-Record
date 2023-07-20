package pkgclass.record;

public class Student 
{    
    private String StudentID;
    private String Lastname;
    private String Firstname;
    private String MiddleInitial;
    private String gender;
    private double FirstQuarterGrade;
    private double SecondQuarterGrade;
    private double ThirdQuarterGrade;
    private double FourthQuarterGrade;
    private double FinalGrade;
    private int FirstQuarterAbsent;
    private int SecondQuarterAbsent;
    private int ThirdQuarterAbsent;
    private int FourthQuarterAbsent;
    private String ContactNumber;

    public Student(String StudentID, String Lastname, String Firstname, String MiddleInitial, String ContactNumber, String gender, double FirstQuarterGrade, double SecondQuarterGrade, double ThirdQuarterGrade, double FourthQuarterGrade, int FirstQuarterAbsent, int SecondQuarterAbsent, int ThirdQuarterAbsent, int FourthQuarterAbsent) 
    {
        this.StudentID = StudentID;
        this.Lastname = Lastname;
        this.Firstname = Firstname;
        this.MiddleInitial = MiddleInitial;
        this.gender = gender;
        this.FirstQuarterGrade = FirstQuarterGrade;
        this.SecondQuarterGrade = SecondQuarterGrade;
        this.ThirdQuarterGrade = ThirdQuarterGrade;
        this.FourthQuarterGrade = FourthQuarterGrade;
        this.FinalGrade = (this.FirstQuarterGrade + this.SecondQuarterGrade + this.ThirdQuarterGrade + this.FourthQuarterGrade) / 4.00;
        this.FirstQuarterAbsent = FirstQuarterAbsent;
        this.SecondQuarterAbsent = SecondQuarterAbsent;
        this.ThirdQuarterAbsent = ThirdQuarterAbsent;
        this.FourthQuarterAbsent = FourthQuarterAbsent;
        this.ContactNumber = ContactNumber;
    }    

    public String getStudentID() {
        return StudentID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public String getMiddleInitial() {
        return MiddleInitial;
    }

    public String getGender() {
        return gender;
    }

    public double getFirstQuarterGrade() {
        return FirstQuarterGrade;
    }

    public double getSecondQuarterGrade() {
        return SecondQuarterGrade;
    }

    public double getThirdQuarterGrade() {
        return ThirdQuarterGrade;
    }

    public double getFourthQuarterGrade() {
        return FourthQuarterGrade;
    }

    public double getFinalGrade() {
        return FinalGrade;
    }

    public int getFirstQuarterAbsent() {
        return FirstQuarterAbsent;
    }

    public int getSecondQuarterAbsent() {
        return SecondQuarterAbsent;
    }

    public int getThirdQuarterAbsent() {
        return ThirdQuarterAbsent;
    }

    public int getFourthQuarterAbsent() {
        return FourthQuarterAbsent;
    }

    public String getContactNumber() {
        return ContactNumber;
    }
    
    
}
