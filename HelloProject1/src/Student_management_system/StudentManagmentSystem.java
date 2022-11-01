package Student_management_system;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class StudentManagmentSystem {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Hefshine Student Managment System ");
		File file = new File("C:\\Users\\hp\\Desktop\\Student_data\\student_info.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		int ch = 1;
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine();
//sc.nextLine();
		Service service = new Service();
		while (ch > 0 && ch < 5) {
			System.out.println("Enter \n 1:Add Student \n 2: Read Student");
			System.out.print(" 3:Update Student \n 4:Delete Student");
			ch = sc.nextInt();
			if (ch == 1)
				service.add();
			else if (ch == 2)
				service.read();
			else if (ch == 3)
				service.update();
			else if (ch == 4)
				service.delete();
			else
				break;

		}
	}
}
