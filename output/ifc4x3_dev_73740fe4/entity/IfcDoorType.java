package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcDoorType extends IfcBuiltElementType {

    public IfcDoorTypeEnum PredefinedType;
    public IfcDoorTypeOperationEnum OperationType;
    public IfcBoolean ParameterTakesPrecedence; // OPTIONAL
    public IfcLabel UserDefinedOperationType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcDoorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDoorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcDoorTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcDoorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
