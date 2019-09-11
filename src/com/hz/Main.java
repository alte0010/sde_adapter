package com.hz;

public class Main {

    public static void main(String[] args) {

        // start survey
        HealthModel model = new HealthModel();
        BooleanAdapter reader = new BooleanAdapter();

        // ask questions
        String q1 = "Do you often go (out) with friends?";
        System.out.println(q1);

        boolean ans1 = reader.readLine();
        if(ans1) {
            model.setSocialActive(ans1);
        }

        int score = model.calculateHealthScore();

        System.out.println("Your health score is " + score + " out of 10.");
    }
}
