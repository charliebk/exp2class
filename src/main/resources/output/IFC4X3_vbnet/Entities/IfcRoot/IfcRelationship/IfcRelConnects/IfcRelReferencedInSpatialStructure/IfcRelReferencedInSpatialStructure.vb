Public Class IfcRelReferencedInSpatialStructure Inherits IfcRelConnects
    Public RelatedElements As SET [1:?] OF IfcSpatialReferenceSelect
    Public RelatingStructure As IfcSpatialElement

    ' === WHERE CLAUSES ===
    ' AllowedRelatedElements : SIZEOF(QUERY(temp <* RelatedElements | ('IFC4X3_DEV_73740fe4.IFCSPATIALSTRUCTUREELEMENT' IN TYPEOF(temp)) AND (NOT ('IFC4X3_DEV_73740fe4.IFCSPACE' IN TYPEOF(temp))) )) = 0
End Class
