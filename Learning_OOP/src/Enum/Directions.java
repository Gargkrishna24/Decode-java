package Enum;
enum Direction{
    North{
        @Override
        public void move() {
            System.out.println("Move up (x)");
        }
    },
    East{
        @Override
        public void move() {
            System.out.println("Move up y");
        }
    },
    South{
        @Override
        public void move() {
            System.out.println("Move up x+1");
        }
    },
    West{
        @Override
        public void move() {
            System.out.println("Move up y+1");
        }
    };
    public abstract void move();
}
public class Directions {
}

