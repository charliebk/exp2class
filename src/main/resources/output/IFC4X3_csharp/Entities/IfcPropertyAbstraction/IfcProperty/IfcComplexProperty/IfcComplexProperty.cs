public class IfcComplexProperty : IfcProperty
{
    public IfcIdentifier UsageName { get; set; }
    public SET [1:?] OF IfcProperty HasProperties { get; set; }

    // === WHERE CLAUSES ===
    // WR21 : SIZEOF(QUERY(temp <* HasProperties | SELF :=: temp)) = 0
    // WR22 : IfcUniquePropertyName(HasProperties)
}
