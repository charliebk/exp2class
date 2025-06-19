Public Class IfcWindow Inherits IfcBuiltElement
    Public OverallHeight As IfcPositiveLengthMeasure
    Public OverallWidth As IfcPositiveLengthMeasure
    Public PredefinedType As IfcWindowTypeEnum
    Public PartitioningType As IfcWindowTypePartitioningEnum
    Public UserDefinedPartitioningType As IfcLabel

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcWindowTypeEnum.USERDEFINED) OR ((PredefinedType = IfcWindowTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCWINDOWTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
End Class
