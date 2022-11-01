package Student_management_system;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class DAO {
	public void add(String data) throws Exception {
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\hp\\Desktop\\Student_data\\student_info.txt"));
		String alldata = "";
		while (true) {
			String s = br.readLine();
			if (s == null)
				break;
			alldata += s + "\n";
		}
		alldata += data;
		FileWriter filewrite = new FileWriter("C:\\Users\\hp\\Desktop\\Student_data\\student_info.txt");
		filewrite.append(alldata);
		filewrite.flush();
		filewrite.close();
	}

	public void read() throws Exception {
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\hp\\Desktop\\Student_data\\student_info.txt"));
		while (true) {
			String s = br.readLine();
			if (s == null)
				break;
			System.out.println(s);
		}
	}

	public void update(String data) throws Exception {
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\hp\\Desktop\\Student_data\\student_info.txt"));
		String alldata = "";
		String[] sa = data.split(",");
		while (true) {
			String s = br.readLine();
			if (s == null)
				break;
			if (s.startsWith(sa[0]))
				alldata += data + "\n";
			else
				alldata += s + "\n";
		}
//	alldata+=data;
		FileWriter filewrite = new FileWriter("C:\\Users\\hp\\Desktop\\Student_data\\student_info.txt");
		filewrite.append(alldata);
		filewrite.flush();
		filewrite.close();
	}

	public void delete(String data) throws Exception {
		BufferedReader br = new BufferedReader(
				new FileReader("C:\\Users\\hp\\Desktop\\Student_data\\student_info.txt"));
		String alldata = "";
		while (true) {
			String s = br.readLine();
			if (s == null)
				break;
			if (!s.startsWith(data))
				alldata += s + "\n";
		}
		FileWriter filewrite = new FileWriter("C:\\Users\\hp\\Desktop\\Student_data\\student_info.txt");
		filewrite.append(alldata);
		filewrite.flush();
		filewrite.close();
	}

}
