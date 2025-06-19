public class IfcElementQuantity : IfcQuantitySet
{
    public IfcLabel MethodOfMeasurement { get; set; }
    public SET [1:?] OF IfcPhysicalQuantity Quantities { get; set; }

    // === WHERE CLAUSES ===
    // UniqueQuantityNames : IfcUniqueQuantityNames(Quantities)
}
