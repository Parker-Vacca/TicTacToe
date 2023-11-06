import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class TTTBoard extends JPanel {
    private TTTTileButton[] tiles = new TTTTileButton[9];
    private Game game = new Game(this);

    public TTTBoard() {
        setLayout(new GridLayout(3, 3));
        initBoard();
    }

    private void initBoard() {
        for (int i = 0; i < tiles.length; i++) {
            tiles[i] = new TTTTileButton(i, game);
            add(tiles[i]);
        }
    }

    public void updateBoard(int index, String player) {
        tiles[index].setText(player);
        tiles[index].setEnabled(false);
    }

    public void resetBoard() {
        for (TTTTileButton tile : tiles) {
            tile.setText("");
            tile.setEnabled(true);
        }
    }

    public void showWinner(String winner) {
        JOptionPane.showMessageDialog(this, "Player " + winner + " wins!");
        resetBoard();
    }

    public void showTie() {
        JOptionPane.showMessageDialog(this, "It's a tie!");
        resetBoard();
    }
}
