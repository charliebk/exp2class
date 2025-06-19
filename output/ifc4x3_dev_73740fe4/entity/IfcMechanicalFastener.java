package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcMechanicalFastener extends IfcElementComponent {

    public IfcPositiveLengthMeasure NominalDiameter; // OPTIONAL
    public IfcPositiveLengthMeasure NominalLength; // OPTIONAL
    public IfcMechanicalFastenerTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcMechanicalFastenerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMechanicalFastenerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCMECHANICALFASTENERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcMechanicalFastenerTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMechanicalFastenerTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCMECHANICALFASTENERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));
}
