Public Class IfcTendonConduitType Inherits IfcReinforcingElementType
    Public PredefinedType As IfcTendonConduitTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcTendonConduitTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonConduitTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
