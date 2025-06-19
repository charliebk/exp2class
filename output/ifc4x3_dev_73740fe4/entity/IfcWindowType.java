package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcWindowType extends IfcBuiltElementType {

    public IfcWindowTypeEnum PredefinedType;
    public IfcWindowTypePartitioningEnum PartitioningType;
    public IfcBoolean ParameterTakesPrecedence; // OPTIONAL
    public IfcLabel UserDefinedPartitioningType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : (PredefinedType <> IfcWindowTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcWindowTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));

    // WHERE constraints:
    // CorrectPredefinedType : (PredefinedType <> IfcWindowTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcWindowTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType));
}
