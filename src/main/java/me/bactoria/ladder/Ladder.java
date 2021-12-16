package me.bactoria.ladder;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ladder {
	private final List<LadderRow> ladderRows;

	public Ladder(List<LadderRow> ladderRows) {
		this.ladderRows = ladderRows;
	}

	public List<List<Boolean>> getLadder() {
		return ladderRows.stream()
				.map(LadderRow::getLadderRow)
				.collect(Collectors.toUnmodifiableList());
	}
}

class LadderRow {
	private final List<Boolean> ladderRow;

	public LadderRow(List<Boolean> ladderRow) {
		this.ladderRow = ladderRow;
	}

	public List<Boolean> getLadderRow() {
		return Collections.unmodifiableList(ladderRow);
	}
}
