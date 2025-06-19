package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcVibrationDamper extends IfcElementComponent {

    public IfcVibrationDamperTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcVibrationDamperTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcVibrationDamperTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCVIBRATIONDAMPERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcVibrationDamperTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcVibrationDamperTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCVIBRATIONDAMPERTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));
}
