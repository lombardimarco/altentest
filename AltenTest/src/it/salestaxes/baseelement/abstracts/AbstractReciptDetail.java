package it.salestaxes.baseelement.abstracts;

import java.util.ArrayList;
import java.util.List;

import it.salestaxes.baseelement.interfaces.IElement;
import it.salestaxes.baseelement.interfaces.IReciptDetail;

public class AbstractReciptDetail implements IReciptDetail {

  private List<IElement> elements;
  private Double salesTaxes;
  private Double total;

  public AbstractReciptDetail() {
    elements = new ArrayList<IElement>();
  }

  protected void init() {
    elements = new ArrayList<IElement>();
    salesTaxes = Double.valueOf(0);
    total = Double.valueOf(0);
  }

  @Override
  public List<IElement> getElements() {
    return this.elements;
  }

  @Override
  public Double getSalesTaxes() {
    return salesTaxes;
  }

  @Override
  public void setSalesTaxes(Double salesTaxes) {
    this.salesTaxes = salesTaxes;
  }

  @Override
  public Double getTotal() {
    return total;
  }

  @Override
  public void setTotal(Double total) {
    this.total = total;
  }

  @Override
  public void setElements(List<IElement> elements) {
    this.elements = elements;
  }

}
