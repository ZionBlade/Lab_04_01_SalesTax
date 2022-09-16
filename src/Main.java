public class Main
{
    public static void main(String[] args)
    {
        int itemPrice = 5;
        double salesTax;
        double total;

        salesTax = itemPrice * 0.05;
        total = itemPrice + salesTax;

        System.out.println("The price of the item is " + itemPrice + " and the sales tax is " + salesTax);
        System.out.println("The total cost of the item is " + total);
    }
}