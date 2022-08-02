package project;

import project.models.Camry;

public class Report {

    private String managerName;
    private Car[] cars;

    public Report(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerName() {
        return managerName;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car car) {
        Car[] newArray = new Car[cars.length + 1];
        for (int i = 0; i < cars.length; i++) {
            newArray[i] = cars[i];
        }
        newArray[cars.length] = car;
        cars = newArray;
    }
}
