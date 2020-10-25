package com.seadog;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Sokoban extends JFrame {
    private final int OFFSET = 30;

    public Sokoban() {

        initUI();
    }

    private void initUI() {

        Board board = new Board();
        add(board);

        setTitle("Sokoban");

        setSize(board.getBoardWidth() + OFFSET, board.getBoardHeight() + 2 * OFFSET);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        // 여러이벤트가 동시에 전달되는 것을 막는 역할인 거 같은데, 없어도 잘 작동함
        EventQueue.invokeLater(() -> {

            Sokoban game = new Sokoban();
            game.setVisible(true);
        });
    }
}
