package org.example.epam1B.begin;

public class Numbers {
    private String id;
    private String num;
    private boolean boolAction;
    private int number;

    public Numbers(String id, String num) {
        this.id = id;
        this.num = num;
    }

    public Numbers(String num) {
        this.num = num;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public boolean isBoolAction() {
        return boolAction;
    }

    public void setBoolAction(boolean boolAction) {
        this.boolAction = boolAction;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
