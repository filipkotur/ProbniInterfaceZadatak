package hr.stratusit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart implements  IShoppingCart {
    Long IdodKosare;
    ArrayList<Product> SviProizvodiUkosari = new ArrayList<Product>();

    public  Long getId() {
        return IdodKosare;
    }

    public  String getUser() {
        long Idkosara;


        return null;
    }

    @Override
    public Date getCreatedTime() {
        return null;
    }

    @Override
    public List<IShoppingItem> getItems() {
        return null;
    }

    @Override
    public BigDecimal getTotalPrice() {
        return null;
    }

    @Override
    public boolean addItem(IProduct product, BigDecimal quantity) {
        SviProizvodiUkosari.add(product);

        return false;
    }

    @Override
    public boolean removeItem(IProduct product, BigDecimal quantity) {
        return false;
    }

    @Override
    public void refresh() {

    }

    @Override
    public boolean checkOut() {
        return false;
    }
}
