package bigletters;

import java.util.HashMap;

public class Utils {

    public static String[][] createLettersArray(String[] rawInput, int width, int height) {
        String[][] letters = new String[height][UserPattern.PATTERN.length()];

        for (int i = 0; i < rawInput.length; i++) {

            for (int j = 0; j < rawInput[i].length() / width; j++) {

                letters[i][j] = rawInput[i].substring(j * width, j * width + width);
            }
        }

        return letters;

    }

    public static HashMap<String, String[]> createLettersMap(String[][] letters) {
        HashMap<String, String[]> lettersMap = new HashMap<>();

        for (int i = 0; i < letters[0].length; i++) {

            String[] values = new String[letters.length];

            for (int j = 0; j < letters.length; j++) {
                values[j] = letters[j][i];
            }
            lettersMap.put(UserPattern.PATTERN.charAt(i) + "", values);
        }
        return lettersMap;
    }

    public static StringBuilder[] getResultingArray(String text, HashMap<String, String[]> lettersMap, int height) {
        StringBuilder[] result = new StringBuilder[height];

        for (int i = 0; i < text.length(); i++) {
            String character = text.charAt(i) + "";

            if (lettersMap.containsKey(character)) {


                for (int j = 0; j < height; j++) {

                    if (result[j] == null) {
                        result[j] = new StringBuilder();
                    }

                    result[j].append(lettersMap.get(character)[j]);

                }

            } else {
                for (int k = 0; k < result.length; k++) {

                    if (result[k] == null) {
                        result[k] = new StringBuilder();
                    }
                    result[k].append(lettersMap.get(Constants.UNKNOWN_SYMBOL)[k]);

                }
            }
        }
        return result;
    }

    public static void showResult(StringBuilder[] result) {
        for (StringBuilder sb : result) {
            System.out.println(sb);
        }
    }

    public static boolean isExitOption(int option) {
        return option == Constants.EXIT_OPTION;
    }

    public static boolean isValidOption(int option) {
        return option >= Constants.EXIT_OPTION && option <= Constants.RESULT_OPTION;
    }
}
