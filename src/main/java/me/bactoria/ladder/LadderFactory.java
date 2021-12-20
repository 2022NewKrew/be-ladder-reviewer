package me.bactoria.ladder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LadderFactory {
	public static Ladder generateLadder(int peopleCount, int ladderHeight) {
		List<LadderRow> ladderRows = IntStream.range(0, ladderHeight)
				.mapToObj(it -> generateLadderRow(peopleCount))
				.collect(Collectors.toList());

		return new Ladder(ladderRows);
	}

	private static LadderRow generateLadderRow(int peopleCount) {
		return new LadderRow(makeRandomWidthLines(peopleCount));
	}

	private static List<Boolean> makeRandomWidthLines(int peopleCount) {
		return IntStream.range(1, peopleCount)
				.mapToObj(i -> Math.random() > 0.5)
				.collect(Collectors.toList());
	}
}
