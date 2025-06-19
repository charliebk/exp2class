public class IfcPropertyEnumeratedValue extends IfcSimpleProperty {
    public List<IfcValue> EnumerationValues;
    public IfcPropertyEnumeration EnumerationReference;

    // === WHERE CLAUSES ===
    // WR21 : NOT(EXISTS(EnumerationReference)) OR  NOT(EXISTS(EnumerationValues)) OR  (SIZEOF(QUERY(temp <* EnumerationValues | temp IN EnumerationReference.EnumerationValues)) = SIZEOF(EnumerationValues))
}
