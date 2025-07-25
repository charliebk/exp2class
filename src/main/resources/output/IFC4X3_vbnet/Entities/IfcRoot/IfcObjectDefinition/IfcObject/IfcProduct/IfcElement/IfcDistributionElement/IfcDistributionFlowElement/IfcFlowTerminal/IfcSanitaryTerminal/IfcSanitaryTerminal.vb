Public Class IfcSanitaryTerminal Inherits IfcFlowTerminal
    Public PredefinedType As IfcSanitaryTerminalTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcSanitaryTerminalTypeEnum.USERDEFINED) OR ((PredefinedType = IfcSanitaryTerminalTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCSANITARYTERMINALTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
End Class
