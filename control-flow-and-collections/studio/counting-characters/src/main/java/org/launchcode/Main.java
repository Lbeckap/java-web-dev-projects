package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String str = input.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "");
        // ^ negated character class - replacing all that isn't a-z or A-Z

        char[] arr = str.toCharArray();

        System.out.println(arr);

        HashMap<Character, Integer> output = new HashMap<>();

        for (Character c : arr) {
//            if (!Character.isLetter(c)){ //Don't need due to regex
//                continue;
//            }
            if (output.containsKey(c)){
//              output.replace(c, output.get(c) + 1);
                output.put(c, output.get(c) + 1);
            } else {
                output.put(c, 1);
            }
        }

//        int comparisonIndex = 0;
//        do {
//            for (char character : arr) {
//                int count = 0;
//                if (arr[comparisonIndex] == character) {
//                    count++;
//                    if (!output.containsKey(character)) {
//                        output.put(character, count);
//                    } else {
//                        count += output.get(character);
//                        output.replace(character, count);
//                    }
//                }
//                comparisonIndex++;
//            }
//        } while (comparisonIndex < arr.length);
        for (Map.Entry<Character, Integer> element : output.entrySet()) {
            System.out.println(element.getKey() + ": " + element.getValue());
        }
        input.close();
    }
}