Public Class IfcBooleanResult Inherits IfcGeometricRepresentationItem
    Public Operator As IfcBooleanOperator
    Public FirstOperand As IfcBooleanOperand
    Public SecondOperand As IfcBooleanOperand

    ' === EXTENDED BY ===
    ' IfcBooleanClippingResult

    ' === WHERE CLAUSES ===
    ' FirstOperandClosed : NOT('IFC4X3_DEV_73740fe4.IFCTESSELLATEDFACESET' IN TYPEOF(FirstOperand)) OR (EXISTS(FirstOperand.Closed) AND FirstOperand.Closed)
    ' SameDim : FirstOperand.Dim = SecondOperand.Dim
    ' SecondOperandClosed : NOT('IFC4X3_DEV_73740fe4.IFCTESSELLATEDFACESET' IN TYPEOF(SecondOperand)) OR (EXISTS(SecondOperand.Closed) AND SecondOperand.Closed)

    ' === DERIVE CLAUSES ===
    ' Dim : IfcDimensionCount := FirstOperand.Dim
End Class
