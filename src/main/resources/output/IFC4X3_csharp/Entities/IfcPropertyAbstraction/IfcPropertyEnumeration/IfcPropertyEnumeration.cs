public class IfcPropertyEnumeration : IfcPropertyAbstraction
{
    public IfcLabel Name { get; set; }
    public List<UNIQUE IfcValue> EnumerationValues { get; set; }
    public IfcUnit Unit { get; set; }

    // === WHERE CLAUSES ===
    // WR01 : SIZEOF(QUERY(temp <* SELF.EnumerationValues | NOT(TYPEOF(SELF.EnumerationValues[1]) = TYPEOF(temp)) )) = 0

    // === UNIQUE CLAUSES ===
    // UR1 : Name
}
