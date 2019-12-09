import java.util.*;
import java.io.*;

public class AthleticList {
	
	ArrayList<Athlet> athletList = new ArrayList<Athlet>();

	public static void main(String[] args) {
		new AthleticList().run();
	}
	
	public void run() {
		getAthlet();
		System.out.println("Unsortiert:" + athletList);
		Collections.sort(athletList);
		System.out.println("Sortiert: " + athletList);
	}

	/*void compare(ArrayList<String> list) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).toString().charAt(0) == 'A') {
				
			}
		}
	}*/
	
	void getAthlet() {
		String pathname = "/home/johannes/eclipse-workspace/SortTextfile/src/file.txt";
		try {
			File file = new File(pathname);
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String row = null;
			while((row = reader.readLine()) != null) {
				addAthlet(row);
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*void addAthlet(String parse) {
		String[] token = parse.split("/");
		athletList.add(token[0]);
	}*/
	
	// new Athlet-Object
	void addAthlet(String parse) {
		String[] token = parse.split("/");
		Athlet athlet = new Athlet(token[0], token[1], token[2]);
		athletList.add(athlet);
	}
}
