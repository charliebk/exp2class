package com.topoplanet.ifc4x3_dev_73740fe4.entity;
import com.topoplanet.test.type.*;


public class IfcMobileTelecommunicationsAppliance extends IfcFlowTerminal {

    public IfcMobileTelecommunicationsApplianceTypeEnum PredefinedType; // OPTIONAL
    // INVERSE attributes:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcMobileTelecommunicationsApplianceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMobileTelecommunicationsApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCMOBILETELECOMMUNICATIONSAPPLIANCETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));

    // WHERE constraints:
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR
    // (PredefinedType <> IfcMobileTelecommunicationsApplianceTypeEnum.USERDEFINED) OR
    // ((PredefinedType = IfcMobileTelecommunicationsApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType));
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR
    // ('IFC4X3_DEV_73740fe4.IFCMOBILETELECOMMUNICATIONSAPPLIANCETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType));
}
