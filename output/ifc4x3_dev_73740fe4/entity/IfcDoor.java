package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcDoor extends IfcBuiltElement {

    public IfcPositiveLengthMeasure OverallHeight; // OPTIONAL
    public IfcPositiveLengthMeasure OverallWidth; // OPTIONAL
    public IfcDoorTypeEnum PredefinedType; // OPTIONAL
    public IfcDoorTypeOperationEnum OperationType; // OPTIONAL
    public IfcLabel UserDefinedOperationType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcDoorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDoorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcDoorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDoorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));
}
