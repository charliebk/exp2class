Public Class IfcTransportElementType Inherits IfcTransportationDeviceType
    Public PredefinedType As IfcTransportElementTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcTransportElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTransportElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
