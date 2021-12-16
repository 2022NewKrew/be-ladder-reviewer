import java.util.ArrayList;
import java.util.List;

public class Ladder {
	private static final int GENERATE_RATE_IN_PERCENT = 50;

	private List<List<Boolean>> steps;

	public Ladder(int playerNumber, int height) {
		this.steps = new ArrayList(height);
		for (int i = 0; i < height; i++) {
			List<Boolean> stepLine = new ArrayList();
			for (int j = 0; j < playerNumber - 1; j++) {
				boolean shouldGenerateStep = (Math.random() * 100) > GENERATE_RATE_IN_PERCENT;
				stepLine.add(shouldGenerateStep);
			}
			steps.add(stepLine);
		}
	}

	public void print() {
		steps.forEach(stepRow -> {
			System.out.print("|");
			stepRow.forEach(step -> {
				System.out.print(step ? "-" : " ");
				System.out.print("|");
			});
			System.out.println();
		});
	}
}
