package it.salestaxes.baseelement.abstracts;

import java.util.ArrayList;
import java.util.List;

import it.salestaxes.baseelement.interfaces.IElement;
import it.salestaxes.baseelement.interfaces.IShoppingBasket;

public abstract class AbstractShoppingBasket implements IShoppingBasket {
  private List<IElement> elements;

  public AbstractShoppingBasket() {
    elements = new ArrayList<IElement>();
    init();
  }

  protected abstract void init();

  @Override
  public List<IElement> getElements() {
    return this.elements;
  }
}
