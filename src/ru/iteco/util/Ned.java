package ru.iteco.util;

public abstract class Ned {
    public String honor;
    private String surname = "Stark";
    protected String greatsword;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public abstract void cut();

    public void die(String weapon) {
        System.out.println("Died by " + weapon);
    }

}
