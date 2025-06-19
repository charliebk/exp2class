Public Class IfcDistributionBoard Inherits IfcFlowController
    Public PredefinedType As IfcDistributionBoardTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcDistributionBoardTypeEnum.USERDEFINED) OR ((PredefinedType = IfcDistributionBoardTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCDISTRIBUTIONBOARDTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
End Class
