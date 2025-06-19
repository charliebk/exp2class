Public Class IfcSpatialZoneType Inherits IfcSpatialElementType
    Public PredefinedType As IfcSpatialZoneTypeEnum
    Public LongName As IfcLabel

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcSpatialZoneTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSpatialZoneTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcSpatialElementType.ElementType))
End Class
