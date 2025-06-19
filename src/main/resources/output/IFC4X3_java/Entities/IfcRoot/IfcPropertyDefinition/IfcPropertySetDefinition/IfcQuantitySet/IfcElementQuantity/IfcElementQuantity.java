public class IfcElementQuantity extends IfcQuantitySet {
    public IfcLabel MethodOfMeasurement;
    public SET [1:?] OF IfcPhysicalQuantity Quantities;

    // === WHERE CLAUSES ===
    // UniqueQuantityNames : IfcUniqueQuantityNames(Quantities)
}
