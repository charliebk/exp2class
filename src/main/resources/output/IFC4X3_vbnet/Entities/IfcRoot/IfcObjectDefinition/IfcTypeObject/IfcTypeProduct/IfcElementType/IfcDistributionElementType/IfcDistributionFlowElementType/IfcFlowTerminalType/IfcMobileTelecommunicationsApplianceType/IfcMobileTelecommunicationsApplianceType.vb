Public Class IfcMobileTelecommunicationsApplianceType Inherits IfcFlowTerminalType
    Public PredefinedType As IfcMobileTelecommunicationsApplianceTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcMobileTelecommunicationsApplianceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcMobileTelecommunicationsApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
