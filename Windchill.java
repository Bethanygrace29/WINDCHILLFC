
import 
java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new
				//Prompt the user to enter the temperature
					Scanner(System.in);
				System.out.println("What is the current temperature in Fahrenheit:");
				
				double T = input.nextDouble();
				// storage for prompted user info 

				//Compute Celsius
				double C = ((T - 32) * 5)/9;
				//Code converts Farehneit to Celsius
				//Prompt user to enter speed in MPH of wind
				System.out.println("What is the current wind speed in MPH:");
				
				double V = input.nextDouble();
				//intake Velocity of Wind Speed from user
				System.out.println("                                            ");
				//gives a row of space between 
				System.out.println("Wind Chill Calculation Information Fahrenheit ");
				//generates output giving what the solution is 
				System.out.println("_____________________________________________");
				
				System.out.println("Temperature:" + " " + T + " F");
				//Displays Temperature in Farenheit
				System.out.println("Wind Speed:" + " " + V + " " + "MPH");
				//Displays wind speed in Miles Per hour
				double WCF = 35.74 + 0.6215 * T -
						 35.75 * Math.pow(V, 0.16) +
						 0.4275 * T * Math.pow(V, 0.16);
				//Formula for the temperature in Farenheit given windchill
				System.out.println("Wind Chill Temperature:" + " " + WCF + " " + "F");
				// Displays windchill temperature output based on user given data
				System.out.println();

				System.out.println("Wind Chill Calculation Information Celsius");
				System.out.println("____________________________________");
				System.out.println("Temperature:" + " " + C + " " + "C");
				double KMH = V * 1.609344;
				// Formula converts MPH to Kilometers
				System.out.println("Windspeed:"+ " " + KMH + "KMH");
				double WCC = 13.12 + 0.6215 * C -
						 11.37 * Math.pow(KMH, 0.16) +
						 0.3965 * C * Math.pow(KMH, 0.16);
				//Double WCC formula converts wind chill temperature in Celsius
				System.out.println("Wind Chill Temperature:" + " " + WCC + " " + "C");

	}

}

