Public Class IfcBuildingSystem Inherits IfcSystem
    Public PredefinedType As IfcBuildingSystemTypeEnum
    Public LongName As IfcLabel

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBuildingSystemTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuildingSystemTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
