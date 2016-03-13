package it.salestaxes.execute;

import java.io.IOException;
import java.util.List;

import it.salestaxes.baseelement.interfaces.IReciptDetail;
import it.salestaxes.baseelement.interfaces.IShoppingBasket;

public class Execute {

  public static void main(String[] args) throws IOException {

    InputData inData = new InputData();
    List<IShoppingBasket> inputData = inData.getInputDataTest();
    OutputData outData = new OutputData(inputData);
    List<IReciptDetail> outputData = outData.getOutputData();
    Printer print = new Printer();
    print.print(outputData);
  }

}