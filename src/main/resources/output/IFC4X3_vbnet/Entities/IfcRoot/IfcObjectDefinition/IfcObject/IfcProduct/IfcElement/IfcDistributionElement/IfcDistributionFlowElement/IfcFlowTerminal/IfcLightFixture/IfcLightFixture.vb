Public Class IfcLightFixture Inherits IfcFlowTerminal
    Public PredefinedType As IfcLightFixtureTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcLightFixtureTypeEnum.USERDEFINED) OR ((PredefinedType = IfcLightFixtureTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCLIGHTFIXTURETYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
End Class
