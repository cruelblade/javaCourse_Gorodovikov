package ru.iteco.util;

public class Arya extends Ned {
    public String wolf;
    private String needle;
    protected String nothing;

    public String getNeedle() {
        return needle;
    }

    public void setNeedle(String needle) {
        this.needle = needle;
    }

    public Arya(String wolf) {
        this.wolf = wolf;
    }

    public Arya() {
        this.wolf = "someone wolf";
    }

    @Override
    public void cut() {
        System.out.println("Arya stick'em with a pointy end of " + needle);
    }
}
