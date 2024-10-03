package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public abstract class Question {
    private final String question;
    private final HashMap<Integer, Choice> choiceMap = new HashMap<>();
    private int maxResponses = 1;

    public Question(String question, Choice[] choiceArray) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public int getMaxResponses() {
        return maxResponses;
    }

    public HashMap<Integer, Choice> getChoiceMap() {
        return choiceMap;
    }

    public void setMaxResponses(int maxResponses) {
        this.maxResponses = maxResponses;
    }

    @Override // Why - Required because the Object toString method is being overridded
    public abstract String toString(); // Why - Forces all subclasses to have a toString method

    void createRandomizedChoiceMap(Choice[] choiceArray) {
        ArrayList<Choice> choiceList = new ArrayList<>();
        Collections.addAll(choiceList, choiceArray); // Why - Dumps items from choiceArray into the new ArrayList choiceArray
        Collections.shuffle(choiceList);
        for (int i = 0; i < choiceList.size(); i++) {
            choiceMap.put(i + 1, choiceList.get(i));
        }
    }

    // Next instance method
    String getFormattedChoices() {
        StringBuilder formattedChoices = new StringBuilder();
        String newLine = System.lineSeparator(); // This is also needed for GA2
        for (int choiceNum : choiceMap.keySet()) {
            String choice = "\t" + choiceNum + " - " + choiceMap.get(choiceNum).getContent() + newLine;
            formattedChoices.append(choice);
        }
        return formattedChoices.toString();
    }

    public boolean isValid(String resp){
        try {
            int respInt = Integer.parseInt((resp));
            return respInt <= 0 || respInt > choiceMap.size();
        } catch(Exception e) {

        }
        return true;
    }
}

