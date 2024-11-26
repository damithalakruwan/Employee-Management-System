package Classpackage;
import java.io.IOException;
import java.io.BufferedReader;

public class Employee {
    private String empId;
    private String empName;
    private String desig;
    private String depart;
    
    
    FileClass fileClass = new FileClass("Employee.txt");
    
    public Employee(){}

    public Employee(String empId, String empName, String depart, String desig) {
        this.empId = empId;
        this.empName = empName;
        this.desig = desig;
        this.depart = depart;
        
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public FileClass getFileClass() {
        return fileClass;
    }

    public void setFileClass(FileClass fileClass) {
        this.fileClass = fileClass;
    }

    
    
   public boolean addEmp()
    {
        if(!fileClass.createNewFile())
        {
            String Record=empId+" "+empName+" "+depart+" "+desig;
            System.out.println("Record"+Record);
            return fileClass.writeDataToFile(Record);
        }
        return false; 
}
   
   public boolean searchEmpId (String userID){
       boolean isFound =false;
       try {
   String [] user = null;
   BufferedReader bufferedReader  = fileClass.readAFile();
   String employee;
   outerloop:
   while ((employee = bufferedReader.readLine()) !=null) {
       user = employee.split(" ");
       for(String word : user ) {
           if(word.equals(userID)){
               isFound = true;
               this.setEmpId(user[0]);
               this.setEmpName(user[1]);
               this.setDepart(user[2]);
               this.setDesig(user[3]);
               break outerloop;
           }   } }}

catch (IOException ex){
    System.out.println("Error Search Employee");
}
return isFound;
   }
   
   public boolean searchEmployeeDep (String userID){
       boolean isFound =false;
       try {
   String [] user = null;
   BufferedReader bufferedReader  = fileClass.readAFile();
   String employee;
   outerloop:
   while ((employee = bufferedReader.readLine()) !=null) {
       user = employee.split(" ");
       for(String word : user ) {
           if(word.equals(userID)){
               isFound = true;
               this.setEmpId(user[0]);
               this.setEmpName(user[1]);
               this.setDesig(user[2]);
               this.setDepart(user[3]);
               break outerloop;
           }   } }}

catch (IOException ex){
    System.out.println("Error!!! Search Employee");
}
return isFound;
   }
   
   public boolean searchEmployeeDes (String userID){
       boolean isFound =false;
       try {
   String [] user = null;
   BufferedReader bufferedReader  = fileClass.readAFile();
   String employee;
   outerloop:
   while ((employee = bufferedReader.readLine()) !=null) {
       user = employee.split(" ");
       for(String word : user ) {
           if(word.equals(userID)){
               isFound = true;
               this.setEmpId(user[0]);
               this.setEmpName(user[1]);
               this.setDesig(user[2]);
               this.setDepart(user[3]);
               
               break outerloop;
           }   } }}

catch (IOException ex){
    System.out.println("Error!!! Search Employee");
}
return isFound;
   }
}
