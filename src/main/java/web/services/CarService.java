package web.services;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {


    private List<Car> cars;

    public CarService() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMV", 149, 2010));
        cars.add(new Car("Porsche", 212, 2000));
        cars.add(new Car("Lada", 827, 1994));
        cars.add(new Car("Toyota", 958, 2018));
        cars.add(new Car("Mercedes", 302, 1989));
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public List<Car> getSomeCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
