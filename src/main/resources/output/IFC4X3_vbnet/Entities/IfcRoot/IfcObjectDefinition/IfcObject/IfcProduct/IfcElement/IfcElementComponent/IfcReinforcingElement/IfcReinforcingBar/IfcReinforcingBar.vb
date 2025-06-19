Public Class IfcReinforcingBar Inherits IfcReinforcingElement
    Public NominalDiameter As IfcPositiveLengthMeasure
    Public CrossSectionArea As IfcAreaMeasure
    Public BarLength As IfcPositiveLengthMeasure
    Public PredefinedType As IfcReinforcingBarTypeEnum
    Public BarSurface As IfcReinforcingBarSurfaceEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcReinforcingBarTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingBarTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCREINFORCINGBARTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
End Class
