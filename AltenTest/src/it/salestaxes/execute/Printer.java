package it.salestaxes.execute;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import it.salestaxes.baseelement.interfaces.IElement;
import it.salestaxes.baseelement.interfaces.IReciptDetail;
import it.salestaxes.config.Config;
import it.salestaxes.consts.Consts;
import it.salestaxes.utility.Utility;

public class Printer {

  PrintWriter printWriter;

  public Printer() throws IOException {
    printWriter = Utility.getOutputFileWriter(Config.getConfigInstance().getReciptsPath());
  }

  public void print(List<IReciptDetail> outputData) throws IOException {
    if (outputData != null) {
      Integer counter = 1;
      for (IReciptDetail singleRecipt : outputData) {
        printWriter.write("Output" + counter.toString() + Consts.newLine);
        for (IElement elemnt : singleRecipt.getElements()) {
          printWriter.write("1 " + elemnt.getDescription() + Consts.colon + Utility.getFormattedDecimal(elemnt.getPrice()) + Consts.newLine);
        }
        printWriter.write("Sales Taxes: " + Utility.getFormattedDecimal(singleRecipt.getSalesTaxes()) + Consts.newLine);
        printWriter.write("Total: " + Utility.getFormattedDecimal(singleRecipt.getTotal()) + Consts.newLine);
        printWriter.write(Consts.newLine);
        counter++;
      }
    }
    if (printWriter != null) {
      closeFile();
    }
  }

  public void closeFile() {
    printWriter.flush();
    printWriter.close();
  }
}
