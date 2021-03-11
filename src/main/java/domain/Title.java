package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Title {

    private static int TITLE_COUNT = 1;

    private static List<String> titles;

    static {
        titles = Arrays.asList(
                "음식",
                "국가",
                "장소",
                "인물",
                "동물",
                "브랜드"
        );
    }

    public static String pickRandomTitle() {
        ArrayList<String> titles = new ArrayList<>(Title.titles);
        Collections.shuffle(titles);
        return titles.stream()
                .limit(TITLE_COUNT)
                .findFirst()
                .orElseThrow(IndexOutOfBoundsException::new);
    }
}
