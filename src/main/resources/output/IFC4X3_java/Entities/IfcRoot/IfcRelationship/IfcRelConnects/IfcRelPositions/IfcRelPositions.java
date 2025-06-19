public class IfcRelPositions extends IfcRelConnects {
    public IfcPositioningElement RelatingPositioningElement;
    public SET [1:?] OF IfcProduct RelatedProducts;

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(temp <* RelatedProducts | RelatingPositioningElement :=: temp)) = 0
}
