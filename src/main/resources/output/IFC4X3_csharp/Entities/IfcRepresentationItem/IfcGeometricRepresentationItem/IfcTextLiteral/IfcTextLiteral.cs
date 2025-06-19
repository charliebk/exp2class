public class IfcTextLiteral : IfcGeometricRepresentationItem
{
    public IfcPresentableText Literal { get; set; }
    public IfcAxis2Placement Placement { get; set; }
    public IfcTextPath Path { get; set; }

    // === EXTENDED BY ===
    // IfcTextLiteralWithExtent
}
