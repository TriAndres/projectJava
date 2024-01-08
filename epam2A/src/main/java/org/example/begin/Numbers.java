package org.example.begin;

public class Numbers {
    private String id;
    private String num;
    private int numLength;
    private int avg;
    private int even;
    private int notEven;
    private boolean flag;

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

    public int getAvg() {
        return avg;
    }

    public void setAvg(int avg) {
        this.avg = avg;
    }

    public int getEven() {
        return even;
    }

    public void setEven(int even) {
        this.even = even;
    }

    public int getNotEven() {
        return notEven;
    }

    public void setNotEven(int notEven) {
        this.notEven = notEven;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}