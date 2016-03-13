package it.salestaxes.utility;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Utility {

  private Utility() {
  }

  public static PrintWriter getOutputFileWriter(String fullPath) throws IOException {
    File file = new File(fullPath);
    if (!file.exists()) {
      File fileDir = new File(file.getParent());
      fileDir.mkdirs();
      file.createNewFile();
    }
    PrintWriter fileWriter = new PrintWriter(file);
    return fileWriter;
  }

  public static String getFormattedDecimal(Double value) {
    Locale locale = new Locale("it", "IT");
    DecimalFormatSymbols symbols = new DecimalFormatSymbols(locale);
    symbols.setDecimalSeparator('.');
    DecimalFormat decinalFormatter = new DecimalFormat("##0.00", symbols);
    return decinalFormatter.format(value);
  }

  public static Double getRoundedImport(Double value) {
    Double roundedValue = Math.round(value * 20) / 20.0;
    return roundedValue;
  }

}
