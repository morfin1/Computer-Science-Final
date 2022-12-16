package Final;
import java.util.Scanner;
public class Game {
// creates the stock games class
    public Game() {
        String userName = "";
// makes the player that is referred to as userName and has 1000 dollars to start off with
        Player player = new Player(userName, 1000.00);
        boolean sold = false;
        userName = player.getPlayerName();
        System.out.println("hello " + userName + "! Welcome to the game of Stocks!\n\nYou start off with $1000 and you can buy stocks of name brands that flucuate with profit and loss of money.\nIf you go under $0 you lose! \nGood Luck!");
// actual data based on each companies stock prices as of december 13th
        CompanyStock stocks = new CompanyStock(158.52, 144.96, 9.89, 11.50, 73.61,331.73);
// plays until the player runs out of money and hasn't sold their stocks
        while(player.getMoney() > 0 && sold != true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("What stocks do you want to buy? [(t, a, n, p, z, h) to buy stock, (price) to see stock price, and (sell) to sell stocks)");
            System.out.println("Stock Value = " + player.getMoney());
// gets user input for which company stock the player wants to buy
            String input = sc.nextLine();
// it will print out all the stocks in this game with user input is "price"
            if(input.equals("price")) {
                System.out.println("Tesla: " + stocks.getTesla() +
                               "\nApple: "+ stocks.getApple() + 
                               "\nNerd Wallet: "+ stocks.getNerdWallet() + 
                               "\nPeloton: "+ stocks.getPeloton() + 
                               "\nZoom: "+ stocks.getZoom() + 
                               "\nHome Depot: "+ stocks.getHomeDepot());
            }
// the more the stock costs, the more the risk is in gaining/losing money
            else if(input.equals("t")) {
                int number = (int)(Math.random() * 300) - 175;
                player.setMoney(player.getMoney() - stocks.getTesla());
                double newPrice = stocks.getTesla() + number;
                player.setMoney(player.getMoney() + newPrice);
            }

            else if(input.equals("a")) {
                int number = (int)(Math.random() * 250) - 100;
                player.setMoney(player.getMoney() - stocks.getApple());
                double newPrice = stocks.getApple() + number;
                player.setMoney(player.getMoney() + newPrice);
            }

            else if(input.equals("n")) {
                player.setMoney(player.getMoney() - stocks.getNerdWallet());
                player.setMoney(player.getMoney() + stocks.getNerdWallet() + (int)(Math.random() * 60) - 30);
            }

            else if(input.equals("p")) {
                player.setMoney(player.getMoney() - stocks.getPeloton());
                player.setMoney(player.getMoney() + stocks.getPeloton() + (int)(Math.random() * 45) - 20);
            }

            else if(input.equals("z")) {
                player.setMoney(player.getMoney() - stocks.getZoom());
                player.setMoney(player.getMoney() + stocks.getZoom() + (int)(Math.random() * 140) - 75);
            }

            else if(input.equals("h")) {
                player.setMoney(player.getMoney() - stocks.getHomeDepot());
                player.setMoney(player.getMoney() + stocks.getHomeDepot() + (int)(Math.random() * 1000) - 500);
            }

            else if(input.equals("sell")) {
// gets the amount of money the player lost or gained
                double profit = player.getMoney() - 1000;
                sold = true;
                if(profit > 0)
                    System.out.println("Congrats " + userName+ "!!! You surprisingly made $" + profit);
                if(profit < 0)
                    System.out.println("I guess you could have lost more than $" + Math.abs(profit) + " " + userName);
                else
                    System.out.println("Well " + userName + ", that was a waste of both of our time.");
            }
        }
        if(player.getMoney() < 0)
            System.out.println(userName + " lost! You might need another way to satisfy your gambling addiction...");
    }
}
