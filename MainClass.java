import java.util.Scanner;
interface Resume {
	void biodata();
}
class Teacher implements Resume {
			public void biodata() {
				String name,dob,age,bg,qualification;
				Scanner s=new Scanner(System.in);
				System.out.println("enter name ,date of birth (DD//MM//YYYY),age,blood group of teacher");
				name =s.nextLine();
				dob=s.nextLine();
				age=s.nextLine();
				bg=s.nextLine();
				System.out.println("enter the qualification,expirence in years,achivements");
				qualification=s.nextLine();
				String exp=s.nextLine();
				String achivement=s.nextLine();
				System.out.println("\n\n resume of the teacher ");
				System.out.println("name:"+name+"\n date of birth:"+dob+"\n age:"+age+"\n blood group:"+bg+"\n expirence in years:"+exp+"\n achivement:"+achivement);
			}
		}
		class Student implements Resume {
			public void biodata()
			{
				String name,dob,age,bg;
				Scanner s=new Scanner(System.in);
				System.out.println("enter the name,date of birth(DD//MM//YYYY),age,blood goup of student");
				name=s.nextLine();
				dob=s.nextLine();
				age=s.nextLine();
				bg=s.nextLine();
				System.out.println("enter the desipline i.branch ii.sem iii.section");
				String branch=s.nextLine();
				String sem=s.nextLine();
				String section=s.nextLine();
				System.out.println("enter the result i.percentage ii.CGPA");
				float p=s.nextFloat();
				float c=s.nextFloat();
				System.out.println("\n\n resume of the student");
				System.out.println("name:"+name+"\n date of birth:"+dob+"\n age:"+age+"\n blood age:"+bg+"\n result\n percentage:"+p+"\n CGPA:"+c+"\n discipline details:\n branch:"+branch+"\n semester;"+sem+"\n section:"+section);
					
			}
			
		}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Teacher t=new Teacher();
			Student s=new Student();
			t.biodata();
			s.biodata();
	}

	}

