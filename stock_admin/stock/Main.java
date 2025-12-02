package stock;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myscan=new Scanner(System.in);
        //Object for stockItem
        StockItem myobj=new StockItem(null, null, null, 0, 0, 0, 0);
        //Object for implementation methods
        StockCalculationImplementation implement=new StockCalculationImplementation();
        System.out.println("\n----------Enter in Item details------------");
        //Item Code
        while (true) {
            try {
                System.out.println("Enter in your item code");
                String itemCode=myscan.nextLine();
                myobj.setItemCode(itemCode);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        //Item Name
        while (true) {
            try {
                System.out.println("Enter in your item name");
                String itemName=myscan.nextLine();
                myobj.setItemName(itemName);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        //Item Category
        }while (true) {
            try {
                System.out.println("Enter in Item Category");
                String category=myscan.nextLine();
                myobj.setCategory(category);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
        //quantity
        while (true) {
            try {
                System.out.println("Enter in the quantity");
                int quant=myscan.nextInt();
                myscan.nextLine();
                myobj.setQuantity(quant);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            } catch (java.util.InputMismatchException e){
                System.out.println("Invalid input, Quantity must be Postive");
                myscan.nextLine();
            }
        }
        //turnover amount
        while (true) {
            try {
                System.out.println("Enter in Turnover Amount");
                double turnover=myscan.nextDouble();
                myscan.nextLine();
                myobj.setTurnoverAmount(turnover);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            } catch (java.util.InputMismatchException e){
                System.out.println("Invalid input, please enter a Turnover Amount.");
                myscan.nextLine();
            }
        }
        //buying price
        while (true) {
            try {
                System.out.println("Enter in your Buying Amount");
                double buy=myscan.nextDouble();
                myscan.nextLine();
                myobj.setBuyingPrice(buy);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            } catch (java.util.InputMismatchException e){
                System.out.println("Invalid Input, Enter in Buying Amount");
                myscan.nextLine();
            }
        }
        //selling price
        while (true) {
            try {
                System.out.println("Enter in Selling amount");
                double sell=myscan.nextDouble();
                myscan.nextLine();
                myobj.setSellingPrice(sell);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Error: "+e.getMessage());
            } catch (java.util.InputMismatchException e){
                System.out.println("Invalid Input, Enter in Selling Amount");
                myscan.nextLine();
            }
        }
        //OUTPUT
        System.out.println("\n---------------Stock Calculation-----------------");
        System.out.println("Item Code: "+myobj.getItemCode());
        System.out.println("Item Name: "+myobj.getItemName());
        System.out.println("Item Category: "+myobj.getCategory());
        System.out.println("Item Quantity: "+myobj.getQuantity());
        System.out.println("Item Turnover Amount: "+myobj.getTurnoverAmount());
        System.out.println("VAT: "+implement.calculateVat(myobj.getTurnoverAmount()));
        System.out.println("Markup profit: "+implement.markupProfit(myobj.getSellingPrice(), myobj.getBuyingPrice()));
        System.out.println("Total Stock Value: "+implement.totalStockValue(myobj.getQuantity(),myobj.getSellingPrice()));
        System.out.println("Restocking Fee: "+implement.restockingFee(myobj.getBuyingPrice()));
    }
}
