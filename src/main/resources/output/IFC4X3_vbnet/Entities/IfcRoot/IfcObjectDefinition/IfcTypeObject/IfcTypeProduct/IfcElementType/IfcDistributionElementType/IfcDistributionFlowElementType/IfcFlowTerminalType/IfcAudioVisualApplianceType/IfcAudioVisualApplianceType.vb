Public Class IfcAudioVisualApplianceType Inherits IfcFlowTerminalType
    Public PredefinedType As IfcAudioVisualApplianceTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcAudioVisualApplianceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAudioVisualApplianceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
