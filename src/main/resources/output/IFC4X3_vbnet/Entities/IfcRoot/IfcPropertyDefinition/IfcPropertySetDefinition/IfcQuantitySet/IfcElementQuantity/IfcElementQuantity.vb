Public Class IfcElementQuantity Inherits IfcQuantitySet
    Public MethodOfMeasurement As IfcLabel
    Public Quantities As SET [1:?] OF IfcPhysicalQuantity

    ' === WHERE CLAUSES ===
    ' UniqueQuantityNames : IfcUniqueQuantityNames(Quantities)
End Class
