import java.io.BufferedWriter;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BackEnd 
	{

		private int count;
		private boolean buttonPressed;
		
		public boolean  isButtonPressed() 
		{
			return buttonPressed;
		}

		public int getCount()
		{
			return count;
		}

		public BackEnd(int x, boolean buttonPressed, int count)
		{ 
			this.count= count;
		;
		 this.buttonPressed=  buttonPressed;
		 	count=x;
		 	updateCount(x);
		 	editFile("testcsv.txt",x);	
		}
	    
		
		private static File editFile (String filename,int count)
		{
			Path pathtoFile=Paths.get(filename);
		 try(BufferedWriter bw=Files.newBufferedWriter(pathtoFile, StandardCharsets.US_ASCII))
		   { 
			 Integer countstring= new Integer(count);
			 bw.write(countstring.toString()+",");
		   }
		}
		
		public int updateCount(int count)
		{
			if (buttonPressed)
			{
				count++;
			}
				else
			{
			count = count+0 ;
			}
		}	
			
		

	}
}
