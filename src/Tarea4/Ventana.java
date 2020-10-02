package Tarea4;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana{
    private JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton generarButton;
    private JTextArea sucesionFibonacciTextArea;
    private JButton limpiarButton;
    private JTextField textField3;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Generador de serie");
        frame.setContentPane(new Ventana().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public Ventana(){
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiar();
            }
        });
        generarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int inicio,fin,iteraciones,aux;
                try {
                    inicio= Integer.parseInt(textField1.getText()); fin = Integer.parseInt(textField2.getText());
                    iteraciones = Integer.parseInt(textField3.getText());
                }catch (Exception e1){
                    JOptionPane.showMessageDialog(panel1,"Favor de verificar que los campos INGRESADOS sean NUMEROS.\n"+e1.getMessage()); return;
                }finally {
                    textField1.setText("");textField2.setText("");textField3.setText("");
                }
                limpiar();
                sucesionFibonacciTextArea.append(inicio+"\n"+fin+"\n");

                while (iteraciones>0){
                    aux=inicio+fin;
                    inicio=fin;
                    fin=aux;

                    sucesionFibonacciTextArea.append(aux+"\n");
                    iteraciones--;
                }
            }
        });
    }

    private void limpiar(){
        sucesionFibonacciTextArea.setText("");
    }
}
