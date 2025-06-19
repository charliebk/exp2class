Public Class IfcFurnitureType Inherits IfcFurnishingElementType
    Public AssemblyPlace As IfcAssemblyPlaceEnum
    Public PredefinedType As IfcFurnitureTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcFurnitureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcFurnitureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcElementType.ElementType))
End Class
