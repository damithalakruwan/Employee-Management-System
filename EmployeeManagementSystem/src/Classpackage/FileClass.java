package Classpackage;
import java.io.*;

public class FileClass {
    private static String FILE_PATH="C:\\Users\\damit\\Desktop\\FileCalss\\";
    File file;
    private String fileName;
    public FileClass(String fileName)
    {
        this.fileName=fileName;
        createNewFile();

    }
    
    // Method to create a new file or check if it already exists
    public boolean createNewFile()
    {
        try
        {
            file=new File(FILE_PATH+fileName);
                    if(file.createNewFile())
                    {
                        System.out.println("File Created: "+file.getName());
                        return true;
                    }
                    else
                    {
                        System.out.println("File Already Exist!");
                        return false;
                    }
        }
        catch(IOException ex)
        {
            System.out.println("Something went wrong with file"+ex);
            return false;
        }
    }
    
    // Method to write data to the file
    public boolean writeDataToFile(String Record)
    {
        try
        {
            file.createNewFile();
            FileWriter fileWriter=new FileWriter(file,true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            
            bufferedWriter.write(Record);
            bufferedWriter.newLine();
            bufferedWriter.close();
            return true;
        }
        catch (IOException ex)
        {
            System.out.println("Something went wrong with writting"+ex);
            return false;
        }
                
    }
    
    // Method to read a file and return a BufferedReader
    public BufferedReader readAFile()
    {
        if(!createNewFile())
        {
            try
            {
                FileReader fileReader=new FileReader(file);
                BufferedReader bufferedReader=new BufferedReader(fileReader);
                return bufferedReader;
            }
            catch(IOException ex)
            {
                System.out.println("Something went wrong with reading the file"+ex);
            }
        }
        return null;
    }
}
