package hr.stratusit;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

public class ShoppingItem extends Product implements IShoppingItem{
    private static final AtomicInteger count = new AtomicInteger(0);
    Long ID;
    Product oneProduct = new Product();
    Date lastModified = new Date();
    public BigDecimal quantity;
    public ShoppingItem(){}
    public ShoppingItem(Product product,BigDecimal amount){
        oneProduct =product;
        quantity=amount;
        ID = (long)count.incrementAndGet();

    }

    @Override
    public Long getId(){
        return  ID;

    }
    @Override
    public IProduct getProduct(){

        return oneProduct;


    }
    @Override
    public BigDecimal getQuantity(){


        return this.quantity;
    }



    public BigDecimal getPrice(){

        return oneProduct.priceOfProduct;

    };



    public Date getLastModifyTime(){
        return lastModified;

    }




    @Override
    public BigDecimal getTotalAmount(){
        return null;
    }

     @Override
    public boolean equals(Object obj){

         ShoppingItem nesto = new ShoppingItem();
        return true;
    }

}
