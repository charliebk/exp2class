Public Class IfcTendon Inherits IfcReinforcingElement
    Public PredefinedType As IfcTendonTypeEnum
    Public NominalDiameter As IfcPositiveLengthMeasure
    Public CrossSectionArea As IfcAreaMeasure
    Public TensionForce As IfcForceMeasure
    Public PreStress As IfcPressureMeasure
    Public FrictionCoefficient As IfcNormalisedRatioMeasure
    Public AnchorageSlip As IfcPositiveLengthMeasure
    Public MinCurvatureRadius As IfcPositiveLengthMeasure

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcTendonTypeEnum.USERDEFINED) OR ((PredefinedType = IfcTendonTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCTENDONTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
End Class
