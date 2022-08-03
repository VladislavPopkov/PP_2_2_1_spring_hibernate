package hiber.service;

import hiber.dao.UserDao;
import hiber.model.User;
import hiber.model.UserCar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }

   @Override
   public void add(UserCar userCar) {
      userDao.add(userCar);
   }

   @Override
   public List<UserCar> listUserCars() {
      return userDao.listUserCars();
   }

}
