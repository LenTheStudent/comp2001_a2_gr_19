import java.util.ArrayList;
import java.util.*;

/**
 * Write a description of class CollegeRegistrar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CollegeRegistrar
{
    private ArrayList<Registration> courseRegistrations = new ArrayList<>();
    
    


    /**
     * Constructor for objects of class CollegeRegistrar
     */
    public CollegeRegistrar()
    {
       //These are just demo Registration objects that are instantiated with the class so we can test our methods. We can remove this later.
        
        Registration LenComp = new Registration("COMP 1501",1,17,"Len","Fiech");
       Registration AdamComp = new Registration("COMP 2704",0,20,"Adam","Xiang");
       Registration CoreyComp = new Registration("COMP 3444",2,21,"Corey","Kolokolova");
       courseRegistrations.add(LenComp);
       courseRegistrations.add(AdamComp);
       courseRegistrations.add(CoreyComp);
        
           
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addRegistration(Registration newRegistration)
    {
       courseRegistrations.add(newRegistration);
        
    }
    
    public void printAllRegistrations()
    {
        // prints for all registrations the corresponding info
        // registration records are separated by an empty line
        courseRegistrations.stream()
            .forEach((registration) ->
            {
                registration.printInfo();
            }
            );
        
    }
    
    public void printClassesForStudent(String student)
    {
        // prints all classes (course number and professor) in which the 
        // student is enrolled
        // one class per line
        
        //courseRegistrations.stream()    // creates a stream of student registration
        //.filter(registration -> registration.getStudent().equals(student)) // loops over each courseNumber in stream
        //.forEach(registration -> registration.printInfo()); // prints courseNumber and professor for all courses
    }
    
    public int getClassCountForStudent(String student)
    {
        // number of classes in which the student is enrolled
        
        //return (int)courseRegistrations.stream()
        //.filter(registration -> registration.getStudent().equals(student))
        //.count();  
        
    }
    
    
    public void printClassesForStudentByProfessor(String student, String professor)
    {
        // prints all classes (course number and section) 
        // tought by professor and taken by student
        // one class per line
        
        //student.stream()    // creates a stream of student registration
        //.filter(student -> professor.equals(student.professor))  // adds courses by given prof
        //.forEach(courseNumber ->     // loops over each courseNumber in stream
        //    System.out.println("Class: " + courseNumber + ". Section: " + section)  // prints courseNumber and section for all courses
        //);
    }
    
    public void printClassesForStudentInSlot(String student, int timeSlot)
    {
        // prints all classes (course number and section)
        // taken by student in timeSlot
        // one class per line
        
        //student.stream()    // creates a stream of student registration
        //.filter(student -> timeSlot == student.timeSlot     // adds courses by given timeSlot
        //.forEach(courseNumber ->    // loops over each courseNumber in stream
        //    System.out.println("Class: " + courseNumber + ". Section: " + section))     // prints courseNumber and section for all courses
        //);
    }
    
    public int getRegistrationsInClass(String classNumber)
    {
        // get the number of students registered in classNumber
        return 0;
    }
    
    public int getRegistrationsInClass(String classNumber, int timeSlot)
    {
        // get the number of students enrolled in classNumber and slot
        return 0;
    }
    
    public int studentsTakingClassesInSlot(int timeSlot)
    {
        // get the number of students taking classes in timeSlot
        return 0;
    }
    
    public void dropClassForStudent(String classNumber, String student)
    {
        // drops class classNumber for student
    }
    
    public void dropAllClassesForStudent(String student)
    {
        // drops all classes for student
    }
}

