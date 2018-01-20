
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

				//Compute Celsius
				double C = ((T - 32) * 5)/9;
				//Prompt user to enter speed
				System.out.println("What is the current wind speed in MPH:");
				//compute windspeed
				double V = input.nextDouble();
				//intake Velocity of Wind Speed
				System.out.println("                                            ");
				System.out.println("Wind Chill Calculation Information Fahrenheit ");
				System.out.println("_____________________________________________");
				System.out.println("Temperature:" + " " + T + " F");
				System.out.println("Wind Speed:" + " " + V + " " + "MPH");
				
				double WCF = 35.74 + 0.6215 * T -
						 35.75 * Math.pow(V, 0.16) +
						 0.4275 * T * Math.pow(V, 0.16);
				System.out.println("Wind Chill Temperature:" + " " + WCF + " " + "F");
				System.out.println();

				System.out.println("Wind Chill Calculation Information Celsius");
				System.out.println("____________________________________");
				System.out.println("Temperature:" + " " + C + " " + "C");
				double KMH = V * 1.609344;
				System.out.println("Windspeed:"+ " " + KMH + "KMH");
				double WCC = 13.12 + 0.6215 * C -
						 11.37 * Math.pow(KMH, 0.16) +
						 0.3965 * C * Math.pow(KMH, 0.16);
				System.out.println("Wind Chill Temperature:" + " " + WCC + " " + "C");

	}

}

