package hr.stratusit;

import java.math.BigDecimal;
import java.util.Date;

public class ShoppingItem extends Product implements IShoppingItem{
    Long ID;
    Product oneProduct = new Product();
    Date lastModified = new Date();
    public BigDecimal quantity;
    public ShoppingItem(){}
    public ShoppingItem(Product product,BigDecimal amount){
        oneProduct =product;
        quantity=amount;

    }

    @Override
    public Long getId(){
        return  ID;

    }
    @Override
    public IProduct getProduct(){

        return oneProduct;


    };
    @Override
    public BigDecimal getQuantity(){
        return this.quantity;
    };


    public BigDecimal getPrice(){

        return oneProduct.priceOfProduct;

    };



    public Date getLastModifyTime(){
        return lastModified;

    };



    public BigDecimal getTotalAmount(){
        return null;
    };



}
