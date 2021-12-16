package me.bactoria.ladder;

public class LadderGame {

	private final View view;

	LadderGame(View view) {
		this.view = view;
	}

	public void start() {
		int peopleCount = view.inputPeopleCount();
		int ladderHeight = view.inputLadderHeight();

		Ladder ladder = LadderFactory.generateLadder(peopleCount, ladderHeight);

		view.outputLadder(ladder.getLadder());
	}
}
