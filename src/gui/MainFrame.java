package gui;

import controller.Controller;
import model.Volo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private JTextField codiceField;
    private JButton cercaButton;
    private JTextArea risultatoArea;
    private Controller controller;

    public MainFrame() {
        super("Aeroporto - Ricerca Volo");
        controller = new Controller();

        // Componenti
        codiceField = new JTextField(10);
        cercaButton = new JButton("Cerca volo");
        risultatoArea = new JTextArea(5, 30);
        risultatoArea.setEditable(false);

        // Layout
        JPanel panel = new JPanel();
        panel.add(new JLabel("Codice volo:"));
        panel.add(codiceField);
        panel.add(cercaButton);
        panel.add(new JScrollPane(risultatoArea));

        add(panel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        // Button
        cercaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codice = codiceField.getText();
                Volo volo = controller.cercaVolo(codice);
                if (volo != null) {
                    risultatoArea.setText("Volo trovato:\n" + volo.toString());
                } else {
                    risultatoArea.setText("Volo non trovato.");
                }
            }
        });

        // Aggiunta vf
        controller.aggiungiVolo(new model.VoloInPartenza(
                "AZ123", "ITA Airways", "Roma",
                java.time.LocalDate.of(2025, 5, 24),
                java.time.LocalTime.of(10, 30), 0,
                model.StatoDelVolo.PROGRAMMATO, new model.Gate(5)
        ));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
    }
}
