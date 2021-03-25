import java.io.IOException;
import java.util.Arrays;

public class Sensors extends Measurements {


    public static class Controller_EKG {
    }

    public static class Controller_Temperature {

        public static double Temperature() {
            double value;
            value = Math.random() * 90 + 130;
            double temperature = value * 4 / 50 + 24;
            return temperature;

        }
    }

    public static class Controller_SpO2_Puls {


        public static void SpO2() {}
        /*
            Measurements measurements = new Measurements();

            try {
                while (true) {
                    measurements.SensorData(true);
                    int[] Data =  measurements.SensorData(true);


                    double maxIR = Arrays.stream(measurements.SensorData().IR).max().getAsDouble();

                    double minIR = Arrays.stream(Data.IR).min().getAsDouble();

                    double maxRed = Arrays.stream(sensor.Red).max().getAsDouble();

                    double minRed = Arrays.stream(sensor.Red).min().getAsDouble();

                    double sPO2 = 104 - 17 * (((maxRed - minRed) / minRed) / ((maxIR - minIR) / minIR));

                }


            }catch (IOException e){
                System.out.println(" Fejl");

            }

        */


    }

}



