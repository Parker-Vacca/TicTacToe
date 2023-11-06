import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TTTTileButton extends JButton {
    private int index;

    public TTTTileButton(int index, Game game) {
        this.index = index;
        setFont(new Font(Font.SANS_SERIF, Font.BOLD, 50));
        setText("");
        addActionListener(e -> game.makeMove(index));
    }
}