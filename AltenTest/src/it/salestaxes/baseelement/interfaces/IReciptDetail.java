package it.salestaxes.baseelement.interfaces;

import java.util.List;

public interface IReciptDetail {

  public List<IElement> getElements();

  public void setElements(List<IElement> elements);

  public Double getSalesTaxes();

  public void setSalesTaxes(Double salesTaxes);

  public Double getTotal();

  public void setTotal(Double total);

}
