package DSAandAlgorithmInJava.Recursion;
import java.io.File;
import java.io.FileNotFoundException;

public class ComputeDirectorySizeinjava {
    //recursive function
    public static long computeFileSize(File file){
        //store the size of all files
        long size=0;


        //recursive case if the directory is encounterd
        if (file.isDirectory()){
            File[] filesarr= file.listFiles();
            for(int i=0;filesarr!=null && i<filesarr.length;i++){
                size+=computeFileSize(filesarr[i]);
            }
        }


        else if(file.isFile()) {
            //base case
           size+=file.length();
        }


        //rerturning the size
        return size;
    }


    public static void main(String[] args) throws FileNotFoundException{
        try{
            //creating file object
            File file=new File("D:\\PROGRAMING_CODES\\DemoDirectory\\Directory(d)");
            //calling the computeFileSize(file) method 
            System.out.println("size of the directory is : "+computeFileSize(file)+" bytes.");

        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}
