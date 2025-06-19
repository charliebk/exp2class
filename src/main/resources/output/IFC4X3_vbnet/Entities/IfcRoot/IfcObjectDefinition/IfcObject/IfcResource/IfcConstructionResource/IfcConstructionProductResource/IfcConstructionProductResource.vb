Public Class IfcConstructionProductResource Inherits IfcConstructionResource
    Public PredefinedType As IfcConstructionProductResourceTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcConstructionProductResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcConstructionProductResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
