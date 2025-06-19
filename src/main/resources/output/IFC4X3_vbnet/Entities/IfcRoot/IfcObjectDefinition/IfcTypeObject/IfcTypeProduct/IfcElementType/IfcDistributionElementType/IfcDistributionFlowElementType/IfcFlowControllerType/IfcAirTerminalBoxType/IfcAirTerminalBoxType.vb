Public Class IfcAirTerminalBoxType Inherits IfcFlowControllerType
    Public PredefinedType As IfcAirTerminalBoxTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcAirTerminalBoxTypeEnum.USERDEFINED) OR ((PredefinedType = IfcAirTerminalBoxTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
