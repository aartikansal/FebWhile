public class WhileNumberPlayerRunner {
    public static void main(String[] args) {
        WhileNumberPlayer player = new WhileNumberPlayer(10);
        player.printSquaresUptoLimit();
        //for limit= 30, output would be 1 4 6 9 16 25'
        player.printCubesUptoLimit();
        //for limit= 30, output would be 18 27
    }
}

