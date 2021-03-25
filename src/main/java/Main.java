import javafx.application.Application;

public class Main {

    static double temperature;
    public static void main(String[] args) {


      Application.launch(Login.class, args); //Objekt  af "log ind"


        Sensors.Controller_SpO2_Puls.SpO2();


        //_____________________________________________________________________________
        int counter = 0;
        while (true) {
            temperature = Sensors.Controller_Temperature.Temperature();//Temperature object
            try {
                Thread.sleep(15_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Print af temperature every 30. sec
            if ((counter % 2) == 0) {
                System.out.println(String.format("%.2f", temperature) + " celcius🌡 ");
            }
            counter++;

        }//___________________________________________________________________________________








    }

}

