package com.app.gr;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.app.gr.GradeFinder;

public class MainClass {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Float maths=null;
		Float physics=null;
		Float chemistry=null;
		Float biology=null;
		Float english=null;
		Float totalMarks = null;
		Float obtainedMarks = null;
		System.out.println("Enter marks obtained : ");
		
		
		try {
			System.out.println("Maths : ");
			maths = scanner.nextFloat();
		}catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("enter valid input.");
			return;
		} 
		
		try {
			System.out.println("Physics : ");
			physics = scanner.nextFloat();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("enter valid input.");
			return;
		}
		try {
			System.out.println("chemistry : ");
			chemistry = scanner.nextFloat();
		} 
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("enter valid input.");
			return;
		}
		try {
			System.out.println("Biology : ");
			biology = scanner.nextFloat();
			
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("enter valid input.");
			return;
		}
		try {
			System.out.println("English : ");
			english = scanner.nextFloat();
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("enter valid input.");
			return;
		}
		
		
		totalMarks = 500.0f;
		obtainedMarks = maths+physics+biology+english+chemistry;
		
		GradeFinder.getGrade(obtainedMarks,totalMarks);
		
		
		
		
		
		
		
	}

}
