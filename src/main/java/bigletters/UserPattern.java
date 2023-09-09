package main.java.bigletters;

public class UserPattern {

    private int width;
    private int height;
    private String text;
    public static final String PATTERN = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";

    public UserPattern() {
    }

    public void showPatternParams() {
        System.out.println("Letter width is: " + width + "\nLetter height is: " + height + "\nYour input text is: " + text);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getText() {
        return text;
    }
}
