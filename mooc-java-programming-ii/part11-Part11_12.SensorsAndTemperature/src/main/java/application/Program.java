package application;

public class Program {

    public static void main(String[] args) {
        // you can test your classes here:

        // Test Code - Part 1
        // StandardSensor ten = new StandardSensor(10);
        // StandardSensor minusFive = new StandardSensor(-5);

        // System.out.println(ten.read());
        // System.out.println(minusFive.read());

        // System.out.println(ten.isOn());
        // ten.setOff();
        // System.out.println(ten.isOn());

        // Test Code - Part 2
        // Sensor kumpula = new TemperatureSensor();
        // kumpula.setOn();
        // System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");

        // Test Code - Part 3
        // Sensor kumpula = new TemperatureSensor();
        // kumpula.setOn();
        // System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");

        // Sensor kaisaniemi = new TemperatureSensor();
        // Sensor helsinkiVantaaAirport = new TemperatureSensor();

        // AverageSensor helsinkiRegion = new AverageSensor();
        // helsinkiRegion.addSensor(kumpula);
        // helsinkiRegion.addSensor(kaisaniemi);
        // helsinkiRegion.addSensor(helsinkiVantaaAirport);

        // helsinkiRegion.setOn();
        // System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");

        // Test Code - Part 4
        // Sensor kumpula = new TemperatureSensor();
        // Sensor kaisaniemi = new TemperatureSensor();
        // Sensor helsinkiVantaaAirport = new TemperatureSensor();

        // AverageSensor helsinkiRegion = new AverageSensor();
        // helsinkiRegion.addSensor(kumpula);
        // helsinkiRegion.addSensor(kaisaniemi);
        // helsinkiRegion.addSensor(helsinkiVantaaAirport);

        // helsinkiRegion.setOn();
        // System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        // System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
        // System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");

        // System.out.println("readings: " + helsinkiRegion.readings());

        AverageSensor ka = new AverageSensor();
        ka.addSensor( new StandardSensor(3) );
        ka.addSensor( new StandardSensor(7) );
        System.out.println(ka.readings());
    }

}
