package it.salestaxes.mockobj.input;

import java.util.ArrayList;
import java.util.List;

import it.salestaxes.mockobj.baseelements.IElement;

public abstract class AbstractInput {
  private List<IElement> elements;

  public AbstractInput() {
    elements = new ArrayList<IElement>();
    init();
  }

  protected abstract void init();

  public List<IElement> getElements() {
    return this.elements;
  }
}
