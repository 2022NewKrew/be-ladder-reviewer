package me.bactoria.ladder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public interface View {
	int inputPeopleCount();

	int inputLadderHeight();

	void outputLadder(List<List<Boolean>> ladder);
}

class ConsoleView implements View {
	private static final String HEIGHT_LINE = "|";
	private static final String WIDTH_LINE_EXIST = "-";
	private static final String WIDTH_LINE_EMPTY = " ";

	@Override
	public int inputPeopleCount() {
		System.out.println("참여할 사람은 몇 명인가요?");
		return readNumber();
	}

	@Override
	public int inputLadderHeight() {
		System.out.println("최대 사다리 높이는 몇 개인가요?");
		return readNumber();
	}

	@Override
	public void outputLadder(List<List<Boolean>> ladder) {
		ladder.forEach(this::outputLadderRow);
	}

	private void outputLadderRow(List<Boolean> ladderRow) {
		System.out.print(HEIGHT_LINE);
		for (boolean hasLine : ladderRow) {
			System.out.print(parseWidthLine(hasLine));
			System.out.print(HEIGHT_LINE);
		}
		System.out.println();
	}

	private String parseWidthLine(Boolean hasLine) {
		return hasLine ? WIDTH_LINE_EXIST : WIDTH_LINE_EMPTY;
	}

	private int readNumber() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			String message = br.readLine();
			return Integer.parseInt(message);
		} catch (Exception e) {
			System.out.println("잘못 입력함. 다시 입력하세요.");
			return readNumber();
		}
	}
}
