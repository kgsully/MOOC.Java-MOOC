package myFirstApplication;

import javafx.application.Application;

// Need to make this a 'launcher' that ends up invoking the Application.launch to get around classpath issues...
// Otherwise receive the error: JavaFX runtime components are missing, and are required to run this application
// Had to make sure to add the dependencies / plugin to Maven pom.xml:

        // <dependency>
        //     <groupId>org.openjfx</groupId>
        //     <artifactId>javafx-controls</artifactId>
        //     <version>17.0.1</version>
        // </dependency>
        // <dependency>
        //     <groupId>org.openjfx</groupId>
        //     <artifactId>javafx-fxml</artifactId>
        //     <version>17.0.1</version>
        // </dependency>

        // <plugin>
        //     <groupId>org.openjfx</groupId>
        //     <artifactId>javafx-maven-plugin</artifactId>
        //     <version>0.0.8</version>
        // </plugin>

public class MyFirstApplication {

    public static void main(String[] args) {
        // System.out.println("Hello world!");
        Application.launch(GUI.class, args);
    }

}
