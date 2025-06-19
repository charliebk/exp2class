Public Class IfcCrewResource Inherits IfcConstructionResource
    Public PredefinedType As IfcCrewResourceTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcCrewResourceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCrewResourceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
