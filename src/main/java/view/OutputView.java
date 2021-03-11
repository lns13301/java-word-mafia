package view;

import domain.Crew;
import domain.Title;

import java.util.List;
import java.util.stream.Collectors;

public class OutputView {

    private static final String ICON = " * ";

    private OutputView() {
    }

    public static void printMafia(List<Crew> crews) {
        System.out.println("😎 마피아를 뽑습니다.");

        for (int i = 0; i < crews.size() - 1; i++) {
            System.out.println("마피아 : " + crews.get(i).getNickName());
        }

        printSpy(crews.get(crews.size() - 1));
    }

    private static void printSpy(Crew crew) {
        System.out.println("스파이 : " + crew.getNickName());
    }

    public static void printTitle() {
        System.out.println();
        System.out.print("🤬 제시어 입니다 :");
        System.out.println(ICON + Title.pickRandomTitle() + ICON);
    }

    public static void printOrder(List<Crew> crews) {
        System.out.println(crews.stream()
                .map(Crew::getNickName)
                .collect(Collectors.joining(" -> ")));
    }
}
