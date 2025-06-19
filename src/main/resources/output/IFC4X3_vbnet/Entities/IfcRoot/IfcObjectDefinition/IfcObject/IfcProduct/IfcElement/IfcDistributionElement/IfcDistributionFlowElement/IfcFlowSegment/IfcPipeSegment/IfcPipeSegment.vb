Public Class IfcPipeSegment Inherits IfcFlowSegment
    Public PredefinedType As IfcPipeSegmentTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcPipeSegmentTypeEnum.USERDEFINED) OR ((PredefinedType = IfcPipeSegmentTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCPIPESEGMENTTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
End Class
