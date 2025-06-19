package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcMotorConnection extends IfcEnergyConversionDevice {

    public IfcMotorConnectionTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcMotorConnectionTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMotorConnectionTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCMOTORCONNECTIONTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcMotorConnectionTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMotorConnectionTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCMOTORCONNECTIONTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));
}
