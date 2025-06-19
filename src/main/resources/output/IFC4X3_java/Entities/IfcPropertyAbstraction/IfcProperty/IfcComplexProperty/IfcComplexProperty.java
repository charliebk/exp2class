public class IfcComplexProperty extends IfcProperty {
    public IfcIdentifier UsageName;
    public SET [1:?] OF IfcProperty HasProperties;

    // === WHERE CLAUSES ===
    // WR21 : SIZEOF(QUERY(temp <* HasProperties | SELF :=: temp)) = 0
    // WR22 : IfcUniquePropertyName(HasProperties)
}
