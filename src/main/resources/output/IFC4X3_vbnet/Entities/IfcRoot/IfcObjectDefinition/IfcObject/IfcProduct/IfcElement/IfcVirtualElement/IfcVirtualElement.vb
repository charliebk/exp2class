Public Class IfcVirtualElement Inherits IfcElement
    Public PredefinedType As IfcVirtualElementTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcVirtualElementTypeEnum.USERDEFINED) OR ((PredefinedType = IfcVirtualElementTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
