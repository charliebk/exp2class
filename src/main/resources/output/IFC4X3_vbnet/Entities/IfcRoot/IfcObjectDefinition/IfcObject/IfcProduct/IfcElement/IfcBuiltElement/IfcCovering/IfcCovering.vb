Public Class IfcCovering Inherits IfcBuiltElement
    Public PredefinedType As IfcCoveringTypeEnum

    ' === INVERSE CLAUSES ===
    ' CoversSpaces : SET [0:1] OF IfcRelCoversSpaces FOR RelatedCoverings
    ' CoversElements : SET [0:1] OF IfcRelCoversBldgElements FOR RelatedCoverings

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcCoveringTypeEnum.USERDEFINED) OR ((PredefinedType = IfcCoveringTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCCOVERINGTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
End Class
