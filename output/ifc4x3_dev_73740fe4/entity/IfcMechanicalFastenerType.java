package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcMechanicalFastenerType extends IfcElementComponentType {

    public IfcMechanicalFastenerTypeEnum PredefinedType;
    public IfcPositiveLengthMeasure NominalDiameter; // OPTIONAL
    public IfcPositiveLengthMeasure NominalLength; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcMechanicalFastenerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMechanicalFastenerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcMechanicalFastenerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMechanicalFastenerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
