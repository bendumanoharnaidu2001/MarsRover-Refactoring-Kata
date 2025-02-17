package org.example;

public class East implements Direction {
    @Override
    public char currentDirection() {
        return 'E';
    }

    @Override
    public Direction turnLeft() {
        return new North();
    }

    @Override
    public Direction turnRight() {
        return new South();
    }
}
