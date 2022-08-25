package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl extends CarDao {
    private static final List<Car> carList = new ArrayList<>();
    static {
        carList.add(new Car("Mercedes-Benz  350", "чёрный", 2007, 650_000.00));
        carList.add(new Car("Hyundai ix35 ", "белый", 2015, 945_000));
        carList.add(new Car("Land Rover ", "белый", 2012, 1_490_000));
        carList.add(new Car("Peugeot 408 ", "чёрный", 2017, 984_000.00));
        carList.add(new Car("Volkswagen", "серебристый", 2013, 1_797_000));
    }
    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
