package Classpackage;
import java.io.BufferedReader;
import java.io.IOException;

// HRPassword class for managing HR user credentials
public class HRPassword {
    private String HRId;
    private String HRPassword;
    private String HRType;

    FileClass fileClass=new FileClass("HR management.txt");
    
    public HRPassword () {}

    public HRPassword(String HID, String HPass) {
        this.HRId = HID;
        this.HRPassword = HPass;
    }

    public HRPassword(String HID, String HPass, String HRType) {
        this.HRId = HID;
        this.HRPassword = HPass;
        this.HRType = HRType;
        System.out.println(HID+HPass+HRType);
    }

    public String getHRId() {
        return HRId;
    }

    public void setHRId(String HRId) {
        this.HRId = HRId;
    }

    public String getHRPassword() {
        return HRPassword;
    }

    public void setHRPassword(String HRPassword) {
        this.HRPassword = HRPassword;
    }

    public String getHRType() {
        return HRType;
    }

    public void setHRType(String HRType) {
        this.HRType = HRType;
    }

    public FileClass getFileClass() {
        return fileClass;
    }

    public void setFileClass(FileClass fileClass) {
        this.fileClass = fileClass;
    }

    
    
    public boolean addNewUser()
    {
        if(!fileClass.createNewFile())
        {
            String Record=HRId+" "+HRPassword+" "+HRType;
            System.out.println("Record"+Record);
            return fileClass.writeDataToFile(Record);
        }
        return false; 
    }
    
    // Method to validate HR user login credentials
    public boolean validateLogin()
    {
        try
        {
            String[] words=null;
            BufferedReader bufferedReader=fileClass.readAFile();
            String user;
            while((user=bufferedReader.readLine()) !=null)
            {
                words=user.split(" ");
                if (words[0].equals(HRId)&& words[1].equals(HRPassword))
                {
                    this.setHRId(words[0]);
                    this.setHRPassword(words[1]);
                    this.setHRType(words[2]);
                    return true;
                }
            }
        }
        catch(IOException ex)
        {
            System.out.println("Enter validation Login"+ex);
            return false;
        }
        return false;
}
}
