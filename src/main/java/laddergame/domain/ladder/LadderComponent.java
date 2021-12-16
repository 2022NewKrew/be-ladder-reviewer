package laddergame.domain.ladder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum LadderComponent {
    HORIZONTAL_BAR("-", "horizontal"),
    HORIZONTAL_BLANK(" ", "horizontal"),
    VERTICAL_BAR("|", "vertical");

    private static final String HORIZONTAL = "horizontal";
    private static final String VERTICAL = "vertical";
    private final String shape;
    private final String property;

    LadderComponent(String shape, String property) {
        this.property = property;
        this.shape = shape;
    }

    public static LadderComponent RandomHorizontalComponent() {
        List<LadderComponent> horizontalComponent = Arrays.
                stream(LadderComponent.values()).
                filter(LadderComponent::isHorizontalComponent).
                collect(Collectors.toList());

        if (horizontalComponent.size() == 0) {
            throw new RuntimeException("there are no horizontal components");
        }

        double randomValue = Math.random();
        int ran = (int) (randomValue * horizontalComponent.size());
        return horizontalComponent.get(ran);
    }

    private boolean isVerticalComponent() {
        return this.property.equals(VERTICAL);
    }

    private boolean isHorizontalComponent() {
        return this.property.equals(HORIZONTAL);
    }

    public String getShape() {
        return shape;
    }
}
