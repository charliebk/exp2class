public class IfcPropertyListValue extends IfcSimpleProperty {
    public List<IfcValue> ListValues;
    public IfcUnit Unit;

    // === WHERE CLAUSES ===
    // WR31 : SIZEOF(QUERY(temp <* SELF.ListValues | NOT(TYPEOF(SELF.ListValues[1]) = TYPEOF(temp)) )) = 0
}
