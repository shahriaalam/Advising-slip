import java.util.Scanner;
class Item
{
    String FoodName;
    double FoodQuantity;
    double FoodPrice;
    public Item(String cn, double cc, double cp)
    {
        FoodName = cn;
        FoodQuantity = cc;
        FoodPrice = cp;
    }
    public String toString()
    {
        return FoodName + " " + FoodQuantity + " " + FoodPrice;
    }
    static double sum=0;
}

public class BurgerKing {
    static Item[] ItemArray = new Item[10];
    public static void searchbyCourse(String name,int p,int n)
    {
        for (int i=0; i<n; i++)
        {
            if (ItemArray[i].FoodName.equals(name))
            {
                System.out.print(ItemArray[i].FoodName+"\t\t\t\t\t");
                System.out.print(ItemArray[i].FoodQuantity*p+"\t\t\t\t");
                System.out.println(ItemArray[i].FoodPrice*p);
                Item.sum=Item.sum+(ItemArray[i].FoodPrice*p);
            }
        }
    }

    public static void main(String[] args)
    {
        System.out.println("\t\t\t\t\t\t WELCOME TO 'BURGER KING'\n");
        Scanner input = new Scanner(System.in);
        System.out.println("How many types of food Burger King have: ");
        int n = input.nextInt();

        for (int i=0; i<n; i++)
        {
            input.nextLine();
            System.out.println("Enter food name:");
            String cn = input.nextLine();
            double cc = 1;
            System.out.println("Enter food quantity:\n"+cc);
            System.out.println("Enter food price:");
            double cp = input.nextDouble();
            ItemArray[i] = new Item(cn, cc, cp);
            System.out.println(ItemArray[i].toString());
        }
        System.out.println("");
        System.out.println("You can take only take two food at a time");
        System.out.println("Input your food name one by one:");
        System.out.println("");

        String[] cn1 = new String[2];
        int []x = new int[2];
        for (int i=0; i<2; i++)
        {
            input.nextLine();
            System.out.println("Enter food name:"+(i+1));
            cn1[i] = input.nextLine();
            System.out.println("Enter food quantity:"+(i+1));
            x[i] =input.nextInt();
        }
        System.out.println("");
        System.out.println("Here is the bill slip: \n");
        System.out.println("Food name   \t      Quantity \t      Food Price:");

        for (int i=0; i<2; i++)
        {
            searchbyCourse(cn1[i],x[i],n);
        }
        System.out.println("---------------------------------------------------------------");
        System.out.println("Total Cost of the foods:                "+Item.sum);
    }
}