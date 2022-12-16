package Final;
import java.util.Scanner;
public class Player {
private double money;
public Player(String uN, double m) {
    money = m;
}
// uses scanner to get the name of the person and set it to the string userName
public String getPlayerName() {
    Scanner sc = new Scanner(System.in);
    System.out.print("what is your name? ");
    String userName = sc.nextLine();
    return userName;
}
// returns player money
public double getMoney() {
    return money;
}// sets the money of the person
public void setMoney(double m) {
    money = m;
}
}
