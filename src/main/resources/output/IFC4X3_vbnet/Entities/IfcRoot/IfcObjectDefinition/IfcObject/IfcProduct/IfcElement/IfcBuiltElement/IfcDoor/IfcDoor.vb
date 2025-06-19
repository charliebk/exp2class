Public Class IfcDoor Inherits IfcBuiltElement
    Public OverallHeight As IfcPositiveLengthMeasure
    Public OverallWidth As IfcPositiveLengthMeasure
    Public PredefinedType As IfcDoorTypeEnum
    Public OperationType As IfcDoorTypeOperationEnum
    Public UserDefinedOperationType As IfcLabel

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcDoorTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDoorTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCDOORTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
End Class
