package Classpackage;

public class CompanyInfo {
    private String Depart;
    private String Desig;
    
    FileClass fileClass = new FileClass("Department");
    
    public CompanyInfo(){}

    public CompanyInfo(String Depart, String Desig) {
        this.Depart = Depart;
        this.Desig = Desig;
    }

    public String getDepart() {
        return Depart;
    }

    public void setDepart(String Depart) {
        this.Depart = Depart;
    }

    
    public String getDesig() {
        return Desig;
    }

    public void setDesig(String Desig) {
        this.Desig = Desig;
    }

    public FileClass getFileClass() {
        return fileClass;
    }

    public void setFileClass(FileClass fileClass) {
        this.fileClass = fileClass;
    }
   
    public boolean addDepartment()
    {
        if(!fileClass.createNewFile())
        {
            String Record=Depart+" "+Desig;
            System.out.println("Record"+Record);
            return fileClass.writeDataToFile(Record);
        }
        return false; 
}
}
