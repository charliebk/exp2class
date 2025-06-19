package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcFurnitureType extends IfcFurnishingElementType {

    public IfcAssemblyPlaceEnum AssemblyPlace;
    public IfcFurnitureTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcFurnitureTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcFurnitureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcFurnitureTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcFurnitureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
