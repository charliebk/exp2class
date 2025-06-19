package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcWindow extends IfcBuiltElement {

    public IfcPositiveLengthMeasure OverallHeight; // OPTIONAL
    public IfcPositiveLengthMeasure OverallWidth; // OPTIONAL
    public IfcWindowTypeEnum PredefinedType; // OPTIONAL
    public IfcWindowTypePartitioningEnum PartitioningType; // OPTIONAL
    public IfcLabel UserDefinedPartitioningType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcWindowTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcWindowTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcWindowTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcWindowTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));
}
