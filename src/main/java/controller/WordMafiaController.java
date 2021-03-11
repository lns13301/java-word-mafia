package controller;

import domain.Crews;
import view.OutputView;

public class WordMafiaController {

    public void run() {
        OutputView.printMafia(Crews.pickRandomMafia());
        OutputView.printTitle();
        OutputView.printOrder(Crews.pickRandomAll());
    }
}
