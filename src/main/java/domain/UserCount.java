package domain;

import java.util.Objects;

public class UserCount {
    private final int userCount;

    public UserCount(int userCount) {
        this.userCount = userCount;
    }

    public int getUserCount() {
        return userCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCount userCount1 = (UserCount) o;
        return userCount == userCount1.userCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userCount);
    }
}
