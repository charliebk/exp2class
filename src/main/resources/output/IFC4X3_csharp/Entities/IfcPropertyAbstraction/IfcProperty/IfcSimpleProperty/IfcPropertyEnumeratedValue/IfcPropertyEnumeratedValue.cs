public class IfcPropertyEnumeratedValue : IfcSimpleProperty
{
    public List<IfcValue> EnumerationValues { get; set; }
    public IfcPropertyEnumeration EnumerationReference { get; set; }

    // === WHERE CLAUSES ===
    // WR21 : NOT(EXISTS(EnumerationReference)) OR  NOT(EXISTS(EnumerationValues)) OR  (SIZEOF(QUERY(temp <* EnumerationValues | temp IN EnumerationReference.EnumerationValues)) = SIZEOF(EnumerationValues))
}
