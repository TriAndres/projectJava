package org.example.begin;

public class Numbers {
    private String id;
    private String num;
    private int numLength;

    public Numbers(String num) {
        this.num = num;
    }

    public Numbers(String id, String num) {
        this.id = id;
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

    public int getNumLength() {
        return numLength;
    }

    public void setNumLength(int numLength) {
        this.numLength = numLength;
    }
}