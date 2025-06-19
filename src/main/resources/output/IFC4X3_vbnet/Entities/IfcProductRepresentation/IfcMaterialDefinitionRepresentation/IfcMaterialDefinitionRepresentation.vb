Public Class IfcMaterialDefinitionRepresentation Inherits IfcProductRepresentation
    Public RepresentedMaterial As IfcMaterial

    ' === WHERE CLAUSES ===
    ' OnlyStyledRepresentations : SIZEOF(QUERY(temp <* Representations | (NOT('IFC4X3_DEV_73740fe4.IFCSTYLEDREPRESENTATION' IN TYPEOF(temp))) )) = 0
End Class
