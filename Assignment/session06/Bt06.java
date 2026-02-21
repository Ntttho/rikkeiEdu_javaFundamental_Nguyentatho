package assignment.session06;

public class Bt06 {
    public static class User {
        static int idI = 1;
        private int id;
        private String userName;
        private String password;
        private String email;
        public User(String userName, String password, String email) {
            this.id = idI++;
            this.userName = userName;
            this.password = password;
            this.email = email;
        }
        @Override
        public String toString() {
            return "User [id= " + id + ", userName= " + userName + ", password= ******" + ", email= " + email + "]";
        }
        public void setUserName(String userName) {
            this.userName = userName;
        }
        public void setPassword(String authPass, String password) {
            if(!this.password.equals(authPass) || password.length() == 0){
                System.out.println("Xac nhan mat khau cu bi sai");
                return;
            }
            this.password = password;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getPassword() {
            return password;
        }
        
    }
    public static void main(String[] args) {
        User u1 = new User("A", "123123", "email1@");
        User u2 = new User("B", "123123", "email2@");
        User u3 = new User("B", "123123", "email3@");
        // User u4 = new User("D", 123123, "email4@"); sai du lieu
        u1.setPassword("1231234", "Hello");
        u2.setEmail("Nguyenvan@");
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);
    }
}
