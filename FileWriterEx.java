import java.io.*;
public class FileWriterEx {
    public static void main(String args[])throws IOException{
        FileOutputStream fout = null;
        BufferedOutputStream bos = null;
        try {
            fout = new FileOutputStream("myfile.txt",true);
            bos = new BufferedOutputStream(fout);
            String s = "My city name is Amravati";
            byte data[] = s.getBytes();
            bos.write(data);
        }catch(IOException e){
            System.out.println(e.getMessage());

        }finally{
            bos.close();
            fout.close();
        }
    }    
}
