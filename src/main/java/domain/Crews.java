package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Crews {

    private static final int MAFIA_COUNT = 4;

    private static List<Crew> crews;

    static {
        crews = Arrays.asList(
                new Crew("김준근", "루트"),
                new Crew("김현식", "시드"),
                new Crew("허진호", "알리"),
                new Crew("김준서", "에어"),
                new Crew("김영빈", "욘"),
                new Crew("김태희", "인비"),
                new Crew("서민정", "조앤"),
                new Crew("김주원", "조이"),
                new Crew("안예장", "춘식"),
                new Crew("김윤정", "코다"),
                new Crew("이동환", "크로플"),
                new Crew("최현구", "현구막"),
                new Crew("박재성", "제이슨")
                );
    }

    public static List<Crew> pickRandomMafia() {
        List<Crew> crews = new ArrayList<>(Crews.crews);
        Collections.shuffle(crews);
        return crews.stream()
                .limit(MAFIA_COUNT)
                .collect(Collectors.toList());
    }

    public static List<Crew> pickRandomAll() {
        List<Crew> crews = new ArrayList<>(Crews.crews);
        Collections.shuffle(crews);
        return crews.stream()
                .limit(crews.size())
                .collect(Collectors.toList());
    }
}
