Public Class IfcTendonAnchorType Inherits IfcReinforcingElementType
    Public PredefinedType As IfcTendonAnchorTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcTendonAnchorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonAnchorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
