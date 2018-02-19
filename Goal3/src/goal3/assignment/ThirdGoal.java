package goal3.assignment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ThirdGoal {

	public static void main(String[] args) {
    String filename = "ipl.csv";
    ArrayList<String> list =new ArrayList<>();
	FileReader fileread=null;
	BufferedReader br=null;
	String head=" "; 
	String value=" ";
	
	try {
            fileread=new FileReader(filename);
            br=new BufferedReader(fileread);
			String CurrentLine=" ";
	//reads the first line of the file		
			head= br.readLine();
   //reads the whole file			
		    while ((CurrentLine = br.readLine()) != null) {
		              
				//String token[] = CurrentLine.split(",");
		    	//System.out.println(CurrentLine);
		    	value=CurrentLine;		    	
		    }
		    DataType data=new DataType();
	    	data.getDataType(head,value);
	    	//DateType d=new DateType();
	        ///d.getDate(value);
		    	

		} catch (IOException e) {
			e.printStackTrace();
		}
	    finally {
	    	if(br!=null) {
	    		try {
	    			br.close();
	  	    		}catch(IOException e){
	  	    			e.printStackTrace();			
	  	    		}
	    	}
	    	if(fileread!=null)
	    	{
	    		try {
	    			fileread.close();
	    		}catch(IOException e) {
	    			e.printStackTrace();
	    		}
	    	}
	    }
	System.out.println(list);
	}
}

