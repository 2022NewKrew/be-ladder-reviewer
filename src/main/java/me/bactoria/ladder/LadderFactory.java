package me.bactoria.ladder;

import java.util.ArrayList;
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
		List<Boolean> result = new ArrayList<>();
		for (int i = 0; i < peopleCount - 1; i++) {
			if (i > 0 && result.get(i - 1)) {
				result.add(false);
				continue;
			}
			boolean hasLine = Math.random() > 0.5;
			result.add(hasLine);
		}
		return result;
	}
}
