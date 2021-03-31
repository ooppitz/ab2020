package de.die_gfi.felix.enumexercise;

import java.util.Scanner;

public class EnumExample {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie eine Nummer zwischen 1 und 7 ein sowie eine Sprache Deutsch Englisch oder Spanisch");
		System.out.println("Please enter a Number between 1 and 7 as well as a Language Englisch German or Spanish");
		System.out.println("Introduzca un numero entre 1 y 7 y un idioma espanol, ingles o germano");
		int x = sc.nextInt();
		String eingabe = sc.next();
		
		Wochentag result = exampleMethod(x);
		
		if(eingabe.equalsIgnoreCase("Deutsch") || eingabe.equalsIgnoreCase("German") || eingabe.equalsIgnoreCase("Germano")) {
			printDeutsch(result);
		} else {
			if(eingabe.equalsIgnoreCase("Englisch") || eingabe.equalsIgnoreCase("English") || eingabe.equalsIgnoreCase("Ingles"))  {
				printEnglisch(result);
			} else {
				if(eingabe.equalsIgnoreCase("Spanisch") || eingabe.equalsIgnoreCase("Spanish") || eingabe.equalsIgnoreCase("Espanol"))  {
					printSpanisch(result);
				} else {
					System.out.println("Ein Fehler ist Aufgetreten, ungültige Sprache");
					System.out.println("An Error has occured, invalide Language");
					System.out.println("Ocurrio un error, idioma no valido ");
				}
			}
		}
	}
	
	public static Wochentag exampleMethod(int x) {
		Wochentag result = Wochentag.ERROR;
		Scanner sc = new Scanner(System.in);
		switch(x) {
		case 1:
			result = Wochentag.MONTAG;
			break;
		case 2:
			result = Wochentag.DIENSTAG;
			break;
		case 3:
			result = Wochentag.MITTWOCH;
			break;
		case 4:
			result = Wochentag.DONNERSTAG;
			break;
		case 5:
			result = Wochentag.FREITAG;
			break;
		case 6:
			result = Wochentag.SAMSTAG;
			break;
		case 7:
			result = Wochentag.HEILIGERSONNTAG;
			break;
		default:
			result = Wochentag.ERROR;
			break;
				
		}
		return result;
	}
	public static void printDeutsch (Wochentag result) {
		switch(result) {
		case MONTAG:
			System.out.println("Montag");
			break;
		case DIENSTAG:
			System.out.println("Dienstag");
			break;
		case MITTWOCH:
			System.out.println("Mittwoch");
			break;
		case DONNERSTAG:
			System.out.println("Donnerstag");
			break;
		case FREITAG:
			System.out.println("Freitag");
			break;
		case SAMSTAG:
			System.out.println("Samstag");
			break;
		case HEILIGERSONNTAG:
			System.out.println("Heiliger Sonntag");
			break;
		default:
			System.out.println("Fehler ist Aufgetreten, Ungültiger Wochentag");
			break;
		}
	}
	public static void printEnglisch (Wochentag result) {
		switch(result) {
		case MONTAG:
			System.out.println("Monday");
			break;
		case DIENSTAG:
			System.out.println("Tuseday");
			break;
		case MITTWOCH:
			System.out.println("Wednesnday");
			break;
		case DONNERSTAG:
			System.out.println("Thursday");
			break;
		case FREITAG:
			System.out.println("Friday");
			break;
		case SAMSTAG:
			System.out.println("Saturday");
			break;
		case HEILIGERSONNTAG:
			System.out.println("Holy Sunday");
			break;
		default:
			System.out.println("An Error has occured, invalide Day");
			break;
		}
	}
	public static void printSpanisch (Wochentag result) {
		switch(result) {
		case MONTAG:
			System.out.println("Lunes");
			break;
		case DIENSTAG:
			System.out.println("Martes");
			break;
		case MITTWOCH:
			System.out.println("Miercoles");
			break;
		case DONNERSTAG:
			System.out.println("Jueves ");
			break;
		case FREITAG:
			System.out.println("Viernes");
			break;
		case SAMSTAG:
			System.out.println("Sabado");
			break;
		case HEILIGERSONNTAG:
			System.out.println("Domingo santo");
			break;
		default:
			System.out.println("Ocurrio un error, dia no valido ");
			break;
		}
	}
}
