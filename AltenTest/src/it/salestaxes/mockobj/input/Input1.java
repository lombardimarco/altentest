package it.salestaxes.mockobj.input;

import it.salestaxes.consts.Consts;
import it.salestaxes.mockobj.elements.Element;

public class Input1 extends AbstractInput {

  protected void init() {
    Element book = new Element("BOOK", "book", Consts.BOOK, Double.parseDouble("12.49"), false);
    Element musicCd = new Element("CD", "music CD", Consts.OTHER, Double.parseDouble("14.99"), false);
    Element chocolateBar = new Element("CHO_BAR", "chocolate bar", Consts.FOOD, Double.parseDouble("0.85"), false);
    getElements().add(book);
    getElements().add(musicCd);
    getElements().add(chocolateBar);
  }

}
