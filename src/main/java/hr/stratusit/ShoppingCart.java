package hr.stratusit;

import java.math.BigDecimal;
import java.util.*;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

public class ShoppingCart   implements  IShoppingCart {
    private static final AtomicInteger count = new AtomicInteger(0);

    String nameOfUser;
    Long idFromBasket;
    Date dateOfCartCreated = new Date();
    ArrayList<ShoppingItem> allProductInBasket = new ArrayList<>();
    ShoppingCart(String nameOfUser,Date dateOfCreatingCart,ArrayList<ShoppingItem> allProductInBasket){
        this.nameOfUser = nameOfUser;
        dateOfCartCreated=dateOfCreatingCart;
        idFromBasket = (long)count.incrementAndGet();
        this.allProductInBasket=allProductInBasket;
    }

    public  Long getId() {

        return this.idFromBasket;
    }

    public  String getUser() {return nameOfUser;}

    public Date getCreatedTime() {
        return this.dateOfCartCreated;
    }

     public List<IShoppingItem> returnInterfaceList(ArrayList<? extends IShoppingItem> bodies) {
         List<IShoppingItem> novi ;
         novi = (List<IShoppingItem>) bodies;
        return novi;

     }


    public List<IShoppingItem> getItems() {
        Collections.sort(allProductInBasket, new Comparator<ShoppingItem>(){
            @Override
            public int compare(ShoppingItem left, ShoppingItem right) {
                return (int) (left.oneProduct.getProducer().compareTo(right.oneProduct.getProducer()));
            }
        });
        Collections.sort(allProductInBasket, new Comparator<ShoppingItem>(){
            @Override
            public int compare(ShoppingItem left, ShoppingItem right) {
                return (int) (left.oneProduct.getName().compareTo(right.oneProduct.getName()));
            }
        });


        return returnInterfaceList(allProductInBasket);
    }

    public BigDecimal getTotalPrice() {;
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
            for ( ShoppingItem model : allProductInBasket) {
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
