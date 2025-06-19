public class IfcPropertyListValue : IfcSimpleProperty
{
    public List<IfcValue> ListValues { get; set; }
    public IfcUnit Unit { get; set; }

    // === WHERE CLAUSES ===
    // WR31 : SIZEOF(QUERY(temp <* SELF.ListValues | NOT(TYPEOF(SELF.ListValues[1]) = TYPEOF(temp)) )) = 0
}
