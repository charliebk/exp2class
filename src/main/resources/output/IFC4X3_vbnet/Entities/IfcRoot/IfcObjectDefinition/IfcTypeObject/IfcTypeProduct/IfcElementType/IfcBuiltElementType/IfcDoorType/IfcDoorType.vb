Public Class IfcDoorType Inherits IfcBuiltElementType
    Public PredefinedType As IfcDoorTypeEnum
    Public OperationType As IfcDoorTypeOperationEnum
    Public ParameterTakesPrecedence As IfcBoolean
    Public UserDefinedOperationType As IfcLabel

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcDoorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDoorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
