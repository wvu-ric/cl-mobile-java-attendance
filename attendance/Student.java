public class Student {
    
    //Variable Declaration
    public String firstName, lastName, studentId;
    
    
    //Method Declaration
    
    
    //main is the function that runs first and starts the lifecycle
    public Student(String firstName, String lastName, String studentId){
        //TODO: Complete Constructor
        Student studentOne = new Student();
        
    }
    
    public String description(){
        //TODO: Complete this method
        System.out.print(firstName);
        System.out.print(lastName);
        System.out.print(studentId);
        
        String returnString = firstName + " " + lastName + ", " + studentId;
        return returnString;
    }
    
}