Public Class IfcRelDefinesByProperties Inherits IfcRelDefines
    Public RelatedObjects As SET [1:?] OF IfcObjectDefinition
    Public RelatingPropertyDefinition As IfcPropertySetDefinitionSelect

    ' === WHERE CLAUSES ===
    ' NoRelatedTypeObject : SIZEOF(QUERY(Types <* SELF\IfcRelDefinesByProperties.RelatedObjects |  'IFC4X3_DEV_73740fe4.IFCTYPEOBJECT' IN TYPEOF(Types))) = 0
End Class
