package it.salestaxes.mockobj.input;

import it.salestaxes.baseelement.Element;
import it.salestaxes.baseelement.abstracts.AbstractShoppingBasket;
import it.salestaxes.consts.Consts;

public class ShoppingBasket3 extends AbstractShoppingBasket {

  @Override
  protected void init() {
    Element bottleOfPerfumeImported = new Element("BOT_PER_IMP", "imported bottle of perfume", Consts.OTHER, Double.parseDouble("27.99"), true);
    Element bottleOfPerfume = new Element("BOT_PER", "bottle of perfume", Consts.OTHER, Double.parseDouble("18.99"), false);
    Element packetOfPills = new Element("PIL", "packet of headache pills", Consts.MEDICAL, Double.parseDouble("9.75"), false);
    Element boxOfChocolates = new Element("BOX_CHO_IMP", "box of imported chocolates", Consts.FOOD, Double.parseDouble("11.25"), true);
    getElements().add(bottleOfPerfumeImported);
    getElements().add(bottleOfPerfume);
    getElements().add(packetOfPills);
    getElements().add(boxOfChocolates);
  }
}
