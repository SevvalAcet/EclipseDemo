package Odevv2;

public class Main {

	public static void main(String[] args) {
		Student student =new Student();
		student.id=1;
		student.firstName="�evval";
		student.lastName="Acet";
		student.age=19;
		

		Student student2 =new Student();
		student2.id=2;
		student2.firstName="Berk";
		student2.lastName="�akmak";
		student2.age=20;
		
		StudentManager studentManager = new StudentManager();
		studentManager.examWinners(student);
		
		
		 Instructor  �nstructor = new  Instructor();
		 �nstructor.firstName="Engin ";
		 �nstructor.lastName="Demiro�";
		 �nstructor.id=1;
		 �nstructor.trainings="JAVA+REACT,Programlamaya Giri�,C# +Angular";
		 �nstructor.competencies="MCT,PMP,ITIL";
		 
	}

}
