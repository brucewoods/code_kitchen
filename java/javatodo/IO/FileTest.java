package IO;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;

public class FileTest {

    private int read;
    String path="F:\\workspace\\java\\IO";
	@Test
    public void DirCreate() throws IOException, InterruptedException {
    final String pathTarget=path+"\\filecreate";
       final File  file=new File(pathTarget);
       
       if(file.exists()){
           file.delete();
       }
       Thread.sleep(3000);
        
       assertTrue(file.mkdir());
       
       
       
    }
    @Test
    public void DirCreate2() throws IOException, InterruptedException {
    final String pathTarget=path+"\\filecreate";
       final File  file=new File(pathTarget,"\\child");
       
       if(file.exists()){
           file.delete();
       }
       Thread.sleep(3000);
        
       assertTrue(file.mkdirs());
       
       
       
    }
    @Test
    public void FileCreate() throws InterruptedException {
        final String pathTarget=path+"\\filecreate\\test.txt";
        final File file=new File(pathTarget);
        if(file.exists()) file.delete();
        Thread.sleep(2000);
        try {
            assertTrue(file.createNewFile());
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    @Test
    public void FileJudge() throws InterruptedException {
          var flag=0;
          final var pathDir=path+"\\judge";
          final var pathFile=pathDir+"\\j.txt";
          final File file=new File(pathDir);
          final File file2=new File(pathFile);
          if(file.exists())
          {file.delete();
          }
         Thread.sleep(1000);

         file.mkdir();
          try {
             file2.createNewFile();
         } catch (final IOException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
         if(file.exists())  flag++;
         if(file2.isFile()) flag++;
         if(file.isDirectory()) flag++;
         if(file2.canRead()) flag++;
         if(file2.canWrite()) flag++;
         if(!file2.isHidden()) flag++;

         assertEquals(6, flag);
         

    }

    @Test
   public void FileWriterAndReader() throws InterruptedException {
        final var pathFileWriter=path + "//filewriter.txt";
        final File  file=new File(pathFileWriter);
        if(file.exists()) file.delete();
        String str="imafilewriter";
        Thread.sleep(1000);
        try {

             FileWriter fw = new FileWriter(pathFileWriter);
            fw.write(str);
            fw.close();
             char[] chas=new char[1];
             StringBuilder sb=new StringBuilder();
             FileReader fr=new FileReader(file);
            while(fr.read(chas)>0){
                sb.append(new String(chas));
              
            }
            System.out.println(sb.toString());
             Assert.assertEquals(str, sb.toString());  
            fr.close();
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    @Test
    public void FileReadAllBytes() throws InterruptedException, IOException {
        final var pathFileWriter=path + "//filewriter.txt";
        final File  file=new File(pathFileWriter);
        String str="imafilewriter";
        try {
            
      
        var content=new String( Files.readAllBytes(Paths.get(pathFileWriter)));
        assertEquals(str, content);

    } catch (Exception e) {
        //TODO: handle exception
        e.printStackTrace();
    }

        }
        @Test
        public void FileBufferedReader(){
            StringBuilder sb=new StringBuilder();
            String str="imafilewriter";
            final var pathFileWriter=path + "//filewriter.txt";
            final File  file=new File(pathFileWriter);
            try(BufferedReader br=new BufferedReader(new FileReader(file))) {
                String temp;
                while((temp=br.readLine())!=null){
                    sb.append(temp) ;
                }

                System.out.println(str);
                System.out.println(sb.toString());
            
                assertTrue(sb.toString().trim()==str.trim());
            } catch (Exception e) {
              e.printStackTrace();
            }
        }

}