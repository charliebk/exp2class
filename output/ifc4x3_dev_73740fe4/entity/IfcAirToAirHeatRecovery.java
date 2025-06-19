package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcAirToAirHeatRecovery extends IfcEnergyConversionDevice {

    public IfcAirToAirHeatRecoveryTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCAIRTOAIRHEATRECOVERYTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcAirToAirHeatRecoveryTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCAIRTOAIRHEATRECOVERYTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));
}
