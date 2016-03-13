package it.salestaxes.mockobj.input;

import it.salestaxes.baseelement.Element;
import it.salestaxes.baseelement.abstracts.AbstractShoppingBasket;
import it.salestaxes.consts.Consts;

public class ShoppingBasket2 extends AbstractShoppingBasket {

  @Override
  protected void init() {
    Element boxOfChocolates = new Element("CHO_BOX_IMP", "imported box of chocolates", Consts.FOOD, Double.parseDouble("10.00"), true);
    Element bottleOfPerfume = new Element("BOT_PER_IMP", "imported bottle of perfume ", Consts.OTHER, Double.parseDouble("47.50"), true);
    getElements().add(boxOfChocolates);
    getElements().add(bottleOfPerfume);
  }
}
