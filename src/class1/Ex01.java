package class1;

public class Ex01 {
	public static void main(String[] args) {
		
		ScoreData scoreData = new ScoreData();
		
		scoreData.name = "����";
		scoreData.score = 80;
		scoreData.ranking = 10;
		
		System.out.println(scoreData.name);
		System.out.println(scoreData.score);
		System.out.println(scoreData.ranking);
		
		System.out.println();
		
		//
		
		Student firstStudent = new Student();
		firstStudent.name = "���缮";
		firstStudent.className = "java";
		firstStudent.age = 23;
		firstStudent.phoneNumber = "0102913123";
		
		Student secondStudent = new Student();
		secondStudent.name = "������";
		secondStudent.className = "java";
		secondStudent.age = 17;
		secondStudent.phoneNumber = "0102938844";
		
		Student[] students = new Student[2];
		students[0] = firstStudent;
		students[1] = secondStudent;
		
		for (int i = 0; i < students.length; i++) {
			Student student = students[i];
			System.out.println(student.name);
			System.out.println(student.age);
			System.out.println(student.className);
			System.out.println(student.phoneNumber);
			
			System.out.println();
		}
		
		
	}
	
}
