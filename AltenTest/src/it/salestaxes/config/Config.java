package it.salestaxes.config;

import java.util.ArrayList;
import java.util.List;

import it.salestaxes.consts.Consts;

public class Config {

  private static String reciptsPath = "/Recipts/recipts.txt";

  private static Config _instance;
  private List<Integer> baseTaxExcludedElement;

  public static Config getConfigInstance() {
    if (_instance == null) {
      _instance = new Config();
    }
    return _instance;
  }

  private Config() {
    baseTaxExcludedElement = new ArrayList<Integer>();
    init();
  }

  protected void init() {
    baseTaxExcludedElement.add(Consts.BOOK);
    baseTaxExcludedElement.add(Consts.FOOD);
    baseTaxExcludedElement.add(Consts.MEDICAL);

  }

  public List<Integer> getBaseTaxExcludedElement() {
    return baseTaxExcludedElement;
  }

  public Double getBaseTaxPercentage() {
    return Double.parseDouble(Consts.baseTaxPercentage);
  }

  public Double getImportTaxPercentage() {
    return Double.parseDouble(Consts.importTaxPercentage);
  }

  public String getReciptsPath() {
    return Config.reciptsPath;
  }
}
