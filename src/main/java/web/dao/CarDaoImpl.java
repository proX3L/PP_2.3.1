package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarDaoImpl implements CarDao {
    private final List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Nissan Murano", "Black", 2015));
        cars.add(new Car("Toyota Rav4", "White", 2023));
        cars.add(new Car("Audi Q5", "Red", 2017));
        cars.add(new Car("Mazda CX-5", "Silver", 2007));
        cars.add(new Car("Renault Duster", "Orange", 2019));
    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
