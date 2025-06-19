Public Class IfcRelContainedInSpatialStructure Inherits IfcRelConnects
    Public RelatedElements As SET [1:?] OF IfcProduct
    Public RelatingStructure As IfcSpatialElement

    ' === WHERE CLAUSES ===
    ' WR31 : SIZEOF(QUERY(temp <* RelatedElements | 'IFC4X3_DEV_73740fe4.IFCSPATIALSTRUCTUREELEMENT' IN TYPEOF(temp))) = 0
End Class
