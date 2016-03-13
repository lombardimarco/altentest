package it.salestaxes.mockobj.input;

import it.salestaxes.consts.Consts;
import it.salestaxes.mockobj.elements.Element;

public class Input3 extends AbstractInput {

  @Override
  protected void init() {
    Element bottleOfPerfumeImported = new Element("BOT_PER_IMP", "imported bottle of perfume", Consts.OTHER, Double.parseDouble("10.00"), true);
    Element bottleOfPerfume = new Element("BOT_PER", "bottle of perfume", Consts.OTHER, Double.parseDouble("47.50"), true);
    Element packetOfPills = new Element("PIL", "packet of headache pills", Consts.MEDICAL, Double.parseDouble("47.50"), true);
    Element boxOfChocolates = new Element("BOX_CHO_IMP", "box of imported chocolates", Consts.FOOD, Double.parseDouble("47.50"), true);
    getElements().add(bottleOfPerfumeImported);
    getElements().add(bottleOfPerfume);
    getElements().add(packetOfPills);
    getElements().add(boxOfChocolates);
  }
}
