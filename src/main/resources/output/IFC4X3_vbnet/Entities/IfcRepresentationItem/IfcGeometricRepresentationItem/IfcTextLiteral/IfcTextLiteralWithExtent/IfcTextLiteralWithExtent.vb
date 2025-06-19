Public Class IfcTextLiteralWithExtent Inherits IfcTextLiteral
    Public Extent As IfcPlanarExtent
    Public BoxAlignment As IfcBoxAlignment

    ' === WHERE CLAUSES ===
    ' WR31 : NOT('IFC4X3_DEV_73740fe4.IFCPLANARBOX' IN TYPEOF(Extent))
End Class
