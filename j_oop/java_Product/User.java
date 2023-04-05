package j_oop.java_Product;

public class User {
    private String userName;
    private String password;
    private final int userId;
    private static int usersNumber = 0;
    Basket basket = new Basket();

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        userId = ++usersNumber;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        if (userId >= 10) {
            return "\nПользователь номер: 0" + userId + " Логин: " + userName;
        }
        return "\nПользователь номер: 00" + userId + " Логин: " + userName;
    }
}
