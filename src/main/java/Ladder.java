import java.util.ArrayList;
import java.util.List;

public class Ladder {
	private static final int GENERATE_RATE_IN_PERCENT = 50;

	private List<LadderStepLine> stepLines;

	public Ladder(int playerNumber, int height) {
		this.stepLines = new ArrayList(height);
		for (int i = 0; i < height; i++) {
			this.stepLines.add(new LadderStepLine(playerNumber, GENERATE_RATE_IN_PERCENT));
		}
	}

	public void print() {
		stepLines.forEach(stepRow -> stepRow.print());
	}
}
