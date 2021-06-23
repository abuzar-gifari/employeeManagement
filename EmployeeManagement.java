package employeeManagement;

import java.util.Scanner;


class Employee implements Serializable{

	int id;
	String name;
	float salary;
	long contact_no;
	String email_id;
	
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
				
			case 2: System.out.println("Enter the Employee ID to search :");
					id = sc.nextInt();
					int i=0;
					for(Employee e: al)
					{
						if(id == e.id)
						{
							System.out.println(e+"\n");
							i++;
						}
					}
					if(i == 0)
					{
						System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
					}
					break;
			
			case 3: System.out.println("\nEnter the Employee ID to EDIT the details");
					id = sc.nextInt();
					int j=0;
					for(Employee e: al)
					{
						if(id == e.id)
						{	
							j++;
						do{
							int ch1 =0;
							System.out.println("\nEDIT Employee Details :\n" +
												"1). Employee ID\n" +
												"2). Name\n" +
												"3). Salary\n" +
												"4). Contact No.\n" +
												"5). Email-ID\n" +
												"6). GO BACK\n");
							System.out.println("Enter your choice : ");
							ch1 = sc.nextInt();
							switch(ch1)
							{
							case 1: System.out.println("\nEnter new Employee ID:");
									e.id =sc.nextInt();
									System.out.println(e+"\n");
									break;
							
							case 2: System.out.println("Enter new Employee Name:");
									e.name =sc.nextLine();
									System.out.println(e+"\n");
									break;
									
							case 3: System.out.println("Enter new Employee Salary:");
									e.salary =sc.nextFloat();
									System.out.println(e+"\n");
									break;
									
							case 4: System.out.println("Enter new Employee Contact No. :");
									e.contact_no =sc.nextLong();
									System.out.println(e+"\n");
									break;
									
							case 5: System.out.println("Enter new Employee Email-ID :");
									e.email_id =sc.next();
									System.out.println(e+"\n");
									break;
									
							case 6: j++;
									break;
									
							default : System.out.println("\nEnter a correct choice from the List :");
										break;
							
							}
							}
						while(j==1);
						}
					}
					if(j == 0)
					{
						System.out.println("\nEmployee Details are not available, Please enter a valid ID!!");
					}
				
					break;
					
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
