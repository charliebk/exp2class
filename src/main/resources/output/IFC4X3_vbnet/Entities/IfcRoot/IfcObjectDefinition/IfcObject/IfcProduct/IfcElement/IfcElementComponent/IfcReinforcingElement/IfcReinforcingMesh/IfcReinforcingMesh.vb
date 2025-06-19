Public Class IfcReinforcingMesh Inherits IfcReinforcingElement
    Public MeshLength As IfcPositiveLengthMeasure
    Public MeshWidth As IfcPositiveLengthMeasure
    Public LongitudinalBarNominalDiameter As IfcPositiveLengthMeasure
    Public TransverseBarNominalDiameter As IfcPositiveLengthMeasure
    Public LongitudinalBarCrossSectionArea As IfcAreaMeasure
    Public TransverseBarCrossSectionArea As IfcAreaMeasure
    Public LongitudinalBarSpacing As IfcPositiveLengthMeasure
    Public TransverseBarSpacing As IfcPositiveLengthMeasure
    Public PredefinedType As IfcReinforcingMeshTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcReinforcingMeshTypeEnum.USERDEFINED) OR ((PredefinedType = IfcReinforcingMeshTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCREINFORCINGMESHTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
End Class
