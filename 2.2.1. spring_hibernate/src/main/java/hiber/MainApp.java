package hiber;

import hiber.config.AppConfig;
import hiber.dao.UserDao;
import hiber.model.User;
import hiber.model.Car;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);

      //userService.add(new User("User1", "Lastname1", "user1@mail.ru").setUserCar(new Car("AUDI", 12))); Почему это не работает????

      User user1 = new User("User1", "Lastname1", "user1@mail.ru");
      User user2 = new User("User2", "Lastname2", "user2@mail.ru");
      User user3 = new User("User3", "Lastname3", "user3@mail.ru");
      User user4 = new User("User4", "Lastname4", "user4@mail.ru");
      Car car1 = new Car("AUDI", 12);
      Car car2 = new Car("MERS", 13);
      Car car3 = new Car("KIA", 14);
      Car car4 = new Car("BMW", 15);
      user1.setUserCar(car1);
      user2.setUserCar(car2);
      user3.setUserCar(car3);
      user4.setUserCar(car4);
      userService.add(user1);
      userService.add(user2);
      userService.add(user3);
      userService.add(user4);

      System.out.println(userService.findUser("KIA", 14));

//      for(Car car : userService.listCars()) {
//         System.out.println(car);
//      }

//      List<User> users = userService.listUsers();
//      for (User user : users) {
//         System.out.println("Id = "+user.getId());
//         System.out.println("First Name = "+user.getFirstName());
//         System.out.println("Last Name = "+user.getLastName());
//         System.out.println("Email = "+user.getEmail());
//         System.out.println();
//      }

      context.close();
   }
}
