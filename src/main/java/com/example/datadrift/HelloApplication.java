package com.example.datadrift;

import java.io.IOException;

import org.springframework.context.ApplicationContext;

import com.example.datadrift.backend.config.SpringContext;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        SpringContext.initializeContext(DataDriftApplication.class);
        ApplicationContext context = SpringContext.getContext();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        fxmlLoader.setControllerFactory(context::getBean); // Allow Spring to inject controllers
        Image img=new Image("com/example/datadrift/images/logo.png");
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("DataDrift");
        stage.setWidth(730);
        stage.setHeight(530);
        stage.getIcons().add(img);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}
