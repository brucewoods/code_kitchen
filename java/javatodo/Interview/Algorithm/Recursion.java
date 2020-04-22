package Interview.Algorithm;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Recursion {
             
     
    @Test
    public   void testRecursioin(){
        
          File f=new File("F:\\workspace\\java\\Interview\\Algorithm");
          myRecursion(f);
          for (File file : BigFiles) {
              System.out.println(file.getPath());
          }
    }   
    public List<File> BigFiles=new ArrayList<File>();
    public  void  myRecursion(final File f){
       final File[] files= f.listFiles();

       for (final File file : files) {
           if(file.isDirectory()){
           myRecursion(file);
           } else{
           BigFiles.add(file);
           }
       }
        
    }
    public int  myRecursion2(int p){
        if(p==0){
            return 1;
        } else if(p>0&& p<2){
            return 2;
        }
        else{
            return myRecursion2(p)+5;
        }

    }
}