package hr.stratusit;

import java.math.BigDecimal;

public class Product implements IProduct{
    int val;
    String nameOfProduct;
    String nameOfProducer;
    String description;
    BigDecimal priceOfProduct;
    BigDecimal StockAmountinwarehouse;
    Product(String productName, int quantity, double unitPrice){
         }
    Product(){
    }
    public String getProducer(){
            return this.nameOfProducer;

    };


    public String getName(){
            return this.nameOfProduct;}

    public String getDescription()
    {return this.description;}


    public BigDecimal getPrice()
    {return this.priceOfProduct;}


    public BigDecimal getStockAmount()
    {return this.StockAmountinwarehouse;}

}
