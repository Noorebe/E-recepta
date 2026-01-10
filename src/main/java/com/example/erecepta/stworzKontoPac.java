package com.example.erecepta;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javax.swing.*;


public class stworzKontoPac {
    /*
    * Dane osobowe
    * */
    private Label LabelDaneOsobowe = new Label("Dane osobowe");
    private Label LabelImie = new Label("Imie");
    private Label LabelNazwisko = new Label("Nazwisko");
    private Label LabelPesel = new Label("Pesel ");
    private Label LabelDataUrodzenia = new Label("Data urodzenia");
    private Label LabelAdresZamieszkania = new Label("Adres Zamieszkania");

    /*
    * Kontakt
    * */
    private Label LabelKontakt = new Label("Kontakt");
    private Label LabelNumerTelefonu = new Label("Numere telefonu");
    private Label LabelAdresEmail = new Label("Adres e-mail");

    public TextField TextImie = new TextField();
    public TextField TextNazwisko = new TextField();
    public TextField TextPesel = new TextField();
    public TextField TextDataUrodzenia = new TextField();
    public TextField TextAdresZamieszkania = new TextField();

    public void start(Stage primaryStage) {
        VBox root = new VBox();

        VBox DaneOsobowe = new VBox(600);
        DaneOsobowe.setPadding(new Insets(16, 16, 8, 16));
        DaneOsobowe.setAlignment(Pos.TOP_LEFT);
        LabelDaneOsobowe.setFont(Font.font("Manrope", 35));
        DaneOsobowe.getChildren().add(LabelDaneOsobowe);

        VBox imie = new VBox();
        imie.setAlignment(Pos.TOP_LEFT);
        imie.getChildren().add(LabelImie);

        GridPane gridImie = new GridPane();
        TextImie.setMaxWidth(Double.MAX_VALUE);
        gridImie.add(TextImie, 1, 0);

        VBox nazwisko = new VBox();
        nazwisko.setAlignment(Pos.TOP_LEFT);
        nazwisko.getChildren().add(LabelNazwisko);

        GridPane gridNazwisko = new GridPane();
        TextNazwisko.setMaxWidth(Double.MAX_VALUE);
        gridNazwisko.add(TextNazwisko, 1, 0);

        HBox peselDataUrodzenia = new HBox();
        peselDataUrodzenia.setAlignment(Pos.TOP_LEFT);
        peselDataUrodzenia.getChildren().addAll(LabelPesel, LabelDataUrodzenia);

        GridPane gridPesel = new GridPane();
        TextPesel.setMaxWidth(Double.MAX_VALUE);
        gridPesel.add(TextPesel, 1, 0);
        GridPane gridDataUrodzenia = new GridPane();
        TextDataUrodzenia.setMaxWidth(Double.MAX_VALUE);
        gridDataUrodzenia.add(TextDataUrodzenia, 1, 0);

        VBox adresZamieszkania = new VBox();
        adresZamieszkania.setAlignment(Pos.TOP_LEFT);
        adresZamieszkania.getChildren().addAll(LabelAdresZamieszkania);

        VBox kontakt = new VBox();
        kontakt.setAlignment(Pos.TOP_LEFT);
        kontakt.getChildren().addAll(LabelKontakt);

        VBox numerTelefonu = new VBox();
        numerTelefonu.setAlignment(Pos.TOP_LEFT);
        numerTelefonu.getChildren().addAll(LabelNumerTelefonu);

        VBox adresEmail = new VBox();
        adresEmail.setAlignment(Pos.TOP_LEFT);
        adresEmail.getChildren().addAll(LabelAdresEmail);


        root.getChildren().addAll(
                DaneOsobowe,
                imie,
                gridImie,
                nazwisko,
                gridNazwisko,
                peselDataUrodzenia,
                gridPesel,
                gridDataUrodzenia,
                adresZamieszkania,
                kontakt,
                numerTelefonu,
                adresEmail);



        Scene scene = new Scene(root, 1300, 780); //1300, 780
        scene.getStylesheets().add(
                getClass().getResource("/css/mainPanels/styleLek.css").toExternalForm()
        );

        primaryStage.setTitle("E-Recepta");
        primaryStage.setScene(scene);
        primaryStage.show();
    };

    public String getImie() {
        return TextImie.getText();
    }
}
