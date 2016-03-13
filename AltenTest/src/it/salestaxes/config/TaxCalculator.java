package it.salestaxes.config;

import java.math.BigDecimal;
import java.math.RoundingMode;

import it.salestaxes.baseelement.interfaces.IElement;
import it.salestaxes.utility.Utility;

public class TaxCalculator {

  private static TaxCalculator _instance;

  public static TaxCalculator getInstance() {
    if (_instance == null) {
      _instance = new TaxCalculator();
    }
    return _instance;
  }

  public Double getTax(IElement element) {
    if (element.getImported()) {
      if (Config.getConfigInstance().getBaseTaxExcludedElement().contains(element.getProductType())) {
        return getOnlyImportTax(element);
      } else {
        return getFullTax(element);
      }
    } else {
      if (Config.getConfigInstance().getBaseTaxExcludedElement().contains(element.getProductType())) {
        return getFreeTax(element);
      } else {
        return getBasicTax(element);
      }
    }
  }

  protected Double getBasicTax(IElement element) {
    return getImport(Config.getConfigInstance().getBaseTaxPercentage(), element.getPrice());
  }

  protected Double getOnlyImportTax(IElement element) {
    return getImport(Config.getConfigInstance().getImportTaxPercentage(), element.getPrice());
  }

  protected Double getFullTax(IElement element) {
    Double taxPercentage = Config.getConfigInstance().getBaseTaxPercentage() + Config.getConfigInstance().getImportTaxPercentage();
    return getImport(taxPercentage, element.getPrice());
  }

  protected Double getFreeTax(IElement element) {
    return 0D;
  }

  /**
   * This method returns the value of tax to be added to the price.
   * 
   * @param percentage
   * @param price
   * @return
   */
  protected Double getImport(Double percentage, Double price) {
    BigDecimal percentageB = new BigDecimal(percentage);
    BigDecimal priceB = new BigDecimal(price);
    BigDecimal res = new BigDecimal(0);
    res = percentageB.multiply(priceB).divide(new BigDecimal(100));
    BigDecimal returnValue = new BigDecimal(0);
    returnValue = res.setScale(2, RoundingMode.HALF_UP);
    // return returnValue.doubleValue();
    return Utility.getRoundedImport(returnValue.doubleValue());
  }

}
