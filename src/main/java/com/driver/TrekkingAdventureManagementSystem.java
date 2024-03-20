package com.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrekkingAdventureManagementSystem {
	private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Get trek details from the user
        System.out.print("Enter Trek Name: ");
        String trekName = scanner.nextLine();

        System.out.print("Enter Trek Duration (days): ");
        int trekDuration = scanner.nextInt();

        System.out.print("Enter Altitude Gain (meters): ");
        int altitudeGain = scanner.nextInt();

        System.out.print("Enter Known Challenges (comma-separated): ");
        scanner.nextLine(); // Consume the newline character
        String[] challengesArray = scanner.nextLine().split(",");
        List<Object> knownChallenges = new ArrayList<Object>();
        for (String challenge : challengesArray) {
            knownChallenges.add(challenge.trim());
        }

        // Create a Trek object
        Trek trek = new Trek(trekName, trekDuration, altitudeGain, knownChallenges);

        // Calculate and display trek difficulty
        String trekDifficulty = calculateTrekDifficulty(trek);
        System.out.println("Trek Difficulty: " + trekDifficulty);
    }

    public static String calculateTrekDifficulty(Trek trek) {
		
    	// your code goes here
    	return null;
    }
}
