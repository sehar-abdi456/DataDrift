package com.example.datadrift.backend.controllers;

import java.io.IOException;

import com.example.datadrift.SceneController;
import com.example.datadrift.backend.config.SpringContext;
import com.example.datadrift.backend.service.UserService;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
public class LoginController {

    private final SceneController sceneController = new SceneController();
    private final UserService userService = SpringContext.getContext().getBean(UserService.class);

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        try {
            boolean loginSuccessful = userService.authenticate(username, password);
            if (loginSuccessful) {
                showAlert("Login Successful", "Welcome, " + username + "!");
                // Navigate to the main application scene
                sceneController.switchToMainPage(event);
            } else {
                showAlert("Login Failed", "Invalid credentials. Please try again.");
            }
        } catch (Exception e) {
            showAlert("Error", "An unexpected error occurred during login.");
            e.printStackTrace();
        }
    }

    @FXML
    private void switchToRegisterPage(ActionEvent event) throws IOException {
        sceneController.switchToRegisterPage(event);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
