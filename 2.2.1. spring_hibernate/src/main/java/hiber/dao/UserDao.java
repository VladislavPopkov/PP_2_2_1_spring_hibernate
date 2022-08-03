package hiber.dao;

import hiber.model.User;
import hiber.model.Car;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
   void add(Car car);
   List<Car> listCars();
   void findUser(String model, int series);
}
