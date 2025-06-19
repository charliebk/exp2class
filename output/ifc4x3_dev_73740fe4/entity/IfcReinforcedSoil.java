package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcReinforcedSoil extends IfcEarthworksElement {

    public IfcReinforcedSoilTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcReinforcedSoilTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcReinforcedSoilTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcReinforcedSoilTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcReinforcedSoilTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
}
