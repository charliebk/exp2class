Public Class IfcSpace Inherits IfcSpatialStructureElement
    Public PredefinedType As IfcSpaceTypeEnum
    Public ElevationWithFlooring As IfcLengthMeasure

    ' === INVERSE CLAUSES ===
    ' HasCoverings : SET [0:?] OF IfcRelCoversSpaces FOR RelatingSpace
    ' BoundedBy : SET [0:?] OF IfcRelSpaceBoundary FOR RelatingSpace

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcSpaceTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSpaceTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCSPACETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
End Class
