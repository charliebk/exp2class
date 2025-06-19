package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcCurrencyRelationship extends IfcResourceLevelRelationship {

    public IfcMonetaryUnit RelatingMonetaryUnit;
    public IfcMonetaryUnit RelatedMonetaryUnit;
    public IfcPositiveRatioMeasure ExchangeRate;
    public IfcDateTime RateDateTime; // OPTIONAL
    public IfcLibraryInformation RateSource; // OPTIONAL
}
