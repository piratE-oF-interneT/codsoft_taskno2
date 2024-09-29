package com.app.gr;

public class GradeFinder { 
	
	
	public static void getGrade(Float marksObtained , Float totalMarks	) {
		
		char[] grades = {'S','A','B','C','D','E','F'};
		char grade;
		
		Float percentage = (marksObtained/totalMarks)*100;
		
		if (percentage>=90) {
			grade=grades[0];
		}
		else if (percentage>=75) {
			grade=grades[1];
		}else if (percentage>=66) {
			grade=grades[2];
		}else if (percentage>=56) {
			grade=grades[3];
		}else if (percentage>=50) {
			grade=grades[4];
		}else if (percentage>=45) {
			grade=grades[5];
		}
		else {
			grade=grades[6];
		}
		
		System.out.println("Total marks obtained : " + marksObtained);
		System.out.println("Average percentage : " + percentage);
		System.out.println("Grade : " + grade);
		return;
		
		
	}
	
	

}
