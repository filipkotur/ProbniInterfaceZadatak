
package hr.stratusit;

import java.math.BigDecimal;

/**
 *
 * @author luka
 */
public interface IProduct {
    

    String getProducer();


    String getName();

    /**
     *
     * @return Description of the product
     */
    String getDescription();

    /**
     *
     * @return Single price of the product
     */
    BigDecimal getPrice();

    /**
     *
     * @return Current stock amount of the product in warehouse 
     */
    BigDecimal getStockAmount();
    
}

