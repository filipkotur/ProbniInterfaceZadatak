package hr.stratusit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoppingCart   implements  IShoppingCart {

    Long idFromBasket;
    Date DatumStvaranjaKosare = new Date();
    ArrayList<ShoppingItem> allProductInBasket = new ArrayList<ShoppingItem>();
    ShoppingCart(Long idBasket,Date dateOfCreatingCart){
        DatumStvaranjaKosare=dateOfCreatingCart;
        idFromBasket=idBasket;
    }

    public  Long getId() {

        return this.idFromBasket;
    }

    public  String getUser() {
        long Idkosara;


        return null;
    }

    public Date getCreatedTime() {
        return this.DatumStvaranjaKosare;
    }

    public List<IShoppingItem> getItems() {
        ShoppingItem Jedanproizvod = new ShoppingItem() ;
        return null;
    }

    public BigDecimal getTotalPrice() {
        return null;
    }

    public boolean addItem(IProduct product, BigDecimal quantity) {
        Product oneProduct = (Product) product;
        int pozicija = allProductInBasket.indexOf(oneProduct);
        if( pozicija != -1) {
            for (ShoppingItem model : allProductInBasket) {
                if(model.oneProduct.nameOfProduct==oneProduct.nameOfProduct){
                    model.quantity= model.quantity.add(new BigDecimal(1));

                }
            }
            return true;
        }else {
            ShoppingItem noviproizvodukosari = new ShoppingItem(oneProduct,quantity);
            if(allProductInBasket.add(noviproizvodukosari))
            {return true; }else
                return false;}}

    public boolean removeItem(IProduct product, BigDecimal quantity) {
        Product oneProduct = (Product) product;
        int pozicija = allProductInBasket.indexOf(oneProduct);
        if( pozicija != -1) {
            for (ShoppingItem model : allProductInBasket) {
                if(model.oneProduct.nameOfProduct==oneProduct.nameOfProduct){
                    model.quantity= model.quantity.add(new BigDecimal(-1));

                }
            }
            return true;
        }else {return false;

                }}

    @Override
    public void refresh() {

    }

    @Override
    public boolean checkOut() {
        return false;
    }
}
