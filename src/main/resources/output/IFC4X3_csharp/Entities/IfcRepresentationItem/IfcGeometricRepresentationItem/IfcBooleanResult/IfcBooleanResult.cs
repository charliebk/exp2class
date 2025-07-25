public class IfcBooleanResult : IfcGeometricRepresentationItem
{
    public IfcBooleanOperator Operator { get; set; }
    public IfcBooleanOperand FirstOperand { get; set; }
    public IfcBooleanOperand SecondOperand { get; set; }

    // === EXTENDED BY ===
    // IfcBooleanClippingResult

    // === WHERE CLAUSES ===
    // FirstOperandClosed : NOT('IFC4X3_DEV_73740fe4.IFCTESSELLATEDFACESET' IN TYPEOF(FirstOperand)) OR (EXISTS(FirstOperand.Closed) AND FirstOperand.Closed)
    // SameDim : FirstOperand.Dim = SecondOperand.Dim
    // SecondOperandClosed : NOT('IFC4X3_DEV_73740fe4.IFCTESSELLATEDFACESET' IN TYPEOF(SecondOperand)) OR (EXISTS(SecondOperand.Closed) AND SecondOperand.Closed)

    // === DERIVE CLAUSES ===
    // Dim : IfcDimensionCount := FirstOperand.Dim
}
