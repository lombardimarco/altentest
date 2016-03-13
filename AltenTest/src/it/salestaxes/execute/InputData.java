package it.salestaxes.execute;

import java.util.ArrayList;
import java.util.List;

import it.salestaxes.baseelement.interfaces.IShoppingBasket;
import it.salestaxes.mockobj.input.ShoppingBasket1;
import it.salestaxes.mockobj.input.ShoppingBasket2;
import it.salestaxes.mockobj.input.ShoppingBasket3;

public class InputData {

  public List<IShoppingBasket> getInputDataTest() {

    ShoppingBasket1 i1 = new ShoppingBasket1();
    ShoppingBasket2 i2 = new ShoppingBasket2();
    ShoppingBasket3 i3 = new ShoppingBasket3();
    List<IShoppingBasket> inputData = new ArrayList<IShoppingBasket>();
    inputData.add(i1);
    inputData.add(i2);
    inputData.add(i3);
    return inputData;
  }
}
