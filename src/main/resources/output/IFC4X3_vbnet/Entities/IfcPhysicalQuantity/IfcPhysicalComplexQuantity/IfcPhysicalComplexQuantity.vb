Public Class IfcPhysicalComplexQuantity Inherits IfcPhysicalQuantity
    Public HasQuantities As SET [1:?] OF IfcPhysicalQuantity
    Public Discrimination As IfcLabel
    Public Quality As IfcLabel
    Public Usage As IfcLabel

    ' === WHERE CLAUSES ===
    ' NoSelfReference : SIZEOF(QUERY(temp <* HasQuantities | SELF :=: temp)) = 0
    ' UniqueQuantityNames : IfcUniqueQuantityNames(HasQuantities)
End Class
