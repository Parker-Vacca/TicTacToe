import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Game {
    private String currentPlayer = "X";
    private String[] boardState = new String[9];
    private TTTBoard board;

    public Game(TTTBoard board) {
        this.board = board;
    }

    public void makeMove(int index) {
        if (boardState[index] == null) {
            boardState[index] = currentPlayer;
            board.updateBoard(index, currentPlayer);
            if (checkForWin()) {
                board.showWinner(currentPlayer);
                resetGame();
            } else if (checkForTie()) {
                board.showTie();
                resetGame();
            } else {
                switchPlayer();
            }
        }
    }

    private boolean checkForWin() {
        for (int i = 0; i < 8; i++) {
            String line = null;
            switch (i) {
                case 0:
                    line = boardState[0] + boardState[1] + boardState[2];
                    break;
                case 1:
                    line = boardState[3] + boardState[4] + boardState[5];
                    break;
                case 2:
                    line = boardState[6] + boardState[7] + boardState[8];
                    break;
                case 3:
                    line = boardState[0] + boardState[3] + boardState[6];
                    break;
                case 4:
                    line = boardState[1] + boardState[4] + boardState[7];
                    break;
                case 5:
                    line = boardState[2] + boardState[5] + boardState[8];
                    break;
                case 6:
                    line = boardState[0] + boardState[4] + boardState[8];
                    break;
                case 7:
                    line = boardState[2] + boardState[4] + boardState[6];
                    break;
            }
            if (line != null && line.equals("XXX") || line.equals("OOO")) {
                return true;
            }
        }
        return false;
    }

    private boolean checkForTie() {
        for (String s : boardState) {
            if (s == null) {
                return false;
            }
        }
        return true;
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer.equals("X")) ? "O" : "X";
    }

    private void resetGame() {
        currentPlayer = "X";
        boardState = new String[9];
    }
}