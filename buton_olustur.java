import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingButtonExample {

    public static void main(String[] args) {
        // Pencere oluştur
        JFrame frame = new JFrame("Java Buton Örneği");

        // Buton oluştur
        JButton button = new JButton("Tıkla");

        // Butona tıklanınca çalışacak olayı belirt
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Butona Tıklandı!");
            }
        });

        // Pencereye butonu ekle
        frame.getContentPane().add(button);

        // Pencereyi yapılandır
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
