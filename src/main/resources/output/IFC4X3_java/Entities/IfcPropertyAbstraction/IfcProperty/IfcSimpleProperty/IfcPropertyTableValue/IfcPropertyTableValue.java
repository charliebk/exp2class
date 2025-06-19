public class IfcPropertyTableValue extends IfcSimpleProperty {
    public List<UNIQUE IfcValue> DefiningValues;
    public List<IfcValue> DefinedValues;
    public IfcText Expression;
    public IfcUnit DefiningUnit;
    public IfcUnit DefinedUnit;
    public IfcCurveInterpolationEnum CurveInterpolation;

    // === WHERE CLAUSES ===
    // WR21 : (NOT(EXISTS(DefiningValues)) AND NOT(EXISTS(DefinedValues))) OR (SIZEOF(DefiningValues) = SIZEOF(DefinedValues))
    // WR22 : NOT(EXISTS(DefiningValues)) OR (SIZEOF(QUERY(temp <* SELF.DefiningValues | TYPEOF(temp) <> TYPEOF(SELF.DefiningValues[1]) )) = 0)
    // WR23 : NOT(EXISTS(DefinedValues)) OR (SIZEOF(QUERY(temp <* SELF.DefinedValues | TYPEOF(temp) <> TYPEOF(SELF.DefinedValues[1]) )) = 0)
}
