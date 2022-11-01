package Student_management_system;

import java.util.Scanner;

public class Service {
	Scanner sc = new Scanner(System.in);

	public void add() throws Exception {
		// System.out.println("i am add from service");
		System.out.println("enter rn,name,marks, separte coma");
		String data = sc.nextLine();
		DAO dao = new DAO();
		dao.add(data);
	}

	public void read() throws Exception {

		DAO dao = new DAO();
		dao.read();

	}

	public void update() throws Exception {
		System.out.println("Enter updated rn, name, marks coma seprated");
		String data = sc.nextLine();
		DAO dao = new DAO();

		dao.update(data);

	}

	public void delete() throws Exception {
		System.out.println("Enter roolNumber");
		String data = sc.nextLine();
		DAO dao = new DAO();
		dao.delete(data);

	}

}
