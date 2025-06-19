public class IfcRelAssignsToProcess : IfcRelAssigns
{
    public IfcProcessSelect RelatingProcess { get; set; }
    public IfcMeasureWithUnit QuantityInProcess { get; set; }

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingProcess :=: Temp)) = 0
}
