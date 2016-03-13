package it.salestaxes.baseelement;

import it.salestaxes.baseelement.abstracts.AbstractElement;
import it.salestaxes.baseelement.interfaces.IElement;

public class Element extends AbstractElement implements IElement {

  public Element(String code, String description, Integer productType, Double price, Boolean imported) {
    super(description, description, productType, price, imported);
  }

  public Element() {
    super();
  }
}
