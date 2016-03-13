package it.salestaxes.baseelement.abstracts;

public abstract class AbstractElement {

  private String code;
  private String description;
  private Integer productType;
  private Double price;
  private Boolean imported;

  public AbstractElement(String code, String description, Integer productType, Double price, Boolean imported) {
    this.code = code;
    this.description = description;
    this.productType = productType;
    this.price = price;
    this.imported = imported;
  }

  public AbstractElement() {
  };

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getProductType() {
    return productType;
  }

  public void setProductType(Integer productType) {
    this.productType = productType;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Boolean getImported() {
    return imported;
  }

  public void setImported(Boolean imported) {
    this.imported = imported;
  }

}
