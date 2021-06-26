package hr.stratusit;

import java.math.BigDecimal;

public class Product implements IProduct{
    int val;
    String NameofProduct;
    String NameofProducer;
    String Description;
    BigDecimal PriceofProduct;
    BigDecimal StockAmountinwarehouse;
    Product(String productName, int quantity, double unitPrice){
         }
    Product(){
    }
    public String getProducer(){
            return this.NameofProducer;

    };


    public String getName(){
            return this.NameofProduct;}

    public String getDescription()
    {return this.Description;}


    public BigDecimal getPrice()
    {return this.PriceofProduct;}


    public BigDecimal getStockAmount()
    {return this.StockAmountinwarehouse;}

}
