package employeeManagement;

import java.util.Scanner;


class Employee implements Serializable{

	
	
	public Employee(int id, String name, float salary, long contact_no, String email_id)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.contact_no = contact_no;
		this.email_id = email_id;
	}
	
	public String toString()
	{
		return "\nEmployee Details :" + "\nID: " + this.id + "\nName: " + this.name + "\nSalary: " + 
				this.salary + "\nContact No: " + this.contact_no + "\nEmail-id: " + this.email_id;
	}
	
}

public class EmployeeManagement
{	
	static void display()
	{
		System.out.println(String.format("ID","Name","salary","contact-no","Email-Id");
		for(Employee e : al)
		{
			System.out.println((e.id,e.name,e.salary,e.contact_no,e.email_id));
		}
	}
	
	
	public static void main(String[] args)
	{
		int id;
		String name;
		float salary;
		long contact_no;
		String email_id;
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		try{
			
			f = new File("Employee Management Tool/src/EmployeeDataList1.txt");
			if(f.exists())
			{
				fis = new File(f); // error found (wasim you need to solve this)
				ois = new ObjectInputStream(fis);
				// This portion need to update Rahat
			}
			
		}catch(Exception){
			//here error number 3
		}
		do
		{
			System.out.println("welcome to our project");
			System.out.println("1). Add Employee to the DataBase\n" +
								"2). Search for Employee\n" +
								"3). Edit Employee details\n" +
								"4). Delete Employee Details\n" +
								"5). Display all Employees working in this company\n" +
								"6). EXIT\n");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			
			switch(ch)
			{
			case 1:System.out.println("\nEnter the following details to ADD list:\n");
				System.out.println("Enter ID :");
				id = sc.nextInt();
				System.out.println("Enter Name :");
				name = sc.next();
				System.out.println("Enter Salary :");
				salary = sc.nextFloat();
				System.out.println("Enter Contact No :");
				contact_no = sc.nextLong();
				System.out.println("Enter Email-ID :");
				email_id = sc.next();
				al.add(new Employee(id, name, salary, contact_no, email_id));
				display(al);
				break;
				
			// case 2 gifari koris (ami wasim, kivabe korbo bujhteci na)
					// case 1 ami koira disi, case 3 rahat koris
					
			case 4: System.out.println("\nEnter Employee ID to DELETE from the Databse :");
					id = sc.nextInt();
					int k=0;
					try{
					for(Employee e: al)
					{
						if(id == e.id)
						{
							//I can not solve the error
						}
					}
					if(k == 0)
					{
						System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
					}
					}
					catch(Exception ex){
						System.out.println(ex);
					}
					break;
			
			case 5: try {
				
				} catch (ClassNotFoundException e2) {
					
					System.out.println(e2);
				} catch (Exception e2) {
					
					System.out.println(e2);
				}
					display(al);
					break;
		}
		while(true);
	}
	
}
