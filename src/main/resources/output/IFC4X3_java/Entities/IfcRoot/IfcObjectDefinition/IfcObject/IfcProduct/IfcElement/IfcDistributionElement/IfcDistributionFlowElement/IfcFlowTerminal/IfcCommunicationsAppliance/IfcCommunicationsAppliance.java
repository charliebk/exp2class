public class IfcCommunicationsAppliance extends IfcFlowTerminal {
    public IfcCommunicationsApplianceTypeEnum PredefinedType;

    // === WHERE CLAUSES ===
    // CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcCommunicationsApplianceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCommunicationsApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    // CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCCOMMUNICATIONSAPPLIANCETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
}
