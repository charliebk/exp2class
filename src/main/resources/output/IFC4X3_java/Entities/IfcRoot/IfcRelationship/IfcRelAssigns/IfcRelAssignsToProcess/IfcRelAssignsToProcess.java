public class IfcRelAssignsToProcess extends IfcRelAssigns {
    public IfcProcessSelect RelatingProcess;
    public IfcMeasureWithUnit QuantityInProcess;

    // === WHERE CLAUSES ===
    // NoSelfReference : SIZEOF(QUERY(Temp <* SELF\IfcRelAssigns.RelatedObjects | RelatingProcess :=: Temp)) = 0
}
