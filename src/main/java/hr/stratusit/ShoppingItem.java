package hr.stratusit;

import java.math.BigDecimal;
import java.util.Date;

public class ShoppingItem implements IShoppingItem{
    Long ID;
    Product proizvod = new Product();
   @Override
    public Long getId(){
        return  ID;

    }
    @Override
    public IProduct getProduct(){
        //proizvod.

        return proizvod;


    };
    @Override
    public BigDecimal getQuantity(){
        return null;
    };

    /**
     *
     * @return Single price of the product
     */
    @Override
    public BigDecimal getPrice(){
        return null;

    };

    /**
     *
     * @return Last modification time and date of the item
     */
    @Override

    public Date getLastModifyTime(){
        return null;

    };

    /**
     *
     * @return Total price amount for this item
     */    @Override

    public BigDecimal getTotalAmount(){        return null;
    };



}
