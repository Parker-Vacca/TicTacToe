import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GameFrame gameFrame = new GameFrame();
            gameFrame.setVisible(true);
        });
    }
}