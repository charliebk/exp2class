Public Class IfcLaborResource Inherits IfcConstructionResource
    Public PredefinedType As IfcLaborResourceTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcLaborResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcLaborResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
