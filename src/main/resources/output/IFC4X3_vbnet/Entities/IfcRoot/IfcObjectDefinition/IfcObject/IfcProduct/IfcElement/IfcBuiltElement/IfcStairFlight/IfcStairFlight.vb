Public Class IfcStairFlight Inherits IfcBuiltElement
    Public NumberOfRisers As IfcInteger
    Public NumberOfTreads As IfcInteger
    Public RiserHeight As IfcPositiveLengthMeasure
    Public TreadLength As IfcPositiveLengthMeasure
    Public PredefinedType As IfcStairFlightTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcStairFlightTypeEnum.USERDEFINED) OR ((PredefinedType = IfcStairFlightTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCSTAIRFLIGHTTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
End Class
