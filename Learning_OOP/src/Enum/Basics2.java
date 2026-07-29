package Enum;

public class Basics2 {

    enum Direction{
        NORTH(0),
        EAST(90),
        SOUTH(360),
        WEST(270);

        private final int degree;
        Direction(int degree){
            this.degree=degree;
        }

        private int getDegree() {
            return degree;
        }
    }
}
