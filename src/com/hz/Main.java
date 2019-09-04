package com.hz;

public class Main {

    public static void main(String[] args) {

        // start survey
        HealthModel model = new HealthModel();
        InputReader reader = new InputReader();

        // ask questions
        String q1 = "Do you often go (out) with friends?";

        System.out.println(q1);

        String ans1 = reader.readLine();

        // todo: make this work!!!
        if(ans1 == true) {
            model.setSocialActive(true);
        }

        int score = model.calculateHealthScore();

        System.out.println("Your health score is " + score + " out of 10.");
    }
}
