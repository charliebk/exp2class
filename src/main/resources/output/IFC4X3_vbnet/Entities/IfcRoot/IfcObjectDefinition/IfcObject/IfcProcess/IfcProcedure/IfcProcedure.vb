Public Class IfcProcedure Inherits IfcProcess
    Public PredefinedType As IfcProcedureTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcProcedureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcProcedureTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcObject.ObjectType))
    ' HasName : EXISTS(SELF\IfcRoot.Name)
End Class
