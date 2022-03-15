package _1_registration;

import javax.swing.JOptionPane;

public class RunnerClass {

	public static void main(String[] args) {
		try {
			String userType= JOptionPane.showInputDialog(null,"Are you a student or teacher?", "Record",JOptionPane.INFORMATION_MESSAGE); 
			String userTypes = userType.toLowerCase();
			
			//Record Object Array
			switch(userTypes) {
			
			case "student":
				int recordSize = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number of Records: ", "Student",JOptionPane.INFORMATION_MESSAGE));
				
				Record[] recordArray = new Record[recordSize];
				
				for(int i = 0; i < recordSize; i++) {
					
					//Class Instantiation
					recordArray[i] = new Record();
					Student student = new Student();
					
					student.setStudentId(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter ID Number :","Student",JOptionPane.INFORMATION_MESSAGE)));
					student.setStudentName(JOptionPane.showInputDialog(null, "Enter Name :","Student",JOptionPane.INFORMATION_MESSAGE));
					student.setStudentAge(Byte.parseByte(JOptionPane.showInputDialog(null, "Enter Age :","Student",JOptionPane.INFORMATION_MESSAGE)));
					recordArray[i].setStudent(student);
					
				}
				for(int i = 0; i < recordArray.length; i++) {

					Student studentRecord = recordArray[i].getStudent();
					int studentId = studentRecord.getStudentId();
					String studentName = studentRecord.getStudentName();
					byte studentAge = studentRecord.getStudentAge();
					
					displayRecordSummaryStudent("Student's ID: " + studentId + "\n" +  "Name: " + studentName + "\n" + "Age: " + studentAge );

				}
				break;
				
			case "teacher":
				int recordSize2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Number of Records :", "Teacher",JOptionPane.INFORMATION_MESSAGE));
				
				Record[] recordArray2 = new Record[recordSize2];
				
				for(int i = 0; i < recordSize2; i++) {

					//Class Instantiation
					recordArray2[i] = new Record();
					Teacher teacher = new Teacher();

					teacher.setTeacherId(Integer.parseInt(JOptionPane.showInputDialog(null, "Enter ID Number :","Teacher",JOptionPane.INFORMATION_MESSAGE)));
					teacher.setTeacherName(JOptionPane.showInputDialog(null, "Enter Name :","Teacher",JOptionPane.INFORMATION_MESSAGE));
					teacher.setTeacherAge(Byte.parseByte(JOptionPane.showInputDialog(null, "Enter Age :","Teacher",JOptionPane.INFORMATION_MESSAGE)));
					
					recordArray2[i].setTeacher(teacher);
					
				}
				
				for(int i = 0; i < recordArray2.length; i++) {

					Teacher teacherRecord = recordArray2[i].getTeacher();
					int teacherId = teacherRecord.getTeacherId();
					String teacherName = teacherRecord.getTeacherName();
					byte teacherAge = teacherRecord.getTeacherAge();

					displayRecordSummaryTeacher("Teacher's ID: " + teacherId + "\n" +"Name: " + teacherName + "\n" + "Age: " + teacherAge );

				}
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Wrong input!",null, JOptionPane.WARNING_MESSAGE);
			}
			

		} catch(ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Exception thrown:" + e);
			JOptionPane.showMessageDialog(null, "It exceeded the limit of the array" + e);
			
		} catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Wrong input!",null, JOptionPane.WARNING_MESSAGE);
		}
	}

	//Method
	private static void displayRecordSummaryStudent(String message) {
		JOptionPane.showMessageDialog(null, message, "Student", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private static void displayRecordSummaryTeacher(String message) {
		JOptionPane.showMessageDialog(null, message, "Teacher", JOptionPane.INFORMATION_MESSAGE);
	}

}
