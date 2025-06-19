public class IfcPropertyEnumeration extends IfcPropertyAbstraction {
    public IfcLabel Name;
    public List<UNIQUE IfcValue> EnumerationValues;
    public IfcUnit Unit;

    // === WHERE CLAUSES ===
    // WR01 : SIZEOF(QUERY(temp <* SELF.EnumerationValues | NOT(TYPEOF(SELF.EnumerationValues[1]) = TYPEOF(temp)) )) = 0

    // === UNIQUE CLAUSES ===
    // UR1 : Name
}
