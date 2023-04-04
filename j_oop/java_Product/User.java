package j_oop.java_Product;

public class User {
    private String userName;
    private final int userId;   
    private static int usersNumber = 0;   

    public User(String userName){
        this.userName = userName;
        userId = ++usersNumber;
    }

    public String getUserName(){
        return userName;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        if(userId>=10){
            return "0" + userId + ". " + userName;
        }
        return "00" + userId + ". " + userName;
    }
}
