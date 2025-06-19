Public Class IfcLaborResourceType Inherits IfcConstructionResourceType
    Public PredefinedType As IfcLaborResourceTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcLaborResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcLaborResourceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcTypeResource.ResourceType))
End Class
