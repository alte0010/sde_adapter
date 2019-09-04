package com.hz;

public class HealthModel {

    private boolean isSocialActive;
    private boolean hasAVariedDiet;
    // add more

    /**
     *
     * @return a health score between 0 and 10
     */
    public int calculateHealthScore() {

        int score = 0;
        if(isSocialActive) score++;
        if(hasAVariedDiet) score++;

        return score;
    }

    public boolean isSocialActive() {
        return isSocialActive;
    }

    public void setSocialActive(boolean socialActive) {
        isSocialActive = socialActive;
    }

    public boolean isHasAVariedDiet() {
        return hasAVariedDiet;
    }

    public void setHasAVariedDiet(boolean hasAVariedDiet) {
        this.hasAVariedDiet = hasAVariedDiet;
    }

}
