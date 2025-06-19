Public Class IfcElementAssembly Inherits IfcElement
    Public AssemblyPlace As IfcAssemblyPlaceEnum
    Public PredefinedType As IfcElementAssemblyTypeEnum

    ' === WHERE CLAUSES ===
    ' CorrectPredefinedType : NOT(EXISTS(PredefinedType)) OR (PredefinedType <> IfcElementAssemblyTypeEnum.USERDEFINED) OR ((PredefinedType = IfcElementAssemblyTypeEnum.USERDEFINED) AND EXISTS (SELF\IfcObject.ObjectType))
    ' CorrectTypeAssigned : (SIZEOF(IsTypedBy) = 0) OR ('IFC4X3_DEV_73740fe4.IFCELEMENTASSEMBLYTYPE' IN TYPEOF(SELF\IfcObject.IsTypedBy[1].RelatingType))
End Class
