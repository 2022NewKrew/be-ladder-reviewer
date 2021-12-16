package me.bactoria.ladder;

public class Main {

	public static void main(String[] args) {
		LadderGame game = new LadderGame(new ConsoleView());
		game.start();
	}
}
