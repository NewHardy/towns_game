import java.util.Scanner;

public class Main
{
    static Scanner scan= new Scanner(System.in);
    public static void main(String[] args)
    {
        String [] dataBase = { "Abu Dhabi","Beijing","Canberra","Dublin","Edinburgh","Paris","Berlin","Havana",
                "Islamabad","Jakarta","Kabul","London","Kyiv","New Delhi","Oslo","Pretoria",
                "Quito","Rome","Seoul","Tokyo","Ulaanbaatar","Vienna","Warsaw","Xiamen","Yamoussoukro","Zagreb"};

        System.out.println("welcome to the game 'TOWNS'");
        System.out.println("pravilo");
        towns(dataBase);
    }

    public static void towns(String[]database)
    {
        String lastTown="";
        boolean lost=false;
        while(!lost)
        {
            System.out.println("enter your town");
            String town=scan.nextLine();
            String myLastLetter=String.valueOf(town.charAt(town.length()-1));
            for (String city : database)
            {
                if(!lastTown.equals(""))
                {
                    String myFirstLetter=String.valueOf(town.charAt(0));
                    String AILastLetter=String.valueOf(lastTown.charAt(lastTown.length()-1));
                    if (!myLastLetter.equalsIgnoreCase(AILastLetter))
                    {
                        System.out.println("you lost");
                        System.out.println("luck next time");
                        break;
                    }
                }
            }
            for (String city : database)
            {
                String AIFistLetter=String.valueOf(city.charAt(0));
                if (myLastLetter.equalsIgnoreCase(AIFistLetter))
                {
                    lastTown=city;
                    System.out.println(city);
                    System.out.println("your turn");
                    towns(database);
                }
            }

            System.out.println("you won");
            break;
        }
    }
}