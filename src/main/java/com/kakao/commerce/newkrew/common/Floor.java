package com.kakao.commerce.newkrew.common;

public class Floor<F> {
    private final F current;
    private Floor<F> upFloor;
    private Floor<F> downFloor;

    public Floor(Floor<F> upFloor, F current, Floor<F> downFloor) {
        this.upFloor = upFloor;
        this.current = current;
        this.downFloor = downFloor;
    }

    public void upFloor(Floor<F> floor) {
        this.upFloor = floor;
    }

    public void downFloor(Floor<F> floor) {
        this.downFloor = floor;
    }

    public F getCurrent() {
        return current;
    }

    public Floor<F> upFloor() {
        return upFloor;
    }

    public Floor<F> downFloor() {
        return downFloor;
    }

    public boolean hasDownFloor() {
        return downFloor != null;
    }
}
