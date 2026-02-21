package assignment.session07;

import java.util.ArrayList;

public class Bt06 {
    public static class User {
        public static int idIncreament = 1;
        
        private int id;
        private String userName;
        private String password;

        public User(String userName, String password) {
            this.id = idIncreament++;
            this.userName = userName;
            this.password = password;
        }
        public String getUserName() {
            return userName;
        }
        public String getPassword() {
            return password;
        }

        @Override
        public String toString() {
            return "User [id=" + id + ", userName=" + userName + ", password=" + password + "]";
        }        
    }

    public static class UserManager {
        public static ArrayList<User> users = new ArrayList<User>();
        public static void addUser(User u){
            users.add(u);
        }
        public static boolean checkLogin(String userName, String password){
            for (User user : users) {
                if(user.getUserName().equals(userName)){
                    if(user.getPassword().equals(password)){
                        return true;
                    }else{
                        return false;
                    }
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        User u1 = new User("Cao", "123");
        User u2 = new User("Ta", "123");
        User u3 = new User("Tho", "123");

        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);

        UserManager.addUser(u1);
        UserManager.addUser(u2);
        UserManager.addUser(u3);

        boolean check1 = UserManager.checkLogin("Tguyen", "123");
        System.out.println(check1);
    }
}
