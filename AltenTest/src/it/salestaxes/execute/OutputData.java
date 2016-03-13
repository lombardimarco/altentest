package it.salestaxes.execute;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import it.salestaxes.baseelement.Element;
import it.salestaxes.baseelement.Output;
import it.salestaxes.baseelement.interfaces.IElement;
import it.salestaxes.baseelement.interfaces.IReciptDetail;
import it.salestaxes.baseelement.interfaces.IShoppingBasket;
import it.salestaxes.config.TaxCalculator;

public class OutputData {
  List<IReciptDetail> outputData;
  List<IShoppingBasket> inputData;

  public OutputData(List<IShoppingBasket> inputData) {
    outputData = new ArrayList<IReciptDetail>();
    this.inputData = inputData;
    init();
  }

  public List<IReciptDetail> getOutputData() {
    return outputData;
  }

  protected void init() {
    Iterator<IShoppingBasket> iterInput = inputData.iterator();
    while (iterInput.hasNext()) {
      Output out = getSingleOutput(iterInput.next());
      outputData.add(out);
    }
  }

  private Output getSingleOutput(IShoppingBasket inputElements) {
    Iterator<IElement> iterElementShoppingBasket = inputElements.getElements().iterator();
    Output out = new Output();
    List<IElement> outReciptes = new ArrayList<IElement>();
    Double salesTax = 0D;
    Double total = 0D;
    while (iterElementShoppingBasket.hasNext()) {
      IElement shoppingBasketElement = iterElementShoppingBasket.next();
      IElement outRecipt = new Element();
      outRecipt.setCode(shoppingBasketElement.getCode());
      outRecipt.setDescription(shoppingBasketElement.getDescription());
      Double taxToAdd = TaxCalculator.getInstance().getTax(shoppingBasketElement);
      outRecipt.setPrice(taxToAdd + shoppingBasketElement.getPrice());
      outRecipt.setProductType(shoppingBasketElement.getProductType());
      outRecipt.setImported(shoppingBasketElement.getImported());
      salesTax += taxToAdd;
      total += outRecipt.getPrice();
      outReciptes.add(outRecipt);
    }
    out.setElements(outReciptes);
    out.setSalesTaxes(salesTax);
    out.setTotal(total);
    return out;
  }

}
