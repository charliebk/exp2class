public class IfcQuantityCount : IfcPhysicalSimpleQuantity
{
    public IfcCountMeasure CountValue { get; set; }
    public IfcLabel Formula { get; set; }

    // === WHERE CLAUSES ===
    // WR21 : CountValue >= 0
}
