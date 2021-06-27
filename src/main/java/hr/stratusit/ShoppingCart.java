package hr.stratusit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart   implements  IShoppingCart {
    Long IdodKosare;
    ArrayList<ShoppingItem> SviProizvodiUkosari = new ArrayList<ShoppingItem>();
    ShoppingCart(){}

    public  Long getId() {

        return this.IdodKosare;
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

    public boolean addItem(IProduct product, BigDecimal quantity) {
        Product proizvod = (Product) product;
        int pozicija = SviProizvodiUkosari.indexOf(SviProizvodiUkosari.size()-1);
        ShoppingItem noviproizvodukosari = new ShoppingItem(proizvod,quantity);

        if(SviProizvodiUkosari.add(noviproizvodukosari)){return true;

    }else
        return false;}

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
