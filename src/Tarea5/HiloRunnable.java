package Tarea5;

import javax.swing.*;
import java.util.Random;

public class HiloRunnable implements Runnable {
    JProgressBar progressBar;
    JLabel jLabel;
    static int x=0;

    public HiloRunnable(JProgressBar progressBar, JLabel label) {
        this.progressBar = progressBar;
        this.jLabel=label;
    }

    @Override
    public void run() {
        Random random = new Random();
        int pr = 0;

        while (pr < 101) {
            try {
                Thread.sleep(90);
            } catch (InterruptedException ex) {
                System.out.println("ERROR: " + ex.getMessage());
                Thread.currentThread().interrupt();
            }

            pr += random.nextInt(10);
            progressBar.setValue(pr);
        }

        x++;
        jLabel.setText("" + x);
    }
}
