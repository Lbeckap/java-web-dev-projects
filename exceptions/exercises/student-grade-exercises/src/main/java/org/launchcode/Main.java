package org.launchcode;

import java.lang.reflect.Array;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Divide(4,2);
        Divide(4, 1);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.jav");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for(Map.Entry<String, String> fileSubmission : studentFiles.entrySet()){
            System.out.println(fileSubmission.getKey() + " " +
                    fileSubmission.getValue() + " Score: " +
                    CheckFileExtension(fileSubmission.getValue(), fileSubmission.getKey()));
        }

    }

    public static void Divide(int x, int y)
    {
        // Write code here!
        try {
            System.out.println(x/y);
        } catch(MainException e) {
            e.printStackTrace();
        }

    }

    public static int CheckFileExtension(String fileName, String student)
    {
        // Write code here!
        int score = 0;
        try {
            if (fileName.contains(".java")) {
                score++;
            } else if (fileName.isBlank()) {
                score--;
                throw new CheckFileException("A file was not submitted for " + student, student);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        return score;
    }

    }
