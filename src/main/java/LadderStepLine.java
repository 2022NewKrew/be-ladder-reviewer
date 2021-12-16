import java.util.ArrayList;
import java.util.List;

public class LadderStepLine {
	private static final char LADDER_FRAME = '|';
	private static final char LADDER_STEP = '-';
	private static final char LADDER_STEP_BLANK = ' ';

	private List<Boolean> steps;

	public LadderStepLine(int columnNumber, int generateRateInPercent) {
		this.steps = new ArrayList();
		for (int j = 0; j < columnNumber - 1; j++) {
			boolean shouldGenerateStep = (Math.random() * 100) > generateRateInPercent;
			steps.add(shouldGenerateStep);
		}
	}

	public void print() {
		System.out.print(LADDER_FRAME);
		this.steps.forEach(step -> {
			System.out.print(getStepShape(step));
			System.out.print(LADDER_FRAME);
		});
		System.out.println();
	}

	private char getStepShape(boolean step) {
		if (!step) {
			return LADDER_STEP_BLANK;
		}
		return LADDER_STEP;
	}
}
