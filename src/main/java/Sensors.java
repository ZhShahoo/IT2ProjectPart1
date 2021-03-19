public class Sensors extends Measurements{


    public static class Controller_EKG {
    }

    public static class Controller_Temperature {

        public static void Temperature(){
            System.out.println("Hello From Temperature");

        }
    }

    public static class Controller_SpO2_Puls {

        public static void SpO2(){

            System.out.println(" Hello from SpO2");
        }
    }
}
