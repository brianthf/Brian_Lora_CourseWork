package com.company.home;

/*Task:
 *
 */
public class Kitchen {
    private int sqFeet;
    private boolean isClean;

    public Kitchen(int sqFeet, boolean isClean) {
        this.sqFeet = sqFeet;
        this.isClean = isClean;
    }

    public void setSqFeet(int sqFeet) {
        this.sqFeet = sqFeet;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public int getSqFeet() {
        return sqFeet;
    }

    public boolean isClean() {
        return isClean;
    }
}
