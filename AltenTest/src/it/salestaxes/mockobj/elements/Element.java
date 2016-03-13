package it.salestaxes.mockobj.elements;

import it.salestaxes.mockobj.baseelements.AbstractElement;
import it.salestaxes.mockobj.baseelements.IElement;

public class Element extends AbstractElement implements IElement {

    public Element(String code, String description, Integer productType, Double price, Boolean imported) {
	super(description, description, productType, price, imported);
    }

}
