package hr.stratusit;

import java.util.ArrayList;
import java.util.Date;

public class User extends  Product {

    String nameOfUser;
    Date dateWhenAccountMade = new Date();
    ArrayList<ShoppingItem> listOfProduct= new ArrayList<ShoppingItem>();
    ShoppingCart Kosara = new ShoppingCart(nameOfUser,dateWhenAccountMade,listOfProduct);


}



