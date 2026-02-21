package assignment.session06;

public class Bt02 {
    public static class Account {
        public String userName;
        private String password;
        public String email;
        public Account(String userName, String password, String email) {
            this.userName = userName;
            this.password = password;
            this.email = email;
        }

        public int changePassword(String oldPass, String newPass){
            if(!oldPass.equals(this.password)){
                System.out.println("Sai mk cu");
                return 0;
            }
            this.password = newPass;
            System.out.println("Mk da duoc thay doi");
            return 1;
        }

        @Override
        public String toString() {
            return "Account [userName= " + userName + ", password= ******"  + ", email= " + email + "]";
        }
        
    }

    public static void main(String[] args) {
        Account newAc = new Account("nguyen van a", "123123", "Hello");
        newAc.changePassword("1231234", "11111");
        System.out.println(newAc);
    }
}
