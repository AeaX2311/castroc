package Tarea5;

import javax.swing.*;

public class Ventana {
    private JPanel panel1;
    private JProgressBar progressBar1;
    private JProgressBar progressBar2;
    private JButton iniciarButton;
    private JProgressBar progressBar3;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel labelx;

    public Ventana() {
        iniciarButton.addActionListener(e -> {
            HiloRunnable.x=0; label1.setText("?"); label2.setText("?"); label3.setText("?");

            HiloRunnable hiloRunnable1 = new HiloRunnable(progressBar1, label3), hiloRunnable2 = new HiloRunnable(progressBar2, label1), hiloRunnable3 = new HiloRunnable(progressBar3, label2);
            Thread thread1 = new Thread(hiloRunnable1), thread2 = new Thread(hiloRunnable2), thread3 = new Thread(hiloRunnable3);

            thread1.start(); thread2.start(); thread3.start();
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Progreso de hilos"); frame.setContentPane(new Ventana().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.pack(); frame.setVisible(true);
    }
}
