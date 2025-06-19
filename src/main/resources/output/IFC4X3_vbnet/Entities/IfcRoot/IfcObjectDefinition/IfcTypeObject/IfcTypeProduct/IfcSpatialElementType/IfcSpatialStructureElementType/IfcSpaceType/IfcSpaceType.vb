Public Class IfcSpaceType Inherits IfcSpatialStructureElementType
    Public PredefinedType As IfcSpaceTypeEnum
    Public LongName As IfcLabel

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : (PredefinedType <> IfcSpaceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSpaceTypeEnum.USERDEFINED) AND EXISTS(SELF\IfcSpatialElementType.ElementType))
End Class
