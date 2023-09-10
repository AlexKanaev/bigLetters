package bigletters;

public class UserPattern {

    private int width;
    private int height;
    private String text;
    public static final String PATTERN = "ABCDEFGHIJKLMNOPQRSTUVWXYZ?";

    public UserPattern() {
    }

    public void showPatternParams() {
        System.out.println("Letter width is: " + getWidth() + "\nLetter height is: " + getHeight() + "\nYour input text is: " + getText());
    }

    public void setWidth(int width) {

        if (width < Constants.MIN_WIDTH) {
            throw new IllegalArgumentException("Width can't be less than " + Constants.MIN_WIDTH);
        }

        this.width = width;
    }

    public void setHeight(int height) {

        if (height < Constants.MIN_HEIGHT) {
            throw new IllegalArgumentException("Height can't be less than " + Constants.MIN_HEIGHT);
        }

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

    public boolean areParametersSet() {
        return getWidth() != 0 && getHeight() != 0 && getText() != null;
    }
}
