package j_oop.java_CowsBulls;

import java.util.List;
import java.util.ArrayList;

public class NumberGame extends AbstractGame {
    @Override
    List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (int i = 0; i <= 9; i++) {
            charList.add(String.valueOf(i));
        }
        return charList;
    }
}
