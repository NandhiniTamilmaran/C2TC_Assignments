package Entityclassassignment1;

public class studentdemo {
	public static void main(String[] args) {
		studentclass stu1 =new studentclass();
		studentclass stu2=new studentclass();
		studentclass stu3=new studentclass();
		
		stu1.setId(1);
		stu2.setId(2);
		stu3.setId(3);
		stu1.setName("Nandhini");
		stu2.setName("W");
		stu3.setName("Tamilmaran");
		stu1.setDept("ece");
		
		
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu3);
		
	}

}
