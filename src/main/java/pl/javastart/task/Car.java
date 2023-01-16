package pl.javastart.task;

public class Car {
    private String brand;
    private int productionYear;

    public Car(String brand, int productionYear) {
        this.brand = brand;
        this.productionYear = productionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Car car = (Car) o;

        if (productionYear != car.productionYear) {
            return false;
        }
        return brand != null ? brand.equals(car.brand) : car.brand == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + productionYear;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", productionYear=" + productionYear +
                '}';
    }

    boolean isDuplicate(Car[] cars) {
        for (Car value : cars) {
            if (value != null && value.equals(this)) {
                return true;
            }
        }
        return false;
    }
}
