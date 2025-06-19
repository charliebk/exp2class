Public Class IfcAnnotation Inherits IfcProduct
    Public PredefinedType As IfcAnnotationTypeEnum

    ' === INVERSE CLAUSES ===
    ' ContainedInStructure : SET [0:1] OF IfcRelContainedInSpatialStructure FOR RelatedElements
End Class
