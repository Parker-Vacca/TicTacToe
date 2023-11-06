
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GameFrame extends JFrame {
    public GameFrame() {
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setLayout(new BorderLayout());

        TTTBoard board = new TTTBoard();
        add(board, BorderLayout.CENTER);
    }
}