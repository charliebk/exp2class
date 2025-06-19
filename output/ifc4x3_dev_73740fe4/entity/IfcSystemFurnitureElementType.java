package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcSystemFurnitureElementType extends IfcFurnishingElementType {

    public IfcSystemFurnitureElementTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcSystemFurnitureElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSystemFurnitureElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcSystemFurnitureElementTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcSystemFurnitureElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
