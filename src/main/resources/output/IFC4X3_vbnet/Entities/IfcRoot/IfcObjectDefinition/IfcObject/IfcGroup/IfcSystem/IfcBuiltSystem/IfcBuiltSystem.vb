Public Class IfcBuiltSystem Inherits IfcSystem
    Public PredefinedType As IfcBuiltSystemTypeEnum
    Public LongName As IfcLabel

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcBuiltSystemTypeEnum.USERDEFINED) OR ((PredefinedType = IfcBuiltSystemTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
