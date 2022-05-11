package hw8;

public class App2 {
    public static void main(String[] args) {
        // Box

        Box boxY = new Box();
        boxY.depth = 8;
        boxY.height = 15;
        boxY.width = boxY.depth+4;

        boxY.volume();
        boxY.boxarea("Mark");

        Box boxX = new Box();
        boxX.width = 40;
        boxX.height = 21.45;
        boxX.depth = 8;

        boxX.volume();
        boxX.boxarea("Jony");
    }
}
