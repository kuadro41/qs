import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ArayuzdenVeriKaydetme extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Kayıt Formu");

        // Arayüz elemanları
        Label labelAd = new Label("Ad:");
        TextField textFieldAd = new TextField();

        Label labelSoyad = new Label("Soyad:");
        TextField textFieldSoyad = new TextField();

        Label labelEmail = new Label("E-posta:");
        TextField textFieldEmail = new TextField();

        Button kaydetButton = new Button("Kaydet");
        kaydetButton.setOnAction(e -> {
            // Arayüzden verileri al
            String ad = textFieldAd.getText();
            String soyad = textFieldSoyad.getText();
            String email = textFieldEmail.getText();

            // Veritabanına kaydet
            kayitEkle(ad, soyad, email);

            // Arayüzdeki metin alanlarını temizle
            textFieldAd.clear();
            textFieldSoyad.clear();
            textFieldEmail.clear();
        });

        // Arayüz düzeni
        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(10, 10, 10, 10));
        vBox.getChildren().addAll(labelAd, textFieldAd, labelSoyad, textFieldSoyad, labelEmail, textFieldEmail, kaydetButton);

        Scene scene = new Scene(vBox, 300, 200);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    // Veritabanına kayıt ekleme metodu
    private void kayitEkle(String ad, String soyad, String email) {
        String url = "jdbc:sqlite:veritabani.db";

        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection(url);

            String sql = "INSERT INTO kullanici (ad, soyad, email) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, ad);
                preparedStatement.setString(2, soyad);
                preparedStatement.setString(3, email);

                int affectedRows = preparedStatement.executeUpdate();

                if (affectedRows > 0) {
                    System.out.println("Kullanıcı başarıyla kaydedildi.");
                } else {
                    System.out.println("Kullanıcı kaydedilemedi.");
                }
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
