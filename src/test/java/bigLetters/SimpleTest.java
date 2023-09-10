package bigLetters;

import bigletters.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

public class SimpleTest {

    @Test
    public void shouldReturnCorrectArray() {

        String[] rawInput =
                {
                        " #  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ### ",
                        "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   # ",
                        "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ## ",
                        "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #       ",
                        "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #  "
                };

        StringBuilder[] actualResult = {new StringBuilder("# # ### "), new StringBuilder("# #  #  "),
                new StringBuilder("###  #  "), new StringBuilder("# #  #  "), new StringBuilder("# # ### ")};

        String[][] lettersArray = Utils.createLettersArray(rawInput, 4, 5);
        HashMap<String, String[]> lettersMap = Utils.createLettersMap(lettersArray);
        StringBuilder[] result = Utils.getResultingArray("hi".toUpperCase(), lettersMap, 5);

        Assertions.assertEquals(Arrays.toString(actualResult), Arrays.toString(result));

    }
}
