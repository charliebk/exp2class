Public Class IfcMobileTelecommunicationsAppliance Inherits IfcFlowTerminal
    Public PredefinedType As IfcMobileTelecommunicationsApplianceTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcMobileTelecommunicationsApplianceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMobileTelecommunicationsApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCMOBILETELECOMMUNICATIONSAPPLIANCETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
End Class
