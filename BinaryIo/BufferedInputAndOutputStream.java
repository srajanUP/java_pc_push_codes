package BinaryIo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputAndOutputStream{
    public static void main(String[] args) {

        //writing data 
        try(FileOutputStream fileOut=new FileOutputStream("D:\\PROGRAMING_CODES\\binary.dat")) {
            BufferedOutputStream buffer=new BufferedOutputStream(fileOut);
            byte[] data = {0x48, 0x65, 0x6C, 0x6C, 0x6F, 0x2C, 0x20, 0x57, 0x6F, 0x72, 0x6C, 0x64, 0x21};
            buffer.write(data);

            buffer.close();


        } catch (Exception e) {
            System.out.println("file not found");
        }


        //reading data
        try (FileInputStream file = new FileInputStream("D:\\PROGRAMING_CODES\\binary.dat")) {
            BufferedInputStream bufferRead=new BufferedInputStream(file);
            while(bufferRead.read()!=-1){
                System.out.println(bufferRead.read());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}