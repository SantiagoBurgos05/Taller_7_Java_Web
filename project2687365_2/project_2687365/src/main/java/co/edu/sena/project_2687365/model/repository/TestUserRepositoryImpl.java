package co.edu.sena.project_2687365.model.repository;

import co.edu.sena.project_2687365.model.User;
import co.edu.sena.project_2687365.model.User;


import java.sql.SQLException;


public class TestUserRepositoryImpl {
    public static void main(String[] args) throws SQLException {
        co.edu.sena.project_2687365.model.repository.Repository<User> repository = new UserRepositoryImpl();

        System.out.println("========saveObj Insert===========");
        User userInsert1 = new User();
        userInsert1.setUser_firstname("santiago");
        userInsert1.setUser_lastname("burgos");
        userInsert1.setUser_email("sfgdsd@mail.com");
        userInsert1.setUser_password("egf5a465");
        repository.saveObj(userInsert1);

        User userInsert2 = new User();
        userInsert2.setUser_firstname("cesar");
        userInsert2.setUser_lastname("salazar");
        userInsert2.setUser_email("salazar@mail.com");
        userInsert2.setUser_password("asfdvfs561");
        repository.saveObj(userInsert2);


        System.out.println("========== listaObj =========");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== byIdObj ===========");
        System.out.println(repository.byIdObj(1));
        System.out.println();

        System.out.println("============== saveObj ===========");
        User userUpdate = new User();
        userUpdate.setUser_firstname("michell");
        userUpdate.setUser_lastname("laiton");
        userUpdate.setUser_email("michel@mail.com");
        userUpdate.setUser_password("wafcaswf156");
        repository.listAllObj().forEach(System.out::println);
        System.out.println();

        System.out.println("========== deleteObj ============");
        repository.deleteObj(2);
        repository.listAllObj().forEach(System.out::println);

    }
}

