package hiber.dao;

import hiber.model.User;
import hiber.model.UserCar;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
   void add(UserCar userCar);
   List<UserCar> listUserCars();
}
