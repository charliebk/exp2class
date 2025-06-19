public class IfcRelPositions : IfcRelConnects
{
    public IfcPositioningElement RelatingPositioningElement { get; set; }
    public SET [1:?] OF IfcProduct RelatedProducts { get; set; }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(temp <* RelatedProducts | RelatingPositioningElement :=: temp)) = 0
}
