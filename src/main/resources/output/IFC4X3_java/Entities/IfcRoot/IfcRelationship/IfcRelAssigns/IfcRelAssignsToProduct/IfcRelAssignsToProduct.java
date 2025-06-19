public class IfcRelAssignsToProduct extends IfcRelAssigns {
    public IfcProductSelect RelatingProduct;

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingProduct :=: Temp)) = 0
}
