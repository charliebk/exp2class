Public Class IfcSurfaceFeature Inherits IfcFeatureElement
    Public PredefinedType As IfcSurfaceFeatureTypeEnum

    ' === INVERSE CLAUSES ===
    ' AdheresToElement : IfcRelAdheresToElement FOR RelatedSurfaceFeatures

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcSurfaceFeatureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSurfaceFeatureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
End Class
