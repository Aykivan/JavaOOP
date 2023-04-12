package example.view;

import example.controller.UserController;
import example.model.User;

public class UserView {

    /**
     * Реализовать операции изменения данных, удаления и получения всех пользователей
     */
    public static void main(String[] args) {
        UserController userController = new UserController();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("enter youre date: ");
//        userController.saveNewUser(scanner.nextInt(), scanner.next(), scanner.nextInt());

        User user1 = new User(1, "user1", 11);
        userController.addUserToRepo(user1);
        System.out.println(userController.getUser(user1));
        userController.deleteUser(user1);
        System.out.println(userController.getUser(user1));
    }
}
