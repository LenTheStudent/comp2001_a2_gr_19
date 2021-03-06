
/**
 * Registration is a class that defines a Registration object that stores infomation pertaining to a student's enrollment in a university class.
 *
 * @author (Len O'Neill, Adam Miller, Corey Cooper)
 * @version 1
 */
public class Registration
{
    // instance variables - replace the example below with your own
    private String courseNumber;
    private int section;
    private int timeSlot;
    private String student;
    private String professor;

    /**
     * Constructor for objects of class Registration
     */
    public Registration(String courseNumber, int section, int slot, 
    String student,String professor)
    {
        //defining the instance variables

        if (this.verifyCourseNumber(courseNumber)){
            this.courseNumber = courseNumber;
        } else{
            System.out.print("Invalid Course Number");
            courseNumber = "INVALID";
        }

        if (this.verifySection(section)){
            this.section = section;
        } else{
            System.out.print("Invalid Section");
            this.section = 3;
        }

        if (this.verifySlot(slot)){
            this.timeSlot = slot;
        } else{
            System.out.print("Invalid Time Slot");
            this.timeSlot = 0;
        }

        this.student = student;

        this.professor = professor;

    }
    //given a string courseNumber, checks if courseNumber is in a list of acceptable course numbers. Returns true if so.
    private boolean verifyCourseNumber(String courseNumber)

    {   
        String[] courses = {"COMP 1501", "ENGL 2201", "CHEM 3060", "PHYS 2344", "ENGL 2005", "COMP 2704", "PHYS 2377", "CHEM 4927", "COMP 3444"};
        boolean isVerified = false;
        for(String course : courses){
            if (courseNumber.equals(course)){
                isVerified = true;
            }   
        }
        return isVerified;
    }

    //given an int section, checks if section is within acceptable bound. Returns true if so.
    private boolean verifySection(int section)
    {   boolean isVerified = false;
        if (section >= 0 && section <=2) {
            isVerified = true;
        }
        return isVerified;
    }

    //given an int slot, checks if slot is within acceptable bound. Returns true if so.
    private boolean verifySlot (int slot)
    {   boolean isVerified = false;
        if (slot >=12 && slot <=25){
            isVerified = true;
        }
        return isVerified;
    }
    // simple print out method
    public void printInfo()
    {
        System.out.println("Course number: " + courseNumber);
        System.out.println("Section: " + section);
        System.out.println("Time Slot: " + timeSlot);
        System.out.println("Student: " + student);
        System.out.println("Professor: " + professor);
        System.out.println("************************");
    }
    //getter methods
    public String getStudent(){
        return this.student;
    }

    public String getProfessor(){
        return this.professor;
    }

    public int getTimeSlot(){
        return this.timeSlot;
    }

    public String getCourseNumber(){
        return this.courseNumber;
    }

}
