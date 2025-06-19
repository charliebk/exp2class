Public Class IfcWindowType Inherits IfcBuiltElementType
    Public PredefinedType As IfcWindowTypeEnum
    Public PartitioningType As IfcWindowTypePartitioningEnum
    Public ParameterTakesPrecedence As IfcBoolean
    Public UserDefinedPartitioningType As IfcLabel

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcWindowTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWindowTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
