package ru.iteco.util;

public class Robb extends Ned {
    public String executor;
    protected String sword;
    private String north;

    public String getNorth() {
        return north;
    }

    public void setNorth(String north) {
        this.north = north;
    }

    public Robb() {
        this.executor = "dagger";
    }

    public Robb(String executor) {
        this.executor = executor;
    }

    @Override
    public void cut() {
        System.out.println("Robb cut his enemies with a " + sword);
    }
}
