package cars;

public class Cars {
    public static void main(String[] args){
        Car bmw = new Car();
        bmw.setColor("Blue");
        bmw.setDateOfBuild("14.06.2008");
        bmw.setMaxSpeed(260);
        System.out.printf("BMW\nColor:%s , Date of build:%s , Max speed:%d\n\n", bmw.getColor(), bmw.getDateOfBuild(), bmw.getMaxSpeed());

        Car mercedes = new Car();
        mercedes.setColor("Black");
        mercedes.setDateOfBuild("23.08.2014");
        mercedes.setMaxSpeed(280);
        System.out.printf("Mercedes\nColor:%s , Date of build:%s , Max speed:%d\n\n", mercedes.getColor(), mercedes.getDateOfBuild(), mercedes.getMaxSpeed());

        Car ferrari = new Car();
        ferrari.setColor("Red");
        ferrari.setDateOfBuild("12.12.2012");
        ferrari.setMaxSpeed(330);
        ferrari.setWeightOfVehicle(1450);
        ferrari.setNumbersOfPassengers(2);
        System.out.printf("Ferrari\nColor:%s , Date of build:%s , Max speed:%d , Weight:%d , Number of passengers:%d" , ferrari.getColor() , ferrari.getDateOfBuild() , ferrari.getMaxSpeed() , ferrari.getWeightOfVehicle() , ferrari.getNumbersOfPassengers());
    }
}