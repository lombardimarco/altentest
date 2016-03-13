package it.salestaxes.baseelement.interfaces;

public interface IElement {

    public String getCode();

    public void setCode(String code);

    public String getDescription();

    public void setDescription(String description);

    public Integer getProductType();

    public void setProductType(Integer productType);

    public Double getPrice();

    public void setPrice(Double price);

    public Boolean getImported();

    public void setImported(Boolean imported);

}
