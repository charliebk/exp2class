package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcTendonType extends IfcReinforcingElementType {

    public IfcTendonTypeEnum PredefinedType;
    public IfcPositiveLengthMeasure NominalDiameter; // OPTIONAL
    public IfcAreaMeasure CrossSectionArea; // OPTIONAL
    public IfcPositiveLengthMeasure SheathDiameter; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcTendonTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcTendonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcTendonTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcTendonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
