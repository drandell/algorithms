import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHelpers 
{
	public int[] ReadDataSet(String filename, String delimiter)
	{
		delimiter = delimiter != null ? delimiter : " ";
		List<String> data = new ArrayList<String>();
		int[] dataSet = null;
	
		try {
			//Read Entire File Into String List
			Scanner file = new Scanner(new FileReader(filename));
			file.useDelimiter(delimiter); 		
			while (file.hasNext()) {
				data.add(file.next());
			}
			file.close();
		
			dataSet = new int[data.size()];	

			for (int i = 0; i < data.size(); i++) {
				dataSet[i] = Integer.parseInt(data.get(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return dataSet;
	}

	public void SaveDataSet(String filename, String delimiter, int[] dataSet) 
	{
		delimiter = delimiter != null ? delimiter : " ";	

		try {
				File file = new File(filename);
				BufferedWriter output = new BufferedWriter(new FileWriter(file));

				for (int i = 0; i < dataSet.length; i++) {
					String element = Integer.toString(dataSet[i]) + delimiter;
					output.write(element);
				}

				output.close();
		    } catch (IOException e ) {
				e.printStackTrace();
		    }
	}
}
