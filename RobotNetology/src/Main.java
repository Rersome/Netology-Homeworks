public class Main {

    public static void main(String[] args) {
        SmartRobot robot = new SmartRobot();
        robot.moveDown();
        robot.moveDown();
        robot.moveLeft();
        robot.moveUp();
        robot.moveDown();
        robot.moveLeft();
        robot.moveLeft();

        System.out.println("Координаты робота: " + robot.getX() + ":" + robot.getY());
        System.out.println("Количество шагов: " + robot.getStepsCount());
    }
}

class Robot {
    private int x;
    private int y;

    public void moveRight() {
        x++;
    }

    public void moveLeft() {
        x--;
    }

    public void moveUp() {
        y--;
    }

    public void moveDown() {
        y++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class SmartRobot extends Robot {
    private int stepsCount;
    @Override
    public void moveDown() {
        super.moveDown();
        stepsCount++;
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
        stepsCount++;
    }

    @Override
    public void moveRight() {
        super.moveRight();
        stepsCount++;
    }

    @Override
    public void moveUp() {
        super.moveUp();
        stepsCount++;
    }

    public int getStepsCount() {
        return stepsCount;
    }
}