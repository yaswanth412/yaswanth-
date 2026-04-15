package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Parent root = createUI();
        Scene scene = new Scene(root, 400, 250);

        stage.setTitle("User Login");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    private Parent createUI() {

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(25));
        grid.setHgap(10);
        grid.setVgap(15);
        grid.setAlignment(Pos.CENTER);

        Label title = new Label("Login Form");
        title.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        Label userLabel = new Label("Username:");
        Label passLabel = new Label("Password:");

        TextField usernameField = new TextField();
        usernameField.setPromptText("Enter username");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter password");

        Button loginBtn = new Button("Login");
        loginBtn.setPrefWidth(100);

        Label messageLabel = new Label();

        loginBtn.setOnAction(e -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if (username.isEmpty() || password.isEmpty()) {
                messageLabel.setStyle("-fx-text-fill: orange;");
                messageLabel.setText("Please fill all fields");
                return;
            }

            if (validate(username, password)) {
                messageLabel.setStyle("-fx-text-fill: green;");
                messageLabel.setText("Login Successful");
            } else {
                messageLabel.setStyle("-fx-text-fill: red;");
                messageLabel.setText("Invalid Credentials");
            }
        });

        grid.add(title, 0, 0, 2, 1);
        grid.add(userLabel, 0, 1);
        grid.add(usernameField, 1, 1);
        grid.add(passLabel, 0, 2);
        grid.add(passwordField, 1, 2);
        grid.add(loginBtn, 1, 3);
        grid.add(messageLabel, 1, 4);

        return grid;
    }

    private boolean validate(String username, String password) {
        return username.equals("admin") && password.equals("1234");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
