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
        System.out.println("π λ§νΌμλ₯Ό λ½μ΅λλ€.");

        for (int i = 0; i < crews.size() - 1; i++) {
            System.out.println("λ§νΌμ : " + crews.get(i).getNickName());
        }

        printSpy(crews.get(crews.size() - 1));
    }

    private static void printSpy(Crew crew) {
        System.out.println("μ€νμ΄ : " + crew.getNickName());
    }

    public static void printTitle() {
        System.out.println();
        System.out.print("π€¬ μ μμ΄ μλλ€ :");
        System.out.println(ICON + Title.pickRandomTitle() + ICON);
    }

    public static void printOrder(List<Crew> crews) {
        System.out.println(crews.stream()
                .map(Crew::getNickName)
                .collect(Collectors.joining(" -> ")));
    }
}
