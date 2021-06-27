package hr.stratusit;

import java.util.ArrayList;
import java.util.Date;

public class Korisnik {

    String ime;
    Long IdodKosare;
    Date dateWhenMaidAccount = new Date();
    ShoppingCart Kosara = new ShoppingCart(IdodKosare,dateWhenMaidAccount);

}



