package cars;

public class Car {
    public String color;
    public String dateOfBuild;
    public int maxSpeed;
    public int weightOfVehicle;
    public int numbersOfPassengers;

    public void setColor(String color) {
        this.color = color;
    }
    public void  setDateOfBuild(String dateOfBuild){
        this.dateOfBuild = dateOfBuild;
    }
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public void setWeightOfVehicle(int weightOfVehicle){
        this.weightOfVehicle = weightOfVehicle;
    }

    public void setNumbersOfPassengers(int numbersOfPassengers){
        this.numbersOfPassengers = numbersOfPassengers;
    }
    public String getColor(){
        return this.color;
    }
    public String getDateOfBuild(){
        return this.dateOfBuild;
    }
    public int getMaxSpeed(){
        return this.maxSpeed;
    }
    public int getWeightOfVehicle(){
        return this.weightOfVehicle;
    }
    public int getNumbersOfPassengers(){
        return this.numbersOfPassengers;
    }

}
