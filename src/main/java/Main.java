import javafx.application.Application;

public class Main {

    public static void main(String[] args){


        Application.launch(Login.class, args); //Objekt  af "log ind"


        Sensors.Controller_SpO2_Puls.SpO2();
        Sensors.Controller_Temperature.Temperature();


    }
}
