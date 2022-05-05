package knox.sudoku;

public class Test {
    public static void main(String[] args) {
        Sudoku sodoku = new Sudoku();
        sodoku.load("easy1.txt");
        System.out.println(sodoku);

        //check examples
        System.out.println(sodoku.getLegalValues(0, 8));
        System.out.println(sodoku.getLegalValues(6, 8));
    }
}
