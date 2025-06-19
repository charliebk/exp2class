public class IfcPropertyTableValue : IfcSimpleProperty
{
    public List<UNIQUE IfcValue> DefiningValues { get; set; }
    public List<IfcValue> DefinedValues { get; set; }
    public IfcText Expression { get; set; }
    public IfcUnit DefiningUnit { get; set; }
    public IfcUnit DefinedUnit { get; set; }
    public IfcCurveInterpolationEnum CurveInterpolation { get; set; }

    // === WHERE CLAUSES ===
    // WR21 : (NOT(EXISTS(DefiningValues)) AND NOT(EXISTS(DefinedValues))) OR (SIZEOF(DefiningValues) = SIZEOF(DefinedValues))
    // WR22 : NOT(EXISTS(DefiningValues)) OR (SIZEOF(QUERY(temp <* SELF.DefiningValues | TYPEOF(temp) <> TYPEOF(SELF.DefiningValues[1]) )) = 0)
    // WR23 : NOT(EXISTS(DefinedValues)) OR (SIZEOF(QUERY(temp <* SELF.DefinedValues | TYPEOF(temp) <> TYPEOF(SELF.DefinedValues[1]) )) = 0)
}
