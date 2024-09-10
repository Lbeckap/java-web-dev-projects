package org.launchcode;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Array practice
        int[] nums = {1, 1, 2, 3, 5, 8};
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 1) {
                System.out.println("ood " + nums[i]);
            }
        }

        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
        System.out.println(Arrays.toString(words));

        String[] sentences = phrase.split("\\.");
        for (int i = 0; i < sentences.length; i++) {
            System.out.println(sentences[i]);
        }

        // ArrayList Practice
        ArrayList<Integer> integersArrL = new ArrayList<>();
        integersArrL.add(4);
        integersArrL.add(14);
        integersArrL.add(0);
        integersArrL.add(3);
        integersArrL.add(12);
        integersArrL.add(7);
        integersArrL.add(9);
        integersArrL.add(6);
        integersArrL.add(5);
        integersArrL.add(16);
        System.out.println(findSum(integersArrL));

        ArrayList<String> wordCloud = new ArrayList<>();
        wordCloud.add("Hello");
        wordCloud.add("Fancy");
        wordCloud.add("Lori");
        wordCloud.add("Constellation");
        wordCloud.add("Ciao");
        System.out.println(findFiveLetterWords(wordCloud));

        // Convert String phrase to ArrayList
        String phrase2 = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] str = phrase2.split("[,. ]"); // 1st make it an array
        System.out.println(Arrays.toString(str));
        List<String> conversion = Arrays.asList(str); // 2nd convert to ArrayList
        String classOf = conversion.getClass().getSimpleName(); // Get class name to confirm conversion
        System.out.println(classOf + " " + conversion);

        // Combine both ArrayLists together
        // Use Set to avoid duplicates
        Set<String> set = new LinkedHashSet<>(wordCloud);
        set.addAll(conversion);
        set.remove(""); // remove null? values
        // Then convert to ArrayList
        ArrayList<String> combinedList = new ArrayList<>(set);
        System.out.println(combinedList);
        System.out.println(findFiveLetterWords(combinedList));

        // HashMap Practice
        HashMap<Integer, String> finalRoster = new HashMap<>();
        finalRoster = createRoster();
        System.out.println(finalRoster);


    }

    public static int findSum(ArrayList<Integer> integers) {
        int sum = 0;
        for (int number : integers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static ArrayList<String> findFiveLetterWords(ArrayList<String> allWords) {
        ArrayList<String> words = new ArrayList<>();

        boolean validInput = false;
        int wordLength = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("What word length would you like to search for? ");
            try { //TODO It's best to implement try-with-resource here!
                wordLength = input.nextInt();
                if (wordLength > 0) {
                    validInput = true;
                }
                for (String word : allWords) {
                    if (word.toCharArray().length == wordLength) {
                        words.add(word);
                    }
                }

                if (words.size() == 0) {
                    System.out.println("Sorry! There are no words with that length. Try Again!");
                    validInput = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Oops! You must enter a number. Try Again!");
                input.nextLine();
            }
        }
        while (!validInput);
        //input.close();

        return words;
    }

    public static HashMap<Integer, String> createRoster() {
        HashMap<Integer, String> roster = new HashMap<>();


        boolean validInput = false;
        boolean isAnother = false;
        do {
            try (Scanner input = new Scanner(System.in)) {
                System.out.println("Please enter a student name: ");
                String name = input.nextLine();
//                    input.nextLine();
                do {

                    System.out.println("Please enter the ID number for " + name);
                    int id = input.nextInt();
//                        input.nextLine();

                    if (!roster.containsKey(id)) {
                        roster.put(id, name);
                        validInput = true;
                        System.out.println("Add another student? Y/N");
                        String addAnother = input.nextLine();
                        //TODO Code stops here! WHY?
                        if (addAnother.equalsIgnoreCase("Y")) {
//                                input.nextLine();
                            isAnother = true;
                        }
                    }
                } while (!validInput);
                input.nextLine();
            }
        }while (isAnother);


        return roster;
    }
}