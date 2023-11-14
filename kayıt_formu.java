import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm {

    public static void main(String[] args) {
        // Pencere oluştur
        JFrame frame = new JFrame("Kayıt Formu");

        // Panel oluştur
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Etiketler ve metin alanları ekle
        JLabel labelFirstName = new JLabel("Ad:");
        JTextField textFieldFirstName = new JTextField();

        JLabel labelLastName = new JLabel("Soyad:");
        JTextField textFieldLastName = new JTextField();

        JLabel labelEmail = new JLabel("E-Posta:");
        JTextField textFieldEmail = new JTextField();

        // Kayıt butonu oluştur
        JButton registerButton = new JButton("Kayıt Ol");

        // Kayıt butonuna tıklanınca çalışacak olayı belirt
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Kullanıcının girdiği bilgileri al
                String firstName = textFieldFirstName.getText();
                String lastName = textFieldLastName.getText();
                String email = textFieldEmail.getText();

                // Bilgileri ekrana yazdır (bu kısmı isteğinize göre değiştirebilirsiniz)
                System.out.println("Ad: " + firstName);
                System.out.println("Soyad: " + lastName);
                System.out.println("E-Posta: " + email);
            }
        });

        // Paneli düzenle
        panel.add(labelFirstName);
        panel.add(textFieldFirstName);
        panel.add(labelLastName);
        panel.add(textFieldLastName);
        panel.add(labelEmail);
        panel.add(textFieldEmail);
        panel.add(new JLabel()); // Boş etiket ekleyerek düzeni düzenleyin
        panel.add(registerButton);

        // Pencereye paneli ekle
        frame.getContentPane().add(panel);

        // Pencereyi yapılandır
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
